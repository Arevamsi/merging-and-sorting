public class Fp6 {

	public static void main(String args[]) {
		int[] l1 = {1,2,3,4,5};
		int[] l2 = {6,7,8,9,10};
		
		int n1 = l1.length;
		int n2 = l2.length;
		
		int[] merged = new int[n1 + n2];
		
		int i = 0, j= 0, k = 0;
		
		while(i<n1 && j<n2) {
			if(l1[i] < l1[j]) {
				merged[k++] = l1[i++];
			}else {
				merged[k++] = l2[j++];
			}
		}
		
		while(i < n1) {
			merged[k++] = l1[i++];
		}
		
		while(j < n2) {
			merged[k++] = l2[j++];
		}
		
		System.out.println("Merged and sorted list : ");
		for(int a:merged) {
			System.out.print(a + " ");
		}
	}
}
