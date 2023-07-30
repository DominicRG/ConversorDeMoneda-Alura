package logica;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Conversor {

    public String[] valoresDivisas() {
        String[] valueCboDivisas = {
            "Seleccione: ",
            "Sol",
            "Dólar",
            "Euro",
            "Libra Esterlina",
            "Yen Japones",
            "Won sul-coreano"
        };
        return valueCboDivisas;
    }

    public BigDecimal Divisas(double cantidad, int monedaNatal, int monedaDestino) {

        double result, valorPorUnidad;

        switch (monedaNatal) {
            case 1:
                switch (monedaDestino) {
                    case 2:
                        valorPorUnidad = 0.28;
                        result = cantidad * valorPorUnidad;
                        break;
                    case 3:
                        valorPorUnidad = 0.25;
                        result = cantidad * valorPorUnidad;
                        break;
                    case 4:
                        valorPorUnidad = 0.22;
                        result = cantidad * valorPorUnidad;
                        break;
                    case 5:
                        valorPorUnidad = 38.92;
                        result = cantidad * valorPorUnidad;
                        break;
                    case 6:
                        valorPorUnidad = 353.49;
                        result = cantidad * valorPorUnidad;
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case 2:
                switch (monedaDestino) {
                    case 1:
                        valorPorUnidad = 3.58;
                        result = cantidad * valorPorUnidad;
                        break;
                    case 3:
                        valorPorUnidad = 0.89;
                        result = cantidad * valorPorUnidad;
                        break;
                    case 4:
                        valorPorUnidad = 0.77;
                        result = cantidad * valorPorUnidad;
                        break;
                    case 5:
                        valorPorUnidad = 139.17;
                        result = cantidad * valorPorUnidad;
                        break;
                    case 6:
                        valorPorUnidad = 1263.91;
                        result = cantidad * valorPorUnidad;
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case 3:
                switch (monedaDestino) {
                    case 1:
                        valorPorUnidad = 4.01;
                        result = cantidad * valorPorUnidad;
                        break;
                    case 2:
                        valorPorUnidad = 1.12;
                        result = cantidad * valorPorUnidad;
                        break;
                    case 4:
                        valorPorUnidad = 0.87;
                        result = cantidad * valorPorUnidad;
                        break;
                    case 5:
                        valorPorUnidad = 156.32;
                        result = cantidad * valorPorUnidad;
                        break;
                    case 6:
                        valorPorUnidad = 1419.07;
                        result = cantidad * valorPorUnidad;
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case 4:
                switch (monedaDestino) {
                    case 1:
                        valorPorUnidad = 4.63;
                        result = cantidad * valorPorUnidad;
                        break;
                    case 2:
                        valorPorUnidad = 1.29;
                        result = cantidad * valorPorUnidad;
                        break;
                    case 3:
                        valorPorUnidad = 1.15;
                        result = cantidad * valorPorUnidad;
                        break;
                    case 5:
                        valorPorUnidad = 180.19;
                        result = cantidad * valorPorUnidad;
                        break;
                    case 6:
                        valorPorUnidad = 1636.14;
                        result = cantidad * valorPorUnidad;
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case 5:
                switch (monedaDestino) {
                    case 1:
                        valorPorUnidad = 0.026;
                        result = cantidad * valorPorUnidad;
                        break;
                    case 2:
                        valorPorUnidad = 0.0072;
                        result = cantidad * valorPorUnidad;
                        break;
                    case 3:
                        valorPorUnidad = 0.0064;
                        result = cantidad * valorPorUnidad;
                        break;
                    case 4:
                        valorPorUnidad = 0.0055;
                        result = cantidad * valorPorUnidad;
                        break;
                    case 6:
                        valorPorUnidad = 9.07;
                        result = cantidad * valorPorUnidad;
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case 6:
                switch (monedaDestino) {
                    case 1:
                        valorPorUnidad = 0.0028;
                        result = cantidad * valorPorUnidad;
                        break;
                    case 2:
                        valorPorUnidad = 0.00079;
                        result = cantidad * valorPorUnidad;
                        break;  
                    case 3:
                        valorPorUnidad = 0.00071;
                        result = cantidad * valorPorUnidad;
                        break;
                    case 4:
                        valorPorUnidad = 0.00061;
                        result = cantidad * valorPorUnidad;
                        break;
                    case 5:
                        valorPorUnidad = 0.11;
                        result = cantidad * valorPorUnidad;
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            default:
                throw new AssertionError();
        }
        
        // Convertir el resultado en un BigDecimal
        BigDecimal resultConversion = BigDecimal.valueOf(result);
        
        // Redondear el resultado a dos decimales sin redondeo
        resultConversion = resultConversion.setScale(2, RoundingMode.DOWN);
        
        
        return resultConversion;
    }
    
    public String[] valoresTemperatura(){
        String[] valueCboTemperatura = {
            "Seleccione: ",
            "Celsius",
            "Fahrenheit",
            "Kelvin"
        };
        return valueCboTemperatura;
    }
    
    public BigDecimal Temperatura(double cantidad, int escalaOrigen, int escalaDestino){
        double result;
        
        switch (escalaOrigen) {
            case 1:
                switch (escalaDestino) {
                    case 2:
                        result = (cantidad * 9/5) + 32;
                        break;
                    case 3:
                        result = (cantidad + 273.15);
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case 2:
                switch (escalaDestino) {
                    case 1:
                        result = (cantidad - 32)* 5/9;        
                        break;  
                    case 3:
                        result = (cantidad - 32)* 5/9 + 273.15;
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case 3:
                switch (escalaDestino) {
                    case 1:
                        result = cantidad - 273.15;
                        break;
                    case 2:
                        result = (cantidad - 273.15) * 9/5 + 32;
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            default:
                throw new AssertionError();
        }
        
        // Convertir el resultado en un BigDecimal
        BigDecimal resultConversion = BigDecimal.valueOf(result);
        
        // Redondear el resultado a dos decimales sin redondeo
        resultConversion = resultConversion.setScale(2, RoundingMode.DOWN);
        
        return resultConversion;
    }
    
    public String[] valoresDistancia(){
        String[] valueCboTemperatura = {
            "Seleccione: ",
            "Kilometros",
            "Millas",
            "Metros",
            "Yardas",
            "Pies",
            "Centimetros"
        };
        return valueCboTemperatura;
    }
    
    public BigDecimal distancia(double cantidad, int distanciaOrigen, int distanciaDestino){
        double result;
        
        switch (distanciaOrigen) {
            case 1:
                switch (distanciaDestino) {
                    case 2:
                        result = cantidad / 1.609;
                        break;
                    case 3:
                        result = cantidad * 1000;
                        break;
                    case 4:
                        result = cantidad * 1904;
                        break;
                    case 5:
                        result = cantidad * 3281;
                        break;
                    case 6:
                        result = cantidad * 100000;
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case 2:
                switch (distanciaDestino) {
                    case 1:
                        result = cantidad * 1.609;
                        break;
                    case 3:
                        result = cantidad * 1609;
                        break;
                    case 4:
                        result = cantidad * 1760;
                        break;
                    case 5:
                        result = cantidad * 5280;
                        break;
                    case 6:
                        result = cantidad * 160900;
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case 3:
                switch (distanciaDestino) {
                    case 1:
                        result = cantidad / 1000;
                        break;
                    case 2:
                        result = cantidad / 1609;
                        break;
                    case 4:
                        result = cantidad * 1.094;
                        break;
                    case 5:
                        result = cantidad * 3.281;
                        break;
                    case 6:
                        result = cantidad * 100;
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case 4:
                switch (distanciaDestino) {
                    case 1:
                        result = cantidad / 1094;
                        break;
                    case 2:
                        result = cantidad / 1760;
                        break;
                    case 3:
                        result = cantidad / 1.094;
                        break;
                    case 5:
                        result = cantidad * 3;
                        break;
                    case 6:
                        result = cantidad * 91.44;
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case 5:
                switch (distanciaDestino) {
                    case 1:
                        result = cantidad / 3281;
                        break;
                    case 2:
                        result = cantidad / 5280;
                        break;
                    case 3:
                        result = cantidad / 3.281;
                        break;
                    case 4:
                        result = cantidad / 3;
                        break;
                    case 6:
                        result = cantidad * 30.48;
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case 6:
                switch (distanciaDestino) {
                    case 1:
                        result = cantidad / 100000;
                        break;
                    case 2:
                        result = cantidad / 160900;
                        break;
                    case 3:
                        result = cantidad / 100;
                        break;
                    case 4:
                        result = cantidad / 91.44;
                        break;
                    case 5:
                        result = cantidad / 30.48;
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            default:
                throw new AssertionError();
        }
        
        // Convertir el resultado en un BigDecimal
        BigDecimal resultConversion = BigDecimal.valueOf(result);
        
        // Redondear el resultado a dos decimales sin redondeo
        resultConversion = resultConversion.setScale(6, RoundingMode.DOWN);
        
        return resultConversion;
    }
}