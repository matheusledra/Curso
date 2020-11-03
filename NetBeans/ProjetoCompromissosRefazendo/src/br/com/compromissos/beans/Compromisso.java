package br.com.compromissos.beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Compromisso {

    private String local, titulo, status;
    private Calendar data = Calendar.getInstance();

    public Compromisso() {
    }

    public Compromisso(String local, String titulo, String status, String data) throws ParseException {
        this.local = local;
        this.titulo = titulo;
        this.status = status;
        this.setData(data);
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dataFormat.format(this.data.getTime());
    }

    public void setData(String data) throws ParseException {
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.data.setTime(dataFormat.parse(data));
    }

    
    
}
