import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {

      int n = Integer.parseInt(args[0]);
      int m = Integer.parseInt(args[1]);
      
      ArrayList<Integer> way = new ArrayList<>();

      int j = 1;
      while (true){
          way.add(j);
          j = 1 + (j + m - 2) % n;
          if (j == 1)
              break;
      }

       		
		String str = "";

        for (int i = 0; i < way.size(); i++) {
            str = str + way.get(i);
        }

        System.out.println(str);

    }
}
