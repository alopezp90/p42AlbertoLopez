package albertolopez;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class UtilidadesFecha {

    public static boolean bisiesto(LocalDate fecha) {
        return fecha.isLeapYear();
    }

    public static LocalDate copia(LocalDate fecha) {
        return LocalDate.of(fecha.getYear(), fecha.getMonth(), fecha.getDayOfMonth());
    }

    public static int diasMes(LocalDate fecha){
        return fecha.getMonth().length(bisiesto(fecha));
    }
                
    public static int diaSemana(LocalDate fecha) {
        return fecha.getDayOfWeek().ordinal();
    }

    public static void mostrarFechaLarga(LocalDate fecha) {
        Locale configSistema = Locale.getDefault();
        System.out.println(fecha.getDayOfWeek().getDisplayName(TextStyle.FULL, configSistema)
                + " " + fecha.getDayOfMonth() 
                + " de " + fecha.getMonth().getDisplayName(TextStyle.FULL, configSistema)
                + " de " + fecha.getYear());
    }

    public static LocalDate sumarDias(long numeroDias, LocalDate fecha) {
        return fecha.plus(numeroDias, ChronoUnit.DAYS);
    }

    public static long diasTranscurridos(LocalDate fechaInicial, LocalDate fechaFinal) {
        return ChronoUnit.DAYS.between(fechaInicial, fechaFinal);
    }

    public static LocalDate siguienteDia(LocalDate fecha) {
        return fecha.plus(1, ChronoUnit.DAYS);
    }

    public static LocalDate anteriorDia(LocalDate fecha) {
        return fecha.minus(1, ChronoUnit.DAYS);
    }

    public static long minutosEntre(LocalDateTime fecha1, LocalDateTime fecha2) {
        return ChronoUnit.MINUTES.between(fecha1, fecha2);
    }

    public static LocalDateTime sumarSegundos(long numeroSegundos, LocalDateTime fecha) {
        return fecha.plusSeconds(numeroSegundos);
    }
}
