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
        int cambiosCom;
        if ((telaRoja / 2) < (telaNegra / 1)) {
            cambiosCom = (int) (telaRoja / 2);
        } else {
            cambiosCom = telaNegra / 1;
        }
        return cambiosCom;
    }

    public int getPrenda2() {
        int cambiosPar;
        if ((telaRoja / 1) < (telaNegra / 2)) {
            cambiosPar = (int) (telaRoja / 1);
        } else {
            cambiosPar = telaNegra / 2;
        }
        return cambiosPar;
    }

    public boolean prenda1() {
        boolean auxCom = false;
        if (telaRoja >= 2 && telaNegra >= 1) {
            auxCom = true;
            telaRoja = telaRoja - 1;
            telaNegra = telaNegra - 2;
            contadorPrenda1++;
        }
        return auxCom;
    }

    public boolean prenda2() {
        boolean auxPar = false;
        if (telaRoja >= 1 && telaNegra >= 2) {
            auxPar = true;
            telaRoja = telaRoja - 1;
            telaNegra = telaNegra - 2;
            contadorPrenda2++;
        }
        return auxPar;
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
