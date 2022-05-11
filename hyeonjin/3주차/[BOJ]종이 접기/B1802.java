import java.io.*;
import java.util.*;
class B1802{
    // 종이 접기
    static String result="YES";
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> answer = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            String tmp = br.readLine();
            result="YES";
            check(tmp, 0,tmp.length()-1);
            answer.add(result);
        }
        for(String x:answer){
            System.out.println(x);
        }
    }
    // 001 0 001 0 011 0 001
    public static void check(String str, int start, int end){
        if(start==end){
            return;
        }
        int mid = (start+end)/2; //3
        if(str.length()==1){
            result="YES";
            return;
        }
        for(int i=start;i<mid;i++){ //3
            if(str.charAt(i)==str.charAt(end-i)) {
                result = "NO";
            }
        }
        check(str,start,mid-1);
        check(str,mid+1,end);


    }
}