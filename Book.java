//Aline Melo Francisco - 6.1.25 - Soft - National College of Ireland

//scanner class to allow to read the input
//ATT should work using uppercase,lowercase, combination
class Book {
    //instance variables for book inventory
    private String title;
    private String author;
    private int year;
    private String category;

    //constructor for class Book
    public Book(){
        this.title = "";
        this.author = "";
        this.year = 0;
        this.category = "";
    }

    //setter method to set the given book information
    public void setBookInfo(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
  
  //conditional method to categorise the book accordingly to the rule
  //(BR2) Books published before 1980 are "Vintage," 
  //greater than or equal to 1980 
  //less than or equal to 2010 as "Standard," 
  //after 2010 as "New Release."
    public void computeCategory(){
        if (year < 1980) {
            category = "Vintage";
        } else if (year >= 1980 && year <= 2010){
            category = "Standard";
        } else {
            category = "New Release";
        }
    }

    //getter method to return the book category of the book
    public String getCategory(){
        return category;
    }

    //method to display book details
    public void displayBookDetails(){
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Category: " + category);
    }

//Q 2a: method to check/validate book titles based on
//Titles must not start with a punctuation symbol, i.e. 
//not start  ‘.’ & ‘?’ & ‘!’, 
// should be at least three words long.
    public boolean validateTitle() {
    //case insensitive validation
    String lowerCaseTitle = title.toLowerCase();

    //to see if starts with invalid characters
    if (lowerCaseTitle.startsWith(".") || lowerCaseTitle.startsWith("?") || lowerCaseTitle.startsWith("!")) {
        return false;
    }

    //to see if three words long
    String[] words = lowerCaseTitle.split(" ");
    return words.length >= 3;
    }

    //getter for title
    public String getTitle() {
        return title;
    }
}


