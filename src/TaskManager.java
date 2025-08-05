import java.sql.*;
import java.util.Scanner;
public class TaskManager{
    public void addTask(Connection con, Scanner s) throws SQLException{
        System.out.print("Enter task:");
        String taskName=s.nextLine();
        PreparedStatement pst=con.prepareStatement("INSERT INTO tasks(description) VALUES(?)");
        pst.setString(1,taskName);
        pst.executeUpdate();
        System.out.println("Task added.");
    }

    public void viewTasks(Connection con)throws SQLException{
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM tasks");
        System.out.println("ID | TASK | STATUS");
        while(rs.next()){
            System.out.println(rs.getInt("id") + " | " +
                    rs.getString("description") + " | " +
                    rs.getString("status"));
        }
    }

    public void markAsDone(Connection con,Scanner s)throws SQLException{
        System.out.print("Enter task ID to mark as done: ");
        int taskId=s.nextInt();
        PreparedStatement pst=con.prepareStatement("UPDATE tasks SET status='Done' WHERE id=?");
        pst.setInt(1, taskId);
        pst.executeUpdate();
        System.out.println("Task marked as done.");
    }
    
    public void deleteTask(Connection con, Scanner s)throws SQLException{
        System.out.print("Enter task ID to delete: ");
        int taskId=s.nextInt();
        PreparedStatement pst=con.prepareStatement("DELETE FROM tasks WHERE id=?");
        pst.setInt(1, taskId);
        pst.executeUpdate();
        System.out.println("Task deleted.");
    }
}

