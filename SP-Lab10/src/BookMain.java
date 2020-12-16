import com.models.*;
import com.resources.DocumentManager;
import com.services.*;


public class BookMain {
    public static void main(String[] args) throws Exception {
        Command cmd1 = new OpenCommand("book.json");
        cmd1.execute();
        Command cmd2 = new StatisticsCommand();
        cmd2.execute();
        //DocumentManager.getBook().print();
    }
}