package ro.euvt.springtest.services;

import ro.euvt.springtest.models.*;
import ro.euvt.springtest.interfaces.*;
import ro.euvt.springtest.resources.*;

public class SaveCommand implements Command {
    private Section section;

    public SaveCommand(Section section) {
        this.section = section;
    }

    @Override
    public void execute() {
        Book book = DocumentManager.getDocumentManager().getBook();
        book.addContent(section);
    }
}
