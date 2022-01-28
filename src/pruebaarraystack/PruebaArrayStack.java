/*
 * Copyright (C) 2020 Oscar Arenas
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package pruebaarraystack;

import edu.oharenas.aleatorio.Aleatorio;
import modelo.ArrayStack;

/**
 *
 * @author Oscar Arenas
 */
public class PruebaArrayStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayStack pila = new ArrayStack();

        // Apilando
        pila.push(45);
        pila.push(83);
        pila.push(47.91);
        pila.push(-12);
        pila.push(77);

        System.out.println("Pila original: " + pila);

        // Desapilar
        while (!pila.isEmpty()) {
            double c = pila.pop();
            System.out.println("\nDesapiló el: " + c);
            System.out.println("Pila: " + pila);
        }

        System.out.println("\nOtra pila:");

        int n = Aleatorio.entero(6, 12);

        int[] codigos = Aleatorio.generarVectorEnteroSinRepeticiones(1, 100, n);

        ArrayStack pila2 = new ArrayStack();
        for (int i = 0; i < codigos.length; i++) {
            pila2.push(codigos[i]);
        }

        System.out.println("Pila 2: " + pila2);
    }
}
