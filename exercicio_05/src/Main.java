

public class Main {
    public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa("Pedro", "88");
    Pessoa pessoa2 = new Pessoa("Marcos", "Salvador", "71");
    Pessoa pessoa3 = new Pessoa();
    Fornecedor fornecedor1 = new Fornecedor("Franco", "Bahia", "77", 1000, 550);
    Empregado empregado1 = new Empregado("Empre", "SP", "11", 2, 2000, 10);
    empregado1.setSalarioBase(2500);
    Administrador administrador1 = new Administrador("adm", "BA", "75", 3, 4000, 15, 700);
    administrador1.setSalarioBase(5000);
    Operario operario1 = new Operario("Marcos", "Rua", "99",5, 3000, 13, 500, 10);

        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);
        System.out.println(fornecedor1);
        System.out.println(empregado1);
        System.out.println((administrador1));
        System.out.println(operario1);
    }
}