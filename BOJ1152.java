import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int cnt = 0;
        while(st.hasMoreTokens()){
            //bw.write(st.nextToken()+"\n");
            st.nextToken();
            cnt++;
        }
        bw.write(String.valueOf(cnt));
        bw.close();
    }
}