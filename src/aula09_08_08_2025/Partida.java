package aula09_08_08_2025;

import java.time.LocalDateTime;
import java.util.UUID;

public class Partida {
    private UUID id;
    private LocalDateTime data;
    private Time timeVisitante;
    private Time timeMandante;
    private Estadio estadio;

    
    public Partida(UUID id, LocalDateTime data, Time timeVisitante, Time timeMandante, Estadio estadio) {
        this.id = id;
        this.data = data;
        this.timeVisitante = timeVisitante;
        this.timeMandante = timeMandante;
        this.estadio = estadio;
    }
    public Partida() {
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public LocalDateTime getData() {
        return data;
    }
    public void setData(LocalDateTime data) {
        this.data = data;
    }
    public Time getTimeVisitante() {
        return timeVisitante;
    }
    public void setTimeVisitante(Time timeVisitante) {
        this.timeVisitante = timeVisitante;
    }
    public Time getTimeMandante() {
        return timeMandante;
    }
    public void setTimeMandante(Time timeMandante) {
        this.timeMandante = timeMandante;
    }
    public Estadio getEstadio() {
        return estadio;
    }
    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
    
}
