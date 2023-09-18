import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;



public class Main
{
    public static void main(String[] args) {
        String inputLine = "aaaaAAAAAbbbbCCCCccccc";
        char[] inputArray = inputLine.toCharArray();
        Map<Character, Long> charResult = IntStream.range(0, inputArray.length).mapToObj(i -> inputArray[i]).collect(Collectors.groupingByConcurrent(Character::valueOf, Collectors.counting()));
        for(Map.Entry<Character, Long> item : charResult.entrySet()){
         
           System.out.printf("\"%s\": %s,", item.getKey(), item.getValue());
       }
       

    }
}
