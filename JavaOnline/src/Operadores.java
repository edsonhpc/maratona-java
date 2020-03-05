public class Operadores {

    /**
     * Operadores unários
     * ++ incremento
     * -- decremento
     * + soma
     * - subtrai
     * * multiplica
     * / divide
     * () cast
     * !  not
     */
    public static void main(String[] args) {

    int numero1 = 10;
    int numero2 = 20;
    int soma = numero1+numero2; // Somo os duas variaveis e atribuo a um novo endereço de memória

    System.out.println("O valor é: "+  numero1+numero2);   // Se começar com String os demais campos serão concatenados
    System.out.println("O valor é: "+ (numero1+numero2)); // Coloco entre parenteses
    System.out.println("O valor é: "+ soma);
    System.out.println(numero1+numero2 + " valor total"); // Soma depois concatena


    }
}
