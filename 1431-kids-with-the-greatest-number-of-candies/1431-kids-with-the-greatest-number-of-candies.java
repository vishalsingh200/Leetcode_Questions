class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = 0;
        for(int candy : candies){
            max = Math.max(candy, max);
        }
        
        for(int candy : candies){
             list.add(candy + extraCandies >= max);
        }
        return list;
    }
}