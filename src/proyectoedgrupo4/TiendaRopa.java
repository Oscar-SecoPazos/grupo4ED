/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedgrupo4;

/**
 *
 * @author DAM127
 */
public class TiendaRopa {

    private double telaRoja;
    private int telaNegra;
    private int contadorPrenda1;
    private int contadorPrenda2;

    public TiendaRopa(int telaRoja, int telaNegra) {
        this.telaRoja = telaRoja;
        this.telaNegra = telaNegra;
        this.contadorPrenda1 = 0;
        this.contadorPrenda2 = 0;
    }

    public void addTelaRoja(int telaRoja) {
        this.telaRoja = this.telaRoja + telaRoja;
    }

    public void addTelaNegra(int telaNegra) {
        this.telaNegra = this.telaNegra + telaNegra;
    }

    public int getPrenda1() {
        int prendas1;
        if ((telaRoja / 2) < (telaNegra / 1)) {
            prendas1 = (int) (telaRoja / 2);
        } else {
            prendas1 = telaNegra / 1;
        }
        return prendas1;
    }

    public int getPrenda2() {
        int prendas2;
        if ((telaRoja / 1) < (telaNegra / 2)) {
            prendas2 = (int) (telaRoja / 1);
        } else {
            prendas2 = telaNegra / 2;
        }
        return prendas2;
    }

    public boolean prenda1() {
        boolean auxPrenda1 = false;
        if (telaRoja >= 2 && telaNegra >= 1) {
            auxPrenda1 = true;
            telaRoja = telaRoja - 1;
            telaNegra = telaNegra - 2;
            contadorPrenda1++;
        }
        return auxPrenda1;
    }

    public boolean prenda2() {
        boolean auxPrenda2 = false;
        if (telaRoja >= 1 && telaNegra >= 2) {
            auxPrenda2 = true;
            telaRoja = telaRoja - 1;
            telaNegra = telaNegra - 2;
            contadorPrenda2++;
        }
        return auxPrenda2;
    }

    public double getTelaRoja() {
        return telaRoja;
    }

    public int getTelaNegra() {
        return telaNegra;
    }

    public String toString() {
        double ingresosPrenda1 = this.contadorPrenda1 * 15.45;
        double ingresosPrenda2 = this.contadorPrenda2 * 11.15;
        double ingresosTotales = ingresosPrenda1 + ingresosPrenda2;
        return "EXISTENCIAS: \n\tTela Roja: " + telaRoja + "metros.\n\tTela Negra: " + telaNegra + " metros.\n INGRESOS: " + ingresosTotales + " €.";
    }

}
