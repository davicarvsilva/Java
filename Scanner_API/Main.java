import java.util.Scanner; //Import scanner class for I/O operations

public class Main{

	public static void main( String[] args ){

		Scanner sc = new Scanner( System.in );

		Square square1 = new Square( sc.nextFloat());

		System.out.println( "Square 1 area: " +square1.calcArea());
	}
}