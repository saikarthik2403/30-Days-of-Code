//Abstract Classes
//https://www.hackerrank.com/challenges/30-abstract-classes/problem
/*
Task
Given a Book class and a Solution class, write a MyBook class that does the following:

Inherits from Book
Has a parameterized constructor taking these  parameters:
string 
string 
int 
Implements the Book class' abstract display() method so it prints these  lines:
, a space, and then the current instance's .
, a space, and then the current instance's .
, a space, and then the current instance's .
Note: Because these classes are being written in the same file, you must not use an access modifier (e.g.: ) when declaring MyBook or your code will not execute.

Input Format

You are not responsible for reading any input from stdin. The Solution class creates a Book object and calls the MyBook class constructor (passing it the necessary arguments). It then calls the display method on the Book object.

Output Format

The  method should print and label the respective , , and  of the MyBook object's instance (with each value on its own line) like so:

Title: $title
Author: $author
Price: $price
Note: The  is prepended to variable names to indicate they are placeholders for variables.

Sample Input

The following input from stdin is handled by the locked stub code in your editor:

The Alchemist
Paulo Coelho
248
Sample Output

The following output is printed by your display() method:

Title: The Alchemist
Author: Paulo Coelho
Price: 248
*/



class MyBook extends Book{
    int price;
    MyBook(String title,String author,int price){
        super(title,author);
        this.price = price;
    }
    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}
// Declare your class here. Do not use the 'public' access modifier.
    // Declare the price instance variable
    
    /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    // Write your constructor here
    
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    // Write your method here
    
// End class


