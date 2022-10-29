import java.util.*;
import java.io.*;
class B2470{
    static int ans1,ans2;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        String[] input = br.readLine().split(" ");
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);
        TwoPointer(arr);
        System.out.println(ans1+" "+ans2);
    }

    public static void TwoPointer(int [] arr){
        int left = 0;
        int right = N-1;
        long gap = Math.abs(arr[left]+arr[right]);
        ans1 = 0;
        ans2 = 0;
        while(left<right){
            int sum = arr[left]+arr[right];
            if(Math.abs(sum) <= gap){
                gap = Math.abs(arr[left]+arr[right]);
                ans1 = arr[left];
                ans2 = arr[right];
            }
            if(sum>0){
                right--;
            }
            else{
                left++;
            }
        }
    }
}