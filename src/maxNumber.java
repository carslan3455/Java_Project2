public class maxNumber {


      /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}

        print the max number from the 2d array

     */


     /*

         {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}

         int 2D arrayini  olustur

        2D arrayinden max number print et

     */


    public static void main(String[] args) {
                    //      0       1         2         3
       int[][] array = {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}};
                    //   0 1 2    0 1 2     0 1 2     0 1 2
       int max=array[0][0];

        for(int i=0; i<array.length; i++){            // for(int i=0; i<4; i++){
            for(int j=0; j<array[i].length; j++){     //    for(int j=0; j<3; j++){
                if (array[i][j]>max)
                    max=array[i][j];

               // max = Math.max(max,array[i][j]);

            }
        }
        System.out.println(max);



    }

}
