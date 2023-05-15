import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long m=sc.nextLong();
        String s=sc.next();
        long x=0,y=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L') 
            --x;
            else if(s.charAt(i)=='R')
            ++x;
            else if(s.charAt(i)=='U')
            ++y;
            else if(s.charAt(i)=='D')
            --y;
            if(x==n && y==m){
            System.out.println("YES");
            return;
            }
        }
        System.out.println("NO");
    }
}