package classes.generics;

import java.util.List;

public class ListaUltil {


    public static Object  getUltimo1(List<?> lista){
        return lista.get(lista.size() -1);
    }
    public static <T> T getUltimo2(List<T> list){
        return list.get(list.size() -1);
    }


}
