
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Wpisz znak operacji");
		
		Scanner newObj=new Scanner(System.in);
		
		String operation=newObj.nextLine();
		
		
		System.out.println("Wpisz pierwszą liczbe");
		
		int one=newObj.nextInt();
		
		
		System.out.println("Wpisz drugą liczbe");
		int two=newObj.nextInt();
// 		String operation=newObj.nextLine();
		
	
		
		switch(operation){
		    case "+":
		        int add=two+one;
		        System.out.print("Wynik dodawania to: " +add);
		        break;
		  case "-":
		      int subs=one-two;
		      System.out.println("Wynik odejmowania to: "+subs);
		      break;
		      
		  case "*":
		      
		      int multi=one*two;
		      System.out.println("Wynik mnożenia to: "+multi);
		      break;
		      
		      case "/":
		          
		      int divi=one/two;
		      System.out.println("Wynik dzielenia to: "+divi)  ;  
		      break;
		    
		    
		}
		
	}
}
