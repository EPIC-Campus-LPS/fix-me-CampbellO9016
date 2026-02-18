import java.util.*;

public class Student
{
    public String name;
    public int IdNum;
    public ArrayList<Integer> l;

    /**
     * Constructor creates a new Student object with parameters name and IdNum
     * @param name String, name of the student
     * @param IdNum int, the ID number of the student
     */
    public Student(String name, int IdNum) {
        this.name=name;
        this.IdNum = IdNum;
        l= new ArrayList<Integer>();
    }

    /**
     * Adds student score to Array list
     * @param v int, value of student score
     */
    public void add(int v) {
        l.add(v);
    }

    /**
     * Returns the average of the students scores and returns -1 if empty
     * @return average of student scores, -1 if empty
     */
    public double get_val() {
        if(l.isEmpty()){
            return -1.0;
        }
        double t = 0;
        for (Integer integer : l) {
            t += integer;
        }
        return t/l.size();
    }
}