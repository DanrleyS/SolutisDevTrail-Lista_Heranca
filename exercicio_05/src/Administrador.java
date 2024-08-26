public class Administrador extends Empregado{
    private double ajudaDeCusto;

    public Administrador() {
        super();
        this.ajudaDeCusto = 0.0;
    }

    public Administrador(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador(int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador(String nome, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double calcularSalario() {
        double descontoImposto = (salarioBase) * (imposto / 100);
        return salarioBase - descontoImposto +ajudaDeCusto;
    }

    @Override
    public String toString() {
        return super.toString() + ", Administrador: " +
                "Ajuda de custo= " + ajudaDeCusto;
    }

}
