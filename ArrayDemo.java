public class ArrayDemo{
 	public static void main(String[] args) {
		printArray (new int [5]);
		printArray (new int [4][10]);
		countZeros2D (new int [2] [7]);
		fill2D(new int [2] [4]);
		fill2DCopy (new int [3] [1]);
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

public static void fill2D(int[][] vals){
	for (int i = 0; i < vals.length; i++){
		for (int t = 0; t < vals[i].length; t++){
			if (i == t) {vals[i][t] = 3;}
			else {
			vals[i][t] = 1;}
		
System.out.println(vals[i][t] + ", ") ;}
}
}
public static int[][] fill2DCopy(int[][] vals){
//from here...   
 int [][] pgm;
    pgm = new int[vals.length][];
    for( int x = 0; x < vals.length;x++){
      pgm [x] = new int[vals[x].length];
    }
//to here I was helped by Moududur Rahman
	for (int i = 0; i < vals.length; i++){
		for (int t = 0; t < vals[i].length; t++){
			if (vals[i][t] < 0){pgm [i][t] = 3;}
			else{pgm [i][t] = 1;}
		
	}}
return pgm;}
}
	



