import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());    //숫자의 개수
        String num = br.readLine();
        long sum = 0;
        for(int i=0;i<n;i++){
            sum+=num.charAt(i)-'0';
        }
        bw.write(String.valueOf(sum));
        bw.close();
    }
}