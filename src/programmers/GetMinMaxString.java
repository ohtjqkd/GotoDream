package programmers;
public class GetMinMaxString {

    public String getMinMaxString(String str) {
    	String[] array= str.split(" ");
    	int[] array1 = new int[array.length];
    	for(int i = 0; i < array.length; i++) {
    		array1[i] = Integer.parseInt(array[i]);
    	}
    	for(int i = 0; i < array1.length; i ++) {
    		System.out.println(array[i]);
    	}
    	for(int i = 0;i < array1.length - 1; i++) {
    		for(int j = i + 1; j < array1.length; j++) {
    			if(array1[i]>array1[j]) {
    				int temp = array1[i];
    				array1[i] = array1[j];
    				array1[j] = temp;    				
    			}
    		}
    	}
    	return "�ִ밪: " + array1[array1.length - 1] + "   �ּҰ�: " + array1[0];
    }
	public static void main(String[] args) {
        String str = "1 -5598 98456 -4";
        GetMinMaxString minMax = new GetMinMaxString();
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println("�ִ밪�� �ּҰ���?" + minMax.getMinMaxString(str));
	}

}
