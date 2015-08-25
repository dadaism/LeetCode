public class Solution {
    public int singleNumber(int[] A) {
 	    final int undef = -999;
    	int i, j;
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        for (i=0; i<A.length; ++i) {
        	if (A[i]==undef) continue;
        	for (j=i+1; j<A.length; ++j) {
        		if ( A[i] == A[j] ) {
        			A[j] = undef;
        			break;
        		}
        	}
        	if (j==A.length)
        		return A[i];
        }
    	return -1;
    }
}
