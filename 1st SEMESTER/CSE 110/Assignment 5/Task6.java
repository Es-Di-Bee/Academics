import java.util.Scanner;
public class Task6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = sc.nextInt();
        int[] a = {10, 30, 20, 50, 40};
        for(int i=0; i<=4; i++)
        {
            for(int j=i+1; j<=4; j++)
            {
                if(a[i]<a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(a[n-1]);
        sc.close();
    }
}
        
        