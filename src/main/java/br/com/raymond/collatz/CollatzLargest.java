package br.com.raymond.collatz;

public class CollatzLargest {

    public static void main(String[] args) {
        int nMaiorSequencia = 0;
        int tamanhoMaiorSequencia = 0;

        Collatz c = new Collatz();

        for (int n = 1; n <= 1_000_000; n++) {
            int[] sequenciaAtual = c.getSequencia(n);

            if (sequenciaAtual.length > tamanhoMaiorSequencia) {
                nMaiorSequencia = n;
                tamanhoMaiorSequencia = sequenciaAtual.length;
            }
        }

        System.out.println("O número que gera a maior sequência é o " + nMaiorSequencia + "; ele gera uma sequencia com " + tamanhoMaiorSequencia + " termos.");
    }

}
