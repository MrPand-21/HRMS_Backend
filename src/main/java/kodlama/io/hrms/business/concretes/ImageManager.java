package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.ImageService;
import kodlama.io.hrms.business.constants.Messages;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.dataAccess.abstracts.ImageDao;
import kodlama.io.hrms.entities.concretes.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ImageManager implements ImageService {

    private kodlama.io.hrms.core.utilities.adapters.adapters.abstracts.ImageService imageService;
    private ImageDao imageDao;

    @Autowired
    public ImageManager(kodlama.io.hrms.core.utilities.adapters.adapters.abstracts.ImageService imageService,ImageDao imageDao) {
        this.imageService = imageService;
        this.imageDao = imageDao;
    }

    @Override
    public Result uploadPhoto(Image image) throws IOException {
        imageDao.save(image);
        imageService.upload(image);
        return new SuccessResult(Messages.ImageUploaded);
    }
}
