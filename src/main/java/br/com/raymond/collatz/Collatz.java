package br.com.raymond.collatz;

import java.util.LinkedList;
import java.util.List;

public class Collatz {

    public int getProximo(int n) {
        if (par(n)) {
            return n / 2;
        } else {
            return 3 * n + 1;
        }
    }

    private boolean par(int n) {
        return n % 2 == 0;
    }

    public int[] getSequencia(int n) {
        List<Integer> sequencia = new LinkedList<>();
        while (n > 1) {
            sequencia.add(n);
            n = getProximo(n);
        }
        sequencia.add(1);

        return toIntArray(sequencia);
    }

    private int[] toIntArray(List<Integer> sequencia) {
        int[] resultado = new int[sequencia.size()];
        for (int i = 0; i < sequencia.size(); i++) {
            resultado[i] = sequencia.get(i);
        }
        return resultado;
    }

}
