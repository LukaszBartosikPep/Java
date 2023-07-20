import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class TaskMngr
{

   private ArrayList<String> Tasks=new ArrayList<>();
    
    
    

        


    public void populateArray(){


		Tasks.add("First");
		Tasks.add("Second");
		Tasks.add("Third");

	}
    public void addTasks(String noweZadanie){
		int size=Tasks.size();
        Tasks.add(noweZadanie);

        
    }
    public void viewAll(){

//		int size=Tasks.size();
//		for(int i=1; i<=size;i++){
//			int
//			String j =toString();
//			Tasks.add(i,j);
////
//		}
		System.out.println(Tasks);

        
    }
    public void del(int numb){
		int size=Tasks.size();
//		System.out.println(size);
//		for(int i=1; i<=size;i++){
//
//			System.out.println(i);
//		}
		Tasks.remove(numb-1);
    }
	public void mark(int sign){
		String modifyTask=Tasks.get(sign-1)+ "*";
		Tasks.set(sign-1, modifyTask);



	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		TaskMngr newObj = new TaskMngr();

//		newObj.Init();
		newObj.populateArray();
		newObj.viewAll();




		while (true) {
			System.out.println("Aby dodac zadanie wybierz 1.");
			System.out.println("Aby usunąć zadanie wybierz 2.");
			System.out.println("Aby zaznaczyć zadanie wybierz 3.");

			int choice = scanner.nextInt();

			switch (choice) {


				case 1:

					System.out.println("Wpisz zadanie");

					String noweZadanie = scanner.next();

					newObj.addTasks(noweZadanie);

				case 2:
					 System.out.println("Które zadanie chcesz usunąć, wpisz numer");
					 newObj.viewAll();

					 //Wyświetl numery zadań i po wpisaniu numeru usun zadanie
					 int numb = scanner.nextInt();
					 newObj.del(numb);
					 newObj.viewAll();
				case 3:
					System.out.println("Które zadanie chcesz zaznaczyć?");
					int sign= scanner.nextInt();
					newObj.mark(sign);
					newObj.viewAll();



			}



		}



		
	}
}
