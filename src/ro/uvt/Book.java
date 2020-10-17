package ro.uvt;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class Book {

    private List<String> paragraphs;
    private List<String> images;
    private List<String> tables;
    private String titlu;

    public Book(String titlu) {
        this.paragraphs = new ArrayList<>();
        this.images = new ArrayList<>();
        this.tables = new ArrayList<>();
        this.titlu = titlu;
    }

    public void createNewParagraph (String paragraph){
        this.paragraphs.add(paragraph);
    }

    public void createNewImage(String image){
        this.images.add(image);
    }

    public void createNewTable(String table){
        this.tables.add(table);
    }

    public void print(){
        System.out.println(titlu);
        System.out.println(paragraphs);
        System.out.println(images);
        System.out.println(tables);
    }

}
