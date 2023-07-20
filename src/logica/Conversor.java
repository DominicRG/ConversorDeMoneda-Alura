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
}
