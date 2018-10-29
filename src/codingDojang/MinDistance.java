package codingDojang;
public class MinDistance {
	public String distance(int[] array) {
		MinDistance min = new MinDistance();
		String result = "";
		int[] distance = new int[array.length-1];
		for(int i = 0; i < array.length - 1; i++) {
			int a1 = array[i];
			int a2 = array[i + 1];
			distance[i] = a2 - a1;
			System.out.println(distance[i]);
		}
		int[] str = distance;
		int md = min.minimum(str);
		for(int i = 0; i < distance.length; i++) {
			if(distance[i] == md) {
				result = result  + String.valueOf(array[i])+", "+ String.valueOf(array[i + 1]) + "\n";
			}
				
		}
		return result;
	}
	public int minimum(int[] array) {
		int result = 0;
		for(int i = 0; i < array.length;i++) {
			for(int j = i + 1; j < array.length;j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		result = array[0];
		return result;
	}
	
	public static void main(String[] args) {
		MinDistance x = new MinDistance();
		int[] intArray = {1, 3, 4, 8, 13, 17, 20, 22};
		System.out.print(x.distance(intArray));

	}

}
