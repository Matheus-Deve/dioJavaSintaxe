import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		int numero= Integer.valueOf(args[0]);
		String agencia= args[1];
	    String nomeCliente= args[2];
	    float saldo= Float.valueOf(args[3]);
	    
	    Scanner scanner= new Scanner(System.in);
	    
	    System.out.println("Por favor, digite o número da Agência");
	    numero= scanner.nextInt();
	    
	    System.out.println("Por favor, digite o nome da Agência");
	    agencia= scanner.next();
	    
	    System.out.println("Por favor, digite o nome do Cliente");
	    nomeCliente= scanner.next();
	    
	    System.out.println("Por favor, digite o número ");
	    saldo= scanner.nextFloat();
	    
	    System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em"
	    +" nosso banco, sua agência é "+agencia+", conta "+numero+" e saldo "+saldo
	    +" já está disponível para saque");
	}
}
