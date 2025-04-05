public class Main {

    public static void main(String[] args){
        Transacao pagamentoFatura = new Transacao(new CartaoCredito());

        pagamentoFatura.realizarTransacao(500);
    }
}
