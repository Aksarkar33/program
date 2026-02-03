import java.util.Scanner;

class Student {
    String fname;
    String lname;
    String email;

    Student(String f, String l) {
        fname = f;
        lname = l;
        email = fname.toLowerCase()  + lname.toLowerCase() +"."+ "it2026@nsec.ac.in";
    }

    void showInfo() {
        System.out.println("\n--- NEW STUDENT ID ---");
        System.out.println("Name : " + fname + " " + lname);
        System.out.println("Email: " + email);
        System.out.println("----------------------");
    }
}

public class EmailGen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String f = sc.next();

        System.out.print("Enter Last Name: ");
        String l = sc.next();

        // Create object
        Student s1 = new Student(f, l);

        // Show result
        s1.showInfo();
    }
}
