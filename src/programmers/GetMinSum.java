package programmers;

public class GetMinSum {
	public int getMinSum(int []A, int []B)
	    {
	      	int [][]aMatrix = new int [1][A.length];
	      	int [][]bMatrix = new int [B.length][B.length];
	      	int [][]tempArray = new int [A.length][bMatrix[0].length];
	      	aMatrix[0] = A;
	      	bMatrix[0] = B;
	      	for(int i = 1; i < bMatrix.length; i++){
	          for(int j = 0; j < bMatrix[0].length; j++){
	            bMatrix[i][j] = bMatrix[i - 1][(j + 1) % bMatrix[0].length];
	          }
	        }
	      	for(int i = 0; i < A.length; i++){
	          for(int j = 0; j < bMatrix[0].length; j++){
	            for(int k = 0; k < bMatrix.length; k++){
	              tempArray[i][j] += aMatrix[0][k]*bMatrix[k][j];
	            }
	          }
	        }
	      	int[] answer = new int[A.length];
	      	for(int i = 0;i < A.length; i++){
	          answer[i] = tempArray[0][i];
	        }
	      	for(int i = 0; i < answer.length; i++){
	          for(int j = i + 1; j < answer.length; j++){
	            if(answer[i] > answer[j]){
	              int temp = answer[i];
	              answer[i] = answer[j];
	              answer[j] = temp;
	            }
	          }
	        }
			return answer[0];
	    }
	    public static void main(String[] args)
	    {
	        GetMinSum test = new GetMinSum();
	        int []A = {1,2,3,10};
	        int []B = {3,4,5,11};
	        System.out.println(test.getMinSum(A,B));
	    }
	}