public class Book{
    private String title;
    private String isbn;
    private String author;
    private boolean isavailable;
    public Book(String title,String isbn,String author){
        this.title=title;
        this.isbn=isbn;
        this.author=author;
        this.isavailable=true;
    }
    public boolean borrow(){
        if(!isavailable){
            return false;
        }
        isavailable=false;
        return true;
    }
    public boolean returnb(){
        if(isavailable){
            return false;
        }
        isavailable=true;
        return true;
    }
    public String getTitle(){
        return title;
    }
    public String getId(){
        return isbn;
    }
    public String getAuthor(){
        return author;
    }
    public boolean isavailable(){
        return isavailable;
    }
}
