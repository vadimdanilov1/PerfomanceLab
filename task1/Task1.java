import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {

      int n = Integer.parseInt(args[0]);
      int m = Integer.parseInt(args[1]);
      
      ArrayList<Integer> way = new ArrayList<>();

      int i = 1;
      while (true){
          way.add(i);
          i = 1 + (i + m - 2) % n;
          if (i == 1)
              break;
      }

        System.out.println(way);

    }
}
