package br.com.curso.restapi;

import org.junit.Assert;
import org.junit.Test;

public class TesteSoma {

    @Test
    public void Soma_3_mais_2_deveRetornar5() {
        int a = 3;
        int b = 2;
        Somador somador = new Somador();


        int res = somador.somar(a, b);

        Assert.assertEquals(5, res);
    }

    @Test
    public void Soma_3_mais_2_naoDeveRetornar6() {
        int a = 3;
        int b = 2;
        Somador somador = new Somador();


        int res = somador.somar(a, b);

        Assert.assertNotEquals(6, res);
    }
}
