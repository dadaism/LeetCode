public class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        HashSet<ArrayList<Integer>> hashSet = new HashSet<ArrayList<Integer>>();
        
        if ( num==null || num.length<4)   return result;
        Arrays.sort(num);
        
        for (int i=0; i<num.length-3; ++i) {
            for (int j=i+1; j<num.length-2; ++j) {
                int start = j+1;
                int end = num.length-1;
                while (start<end) {
                    int sum = num[i] + num[j] + num[start] + num[end];
                    if ( sum==target ) {
                        ArrayList<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(num[i]);
                        tmp.add(num[j]);
                        tmp.add(num[start]);
                        tmp.add(num[end]);
                        if ( !hashSet.contains(tmp) ) {
                            hashSet.add(tmp);
                            result.add(tmp);
                        }
                        start++;
                        end--;
                    } else if (sum<target) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
            
        }
        return result;
    }
}
