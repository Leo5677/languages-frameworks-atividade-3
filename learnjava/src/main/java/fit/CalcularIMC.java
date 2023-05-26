package fit;

public class CalcularIMC {
  public static void exec() {
    /*
     * Magreza, quando o resultado é menor que 18,5 kg/m2;
     * Normal, quando o resultado está entre 18,5 e 24,9 kg/m2;
     * Sobrepeso, quando o resultado está entre 24,9 e 30 kg/m2;
     * Obesidade, quando o resultado é maior que 30 kg/m2;
     */

    double peso = 60;
    double altura = 1.70;
    double imc = peso / (altura * altura);
    String imc_formatado = String.format("%.2f", imc);

    if (imc < 18.5) {
      System.out.println("Magreza -> Seu IMC é de: " + imc_formatado);
    } else if (imc >= 18.5 && imc <= 24.9) {
      System.out.println("Normal -> Seu IMC é de: " + imc_formatado);
    } else if (imc >= 24.9 && imc <= 30) {
      System.out.println("Sobrepeso -> Seu IMC é de: " + imc_formatado);
    } else {
      System.out.println("Obesidade -> Seu IMC é de: " + imc_formatado);
    }
  }
}
