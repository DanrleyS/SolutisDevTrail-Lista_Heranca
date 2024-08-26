public class Vendedor extends Empregado{
    private double valorVendas;
    private double comissao;

    public Vendedor() {
        super();
        this.valorVendas = 0.0;
        this.comissao = 0.0;
    }

    public Vendedor(double valorVendas, double comissao) {
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Vendedor(int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Vendedor(String nome, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        double descontoImposto = salarioBase * (imposto / 100);
        double salarioBruto = salarioBase - descontoImposto;
        double valorComissao = valorVendas * (comissao / 100);
        return salarioBruto + valorComissao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Vendedor: " +
                "valorVendas= " + valorVendas +
                ", comissao= " + comissao;
    }

}
