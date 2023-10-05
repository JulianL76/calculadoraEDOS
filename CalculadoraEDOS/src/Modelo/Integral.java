package Modelo;

import static Modelo.Trigonometricas.signos;

/**
 * Autores: 
 * Daniela Alexandra Patiño Davila - 1152136 
 * Cristian Julian Lamus Lamus - 1152139 
 * Jairo Alexis Rojas Ramirez - 1152142 
 * Jairo Alberto Duran Rivero - 1152160
 */

public class Integral {

    String u, dv, v, du;

    /**
     * Metodo usado en la version 1.0
     */
    private void componentes(String fx, String gx) {
        int f1 = ILATE(fx);
        int f2 = ILATE(gx);
        if (f1 > f2) {
            u = fx;
            dv = gx;
        } else if (f1 < f2) {
            u = gx;
            dv = fx;
        } else {
            if (fx.contains("/")) {
                u = gx;
                dv = fx;
            } else {
                u = fx;
                dv = gx;
            }
        }
        Derivada derivada = new Derivada();
        derivada.setFuncionADerivar(u);
        derivada.derivar();
        du = derivada.getFuncionDerivada(); //Se obtiene du
        v = integralDirecta(dv);
    }//end void componentes.

     /**
     * Metodo usado en la version 1.0
     */
    private String integralDirecta(String fx) {
        if (fx.contains("e^")) {
            if (!fx.equals("e^x")) {
                int k = Integer.parseInt(fx.substring(fx.indexOf("^") + 1, fx.length() - 1));
                if (k == 0) {
                    fx = "x";
                } else {
                    fx = "(1/" + k + ")e^" + k + "x";
                }
            }
        } else if (fx.equals("sin(x)")) {
            fx = "-cos(x)";
        } else if (fx.equals("cos(x)")) {
            fx = "sin(x)";
        } else if (fx.equals("-sin(x)")) {
            fx = "cos(x)";
        } else if (fx.equals("-cos(x)")) {
            fx = "-sin(x)";
        } else if (fx.contains("ln(x)")) {
            fx = "xln-x";
        } else if (fx.contains("x^")) {
            String coeficiente = fx.substring(0, fx.indexOf("x"));
            int n = Integer.parseInt(fx.substring(fx.indexOf("^") + 1, fx.length()));
            if (n == -1) {
                fx = coeficiente + "ln(x)";
            } else {
                fx = coeficiente + "(1/" + (n + 1) + ")x^" + (n + 1);
            }
        } else if (fx.equals("x")) {
            fx = "(1/2)x^2";
        } else if (fx.equals("1")) {
            fx = "x";
        } else if (fx.contains("/x")) {
            fx = fx.substring(0, fx.indexOf("/")) + "ln(x)";
        } else if (!fx.contains("x")) {
            fx = fx + "x";
        } else if (fx.contains("x") && !fx.equals("x")) {
            fx = "(1/2)" + fx.substring(0, fx.indexOf("x")) + "x^2";
        } else {
            fx = "Nada";
        }
        return fx;
    }

    static int ILATE(String fx) {
        int n = 0;
        String function = "";
        if (fx.contains("arc")) {
            function = "inversa";
            n = 5;
        } else if (fx.contains("ln")) {
            function = "logaritmica";
            n = 4;
        } else if ((fx.contains("x") || fx.contains("x^")) && (!(fx.contains("sin") || fx.contains("cos") || fx.contains("tan") || fx.contains("sec") || fx.contains("cot") || fx.contains("csc") || fx.contains("ln") || fx.contains("e^")))) {
            function = "algebraica";
            n = 3;
        } else if (fx.contains("sin") || fx.contains("cos") || fx.contains("tan") || fx.contains("sec") || fx.contains("cot") || fx.contains("csc")) {
            function = "trigonometrica";
            n = 2;
        } else if (fx.contains("e")) {
            function = "exponencial";
            n = 1;
        }
        return n;
    }

    public String integral_siclica(String fx, String gx) {
        String I = "";
        String ux = fx;
        int k = Integer.parseInt(ux.substring(ux.indexOf("^") + 1, ux.indexOf("x")));
        if (gx.equals("sin(x)")) {
            I = "-cos(x)/(" + (1 + k * k) + ") + " + k + "sin(x)/(" + (1 + k * k) + ") + C/e^" + k + "x";
        } else if (gx.equals("cos(x)")) {
            I = "sin(x)/(" + (1 + k * k) + ") + " + k + "cos(x)/(" + (1 + k * k) + ") + C/e^" + k + "x";
        } else if (gx.equals("-sin(x)")) {
            I = "cos(x)/(" + (1 + k * k) + ") - " + k + "sin(x)/(" + (1 + k * k) + ") + C/e^" + k + "x";
        } else if (gx.equals("-cos(x)")) {
            I = "-sin(x)/(" + (1 + k * k) + ") - " + k + "cos(x)/(" + (1 + k * k) + ") + C/e^" + k + "x";
        }
        return I;
    }

    public String integral_algebraica_trigonometrica(String fx, String gx) {
        String ux = fx;
        String I = "";
        int n = Integer.parseInt(ux.substring(ux.indexOf("^") + 1, ux.indexOf("^") + 2));
        if (gx.equals("sin(x)")) {
            I = coseno_gxsinx(n) + " + " + seno_gxsinx(n) + "+ C";
        } else if (gx.equals("cos(x)")) {
            I = seno_gxcosx(n) + " + " + coseno_gxcosx(n) + "+ C";
        } else if (gx.equals("-cos(x)")) {
            I = "-" + seno_gxcosx(n) + " - " + coseno_gxcosx(n) + "+ C";
        } else if (gx.equals("-sin(x)")) {
            I = "-" + coseno_gxsinx(n) + " - " + seno_gxsinx(n) + "+ C";
        }
        return I;
    }

    private String coseno_gxsinx(int n) {
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
    }//end cosx sinx

    private String seno_gxsinx(int n) {
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
    }//end sinx sinx

    private String seno_gxcosx(int n) {
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
        data = "x^" + n;
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
            signo--;
            if (signo < 0) {
                signo = 1;
            }
        }//end while
        data = "sin(x)[" + data + "]";
        return data;
    }//end sinx cosx

    private String coseno_gxcosx(int n) {
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
        }
        data = "cos(x)[" + data + "]";
        return data;
    }//end cosx cosx

    public String exponecial(String gx, String fx) {
        String I = "";
        int n = 0;
        int k = 0;
        int m = 0;
        boolean b = false;
        try {
            k = Integer.parseInt(fx);
            b = true;
        } catch (NumberFormatException e) {
            b = false;
        }
        if (gx.contains("e^") && b) {
            if (k != 0) {
                n = Integer.parseInt(gx.substring(gx.indexOf("^") + 1, gx.indexOf("^") + 2));
                I = k + "/" + n + " + " + " C/e^" + n + "x";
            } else {
                n = Integer.parseInt(gx.substring(gx.indexOf("^") + 1, gx.indexOf("^") + 2));
                I = "Ce^-" + n + "x";
            }
        } else if (gx.contains("e^") && fx.contains("e^")) {
            n = Integer.parseInt(gx.substring(gx.indexOf("^") + 1, gx.indexOf("^") + 2));
            m = Integer.parseInt(fx.substring(fx.indexOf("^") + 1, fx.indexOf("^") + 2));
            I = "(1/" + (n + m) + ")e^" + m + "x + Ce^-" + n + "x";
        } else if (gx.contains("x^") && b) {
            if (k != 0) {
                n = Integer.parseInt(gx.substring(gx.indexOf("^") + 1, gx.indexOf("^") + 2));
                I = k + "x/" + (n + 1) + " + " + " Cx^-" + n;
            } else {
                n = Integer.parseInt(gx.substring(gx.indexOf("^") + 1, gx.indexOf("^") + 2));
                I = "Cx^-" + n;
            }
        }
        return I;
    }

}//end class Integral
