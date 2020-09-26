package examen2_tylercruz;

import java.io.Serializable;
import java.util.Date;

public class Mensaje implements Serializable{
    private String cotenido;
    private Date hora;
    private Date date;
    private boolean seen;
    private static final long SerialVersionUID=102L;

    public Mensaje() {
    }

    public Mensaje(String cotenido, Date hora, Date date, boolean seen) {
        this.cotenido = cotenido;
        this.hora = hora;
        this.date = date;
        this.seen = seen;
    }

    public String getCotenido() {
        return cotenido;
    }

    public void setCotenido(String cotenido) {
        this.cotenido = cotenido;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isSeen() {
        return seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "cotenido=" + cotenido + ", hora=" + hora + ", date=" + date + ", seen=" + seen + '}';
    }
    
}
