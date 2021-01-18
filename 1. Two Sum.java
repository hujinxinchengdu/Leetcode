/*
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
*/

/*
class Solution{
    public int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < nums.length; i++){
            map.put(nums[i],i);//此题因为数组中的数字不重复，所以可以将nums作为键，这样更加简便
        }
        for(int j = 0 ; j < nums.length ; j++){
            int complement = target - nums[j];
            if(map.containsKey(complement) && map.get(complement) != j){
                return new int[]{j,map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
*/
/*
class Solution{
    public int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < nums.length; i++){
            map.put(i,nums[i]);//若数组可以重复，则只能将nums作为值
        }
        for(int j = 0 ; j < nums.length ; j++){
            int complement= target - nums[j];
            //由于值可能相同，那便有多个键对应一个同一个值,本题假设只有一个解
            if(map.containsValue(complement)){
                int k = 0;// = 0 是否正确，若complement和nums[j]为同一个，则没有k
                for(; k < nums.length; k++){
                    if(map.get(k) == complement && j != k){
                        return new int[]{j,k};
                    }
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
*/
/*
class Solution{
    public int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        int complement;
        for(int i = 0 ; i < nums.length; i++){
            complement = target - nums[i];
            if(map.containsKey(complement)){ //此处不用判断complement的值是否就是i，因为此时还没有将[nums[i],i]put进hashmap
                return new int[]{map.get(complement),i};//这个顺序下，i肯定大于map.get(complement)
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}

