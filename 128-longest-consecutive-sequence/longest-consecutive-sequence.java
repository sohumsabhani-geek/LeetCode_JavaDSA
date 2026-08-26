class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int max = 0;
        for(int x : set){
            if(!set.contains(x-1)){
                int current = x;
                int length = 1;

                while(set.contains(current + 1)){
                    current++;
                    length++;
                }
                if(length>max){
                    max = length;
                }
            }
        }
        return max;
    }
}