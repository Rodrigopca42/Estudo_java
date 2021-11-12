public class estudo2 {
    public static void main(String[] args) {
        
        int idade;
        double salario;
        String nome;
        char sexo;

        idade = 35;
        salario = 4250.9;
        nome = "Maria Silva";
        sexo = 'F';

        System.out.println("A funcionaria " + nome + ", do sexo " + sexo + ", ganha R$" + String.format("%.2f", salario) + " e tem " + idade + " anos.");


    }
}
