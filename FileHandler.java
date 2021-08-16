import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FileHandler {

	// Driver Code
	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);

		System.out.println("Please provide the file directory location");

		String s = input.next();

		//parsing a CSV file into Scanner class constructor  
		Scanner sc;

		ArrayList <Integer> sortWeight = new ArrayList<Integer>();

		try {
			sc = new Scanner(new File(s));
			sc.useDelimiter(",");   //sets the delimiter pattern  

			while (sc.hasNext())  //returns a boolean value  
			{  
				sortWeight.add(Integer.parseInt(sc.next()));  //find and returns the next complete token from this scanner  
			}   

			sc.close();  //closes the scanner 

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}  


		int[] arey = new int[sortWeight.size()];;
		
		Iterator<Integer> iterator = sortWeight.iterator();
		
		for(int i=0; i<sortWeight.size(); i++) {

			arey[i]=iterator.next().intValue();
		}

		int n = arey.length;



		Quicksorter.quickSort(arey, 0, n - 1);
		System.out.println("Sorted arey: ");
		Quicksorter.printArey(arey, n);
	}

}
