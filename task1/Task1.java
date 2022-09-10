import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        ArrayList<Integer> way = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr1[i] = i + 1;
        }

        int j = 1;
        while (true) {

                j--;
            for (int i = 0; i < m; i++) {
                arr2[i] = arr1[j];

                if (j == m && i != m - 1)
                    j = 0;
                else j++;
            }
            way.add(arr2[0]);

            if (arr2[m - 1] == 1)
                break;
        }

        String str = "";

        for (int i = 0; i < way.size(); i++) {
            str = str + way.get(i);
        }

        System.out.println(str);
  
    }
}
