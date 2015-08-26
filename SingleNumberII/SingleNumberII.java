public class Solution {
    public int singleNumber(int[] A) {
		 int one = 0, two = 0, three = 0;
		 for (int i=0; i<A.length; ++i) {
			  two = two | (one&A[i]);
			 //three = two
			 one = one ^ A[i];
			 three = two & one;
			 one = one & (~three);
			 two = two & (~three);
		 }
		 
		 return one;
	 }
}
