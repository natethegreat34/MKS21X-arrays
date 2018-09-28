public class ArrayDemo{
 	public static void main(String[] args) {
		printArray (new int [5]);
		printArray (new int [4][10]);
		countZeros2D (new int [2] [7]);
}        

public static void printArray(int[]ary){
	System.out.println("[");
for (int i = 0; i < ary.length - 1; i ++){
	System.out.println(ary[i] + ", ");
}
System.out.println(ary[ary.length - 1]);
System.out.println("]");
}

public static void printArray(int[][]ary){
System.out.println ("[");
for (int i = 0; i < ary.length; i++){
for (int t = 0; t < ary[i].length; t++){
System.out.println (ary[i][t] + ", ");}}
System.out.println ("]");
 }
		
public static int countZeros2D(int[][] nums){
int a = 0;
for (int s = 0; s < nums.length; s++){
for (int d = 0; d < nums[s].length; d++){
if (nums[s][d] == 0){
a++;}
}}
return a;}
}
