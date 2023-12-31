import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        String a = st.nextToken();
        String b = st.nextToken();
        
        StringBuilder sa = new StringBuilder(a);
        StringBuilder sb = new StringBuilder(b);
        
        a=sa.reverse().toString();
        b=sb.reverse().toString();
        
        if(Integer.parseInt(a)>Integer.parseInt(b)){
            bw.write(a);
        }else{
            bw.write(b);
        }
        bw.close();
    }
}