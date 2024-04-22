package classes.ArraysCollections;

import java.util.Objects;

public class UsuarioLista {
    String nome;
    UsuarioLista(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "UsuarioLista{" +
                "nome='" + this.nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioLista that = (UsuarioLista) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
