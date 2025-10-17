package exercicios_linguagem;

public class VerificadorVoto {
    public static String podeVotar(int idade){
        if (idade < 16){
            return "Não Pode votar";
        }else{
            return "Pode votar";
        }
    }
}
