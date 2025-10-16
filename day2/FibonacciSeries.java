package week1.day2;

public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 30; 

        int firstnum =0;
        int secondnum=1;
        
        System.out.println("Fibonacci Series up to "+ n+" terms:");
        
        if(n>=0) {
        	System.out.print(firstnum+" ");
        }
        if(n>=1) {
        	System.out.print(secondnum+" ");
        }
      
        for(int i=3;i<=n;i++) {
        	int nextnum = firstnum+secondnum;
        	System.out.print(nextnum+" ");
        	firstnum = secondnum;
        	secondnum = nextnum;
        }
        System.out.println(" ");
}}