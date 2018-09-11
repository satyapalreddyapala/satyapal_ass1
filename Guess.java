import java.util.*;
class Guess{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>40)
        {
            System.out.print("Number guessed is more than original number");
        }
        else if(n<40)
            System.out.print("Number guessed is less than original number");
        else
            System.out.print("Number guessed matches the original number");
    }
}