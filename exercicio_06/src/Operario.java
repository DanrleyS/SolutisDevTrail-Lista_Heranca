public class Operario extends Empregado{

    private double valorProducao;
    private double comissao;

    public Operario() {
        super();
        this.valorProducao = 0.0;
        this.comissao = 0.0;
    }

    public Operario(double valorProducao, double comissao) {
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public Operario(int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public Operario(String nome, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
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
        double valorComissao = valorProducao * (comissao / 100);
        return salarioBruto + valorComissao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Operario: " +
                "valorProducao= " + valorProducao +
                ", comissao= " + comissao;
    }

}
