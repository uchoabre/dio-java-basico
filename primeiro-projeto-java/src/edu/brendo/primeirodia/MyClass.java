package edu.brendo.primeirodia;

public class MyClass {
    public static void main(String[] args) {
        String primeiroNome = "Brendo";
        String sobrenome = "Uchôa";

        String nomeCompleto = nomeCompleto(primeiroNome, sobrenome);

        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String sobrenome) {
        return "Meu nome é: " + primeiroNome.concat(" ").concat(sobrenome);
    }
}
