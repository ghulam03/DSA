package ProblemsKK.Arrays;

import java.util.Arrays;

public class FlipImage {
        public static int[][] flipAndInvertImage(int[][] image) {

            //rotate image
            for(int i=0;i<image.length;i++){
                int left=0;
                int right=image[i].length-1;
                int temp;
                while(left<=right){
                    temp=image[i][left];
                    image[i][left]=image[i][right];
                    image[i][right]=temp;

                    left++;
                    right--;
                }
            }
            //invert image
            for(int i=0;i<image.length;i++){
                for(int j=0;j<image[i].length;j++){
                    image[i][j]=1-image[i][j];
                }

            }
            return image;

        }


    public static void main(String[] args) {
            int[][] imagee={{1,1,0,0},{0,0,1,0},{0,1,0,1}};
          int[][]  solImage=(flipAndInvertImage(imagee));
        System.out.println(Arrays.deepToString(solImage));

    }
}
