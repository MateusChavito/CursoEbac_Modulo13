public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Mateus");
        pessoa.setSobrenome("Chaves");

        System.out.println(" O Nome é: " + pessoa.getNome()  + " com o Sobrenome:" + pessoa.getSobrenome());

        Fisica fisica = new Fisica();
        fisica.setCPF(37815242378d);

        System.out.println("O CPF de pessoa física é: " + fisica.getCPF());

        Juridico juridico = new Juridico();
        juridico.setCNPJ(092934820000d);

        System.out.println("O CNPJ de pessoa Jurídica é:" + juridico.getCNPJ());

    }

}
