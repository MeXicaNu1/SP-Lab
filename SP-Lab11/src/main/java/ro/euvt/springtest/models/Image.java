package ro.euvt.springtest.models;

import ro.euvt.springtest.interfaces.*;
import ro.euvt.springtest.resources.*;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.concurrent.TimeUnit;

@NoArgsConstructor(force = true)
@Entity
public class Image extends Element {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "imageName")
    private String imageName;
    @Transient
    private ImageContent content;
    @Transient
    private ImageContentFactory factory;

    public Image(String name){
        this.imageName = name;
        factory = new ImageContentFactory();
        try{
            TimeUnit.SECONDS.sleep(5);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public ImageContent getContent(){
        return this.content;
    }

    public void setContent(String type){
        content = factory.loadImage(type);
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageName() {
        return imageName;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
