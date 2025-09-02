package UNIT3;
import java.util.ArrayList;

public class Arraylist1
{
    public static void main(String[] args) {
     ArrayList<Integer> al = new ArrayList<>();
     al.add(12);
     al.add(13);
     al.add(34);
        System.out.println(al);
        for( int  al1:al){
            System.out.println(al1);
        }
    }
}
