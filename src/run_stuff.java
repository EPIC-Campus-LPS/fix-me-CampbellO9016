import java.util.*;

public class run_stuff {

    public static void main(String[] args) {
        ArrayList<s_obj> al = new ArrayList<s_obj>();

        // Load data
        s_obj s1 = new s_obj("Alice", 101);
        s1.add(85); s1.add(90); s1.add(78);
        al.add(s1);

        s_obj s2 = new s_obj("Bob", 102);
        s2.add(92); s2.add(88); s2.add(95);
        al.add(s2);

        s_obj s3 = new s_obj("Charlie", 103);
        s3.add(70); s3.add(60); s3.add(65);
        al.add(s3);

        // DOING THE MATH AND PRINTING ALL AT ONCE
        System.out.println("Processing...");
        for(int i = 0; i < al.size(); i++) {
            s_obj temp = al.get(i);
            double d = temp.get_val();
            String g = "";
            if (d >= 90) g = "A";
            else if (d >= 80) g = "B";
            else if (d >= 70) g = "C";
            else if (d >= 60) g = "D";
            else g = "F";

            System.out.println("ID: " + temp.id_num + " | Name: " + temp.n + " | Avg: " + d + " | Grade: " + g);
        }

        // FINDING THE BEST STUDENT
        double m = -1;
        String n = "";
        for (s_obj x : al) {
            if (x.get_val() > m) {
                m = x.get_val();
                n = x.n;
            }
        }
        System.out.println("Top: " + n + " with " + m);

        // FINDING FAILING STUDENTS
        System.out.println("Needs Help:");
        for(s_obj z : al) {
            if(z.get_val() < 70) {
                System.out.println(z.n);
            }
        }
    }
}