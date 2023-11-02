import java.util.Vector;
import java.util.List;

public class VectorExample {
    public static void main(String[] args) {
        List<String> nomes = new Vector<>();
        
        nomes.add("Alice");
        nomes.add("Bob");
        nomes.add("Charlie");
        
        System.out.println(nomes); // Saída: [Alice, Bob, Charlie]
    }
}
