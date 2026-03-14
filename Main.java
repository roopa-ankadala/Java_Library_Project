import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Library q=new Library();
        while(true){
        System.out.println("----------------------------------");
        System.out.println("-----Personal Library System-----");
        System.out.println("1.Add Book/Books");
        System.out.println("2.Search Book by Title");
        System.out.println("3.List All Books");
        System.out.println("4.Borrow Book");
        System.out.println("5.Return Book");
        System.out.println("6.Exit");
        System.out.println("----------------------------------");
        System.out.print("Enter Your Choice: ");
        String choice=s.nextLine();
        switch(choice){
            case "1": 
                System.out.print("Enter Title: ");
                String titles=s.nextLine();
                System.out.print("Enter Isbn: ");
                String isbnn=s.nextLine();
                System.out.print("Enter Author: ");
                String authorr=s.nextLine();
                if(q.addBook(titles,isbnn,authorr)){
                    System.out.println(titles+"-"+"Added Succesfully");
                }else{
                    System.out.println("Book already exists");
                }
                break;
            case "2":
                System.out.println("Enter Your Title");
                String titless=s.nextLine();
                Book b=q.findByTitle(titless);
                if(b==null){
                System.out.println("Book Not Exist");
                }else{
                    System.out.println(b.getTitle()+"-"+(b.isavailable()?"Available":"Borrowed"));
                }
                break;
            case "3":
                if(q.listbooks().isEmpty()){
                   System.out.println("No books available.");
                } else {
                for(Book bb:q.listbooks()){
                    System.out.println(bb.getTitle()+"-"+(bb.isavailable()?"Available":"Borrowed"));
                }}
                break;
            case "4":
                System.out.println("Enter isbn: ");
                String isbnnn=s.nextLine();
                Boolean bb=q.borrowBook(isbnnn);
                if(bb==null){
                    System.out.println("Book Not Exists");
                }else if(bb){
                    System.out.println("Book Borrowed Successfully");
                }else {
                    System.out.println("Book already Borrowed..please choose another book");
                }
                break;
            case "5":
                System.out.println("Enter Book Isbn: ");
                String isbnmn=s.nextLine();
                Boolean x=q.returnBook(isbnmn);
                if(x==null){
                    System.out.println("Book not exists");
                }else if(x){
                    System.out.println("Book Returned successfully");
                }else{
                    System.out.println("Book not Borrowed");
                }
                break;
            case "6":
                System.out.println("Program Exited Successfully...");
                s.close();
                System.exit(0);
            default:
                System.out.println("Enter valid input");    
            }
        }
    }
}
