import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        int ans1 = (a+b)%c;
        int ans2 = (a*b)%c;
        bw.write(String.valueOf(ans1)+"\n");
        bw.write(String.valueOf(ans1)+"\n");
        bw.write(String.valueOf(ans2)+"\n");
        bw.write(String.valueOf(ans2));
        
        bw.close();
    }
}