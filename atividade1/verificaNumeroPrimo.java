public class NumeroPrimoChecker {
    
    public static int verificaNumeroPrimo(Integer n) {
        if (n <= 1) {
            return 0;  
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return 0; 
            }
        }

        return 1;  
    }

    public static void main(String[] args) {
        Integer num = 0;  
        
        int resultado = verificaNumeroPrimo(num);

        if (resultado == 1) {
            System.out.println("1 - O número é primo.");
        } else {
            System.out.println("0 - O número não é primo.");
        }
    }
}
