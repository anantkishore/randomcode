import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CalixSolution {

        public static void main (String[] args) {

            HashMap<String, List<String>> map = new HashMap<>();

            ArrayList studentList1 = new ArrayList<>();
            studentList1.add("Dev");
            studentList1.add("Raj");

            map.put("Sharada College", studentList1);

            ArrayList studentList2 = new ArrayList<>();
            studentList2.add("Ajay");
            studentList2.add("Rakesh");
            studentList2.add("Anup");

            map.put("Shree College", studentList2);

            ArrayList studentList3 = new ArrayList<>();
            studentList3.add("X");
            studentList3.add("Y");
            studentList3.add("Z");

            map.put("Ihree College", studentList3);

            ArrayList<Object> result = new ArrayList<>();

            map.forEach((a,b) -> {
                if (a.toLowerCase().startsWith("s")){
                    System.out.println(a);
                    result.addAll(0, b);
                }
            });

            System.out.println(result.toString());

        }
}
