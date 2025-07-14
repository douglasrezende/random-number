import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();

        // Gerar um número entre 0 e 9
        int numeroAte9 = random.nextInt(10);
        System.out.println("Número entre 0 e 9: " + numeroAte9);

        // Gerar um número entre 1 e 10 (inclusive)
        int numero1a10 = random.nextInt(10) + 1;
        System.out.println("Número entre 1 e 10: " + numero1a10);

        // Gerar um número entre 5 e 15 (inclusive)
        int numero5a15 = random.nextInt(11) + 5;
        System.out.println("Número entre 5 e 15: " + numero5a15);
    }
}
