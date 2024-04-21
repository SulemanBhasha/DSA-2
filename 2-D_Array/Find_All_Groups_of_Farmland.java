public class Find_All_Groups_of_Farmland {

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 0, 0 },
                { 0, 1, 1 },
                { 0, 1, 1 }
        };
        ArrayList<int[]> list = new ArrayList<>();
        list = findFarmland(arr, list);
        for (int i = 0; i < list.size(); i++) {
            int arr1[] = list.get(i);
            System.out.println(Arrays.toString(arr1));
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

    }

    public static ArrayList<int[]> findFarmland(int[][] land, ArrayList<int[]> list) {
        int n = land.length;
        int m = land[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (land[i][j] == 1) {
                    int arr[] = new int[4];
                    arr[0] = i;
                    arr[1] = j;
                    int r = i;
                    int c = j;
                    for (r = i; r < n && land[r][i] == 1; r++) {
                        for (c = j; c < m && land[r][c] == 1; c++) {
                            land[r][c] = 2;
                        }
                    }
                    arr[2] = r - 1;
                    arr[3] = c - 1;
                    list.add(arr);
                }
            }
        }
        return list;

    }

}
