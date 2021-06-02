package kodlama.io.hrms.core.utilities.adapters.adapters.abstracts;

import com.cloudinary.Cloudinary;
import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Image;
import org.springframework.stereotype.Service;

import java.io.IOException;

public interface ImageService {

    public Result upload(Image image) throws IOException;


}
