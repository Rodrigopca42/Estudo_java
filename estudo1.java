

public class Estudo1 {
     public static void main(String[] args) {
        
        

        int idade;
        double salario, altura;
        char genero;
        String nome;

        idade = 20;
        salario = 5800.5;
        altura = 1.80;
        genero = 'M';
        nome = "Rodrigo Cardoso";

        System.out.println("Idade= " + idade);
        System.out.println("Salario= R$" + String.format("%.2f", salario));
        extracted(altura);
        System.out.println("Genero= " + genero);
        System.out.println("Nome= " + nome);

    }

    private static void extracted(double altura) {
        System.out.println("Altura= " + String.format("%.2f", altura));
    }
}