public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (num.length<3)
            return result;
        
        // sort array
        Arrays.sort(num);
        
        for (int i=0; i<num.length-2; ++i) {
            if (i==0 || num[i]>num[i-1]) {
                int negate = -num[i];
                int start = i + 1;
                int end = num.length - 1;
                
                while (start<end) {
                    // case 1
                    if (num[start]+num[end]==negate) {
                        List<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(num[i]);
                        tmp.add(num[start]);
                        tmp.add(num[end]);
                        result.add(tmp);
                        start++;
                        end--;
                        while (start<end && num[start]==num[start-1])
                            start++;
                        while (start<end && num[end]==num[end+1])
                            end--;
                    }else if (num[start]+num[end]<negate) { // case 2
                        start++;
                    }else { // case 3
                        end--;
                    }
                }
            }
        }
        return result;
    }
}
