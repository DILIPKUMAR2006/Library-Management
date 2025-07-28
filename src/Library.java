import java.util.Scanner;

public class Library
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        Students students = new Students();
        Books book = new Books();
        System.out.println("Welcome to Library System !!!");
        System.out.println();
        int i = 0;
        do
        {
            System.out.println();
            System.out.println("Register student : 1 \n"+
                    "Student details : 2 \n" +
                    "Student issue book : 3 \n" +
                    "Student return book : 4 \n" +
                    "Show books : 5 \n" +
                    "Add book : 6 \n" +
                    "Exit : 7");
            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    students.Register();
                    break;
                case 2:
                    students.Stu_details();
                    break;
                case 3 :
                    scanner.nextLine();
                    System.out.println("Enter the book name to issue");
                    String bookname = scanner.nextLine();
                    System.out.println("Enter your roll no please ");
                    int rollno = scanner.nextInt();
                    students.issue_book(bookname,rollno,book);
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Enter your book name :");
                    String bookname1 = scanner.nextLine();
                    System.out.println("Enter your roll no");
                    int rollno1 = scanner.nextInt();
                    students.return_book(bookname1,rollno1,book);
                    break;
                case 5:
                    book.show_books();
                    break;
                case 6:
                    book.add_book();
                    break;
                case 7:
                    i = -1;
            }
        }while(i!=-1);
    }
}
