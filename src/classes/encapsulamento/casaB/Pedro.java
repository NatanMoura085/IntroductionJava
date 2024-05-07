package classes.encapsulamento.casaB;

import classes.encapsulamento.casaA.Ana;

public class Pedro  extends Ana {
    void TestAcesso(){
        System.out.println(formaDeFalar);
        System.out.println(new Ana().todosSaben);
    }
}
