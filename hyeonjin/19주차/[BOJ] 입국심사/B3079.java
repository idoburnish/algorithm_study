import java.util.*;
import java.io.*;
class B3079{
        static int N,M;
        static long simsa[];
        public static void main(String[] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String input[] = br.readLine().split(" ");
                N = Integer.parseInt(input[0]);
                M = Integer.parseInt(input[1]);

                simsa = new long[N];
                for(int i=0;i<N;i++){
                        simsa[i] = Integer.parseInt(br.readLine());
                }
                Arrays.sort(simsa);
                long answer = BinarySearch(simsa[0], simsa[N-1]*M);
                System.out.println(answer);
        }

        public static long BinarySearch(long left, long right){
                long answer = 0;
                while(left<=right){
                        long mid = (left+right)/2; // 걸리는 시간
                        long count = CanSimsa(mid);
                        if(count<M){
                                left = mid+1;
                        }
                        else{
                                answer = mid;
                                right = mid-1;
                        }
                }
                return answer;
        }

        public static long CanSimsa(long time){
                long count = 0;
                for(int i=0;i<N;i++){
                        long t = simsa[i]; // 심사대 시간
                        count+=time/t;
                        if(count>M) break;
                }
                return count;
        }

}