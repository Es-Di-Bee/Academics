import java.util.Scanner;
public class Task12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        int count = 1;
        int multipleOfFour = 0;
        while(count<=10)
        {
            System.out.println("Please input a number");
            int number = sc.nextInt();
            if(number%4==0)
            {
                sum+=number;
                multipleOfFour++;
            }
            count++;
        }
        double avg = sum/multipleOfFour;
        System.out.println("Average:" + avg);
        System.out.println("Sum:" + sum);
    }
}
