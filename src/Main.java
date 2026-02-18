import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();

        // Loads data
        Student s1 = new Student("Alice", 101);
        s1.add(85); s1.add(90); s1.add(78);
        al.add(s1);

        Student s2 = new Student("Bob", 102);
        s2.add(92); s2.add(88); s2.add(95);
        al.add(s2);

        Student s3 = new Student("Charlie", 103);
        s3.add(70); s3.add(60); s3.add(65);
        al.add(s3);

        // Finds grade average and letter grade
        System.out.println("Processing...");
        for (Student temp : al) {
            double d = temp.get_val();
            String g = "";
            if (d >= 90) {
                g = "A";
            } else if (d >= 80) {
                g = "B";
            } else if (d >= 70) {
                g = "C";
            } else if (d >= 60) {
                g = "D";
            } else {
                g = "F";
            }
            String str = "ID: " + temp.IdNum + " | Name: " + temp.name + " | Avg: " + d + " | Grade: " + g;
            System.out.println(str);
        }

        // Returns the student with the highest score
        double m = -1;
        String n = "";
        for (Student x : al) {
            if (x.get_val() > m) {
                m = x.get_val();
                n = x.name;
            }
        }
        System.out.println("Top: " + n + " with " + m);

        // Prints the student with the lowest score
        System.out.println("Needs Help:");
        for(Student z : al) {
            if(z.get_val() < 70) {
                System.out.println(z.name);
            }
        }
    }
}