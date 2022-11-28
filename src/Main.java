import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
        Parallelepiped parallelepiped = new Parallelepiped(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        System.out.println(parallelepiped);
        parallelepiped.checkArea();
        parallelepiped.checkVolume();}
        catch (InputMismatchException e){
            System.out.println(" tolko san ber ");
        }
        catch (Exception e){
            System.out.println(" san 0 don chon bolsun ");
        }
    }
}