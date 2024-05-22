package classes.br.com.coder3.modelo;

import classes.br.com.coder3.excecao.ExplosaoException;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CampoTest {
    private Campo campo;

    @BeforeEach
    void iniciaCampo(){
        campo = new Campo(3,3);
    }

    @Test
    void TestCampo1Esquerda(){
        Campo vizinhoEsquerda = new Campo(3,2);
           boolean resultado = campo.adicionarVizinhos(vizinhoEsquerda);
           assertTrue(resultado);
    }

    @Test
    void TestCampo2Direita(){
        Campo vizinhoEsquerdo = new Campo(3,4);
        boolean  resultado = campo.adicionarVizinhos(vizinhoEsquerdo);
        assertTrue(resultado );
    }


    @Test
   void TestCampo3Direita(){
        Campo viznhoDireito = new Campo(2,3);
        boolean resultado = campo.adicionarVizinhos(viznhoDireito);
        assertTrue(resultado);
   }

   @Test
   void TestVizinhoDistancia2(){
        Campo  vizinho = new Campo(2,2);
        boolean resultado = campo.adicionarVizinhos(vizinho);
        assertTrue(resultado);
   }
   @Test
   void TestNaoVizinho(){
        Campo naoVizinho = new Campo(1,1);
        boolean resultado = campo.adicionarVizinhos(naoVizinho);
        assertFalse(resultado);
   }

   @Test
   void valorPadraoAtributo(){
       boolean res =  campo.IsMarcado();
       assertFalse(res);

   }

   @Test
    void valorDesmarcado(){
      campo.alternaMarcacao();
      assertTrue(campo.IsMarcado());

   }

   @Test
   void  valorMarcado(){
        campo.alternaMarcacao();
        campo.alternaMarcacao();
        assertFalse(campo.IsMarcado());
   }

   @Test
    void valorCampoAberto(){
        campo.abrir();
        assertTrue(campo.IsAberto());
   }

   @Test
   void  valorCampoFechado(){
        campo.abrir();
        campo.abrir();
        assertFalse(campo.IsFechado());
   }

   @Test
    void valorMinaPadrao(){
        campo.minar();
        assertTrue(campo.IsMinar());
   }

   @Test
    void valorExcecaoMinar() {
        campo.minar();
        assertThrows(ExplosaoException.class,()->campo.abrir());
   }
   @Test
    void valorMinado(){
        Campo campo11 = new Campo(1,1);
        Campo campo12 = new Campo(1,1);
        campo12.minar();




       Campo campo22 = new Campo(2,2);
        campo.adicionarVizinhos(campo11);
        campo.adicionarVizinhos(campo12);
        campo.adicionarVizinhos(campo22);
        campo.abrir();
        assertTrue(campo22.IsAberto() && !campo12.IsAberto());
   }

   @Test
    void objetivoAlcancadoTest(){
    Campo campo14 = new Campo(2,2);
    Campo campo15 = new Campo(2,3);
     campo.adicionarVizinhos(campo14);
     campo.adicionarVizinhos(campo15);
     campo.minar();
     campo.alternaMarcacao();

     assertTrue(campo.objetivoAlcancado());
   }

   @Test
    void objetivoAlcancadoTest2(){
        Campo campo16 = new Campo(3,2);
        Campo campo17 = new Campo(3,3);
        campo.adicionarVizinhos(campo16);
        campo.adicionarVizinhos(campo17);
        campo.abrir();
        assertTrue(campo.objetivoAlcancado());

   }

   @Test
    void reniciarTest(){
        Campo campo18 = new Campo(2,3);
        Campo campo19 = new Campo(2,4);
        campo.adicionarVizinhos(campo18);
        campo.adicionarVizinhos(campo19);
        campo.abrir();
        campo.minar();
        campo.abrir();
        campo.reniciar();
        assertFalse(campo.IsAberto());
       assertFalse(campo.IsMinar());
       assertFalse(campo.IsMarcado());
   }
   
   @Test
    void minasVizinhacaTest(){
        Campo campo20 = new Campo(2,3);
        Campo campo21 = new Campo(2,4);
         campo.adicionarVizinhos(campo20);
         campo.adicionarVizinhos(campo21);
         campo21.minar();
         campo.minar();

         assertEquals(1 ,campo.minasVizinhaca());
   }

   @Test
    void toStringTest(){
        Campo campo24 = new Campo(2,3);
        Campo campo25 = new Campo(2,4);
        campo.adicionarVizinhos(campo24);
        campo.adicionarVizinhos(campo25);
        campo.alternaMarcacao();
        assertEquals("x", campo.toString());

   }

   @Test
    void toStringTest2(){
        Campo campo26 = new Campo(2,3);
        Campo campo27 = new Campo(2,4);
        campo.adicionarVizinhos(campo26);
        campo.adicionarVizinhos(campo27);
        campo.abrir();
        campo.minar();
        assertEquals("*",campo.toString());
   }

}