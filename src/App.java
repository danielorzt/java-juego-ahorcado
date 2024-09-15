import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglo para almacenar las letras adivinadas
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Inicializar el arreglo con guiones bajos
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        // Bucle principal del juego
        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");
            System.out.println("Introduce una letra, por favor:");

            // Leer la letra del usuario
            char letra = Character.toLowerCase(scanner.next().charAt(0));
            boolean letraCorrecta = false;

            // Comprobar si la letra está en la palabra secreta
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            // Si la letra no es correcta, aumentar el contador de intentos
            if (!letraCorrecta) {
                intentos++;
                System.err.println("¡Incorrecto! Te quedan " + (intentosMaximos - intentos) + " intentos.");
            }

            // Comprobar si se ha adivinado toda la palabra
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("¡Felicidades, has adivinado la palabra secreta!: " + palabraSecreta);
            }
        }

        // Si el jugador ha usado todos los intentos y no ha adivinado la palabra
        if (!palabraAdivinada) {
            System.out.println("¡Qué pena, te has quedado sin intentos! GAME OVER.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
