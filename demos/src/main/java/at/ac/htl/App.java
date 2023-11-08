package at.ac.htl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        
    }

    public int getSum(){
        var sum = 0;
        for (var i = 1; i <= 10; i++){
            sum += i * i;
        }
        return sum;
    }
}
