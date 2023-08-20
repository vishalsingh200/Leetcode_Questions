class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        // for(int[] row : image){
        //     for(int i = 0; i < (image[0].length + 1) / 2; i++){
        //         int temp = row[i] ^ 1;
        //         row[i] = row[image[0].length - i - 1] ^ 1;
        //         row[image[0].length - i - 1] = temp;
        //     }
        // }
        // return image;
        int rows = image.length;
        int cols = image[0].length;

        for (int i = 0; i < rows; i++) {
            int left = 0;
            int right = cols - 1;

            while (left <= right) {
                // Flip and invert the elements
                int temp = image[i][left];
                image[i][left] = 1 - image[i][right];
                image[i][right] = 1 - temp;

                left++;
                right--;
            }
        }

        return image;
    }
}