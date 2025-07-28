import java.util.Scanner;

public class Books
{
    Book[] book = new Book[50];
    Scanner scan = new Scanner(System.in);
    int count = 0;

    public void show_books()   //show books
    {
        for(int i=0;i<count;i++)
        {
            System.out.println("Book name : "+book[i].book_name+" Book no : "+book[i].book_no+" Book author : "+book[i].Author_name+" Book quantity : "+book[i].book_qnty);
        }
    }
    public void add_book()  //add the new book
    {
        Book book1 = new Book();
        System.out.println("Enter the book name : ");
        book1.book_name = scan.nextLine();
        System.out.println("Enter the book number : ");
        book1.book_no = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the Author name : ");
        book1.Author_name = scan.nextLine();
        System.out.println("Enter the quantity of the book : ");
        book1.book_qnty = scan.nextInt();
        scan.nextLine();
        book[count++] = book1;
    }
    public int is_book_ava(String books)
    {
        for(int i=0;i<count;i++)
        {
            if(book[i].book_name.equals(books))
                return i;
        }
        return -1;
    }
    public void addBookQuantity(String books)
    {
        int index = is_book_ava(books);
        if(index!=-1)
        {
                book[index].book_qnty++;
                System.out.println("book successfully added to library "+books);
        }
    }
    public void removeBookQuantity(String books)
    {
        int index = is_book_ava(books);
        if(index!=-1)
        {
            if(book[index].book_qnty>0)
            {
                book[index].book_qnty--;
                System.out.println("Book successfully removed from library " + books);
            }
        }
    }
}
