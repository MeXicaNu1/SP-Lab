package com.services;
import com.models.*;
import com.resources.*;
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
