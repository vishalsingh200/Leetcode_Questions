class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        // int maxCandy = 0;
        // for (int candy : candies){
        //     maxCandy = Math.max(candy, maxCandy);
        // }
        // for (int candy : candies){
        //     result.add(candy + extraCandies >= maxCandy);
        // }
        // return result;
        int maxCandies = 0;
        for (int i = 0; i < candies.length; i++){
            int x = candies[i];
            maxCandies = Math.max(x, maxCandies);
        }
        for (int i = 0; i < candies.length; i++){
            int y = candies[i];
            result.add(y + extraCandies >= maxCandies);
        }
        return result;
    }
}