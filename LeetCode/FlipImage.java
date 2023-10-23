class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for(int i=0;i<image.length;i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=image[0].length-1;j>=0;j--){
                row.add((image[i][j] == 0) ? 1:0);
            }
            // for(int k=0;k<row.size();k++){
            //     row.set(k, (row.get(k) == 0) ? 1 : 0);
            // }
            arr.add(row);
        }

        int numRows = arr.size();
        int numCols = arr.get(0).size();

        int[][] intArray = new int[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                intArray[i][j] = arr.get(i).get(j);
            }
        }

        return intArray;
    
}
}
