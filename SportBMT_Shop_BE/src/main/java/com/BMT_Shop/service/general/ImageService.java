package com.BMT_Shop.service.general;

import com.BMT_Shop.dto.general.UploadedImageResponse;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

    UploadedImageResponse store(MultipartFile image);

    Resource load(String imageName);

    void delete(String imageName);

}
