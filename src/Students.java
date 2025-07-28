import java.util.Scanner;

public class Students
{
    Scanner scan = new Scanner(System.in);
    Student[] students = new Student[50];
    int count = 0;
    public void Stu_details()
    {
        for(int i=0;i<count;i++)
        {
            System.out.println("Student name : "+students[i].student_name+" Student roll no : "+students[i].student_roll+" Borrowed books : "+students[i].borrow);
        }
    }
    public void Register()
    {
        Student student = new Student();
        System.out.println("Enter Student name : ");
        student.student_name = scan.nextLine();
        System.out.println("Enter Student roll no : ");
        student.student_roll = scan.nextInt();
        scan.nextLine();
        students[count++] = student;
    }
    public int is_Student(int rollno)
    {
        for(int i=0;i<count;i++)
        {
            if(students[i].student_roll==rollno)
                return i;
        }
        return -1;
    }
    public int noOfBookIssue(int stu_index)
    {
        return students[stu_index].borrow;
    }
    public void issue_book(String book,int rollno,Books books)
    {
        int no = books.is_book_ava(book);
        if(no!=-1)
        {
            int stu_index = is_Student(rollno);
            if(stu_index!=-1)
            {
                int no_of_book = noOfBookIssue(stu_index);
                if(no_of_book<=3)
                {
                    students[stu_index].borrow++;
                    books.removeBookQuantity(book);
                    System.out.println("Successfully issued !");
                }
                else
                    System.out.println("Sorry already your issue more than 3 books !");
            }
            else
                System.out.println("Please go and register first !");
        }
        else
            System.out.println("Sorry, Book not avaliable !");
    }
    public void return_book(String book,int rollno,Books books) {
        int stu_index = is_Student(rollno);
        if (stu_index!=-1 && students[stu_index].borrow > 0)
        {
            students[stu_index].borrow--;
            System.out.println("Successfully return to library");
            books.addBookQuantity(book);
        }
        else
        {
            System.out.println("No book to return !!");
        }
    }
}
