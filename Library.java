import java.util.*;
public class Library{
    private HashMap<String, Book> h;
    public Library(){
        h=new HashMap<>();
    }
    public Boolean addBook(String title,String isbn,String author){
        if(h.containsKey(isbn)){
            return false;
        }
        h.put(isbn,new Book(title,isbn,author));
        return true;
    }
    public Book findByTitle(String title){
        for(Book n:h.values()){
            if(n.getTitle().equalsIgnoreCase(title)){
                return n;
            }
        }
        return null;
    }
    public Book findByIsbn(String isbn){
        return h.get(isbn);
    }
    public Boolean borrowBook(String isbn){
        Book b=h.get(isbn);
        if(b==null){
            return null;
        }
        else if(b.borrow()){
            return true;
        }
        return false;
    }
    public Boolean returnBook(String isbn){
        Book b=h.get(isbn);
        if(b==null){
            return null;
        }
        else if(b.returnb()){
            return true;
        }
        return false;
    }
    public Collection<Book> listbooks(){
        return h.values();
    }
}

