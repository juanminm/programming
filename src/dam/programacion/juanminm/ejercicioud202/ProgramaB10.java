/*
 * 10. Escribe un programa que permita determinar si utilizar los números
 * aleatorios de la clase Math son apropiados. Para ello el programa debe
 * simular que se lanza una moneda un número elevado de veces, por ejemplo,
 * 1.000.000. A continuación debe imprimir por pantalla el porcentaje de caras
 * y el porcentaje de cruces que han salido.
 */
package dam.programacion.juanminm.ejercicioud202;

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class ProgramaB10 {
    public static void main(String[] args) {
        int moneda, cara = 0, cruz = 0;
        float pcntCara, pcntCruz;

        for (int i = 1; i <= 1000000; i++) {
            moneda = (int) (Math.random()*2+1);

            switch(moneda) {
                case 1:
                    cara++;
                    break;
                case 2:
                    cruz++;
            }
        }

        pcntCara = (float) cara/1000000 * 100;
        pcntCruz = (float) cruz/1000000 * 100;

        System.out.println("Cara: " + pcntCara + "%");
        System.out.println("Cruz: " + pcntCruz + "%");
    }
}