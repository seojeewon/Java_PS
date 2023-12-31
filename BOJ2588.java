import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String num1 = br.readLine();
        String num2 = br.readLine();
        
        int num3, num4, num5, num6;
        
        num3 = Integer.parseInt(num1)*Integer.parseInt(num2.substring(2,3));
        num4 = Integer.parseInt(num1)*Integer.parseInt(num2.substring(1,2))*10;
        num5 = Integer.parseInt(num1)*Integer.parseInt(num2.substring(0,1))*100;
        num6 = Integer.parseInt(num1)*Integer.parseInt(num2);
        
        bw.write(String.valueOf(num3)+'\n');
        bw.write(String.valueOf(num4/10)+'\n');
        bw.write(String.valueOf(num5/100)+'\n');
        bw.write(String.valueOf(num6)+'\n');
        bw.close();
    }
}