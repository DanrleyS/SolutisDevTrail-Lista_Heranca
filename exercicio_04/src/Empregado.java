public class Empregado extends Pessoa {
    private int codigoSetor;
    protected double salarioBase;
    protected double imposto;

    public Empregado() {
        super();
        this.codigoSetor = 0;
        this.salarioBase = 0.0;
        this.imposto = 0.0;
    }

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public Empregado(int codigoSetor, double salarioBase, double imposto) {
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public Empregado(String nome, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        double descontoImposto = salarioBase * (imposto / 100);
        return salarioBase - descontoImposto;
    }

    @Override
    public String toString() {
        return super.toString() + ", Empregado: " +
                "codigoSetor= " + codigoSetor +
                ", salarioBase= " + salarioBase +
                ", imposto= " + imposto +
                "%, salarioLiquido= " + calcularSalario();
    }

}
