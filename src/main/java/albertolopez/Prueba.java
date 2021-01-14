package albertolopez;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

/**
 * @author Alberto López Puertas
 * <alopezp90@gmail.com>
 */
public class Prueba {
    public static void main(String[] args) {
        
        LocalDate fecha = LocalDate.of(1990, Month.SEPTEMBER, 6);
        
        System.out.println("¿Fue bisiesto el año del dia " + fecha.toString() + "?");
        System.out.println(UtilidadesFecha.bisiesto(fecha));
        
        //Copia la fecha
        LocalDate fecha2 = UtilidadesFecha.copia(fecha);
        System.out.println("Copia:");
        UtilidadesFecha.mostrarFechaLarga(fecha2);
        
        System.out.println("¿Cuantos dias tuvo ese mes?");
        System.out.println(UtilidadesFecha.diasMes(fecha));
        
        System.out.println("¿Que dia de la semana fue?");
        System.out.println(UtilidadesFecha.diaSemana(fecha));
        
        System.out.println("Fecha larga:");
        UtilidadesFecha.mostrarFechaLarga(fecha);
        
        System.out.println("Suma 10 dias");
        UtilidadesFecha.mostrarFechaLarga(UtilidadesFecha.sumarDias(10, fecha));
        
        LocalDate hoy = LocalDate.now();
        System.out.println("Dias hasta hoy:");
        System.out.println(UtilidadesFecha.diasTranscurridos(fecha, hoy));
        
        System.out.println("¿Que dia es mañana?");
        UtilidadesFecha.mostrarFechaLarga(UtilidadesFecha.siguienteDia(hoy));
        
        System.out.println("¿Que dia fue ayer?");
        UtilidadesFecha.mostrarFechaLarga(UtilidadesFecha.anteriorDia(hoy));
        
        System.out.println("Minutos entre ahora y dentro de 3600 segundos");
        LocalDateTime ahora = LocalDateTime.now();
        LocalDateTime luego = UtilidadesFecha.sumarSegundos(3600, ahora);
        System.out.println(UtilidadesFecha.minutosEntre(ahora, luego));
    }
}
