package kodlama.io.hrms.core.utilities.adapters.adapters.concretes;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import kodlama.io.hrms.core.utilities.adapters.adapters.abstracts.ImageService;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.core.utilities.results.SuccessResult;
import kodlama.io.hrms.entities.concretes.Image;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class CloudinaryImageServiceAdapter implements ImageService {

    private Cloudinary cloudinary;

    public CloudinaryImageServiceAdapter() {
        this.cloudinary = new Cloudinary("cloudinary://541124263762825:KyA88ExE7T39fZsIjh9GQ8PnoX4@turix");
    }

    @Override
    public Result upload(Image image) throws IOException {
        cloudinary.uploader().upload(image.getImagePath(), ObjectUtils.emptyMap());
        cloudinary.url().generate(image.getId()+"");
        return new SuccessResult();


    }

    public Result deleteImage(Image image) throws IOException {
        cloudinary.uploader().destroy(image.getId()+"",ObjectUtils.emptyMap());
        return new SuccessResult();


    }


}
