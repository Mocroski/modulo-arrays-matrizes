package cursojava.executavel;

public class Matriz {
    public static void main(String[] args) {

        int notas[] [] = new int[2] [3]; /*matriz*/

        notas[0] [0] = 80; /*na primeira linha e primeira coluna o valor é 80*/
        notas[0] [1] = 90;
        notas[0] [2] = 70;

        notas[1] [0] = 40;
        notas[1] [1] = 60;
        notas[1] [2] = 30;



        /*percorre as linhas*/
        for (int poslinha = 0; poslinha < notas.length; poslinha ++ ){
            System.out.println("====================");
            /*para cada linha percorre as colunas ARRAY*/
            for (int poscoluna = 0; poscoluna < notas[poslinha].length; poscoluna ++) {
                System.out.println("valor da matriz : " + notas[poslinha] [poscoluna]);

            }

        }



    }
}
