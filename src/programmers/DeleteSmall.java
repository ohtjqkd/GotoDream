package programmers;
import java.util.*;
public class DeleteSmall {
	public ArrayList solution (int[] arr) {
		ArrayList newArr = new ArrayList<>();
		int min = arr[0];
		if(arr.length>1) {
			for (int i = 1; i < arr.length; i++) {
				min = (min > arr[i]) ? arr[i] : min;
				newArr.add(arr[i]);
			}
			newArr.remove(newArr.indexOf(min));
			
			return newArr.toArray();
		}
		ArrayList def = new ArrayList<>();
		def.add(arg0)
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteSmall ds = new DeleteSmall();
		int[] arr = {9};
		for (int i = 0; i < arr.length-1; i++) {
			System.out.println(ds.solution(arr));
		}

	}

}
