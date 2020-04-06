import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TemaEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(5);
        a.add(2);
        a.add(8);
        a.add(8);
        a.add(8);
        a.add(2);
        Collections.sort(a);
        int nr=1,maxx=-1;
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=0;i<a.size()-1;i++)
        {
            if(a.get(i)==a.get(i+1))
                nr++;
            else {
                if (nr > maxx) {
                    b.clear();
                    b.add(a.get(i));
                    maxx = nr;
                   // nr = 1;
                }
                else if(nr==maxx){
                    b.add(a.get(i));
                }
                nr = 1;

            }
        }
        for(int i=0;i<b.size();i++)
        System.out.println(b.get(i));


    }
}
