import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
    private List<String> Tasks;
    
    
    
    public void Init(){
        
        Tasks=new ArrayList<>();
    }
    public void populateArray(){
        
        
        
        Tasks.add("First");
        
    }
    public void addTasks(){
        
        
    }
    public void viewAll(){
        System.out.println(Tasks);
        
    }
    public void del(){
        
    }
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Main newObj=new Main();
		
		newObj.Init();
		newObj.populateArray();
		newObj.viewAll();
		
		String name="Jason";
		
		
		while (true){
		    System.out.println("Aby dodac zadanie wybierz 1.");
		    System.out.println("Aby usunąć zadanie wybierz 2.");
		    System.out.println("Aby wyświetlić zadania wybierz 3.");
		    int choice=scanner.nextInt();
		    
		    switch(choice){
		        
		        
		        
		        case 1:
		            
		            
		    }
		    
		    
		    
		}
		
// 		Neu neuObj=new Neu(name);
		
		
	}
}
// class Neu{
    
    
//     private String name;
    
    
//     public Neu(String name){
//         this.name=name;
//     }
    
    
//     public String getname(){
//         return name;
//     }
    
    
    
    