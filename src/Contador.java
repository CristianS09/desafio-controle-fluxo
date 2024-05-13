import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        //Definindo um objeto da classe Scanner
        Scanner scanner = new Scanner(System.in);
        //Definindo as variáveis
        System.out.println("Digite o primeiro parâmentro:");
        int paramentroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmentro:");
        int paramentroDois = scanner.nextInt();
        //Usando try e catch
        try{
            contar(paramentroUm, paramentroDois);
        }catch(Exception e){
            System.out.println(e);
        }
    }   
    //Definindo o método contar
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
        
        int contagem = parametroDois - parametroUm;
        for (int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    } 
}