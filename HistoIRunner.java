//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class HistoIRunner
{
	public static void main( String args[] ) throws IOException
	{
		Histogram test = new Histogram("a b c d e f g h i a c d e g h i h k");
		test.printMap();

		Histogram test = new Histogram("1 2 3 4 5 6 1 2 3 4 5 1 3 1 2 3 4");
		test.printMap();

		Histogram test = new Histogram("Y U I O Q W E R T Y");
		test.printMap();

		Histogram test = new Histogram("4 T # @ ^ # # #");
		test.printMap();
	}
}
