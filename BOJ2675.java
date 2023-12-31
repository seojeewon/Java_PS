import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            String newS = "";
            for(int k=0;k<s.length();k++){
                for(int j=0;j<r;j++){
                    newS+=s.charAt(k);
                }
            }
            bw.write(newS+"\n");
        }
        bw.close();
    }
}