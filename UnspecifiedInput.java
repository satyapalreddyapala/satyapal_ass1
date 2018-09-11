import java.util.*;
class UnspecifiedInput{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s;
        int k, sum = 0, f = 1;
        s = in.nextLine();
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++)
        {   k = Integer.parseInt(str[i]);
            sum += k;
        }
        System.out.print(sum);
    }
}