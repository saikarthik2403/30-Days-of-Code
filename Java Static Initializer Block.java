import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int B,H;
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        try{
            int area =  B * H;
            if(B<=0){
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
            else if(H<=0){
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
            else{
                System.out.println(area);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
