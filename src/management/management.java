
package management;

public class management {
    public static void main(String[] args) {
        String  className = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(className);
            System.out.println("Driver loaded successfully");
        } catch(Exception e) {
            System.out.println("Driver failed to load successfully");
            System.out.println("Error" + e.getMessage());
        }
    }
    
}
