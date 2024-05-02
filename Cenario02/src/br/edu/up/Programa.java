package br.edu.up;

import br.edu.up.modelo.Ponto;
import br.edu.up.Util.Prompt;

public class Programa {

    public static void main(String[] args) {
        Ponto ponto1 = new Ponto();

        Ponto ponto2 = new Ponto(2, 5);

        Prompt.imprimir("Distância do ponto1 ao ponto2: " + ponto1.calcularDistancia(ponto2));

        Prompt.imprimir("Distância do ponto2 às coordenadas (7,2): " + ponto2.calcularDistancia(new Ponto(7, 2)));

        ponto1.setX(10);

        ponto1.setY(3);
    }

}
