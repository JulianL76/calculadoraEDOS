package Modelo;

public class Trigonometricas {

    /**
 * Autores: 
 * Daniela Alexandra Patiño Davila - 1152136 
 * Cristian Julian Lamus Lamus - 1152139 
 * Jairo Alexis Rojas Ramirez - 1152142 
 * Jairo Alberto Duran Rivero - 1152160
 */
    
    static char signos[] = {'+', '-'};

    public static void main(String[] args) {

        Integral i = new Integral();
        String px, fx, ux;
        px = "";
        fx = "";
        String y = "";
        int num = 0;
        String gx = "";
        String edo = "dy/dx+3Y=sin(x)";
        if (edo.contains("dy/dx")) {
            if (edo.contains("Y")) {
                px = edo.substring(edo.indexOf("dx") + 3, edo.indexOf("Y"));
                fx = edo.substring(edo.indexOf("=") + 1, edo.length());

                if (px.contains("/x")) {
                    num = Integer.parseInt(px.substring(0, px.indexOf("/")));
                }

                if (!px.contains("/x") && (fx.contains("sin") || fx.contains("cos"))) {
                    gx = px.substring(0, px.indexOf("Y"));

                } else if (px.contains("/x") && (fx.contains("sin") || fx.contains("cos"))) {
                    gx = px.substring(0, px.indexOf("Y")); //extraigo la constante
                    int k = Integer.parseInt(gx);
                    gx = "x^" + k;
                    y = "1/x^" + k + "(" + y + ")";
                }

            }else{
            
            }
        }

        System.out.println(px + "\n" + fx + "\n" + gx);
    } //end main

    static String coseno(int n) {
        int veces = 0;
        if (n % 2 == 0) {
            veces = n / 2;
        } else {
            veces = (n - 1) / 2;
        }

        String data = "";
        byte signo = 0;
        int N = 1;
        int exponente = 1;
        int exp = n;
        String variable = "x^";
        String variable2 = exp + "";
        data = "-x^" + n;
        String cantidad = "n(n-" + N + ")";
        int coeficiente = n * (n - N);
        cantidad = coeficiente + "";
        while (veces != 0) {
            exp = (n - (2 * exponente));
            if (exp == 0) {
                variable = "";
                variable2 = "";
            } else {
                variable2 = exp + "";
            }
            if (exp == 1) {
                variable = "x";
                variable2 = "";
            }
            data += signos[signo] + cantidad + variable + variable2;
            coeficiente = coeficiente * (n - (N + 1)) * (n - (N + 2));
            cantidad = coeficiente + "";
            exponente++;
            N += 2;
            veces--;
            signo++;
            if (signo > 1) {
                signo = 0;
            }
        }//end while
        data = "cos(x)[" + data + "]";
        return data;
    }
    static String seno(int n) {
        int veces = 0;
        if (n % 2 == 0) {
            veces = n / 2;
        } else {
            veces = (n - 1) / 2;
        }

        String data = "";
        byte signo = 1;
        int N = 1;
        int exponente = 1;

        int exp = n;
        String variable = "x^";
        String variable2 = exp + "";
        if ((n - 1) == 1) {
            data = n + "x";
        } else {
            data = n + "x^" + (n - 1);
        }
        String cantidad = "n(n-" + N + ")";
        int coeficiente = n * (n - N) * (n - (N + 1));

        cantidad = coeficiente + "";

        while (veces != 0) {

            exp = (n - ((2 * exponente) + 1));
            if (exp < 0 || exp == 0) {
                variable = "";
                variable2 = "";
            } else {
                variable2 = exp + "";
            }
            if (exp == 1) {
                variable = "x";
                variable2 = "";
            }
            if (coeficiente == 0) {
                cantidad = "";
                data += variable + variable2;
            } else {
                data += signos[signo] + cantidad + variable + variable2;
            }
            coeficiente = coeficiente * (n - (N + 2)) * (n - (N + 3));
            cantidad = coeficiente + "";
            exponente++;
            N += 2;
            veces--;
            signo--;
            if (signo < 0) {
                signo = 1;
            }
        }//end while
        data = "sin(x)[" + data + "]";
        return data;
    }

}
