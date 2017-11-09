
/**
 * Write a description of class MediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MediaLib
{
    // instance variables - replace the example below with your own
    private int x;

    public static void main()
    {
        System.out.println("Welcome to your media library!");
        
        Song song1 = new Song ();
        
        System.out.println(song1);
        
        song1.setTitle("Johnny B. Goode");
        System.out.println(song1.getTitle());
        
        song1.setRating(9);
        System.out.println(song1.getRating());
        
        
        
        Movie movie1 = new Movie ();
        System.out.println(movie1);
        
        movie1.setTitle("Sausage Party");
        System.out.println(movie1.getTitle());
        
        movie1.setRating(9);
        System.out.println(movie1.getRating());
        
        Books books1 = new Books();
        System.out.println(books1);
        
        books1.setTitle("Fifty Shade of Black");
        System.out.println(books1.getTitle());
        
        books1.setRating(9);
        System.out.println(books1.getRating());
    }
        // put your code here
       
    
}

