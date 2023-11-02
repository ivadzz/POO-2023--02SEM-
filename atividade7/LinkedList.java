import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        
        System.out.println("Terceiro número: " + numbers.get(2)); // Saída: Terceiro número: 30
    }
}
