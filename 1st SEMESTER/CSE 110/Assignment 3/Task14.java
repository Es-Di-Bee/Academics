import java.util.Scanner;
public class Task14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number");
        int number = sc.nextInt();
        System.out.println(Math.abs(number));
    }
}