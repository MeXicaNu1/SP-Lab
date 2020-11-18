public class BookMain {
    public static void main(String[] args) {
        Book test = new Book("TEST");
        Author auth = new Author("Autor test");

        test.addAuthor(auth);
        Section cap1 = new Section("Cap 1");
        Section cap11 = new Section("Cap 2");
        Section cap111 = new Section("Cap 3");
        Section cap1111 = new Section("Subcap");

        test.addContent(new Paragraph("DAD#@!FFFAAD#!#FF TEST"));
        test.addContent(cap1);
        cap1.addElement(new Paragraph("Moto capitol"));
        cap1.addElement(cap11);
        cap11.addElement(new Paragraph("Text from subchapter 1.1"));
        cap11.addElement(cap111);
        cap111.addElement(new Paragraph("text from subchapter 1.1.1"));
        cap111.addElement(cap1111);
        cap1111.addElement(new Image("Image from subchapter 1.1.1.1"));

        test.print();

    }
}