package classes.streamsApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        Comparator<AlunoFilter> MinMax = (n1,n2)-> n1.nota > n2.nota ? 1 : false || n2.nota>n1.nota ? -1 : 0;
        AlunoFilter a1 = new AlunoFilter("Natan",10.0);
        AlunoFilter a2 = new AlunoFilter("Carlos",4.0);
        AlunoFilter a3 = new AlunoFilter("Lizza", 7.0);
        AlunoFilter a4 = new AlunoFilter("Naca", 8.0);

        List<AlunoFilter> filterList = Arrays.asList(a1,a2,a3,a4);
        System.out.print(filterList.stream().max(MinMax));
        System.out.print(filterList.stream().min(MinMax));
    }
}
