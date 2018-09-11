import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TomJerry{
    public static void main(String args[]) throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        int t;
        t=Integer.parseInt(b.readLine());
        if(t>=20 && t<=30 && t%2==0)
            System.out.print("Jerry");
        else if(t%2!=0 && t>=20 && t<=30)
            System.out.print("Tom");
    }
}