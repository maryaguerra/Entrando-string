import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    
  Scanner  sc = new Scanner(System.in);
System.out.println("Digite seu primeiro nome");
    String nome = sc.next();
    System.out.println(nome);
System.out.println("Digite seu sobrenome");
    String sobrenome = sc.next();
    System.out.println(sobrenome);
    System.out.println("Seu nome completo é :" + nome + " " + sobrenome);
    System.out.println("Digite sua Idade");
    int Idade = sc.nextInt ();
    System.out.println(Idade);
System.out.println("Digite sua Massa");
    double Massa = sc.nextDouble();
    System.out.println(Massa);
    System.out.println("Sua altura em Centimetros");
    double Altura = sc.nextDouble();
    System.out.println(Altura);
    double AlturaMetros = Altura/100;
    double AlturaQuadrado = AlturaMetros * AlturaMetros ;
    double MassaDividida = Massa / AlturaQuadrado  ;
      
      System.out.println("Seu IMC é: " + " " + MassaDividida);
    
    sc.close();
}
  }