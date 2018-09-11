import java.util.*;
class RepeatString{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] temp=str.toCharArray();
        int n=sc.nextInt();
        System.out.print(str);
        for(int j=1;j<=n;j++)
        {
            for(int i=temp.length-n;i<temp.length;i++)
            {
                System.out.print(temp[i]);
            }
        }
    }
}