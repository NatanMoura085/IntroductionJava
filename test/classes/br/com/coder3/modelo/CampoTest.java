package classes.br.com.coder3.modelo;

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


}