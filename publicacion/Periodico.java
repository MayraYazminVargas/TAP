package publicacion;

public class Periodico extends Publicacion implements Periodicidad
{
    private String secciones;
    private String editor;
    
    public String getSecciones(){
     return secciones;
    }
    
    public void setSecciones(String Secciones){
        secciones = Secciones;
    }
    
    public String getEditor(){
     return editor;
    }
    
    public void setEditor(String Editor){
        editor = Editor;
    }
    
   
    
   @Override
    public String getPeriodicidad()//implementación del método
    {
     return periodicidad;
    }
        
  }