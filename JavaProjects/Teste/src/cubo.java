
import java.util.ArrayList;
import java.util.Scanner;

public class cubo {
    public static void main(String[] args){

        //Lendo limite inferior e superior do intervalo
        Scanner scanner = new Scanner(System.in);
        Integer A = scanner.nextInt();
        Integer B = scanner.nextInt();
        
        //Criando array do intervalo
        ArrayList<Integer> intervalo = new ArrayList<Integer>();

        //Variável que conterá a quantidade de números que tem raízes exatas
        Integer saida = 0;

        //Algoritmo para adicionar no ArrayList intervalo
        for (int i = A; i <= B; i++){ //Começa do limite inferior e vai incrementando 1 até chegar no limite superior
            intervalo.add(i); //Adiciona na lista

            //Confere se o resto da divisão entre a raíz quadrada por 1, é zero, se sim, é exata e calcula a raíz cúbica
            if (Math.sqrt(i) % 1 == 0){ 
                //Confere se a raíz cúbica é exata, se sim, incrementa a saída
                if  (Math.cbrt(i) % 1 == 0){
                    saida++;
                }
            }
        }

        //Printando a saída
        System.out.println(saida);

        scanner.close();
    }

    
}
