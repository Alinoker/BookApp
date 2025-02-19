//Aline Melo Francisco - 6.1.25 - Soft - National college of Ireland

//Q1.b
//application class (BookApp).
//develop app using Book Class to categorise multip books
//enable user to enter inf for multiple books.
import java.util.Scanner;
public class BookApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String continueInput;

        do {
            //create a new Book object
            Book book = new Book();

            //prompt user for book details
            System.out.println("Put book details please: TITLE, AUTHOR and YEAR ");
            String input = scanner.nextLine();

            //split the input into parts (assuming the format is correct)
            String[] details = input.split(",");

            //extract and trim the details
            String title = details[0].trim();
            String author = details[1].trim();
            int year = Integer.parseInt(details[2].trim());

            //set book inf.
            book.setBookInfo(title, author, year);


            //validate book title whether each title is valid or invalid
            if (book.validateTitle()) {
                System.out.println("The title \"" + book.getTitle() + "\" is VALID.");
            } else {
                System.out.println("The title \"" + book.getTitle() + "\" is INVALID.");
            }
            

            //compute the category
            book.computeCategory();

            //display the book details
            book.displayBookDetails();

            //ask user if wants to categorise another book
            System.out.println("Would you like to categorise another book? Put YES or NO):");
            continueInput = scanner.nextLine().trim().toLowerCase();
        
        } while (continueInput.equals("yes"));
        scanner.close();

        System.out.println("You have used our Library Book Categorisation! :D THANKS A MILLION :D ");
    }
}
    //Harry Potter, J.K. Rowling, 1997
    //!Harry Potter, J.K. Rowling, 1997

