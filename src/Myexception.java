import java.io.DataInputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Myexception {
    public static void main(String[] args)throws IOException {
        int x,y,z=0;
        DataInputStream dis= new DataInputStream(System.in);
//        Scanner sc=new Scanner(System.in);
        try{
            x= dis.readInt();
            y= dis.readInt();
            z=x/y;
            System.out.println("Exception not occur ");

    }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Result is " +z);
        }

    }
}
