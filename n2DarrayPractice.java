public class n2DarrayPractice{

public static void main(String args[]){


int A[][]=new int[5][5];
int B[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};


System.out.println("printing 2D array B");
for(int X[]:B){

	for(int y:X){

	System.out.print(y+",");

		}		
	System.out.println("");

}


System.out.println("printing 2D array A");

for(int i=0;i<A.length;i++)
{
	for(int j=0;j<A[0].length;j++)
	{
	System.out.print(A[i][j]+",");
	}System.out.println("");

}



// jagged array 

int C[][];
C=new int[4][];

C[0]=new int[5];
C[1]=new int[7];
C[2]=new int[9];
C[3]=new int[11];


for(int X[]:C)
{
	for(int y:X)
	{
		System.out.print(y);
	}
		System.out.println("");

}






	}

}