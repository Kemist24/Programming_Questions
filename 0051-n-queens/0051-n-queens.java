class Solution
{
    static  List<List<String>> finalAns;

    public static List<List<String>> solveNQueens(int n) {
      int   arr[][] = new int[n][n];
        finalAns = new ArrayList<>();
       printNQueens(arr, 0);
        return finalAns;
    }

    public static boolean isItSafePlaceForQueen(int arr[][], int row, int col) {

//        CHECK IN ABOVE COLUMNS
        for (int i = row - 1, j = col; i >= 0 && j >= 0; i--) {
            if (arr[i][j] == 1) return false;
        }

//        CHECK DIAGONALLY ON LEFT
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 1) return false;
        }
//        CHECK DIAGONALLY ON RIGHT
        for (int i = row - 1, j = col + 1; i >= 0 && j < arr[0].length; i--, j++) {
            if (arr[i][j] == 1) return false;
        }

        return true;
    }

    public static void printNQueens(int arr[][], int row) {
        if (row == arr.length) {
//            System.out.println(qsf);
            List<String> ans = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {

                String st="";
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == 1) {
                       st+="Q";
                    } else {
                       st+=".";
                    }
                }
                ans.add(st);

            }
            finalAns.add(ans);
            return ;
        }
        for (int i = 0; i < arr[0].length; i++) {
            if (isItSafePlaceForQueen(arr, row, i)) {
                arr[row][i] = 1;
                printNQueens(arr, row + 1);
                arr[row][i] = 0;
            }
        }

    }


}
