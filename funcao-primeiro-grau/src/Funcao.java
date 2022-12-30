
public class Funcao {
    
    public String raizFuncao; 

    // Método para tratar a função
    public void tratamentoFuncao(String funcao){

        //FAZENDO OS TRATAMENTOS DE CARACTERE
        String funcaoTratada = funcao; 
        funcaoTratada = funcaoTratada.replace(" ", "");
        funcaoTratada = funcaoTratada.replace("y", "0");

        //PASSANDO OS VALORES TRATADOS PARA O ATRIBUTO GLOBAL 
        this.raizFuncao = funcaoTratada;

        //CHAMANDO O MÉTODO QUE COLOCA TUDO EM UM VETOR
        apresentar(); 
    }


    public String[] arrayValoresFuncao(){
        int tamanho = raizFuncao.length(); //TAMANHO DA STRING

        //CRIANDO O VETOR E DANDO UM TAMANHO PARA ELE 
        String valores[] = new String[tamanho]; 
        
        for(int i = 0; i < tamanho; i++){

            //TRANSFORMANDO O VALOR DA STRING EM UM CHAR 
            char stringAtual = raizFuncao.charAt(i);

            //CONVERTENDO O VALOR DE CHAR PARA STRING E ADICIONANDO ELE NO ARRAY
            valores[i] = String.valueOf(stringAtual); 
        }  

        return valores;
    }

    public void apresentar(){
        // System.out.println(arrayValoresFuncao()); 
        String vetor[] = arrayValoresFuncao();

        for(String count:vetor){
            System.out.println(count);
        }

    }
}

