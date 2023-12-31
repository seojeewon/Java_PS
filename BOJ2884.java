import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        if(m>=45){
            m-=45;
        }
        else{
            m=60+(m-45);
            h=(24+h-1)%24;
        }
        bw.write(String.valueOf(h)+" "+String.valueOf(m));
        bw.close();
    }
}