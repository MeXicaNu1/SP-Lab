package com.resources;

public class ImageContentFactory {
    public ImageContent loadImage(String type){
        if(type.equals("bmi")) {
            return new BMPImageContent(type);
        } else if(type.equals("JPG")){
            return new JPGImageContent(type);
        }
        return new ImageContent(type);
    }
}
