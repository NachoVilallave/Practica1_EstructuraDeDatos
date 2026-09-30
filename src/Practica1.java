import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Practica1 {

    static public void separa(Set<String> unicos, Set<String> repetidos) {
        Set<String> interseccion = new HashSet<>(unicos);
        interseccion.retainAll(repetidos);

        unicos.addAll(repetidos);
        unicos.removeAll(interseccion);

        repetidos.clear();
        repetidos.addAll(interseccion);
    }

    static public Set<Integer> filtra(Iterator<Integer> iter) {
        Set<Integer> positivos = new HashSet<>();

        while(iter.hasNext()){
            Integer num = iter.next();
            if ( num != null && num > 0){
                positivos.add(num);
            }
        }

        Set<Integer> resultado = new HashSet<>();
        for(Integer a: positivos){
            boolean esMultiploDeOtro = false;
            for (Integer b : positivos){
                if(!a.equals(b) && a % b == 0){
                    esMultiploDeOtro = true;
                    break;
                }
            }
            if(!esMultiploDeOtro){
                resultado.add(a);
            }
        }
        return resultado;

    }

    static public Set<String> repetidos (Collection<Set<String>> col) {
        Set<String> vistos = new HashSet<>();
        Set<String> resultado = new HashSet<>();

        for (Set<String> conjunto : col) {
            for (String elemento : conjunto) {
                if (vistos.contains(elemento)) {
                    resultado.add(elemento);
                } else {
                    vistos.add(elemento);
                }
            }
        }
        return resultado;
    }



    public static Set<Integer> interseccionImpares (Collection<Set<Integer>> col) {
        Set<Integer> resultado = new HashSet<>();

        if (col == null || col.isEmpty()) {
            return resultado;
        }

        Iterator<Set<Integer>> iter = col.iterator();

        resultado.addAll(iter.next());

        resultado.removeIf(num -> num % 2 == 0);

        while (iter.hasNext()) {
            Set<Integer> conjuntoActual = iter.next();
            resultado.retainAll(conjuntoActual);
        }

        return resultado;
    }
}


