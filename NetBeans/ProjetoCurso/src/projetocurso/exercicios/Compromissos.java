package projetocurso.exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Compromissos {
    private String titulo, tipo, local, dataFinal;
    private Calendar data = Calendar.getInstance();
    
    public Compromissos(String titulo, String tipo, String dataCompromisso, String local) throws ParseException {
        
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
        
        data.setTime(dataFormat.parse(dataCompromisso));
        
        this.titulo = titulo;
        this.tipo = tipo;
        this.dataFinal = dataFormat.format(this.data.getTime());
        this.local = local;
    }
    
    public String getTitulo() {
        return this.titulo;
    }
    
    public String getTipo() {
        return this.tipo;
    }
    
    public String getData() {
        return this.dataFinal;
    }
    
    public String getLocal() {
        return this.local;
    }
        
}
