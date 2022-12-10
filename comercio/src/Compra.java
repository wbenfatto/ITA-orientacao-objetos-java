public class Compra {
    int valorTotal;
    int numeroParcelas;

    // a vista
    public Compra(int valor) {
        valorTotal = valor;
        numeroParcelas = 1;
    }

    public Compra(int qtdparcelas, int valorparcela) {
        numeroParcelas = qtdparcelas;
        valorTotal = valorparcela * qtdparcelas;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public int getValorParcela() {
        return valorTotal / numeroParcelas;
    }
}
