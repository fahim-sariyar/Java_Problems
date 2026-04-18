import java.util.Scanner;
public class NumberCheck {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
    
        System.out.print("Enter An Interger Number : "); 
        int n = sc.nextInt();
        if (n > 0)
        {
    System.out.println("Number Is Positive");
        int sum =0;
        System.out.print("Even Number 1 to " + n + ":");
        for(int i=1;i<=n;i++)
        {
        sum +=i;
        if(i%2 == 0 )
        {
  System.out.println(i+ "");
}
}
        System.out.print("\nSum From 1 to " + n + " = " +sum);
}
        else if(n<0 )
        {
        System.out.println("Number Is Negative. No Calculation");
}
        else{
        System.out.println("Number Is Zreo.");
}
        sc.close();
}
}



