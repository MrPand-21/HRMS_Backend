package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.core.utilities.results.Result;
import kodlama.io.hrms.entities.concretes.Image;

import java.io.IOException;

public interface ImageService {

    Result uploadPhoto(Image image) throws IOException;

}
