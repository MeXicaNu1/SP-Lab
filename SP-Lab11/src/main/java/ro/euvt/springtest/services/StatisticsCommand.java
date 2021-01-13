package ro.euvt.springtest.services;

import ro.euvt.springtest.models.*;
import ro.euvt.springtest.interfaces.*;
import ro.euvt.springtest.resources.*;

public class StatisticsCommand implements Command {
    @Override
    public void execute() {
        Book book = DocumentManager.getDocumentManager().getBook();
        BookStatistics bookStatistics = new BookStatistics();
        PrintContentVisitor printContentVisitor = new PrintContentVisitor();
        book.accept(bookStatistics);
        bookStatistics.printCounter();
        book.accept(printContentVisitor);
    }
}
