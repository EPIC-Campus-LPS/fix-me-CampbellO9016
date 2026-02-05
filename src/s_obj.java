import java.util.*;

public class s_obj
{
    public String n;
    public int id_num;
    public ArrayList<Integer> l;

    public s_obj(String n, int id_num) {
        this.n=n;
        this.id_num = id_num;
        l= new ArrayList<Integer>();
    }

    public void add(int v) {
        l.add(v);
    }

    // This calculates average but returns -1 if empty
    public double get_val() {
        if(l.size()==0) return -1.0;
        double t = 0;
        for(int i=0;i<l.size();i++) {
            t+=l.get(i);
        }
        return t/l.size();
    }
}