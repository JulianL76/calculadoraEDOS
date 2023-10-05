/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Lamus PC
 */
public class StepbyStep{

    String px, ux, fx;
    String SolucionFinal;
    String paso1, paso2, paso3, paso4, paso5, paso6;
    String[] dividido, dividido2;
    FactorIntegrante factor = new FactorIntegrante();

    public void StepbyStep(String ecu) {
        factor.calcular(ecu);
        this.getFx();
        this.getUx();
        this.getPx();
    }
    
    
    public String getPx() {
        px = factor.getPx();
        if (px.contains("/")) {
            return px = "\\frac{" + px.replace("/", "}{") + "}";
        }
        return px;
    }

    public String getFx() {
        fx = factor.getFx();
        if (fx.contains("^")) {
            return fx = "e^{" + fx.replace("e^", "") + "}";
        }
        return fx;
    }

    public String getUx() {
        ux = factor.getUx();
        if (ux.contains("e")) {
            return ux = ux.replace("e^", "e^{") + "}";
            
        }
        return ux;
    }
    
    public String getPaso1() {
        paso1 = "\\frac{dy}{dx}+" + px + "y=" + fx;
        return paso1;
    }

    public String getPaso2() {
        paso2 = "u(x)=e^{\\int{" + px + "}dx}";
        return paso2;
    }

    public String getPaso3() {
        if (!px.contains("x")) {
            paso3 = "u(x)=e^{" + px + "x}";
            return paso3;
        }
        paso3 = "u(x)=x^{" + px.replace("\\frac", "").replace("x", "") + "}";
        return paso3;
    }

    public String getPaso4() {
        paso4 = "\\frac{d}{dx}[" + ux + "y]=" + ux + "." + fx;
        return paso4;
    }

    public String getPaso5() {
        paso5 = "y=\\frac{\\int{" + ux + "." + fx + "}}{{" + ux + "}}";
        return paso5;
    }

    public String getSolucion() {
        if (fx.contains("-cos") || fx.contains("-sin")) {
            solucion_negativas_trigonometricas();
        } else {
            solucion_trigonometricas();
            if (!factor.getFx().contains("cos") && !factor.getFx().contains("sin")) {
                SolucionFinal = dividido[0] + "+\\frac{C}{" + ux + "}";
            }
            if (factor.getFx().contains("^")) {
                solucion_exponencial();
            }
            
            if (factor.getPx().contains("x")){
            solucion_division_px();
            }
        }
        return SolucionFinal;
    }

    public void solucion_negativas_trigonometricas() {
        paso6 = factor.getSolucion().replace(" - ", "min").replace("+", "sum");
        dividido = paso6.split("min", 5);
        dividido2 = dividido[1].split("sum", 5);
        dividido[0] = "{" + dividido[0] + "}";
        String solucion1 = dividido[0].replace("/", "}{");
        dividido[0] = "\\frac" + solucion1;
        dividido2[0] = "{" + dividido2[0] + "}";
        String solucion2 = dividido2[0].replace("/", "}{");
        dividido2[0] = "\\frac" + solucion2;
        dividido2[1] = "{" + dividido2[1] + "}";
        String solucion3 = dividido2[1].replace("/", "}{");
        dividido2[1] = "\\frac" + solucion3;
        SolucionFinal = dividido[0] + "-" + dividido2[0] + "+\\frac{C}{" + ux + "}";
    }

    public void solucion_trigonometricas() {
        paso6 = factor.getSolucion().replace("+", "sum");
        dividido = paso6.split("sum", 5);
        dividido[0] = "{" + dividido[0] + "}";
        String solucion1 = dividido[0].replace("/", "}{");
        dividido[0] = "\\frac" + solucion1;
        dividido[1] = "{" + dividido[1] + "}";
        String solucion2 = dividido[1].replace("/", "}{");
        dividido[1] = "\\frac" + solucion2;
        SolucionFinal = dividido[0] + "+" + dividido[1] + "+\\frac{C}{" + ux + "}";
    }

    public void solucion_exponencial() {
        String sol = factor.getSolucion().replace("+", "sum");
        sol = sol.replace(")", "sum");
        dividido = sol.split("sum", 5);
        dividido[0] = dividido[0].replace("/", "}{");
        dividido[0] = dividido[0].replace("(", "{") + "}";
        dividido[1] = dividido[1].replace("e^", "e^{") + "}";
        SolucionFinal = "\\frac" + dividido[0] + dividido[1] + "+" + "\\frac{C}{" + ux + "}";
    }
    
    public void solucion_division_px(){
        String sol = factor.getSolucion().replace("1/"+ux,"");
        SolucionFinal = "\\frac{"+sol+"}{"+ux+"}";
    
    
    
    }
}
