package UNIT3;
import java.util.
*;

public class Arraylist2 {
    public static void main(String[] args) {
        ArrayList<String> product = new ArrayList<>();
        System.out.println("Enter the num of products  : ");
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        for( int i = 0 ; i< n ; i++){
            product.add(sc.next());
        }
        Collections.sort(product);
        Iterator it =  product.iterator();

        while( it.hasNext()){
            System.out.println(it.next());
        }
        product.add(1,"Apple");
        product.addLast("bannana");
        product.addFirst("peach");
        System.out.println(product.get(2));

    }
}
