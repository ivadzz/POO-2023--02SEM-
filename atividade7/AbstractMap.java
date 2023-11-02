import java.util.AbstractMap;
import java.util.Map;

public class AbstractMapExample {
    public static void main(String[] args) {
        Map<String, Integer> population = new AbstractMap<String, Integer>() {
            @Override
            public Set<Entry<String, Integer>> entrySet() {
                // Implementação personalizada do entrySet
                return null;
            }
        };
        
        population.put("Nova York", 8405837);
        population.put("Los Angeles", 3990456);
    }
}
