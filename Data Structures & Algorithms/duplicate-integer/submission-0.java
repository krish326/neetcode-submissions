class Solution {
    public boolean hasDuplicate(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int temp = map.getOrDefault(arr[i], 0) + 1;
            if(temp > 1){
                return true;
            }

            map.put(arr[i], temp);
        } return false;
    }
}