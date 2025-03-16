import java.util.Arrays;
import java.util.Scanner;
class Longest_prefix_sorting{
    static String longestcommonprefix(String[] arr){
        Arrays.sort(arr);
        String first=arr[0];
        String last=arr[arr.length-1];
        int minLength=Math.min(first.length(),last.length());
        //find the common prefix between the first 
        //and last strings
        int i=0;
        while(i<minLength&&first.charAt(i)==last.charAt(i)){
            i++;
        }
        return first.substring(0,i);
    }
        public static void main(String[] args){
        String[] arr = { "geeksforgeeks", "geeks", 
                        		"geek", "geezer" };
        System.out.println(longestcommonprefix(arr));
    }

}