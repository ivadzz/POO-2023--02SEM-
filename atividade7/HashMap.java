import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> population = new HashMap<>();
        
        population.put("Nova York", 8405837);
        population.put("Los Angeles", 3990456);
        
        int nyPopulation = population.get("Nova York");
        System.out.println("População de Nova York: " + nyPopulation);
    }
}
