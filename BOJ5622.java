import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String pNum = br.readLine();    //단어
        int ans = 0;
        for(int i=0;i<pNum.length();i++){
            char c = pNum.charAt(i);
            if(c=='A'||c=='B'||c=='C'){
                ans+=3;
            }
            else if(c=='D'||c=='E'||c=='F'){
                ans+=4;
            }
            else if(c=='G'||c=='H'||c=='I'){
                ans+=5;
            }
            else if(c=='J'||c=='K'||c=='L'){
                ans+=6;
            }
            else if(c=='M'||c=='N'||c=='O'){
                ans+=7;
            }
            else if(c=='P'||c=='Q'||c=='R'||c=='S'){
                ans+=8;
            }
            else if(c=='T'||c=='U'||c=='V'){
                ans+=9;
            }
            else{
                ans+=10;
            }
        }
        bw.write(String.valueOf(ans));
        
        bw.close();
    }
}