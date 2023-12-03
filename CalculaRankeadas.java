import java.util.Scanner;

public class CalculaRankeadas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do heroi: ");
        String nome = sc.next();
        
        System.out.println("Quantidade de vitórias: ");
        int vitorias = sc.nextInt();

        System.out.println("Quantidade de derrotas: ");
        int derrotas = sc.nextInt();

        int saldoRankeadas = vitorias - derrotas;
        String nivel = calcularNivel(saldoRankeadas);       

        System.out.println("O herói " + nome + " tem um saldo de " + saldoRankeadas + " vitórias e está no nível de " + nivel + "!");
        
        sc.close();
    }

    public static String calcularNivel(int saldo){

        if (saldo >= 0 && saldo <= 10){
            return "Ferro";
        }
        else if (saldo <= 20) {
            return "Bronze";
        }
        else if (saldo <= 50) {
            return "Prata";
        }
        else if (saldo <= 80) {
            return "Ouro";
        }
        else if (saldo <= 90) {
            return "Diamante";
        }
        else if (saldo <= 100) {
            return "Lendário";
        }
        else{
            return "Imortal";
        }

    }
}