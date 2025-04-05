import java.text.DecimalFormat;

public class Pix implements Pagamento{

    double taxa = 0;

    @Override
    public String processarPagamento(double valor) {
        double total = valor + (this.taxa * valor);

        DecimalFormat df = new DecimalFormat("#.00");

        return "Pagamento com valor inical de R$" + df.format(valor) + " realizado com taxa de " + df.format(taxa * 100) + "%\n Total pago: " + total;
    }
}
