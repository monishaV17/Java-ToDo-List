import java.sql.Connection;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        TaskManager manager=new TaskManager();
        try(Connection con=DBConnection.getConnection()){
            if(con==null){
                System.out.println("Database connection failed!");
                return;
            }

            while(true){
                System.out.println("\n--- TO-DO LIST MENU ---");
                System.out.println("1. Add Task");
                System.out.println("2. View All Tasks");
                System.out.println("3. Mark Task As Done");
                System.out.println("4. Delete Task");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice=s.nextInt();
                s.nextLine();

                switch(choice){
                    case 1:
                        manager.addTask(con,s);
                        break;
                    case 2:
                        manager.viewTasks(con);
                        break;
                    case 3:
                        manager.markAsDone(con,s);
                        break;
                    case 4:
                        manager.deleteTask(con,s);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        s.close();
                        return;
                    default:
                        System.out.println("Invalid Choice. Try Again!");
                }
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
