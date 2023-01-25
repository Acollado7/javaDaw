package tema5.ordenacionbusqueda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacionBusqueda {
    public static void main(String[] args) {
        List<Pais> paises = new ArrayList<>();
        paises.add(new Pais("España", 47450795, 505944, "Euro"));
        paises.add(new Pais("Portugal", 10276617, 92090, "Euro"));
        paises.add(new Pais("EEUU", 331002651, 9833517, "Dolar"));
        paises.add(new Pais("Italia", 47450795, 505944, "Euro"));

        paises.forEach(System.out::println);
        System.out.println("--------------");
        //Ordenacion usando orden natural, requiero que pais implemente comparable
            Collections.sort(paises);
        paises.forEach(System.out::println);
        System.out.println("--------------");


        //Ordenacion usando comparator (Proporcionando el criterio mediante lambda)
        Comparator <Pais> criterioprobalcion = (p1,p2)->Long.compare(p1.getPoblacion(), p2.getPoblacion());
            Collections.sort(paises, criterioprobalcion.reversed() );
        paises.forEach(System.out::println);
        System.out.println("--------------");



    }
}
