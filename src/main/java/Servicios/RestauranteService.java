package Servicios;

import Entidades.EstadoReserva;
import Entidades.Reserva;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RestauranteService {

    private List<Reserva> reservas = new ArrayList<>();
    public RestauranteService(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    /** 1. Reservas confirmadas de una fecha concreta */
    public void getReservasConfirmadas(LocalDate fecha) {
        reservas.stream()
                .filter(r -> r.getFecha().equals(fecha))
                .filter(r -> r.getEstado() == EstadoReserva.CONFIRMADA)
                .forEach(IO::println);
    }

    /** 2. Reservas de más de X personas */
    // getReservasGrandes(int numPersonas);

    /** 3. Primera reserva cancelada */
    // getPrimeraCancelada();

    /** 4. Reservas ordenadas por número de personas */
    // getReservasOrdenadas(LocalDate fecha);

    /** 5. Clientes con reservas grandes */
    // getClientesReservasGrandes();

    /** 6. Total previsto de reservas atendidas */
    // getTotalPrevistoAtendidas();

    /** 7. Número de reservas por estado */
   //  getReservasPorEstado();

    /** 8. Número de reservas por zona */
    // getReservasPorZona();

    /** 9. Reservas agrupadas por fecha */
    // getReservasAgrupadasPorFecha();

    /** 10. Cliente con más reservas */
   //  getClienteTop();

    /** 11. Recaudación prevista por fecha */
   //  getTotalPrevistoAgrupadoPorFecha();

    /** 12. Estadísticas de comensales */
   //  getEstadisticasNumPersonas();

    /** 13. Clientes ordenados alfabéticamente */
   //  getClientes();

    /** 14. Reservas futuras agrupadas por fecha */
    //  getReservasFuturasAgrupadasPorFecha();

    /** 15. Porcentaje de reservas canceladas */
    //  getPorcentajeCanceladas();

}


