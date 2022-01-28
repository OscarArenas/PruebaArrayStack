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
package modelo;

import java.util.EmptyStackException;

/**
 *
 * @author Oscar Arenas
 */
public class ArrayStack {

    private double[] data;
    private int n;

    public ArrayStack() {
        data = new double[1];
        n = 0;
    }

    public void push(double item) {
        if (data.length == n) {
            resize(2 * n);
        }
        data[n++] = item;
    }

    public double pop() throws EmptyStackException {
        if (n > 0) {
            n--;
            double item = data[n];

            if (data.length / 4 == n) {
                resize(data.length / 2);
            }
            return item;
        }
        throw new EmptyStackException();
    }

    private void resize(int nc) {
        if (nc > 0 && nc >= n) {
            double[] newArray = new double[nc];

            for (int i = 0; i < n; i++) {
                newArray[i] = data[i];
            }
            data = newArray;
        }
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    @Override
    public String toString() {
        String text = "";

        if (n > 0) {
            text = numberToString(data[0]);
            for (int i = 1; i < n; i++) {
                text += ", " + numberToString(data[i]);
            }
        }
        return "[" + text + "]";
    }

    private String numberToString(double real) {
        int entero = (int) real;
        String cadena = real + "";

        if (real == entero) {
            cadena = entero + "";
        }
        return cadena;
    }
}
