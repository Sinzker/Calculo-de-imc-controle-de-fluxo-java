import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        double peso;
        double altura;
        double resultado;

        System.out.println("******* Calculadora de IMC *******");

        System.out.print("Digite seu nome: ");
        nome = scan.next().toUpperCase();

        System.out.println("******* Bem Vindo(a): " + nome);

        System.out.print("Digite seu peso: ");
        peso = scan.nextDouble();

        System.out.print("Digite sua altura: ");
        altura = scan.nextDouble();

        resultado = peso / (altura * altura);

        System.out.println("O seu IMC é: " + resultado);

        if (resultado <= 18.5){
            System.out.println("Você está abaixo do peso");
        } else if (resultado >= 18.6 && resultado <= 24.9) {
            System.out.println("Você está no peso ideal PARABÉNS");
        } else if (resultado >= 25 && resultado <= 29.9) {
            System.out.println("Você está levemente acima do peso");
        } else if (resultado >= 30 && resultado <= 34.9) {
            System.out.println("Vocês está com Obesidade grau I");
        } else if (resultado >= 35 && resultado <= 39.9) {
            System.out.println("Vocês está com Obesidade grau II (severa)");
        } else {
            System.out.println("Vocês está com Obesidade grau III (mórbida)");
        }
    }
}