
public class Exam1 {

	public static void main(String[] args) {
		int[] list = new int [5];
		
		for(int i =0; i < list.length; i++) {
			list[i] = i * 3;
		}
		
		for(int i = 0; i<list.length -1; i++) {
			list[i] = list[i + 1] + list[i];
		}
		for (int x = 0; x < list.length; x++) {
			
			System.out.println(list[x] + "\n");
		}
		
	}

}
