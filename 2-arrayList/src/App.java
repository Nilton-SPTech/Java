import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

/* 
        // FORMA CASUAL DE SE CRIAR UM ARRAY
        // ARRAY ESTÁTICO
        String[] arrayNomesEstatico = new String[5];
        arrayNomesEstatico[0] = "aba";
        arrayNomesEstatico[1] = "aba";
        arrayNomesEstatico[2] = "aba";
        arrayNomesEstatico[3] = "aba";
        arrayNomesEstatico[4] = "aba";


        // ARRAY DINAMICO, ELE EXPANDE DE ACORDO COM A QUANTIDADE DE ELEMENTOS DENTRO DELE
        ArrayList<String> arrayDinamico = new ArrayList<String>();  
        arrayDinamico.add("Nilton"); //[0]
        arrayDinamico.add("Maria"); //[1]
        arrayDinamico.add("José"); //[2]
        arrayDinamico.add("Rufendi"); //[3]


        //IMPRIMINDO O ARRAY ESTÁTICO
        System.out.println("\nIMPRIMINDO O ARRAY ESTÁTICO");
        for(int i = 0; i < arrayNomesEstatico.length; i++){
            System.out.println(arrayNomesEstatico[i]);
        }
     
        //IMPRIMINDO O ARRAY DINAMICO 
        System.out.println("\nIMPRIMINDO O ARRAY DINAMICO");

        // VERIFICANDO O TAMANHO DO ARRAY LIST
        int tamanho = arrayDinamico.size();
        System.out.println("Tamanho do arrayLis: " + tamanho);

        // PARA PEGAR UM VALOR ESPECIFICO NO ARRAYLIST UTILIZAMOS O GET
        String primeiroValor = arrayDinamico.get(0);

        // LAÇO QUE VAI PERCORRER O ARRAYLIST
        for(int i = 0; i < tamanho; i++){
            System.out.println(arrayDinamico.get(i));
        }

        // REMOVENDO UM ELEMENTO DO ARRAY LIST 
        System.out.println("\nREMOVER UM ELEMENTO DO ARRAYLIST");
        // REMOVENDO O ELEMEMTO DO ARRAYLIST
        arrayDinamico.remove(2);

        for(int i = 0; i < arrayDinamico.size(); i++){
            System.out.println(arrayDinamico.get(i));
        }

        // UTILIZANDO O FOREACH PARA PERCORRER O ARRAYLIST
        //Sempre deve colocar o tipo da var
        System.out.println("\nIMPRIMINDO O ARRAYLIST UTILIZANDO O FOREACH");
        for(String nome:arrayDinamico){
            System.out.println(nome);
        }

        // REMOVENDO TODOS O CONTEUDO QUE TEM DENTRO DO ARRAYLIST
        arrayDinamico.clear();

*/



        /*PASSANDO TIPOS PRIMITIVOS PARA UM ARRAYLIST 
        Tipo Primitivo -> Wrapper Class 
        int -> Integer
        float -> Float
        double -> Double
        char -> Character
        */

        ArrayList<Integer> idade = new ArrayList<Integer>(); //ARRAYLIST DE INT
        ArrayList<Float> peso = new ArrayList<Float>(); //ARRAY LIST DE FLOAT 
    }
}
