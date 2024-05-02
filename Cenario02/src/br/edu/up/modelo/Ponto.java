package modelo;

public class Ponto {
    private double x;
    private double y;

    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Método para calcular a distância entre dois pontos
    public double calcularDistancia(Ponto outroPonto) {
        return Math.sqrt(Math.pow(this.x - outroPonto.x, 2) + Math.pow(this.y - outroPonto.y, 2));
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
