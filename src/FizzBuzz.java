import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FizzBuzz {

    public static List<String> fizzBuzz(int n, Map<Integer, String> map) {
        List<String> resultList = new ArrayList<>();
        String result;
        for (int i = 1; i <= n; i++) {
            result = "";
            //Iterate over divisors and form the desired output
            for (Map.Entry<Integer, String> entry: map.entrySet()) {
                if (i % entry.getKey() == 0) {
                    result += entry.getValue();
                }
            }

            if (result.isEmpty()) {
                result = Integer.toString(i);
            }

            resultList.add(result);

        }
        return resultList;
    }

    public static void main(String[] args) {
        //105 is the least common multiple of 3, 5 and 7
        int n = 105;
        //Putting values inside a map for scalability
        Map<Integer, String> divisorSounds = new HashMap<>();
        divisorSounds.put(3, "Fizz");
        divisorSounds.put(5, "Buzz");
        divisorSounds.put(7, "Jazz");
        //Add new values here if necessary

        List<String> result = fizzBuzz(n, divisorSounds);
        for (String s : result) {
            System.out.println(s + " ");
        }
    }
}