import java.util.Dictionary;
import java.util.Hashtable;

public class DictionaryExample {
    public static void main(String[] args) {
        Dictionary<String, Integer> population = new Hashtable<>();
        
        population.put("Nova York", 8405837);
        population.put("Los Angeles", 3990456);
        
        int nyPopulation = population.get("Nova York");
        System.out.println("População de Nova York: " + nyPopulation);
    }
}
