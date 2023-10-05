/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Lamus PC
 */
public class FactorIntegrante {

    Integral integral = new Integral();
    String msg;
    String px, fx, ux;
    String solucion = "";
    String ecuacion;
    int num = 0;
    int k = 0;

    public FactorIntegrante() {
    }

    public FactorIntegrante(String ecuacion) {
        this.ecuacion = ecuacion;
    }
    
    public void calcular(String ecuacion) {
        boolean bandera = false;

        if (ecuacion.contains("dy/dx")) {
            if (ecuacion.contains("Y")) {
                px = ecuacion.substring(ecuacion.indexOf("dx") + 3, ecuacion.indexOf("Y"));
                fx = ecuacion.substring(ecuacion.indexOf("=") + 1, ecuacion.length());

                try {
                    k = Integer.parseInt(fx);
                    bandera = true;
                    System.out.println("okay: " + bandera);
                } catch (Exception e) {
                    bandera = false;
                    System.out.println("okay_no: " + bandera);
                    msg = "Ha ocurrido un error!" + "\nk dede de ser un valor mayor a 0 y menor o igual a 9." + "\nm debe ser mayor a 0 y menor o igual a 9." + "\nn debe ser un entero positivo hasta el infinito";
                }

                if (px.contains("/x")) {
                    num = Integer.parseInt(px.substring(0, px.indexOf("/")));
                }

                if (num != 0) {
                    ux = "x^" + num;
                } else {
                    num = Integer.parseInt(px.substring(0, 1));
                    ux = "e^" + num + "x";
                }

                if (!px.contains("/x") && (fx.contains("sin") || fx.contains("cos"))) {
                    String gx = "e^" + px + "x";
                    solucion = integral.integral_siclica(gx, fx);

                } else if (px.contains("/x") && (fx.contains("sin") || fx.contains("cos"))) {
                    String gx = px.substring(0, px.indexOf("/")); //extraigo la constante
                    int m = Integer.parseInt(gx);
                    gx = "x^" + m;

                    solucion = integral.integral_algebraica_trigonometrica(gx, fx);
                    solucion = "1/x^" + m + "(" + solucion + ")";
                } else if (!px.contains("/x") && bandera) {
                    String gx = "e^" + px + "x";

                    solucion = integral.exponecial(gx, fx);

                } else if (!px.contains("/x") && fx.contains("e^")) {
                    String gx = "e^" + px + "x";
                    solucion = integral.exponecial(gx, fx);

                } else if (px.contains("/x") && bandera) {
                    String gx = "x^" + px;
                    solucion = integral.exponecial(gx, fx);
                }
                if (!px.contains("x")) {
                    msg = "No es una Ecuacion Diferencial";
                }

                if (solucion.contains("C")) {
                    msg = "p(x): " + px + "\nf(x): " + fx + "\nu(x): " + ux + "\n\nsu respuesta-> y(x)= " + solucion;
                } else {
                    msg = "Ha ocurrido un error!" + "\nRevise la ecuación según las formas de ecuaciónes solucionables.";
                }
                System.out.println("px: " + px + "\nfx: " + fx + "\nnum: " + num + "\nux: " + ux + "\ny(x)= " + solucion);
            } else {
                msg = "La ecuación no contiene 'Y' en Mayusculas";
            }

        } else {
            System.out.println("No es una Ecuacion Diferencial");
            msg = "No es una Ecuacion Diferencial";
        }
    }
        public Integral getIntegral() {
        return integral;
    }

    public void setIntegral(Integral integral) {
        this.integral = integral;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getPx() {
        return px;
    }

    public void setPx(String px) {
        this.px = px;
    }

    public String getFx() {
        return fx;
    }

    public void setFx(String fx) {
        this.fx = fx;
    }

    public String getUx() {
        return ux;
    }

    public void setUx(String ux) {
        this.ux = ux;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

}
