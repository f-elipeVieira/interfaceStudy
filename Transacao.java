public class Transacao {

    final Pagamento formaPagamento;

    Transacao(Pagamento formaPagamento){
        this.formaPagamento = formaPagamento;
    }

    public void realizarTransacao(double valor){

        System.out.println(formaPagamento.processarPagamento(valor));

        if(formaPagamento instanceof Boleto){
            System.out.println("Gerando boleto físico...");
        }
    }
}
