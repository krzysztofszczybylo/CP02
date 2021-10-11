
public class Books
{
    String title;
    String author;
    String pubDate;
    boolean isOpen;
    
    
    void Open(){
        System.out.println(isOpen = true);
    };
    void Close(){
        System.out.println(isOpen = false);
    };
    void showInfo(){
        System.out.println("Author: " + author + ", Title: " + title + ", Date of publication: " + pubDate);
    };
}
