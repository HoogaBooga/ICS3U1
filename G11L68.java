//By Jacky Chen
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class G11L68 {
	final static int NUMELEM = 100;
	static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {

		int num[] = new int [NUMELEM];
		num=input();
		System.out.println("Unsorted List");
		output(num);
		System.out.println("Sorted List");
		bubbleSorting(num);
		output(num);
		Integer[] ocur=search(num);
		displayOcur(ocur);
	}

	public static int[] input (){
		int num[] = new int [NUMELEM];
		for (byte i = 0; i < num.length; i ++)
			num[i] = (int)(Math.random()*1000);
		return num;
	}

	public static void bubbleSorting (int num[]){
		boolean swap;
		int temp;
		for (byte i=0;i<num.length-1;i++){//number of passes
			swap=false;
			for (byte j = 0; j < ((num.length-1)-i); j++){ //number of comparisons
				if (num[j] > num[j+1]){
					swap=true;
					temp = num[j];		//swapping
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}//end inner for loop
			if (swap==false){//makes no further passes if no swaps were necessary
				break;
			}
		}//end outer loop
	}
	public static void output (int num[]){
		for (int i = 0; i <NUMELEM; i ++){
			System.out.print (num[i]+"\t");
			if ((i+1)%5 == 0)
				System.out.println();
		}
	}

	public static Integer[] search( int num[] ) { 
		int n = 0;
		int key;
		List <Integer> occurances=new ArrayList<Integer>();//an array without specific size?
		System.out.println("Please enter key");
		key=sc.nextInt();
		while (n < num.length) {
			if ( num[n] == key ) {
				occurances.add(n);
			}
			n++;
		}
		if (occurances.size()==0){
			System.out.println("This number is not within the numbers generated");
		}

		return occurances.toArray(new Integer [occurances.size()]);
	}


	public static void displayOcur (Integer ocur[]){
		for (byte b=0; b<ocur.length;b++){
			System.out.println("This number occured at index:"+ocur[b]);
		}
	}
}











/*DOING
*/


/*TO-DO
*/

/*DONE
 * method for generating numbers
 * method for outputing numbers
 * method for sorting numbers
 * method for searching numbers and outputting occurances
 * method for displaying occurances
*/