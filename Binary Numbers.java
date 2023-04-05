//Binary Numbers
//https://www.hackerrank.com/challenges/30-binary-numbers/problem
/*
Task
Given a base- integer, , convert it to binary (base-). Then find and print the base- integer denoting the maximum number of consecutive 's in 's binary representation. When working with different bases, it is common to show the base as a subscript.

Example

The binary representation of  is . In base , there are  and  consecutive ones in two groups. Print the maximum, .

Input Format

A single integer, .

Constraints

Output Format

Print a single base- integer that denotes the maximum number of consecutive 's in the binary representation of .

Sample Input 1

5
Sample Output 1

1
Sample Input 2

13
Sample Output 2

2
Explanation

Sample Case 1:
The binary representation of  is , so the maximum number of consecutive 's is .

Sample Case 2:
The binary representation of  is , so the maximum number of consecutive 's is .
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        char[] result = Integer.toBinaryString(n).toCharArray();
        int tempcount = 0;
        int maxcount = 0;
        for (int i = 0;i < result.length; i++){
            tempcount = (result[i] == '0') ? 0 : tempcount + 1;
            if(tempcount>maxcount){
                maxcount = tempcount;
            }
        }
        System.out.print(maxcount);
        
    }
}
