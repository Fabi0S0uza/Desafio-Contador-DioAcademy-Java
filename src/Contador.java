import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
          Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();
        scanner.close();
		
		try {
			
			contar(parametroUm, parametroDois);
		
		}catch ( ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    if (parametroDois <= parametroUm) {
        throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
    }

    int contagem = parametroDois - parametroUm;
    for (int i = 0; i < contagem; i++) {
        parametroUm += 1;
        System.out.println("Imprimindo o numero " + parametroUm);
    }
}
     
}     
         
    

