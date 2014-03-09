package br.com.raymond.collatz;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;

public class TestCollatz {

    private Collatz c;

    @Before
    public void setUp() {
        c = new Collatz();
    }

    @Test
    public void proximoSe13() {
        assertThat(c.getProximo(13), is(40));
    }

    @Test
    public void proximoSe40() {
        assertThat(c.getProximo(40), is(20));
    }

    @Test
    public void proximoSe20() {
        assertThat(c.getProximo(20), is(10));
    }

    @Test
    public void proximoSe10() {
        assertThat(c.getProximo(10), is(5));
    }

    @Test
    public void proximoSe5() {
        assertThat(c.getProximo(5), is(16));
    }

    @Test
    public void proximoSe16() {
        assertThat(c.getProximo(16), is(8));
    }

    @Test
    public void proximoSe8() {
        assertThat(c.getProximo(8), is(4));
    }

    @Test
    public void proximoSe4() {
        assertThat(c.getProximo(4), is(2));
    }

    @Test
    public void proximoSe2() {
        assertThat(c.getProximo(2), is(1));
    }

    @Test
    public void sequencia13() {
        int[] sequencia = c.getSequencia(13);
        assertThat(sequencia, is(new int[]{13, 40, 20, 10, 5, 16, 8, 4, 2, 1}));
    }
}
