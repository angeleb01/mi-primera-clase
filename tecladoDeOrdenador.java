
/**
 * Write a description of class tecladoDeOrdenador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TecladoDeOrdenador
{
    //Atributos de la clase
    private String marca;
    private int numTeclas;
    private boolean rgb;
    /**
     * Constructor de la clase tecladoDeOrdenador
     */
    public TecladoDeOrdenador (String marcas, int numT){
        marca = marcas;
        numTeclas = numT;
        rgb = false;
    }
    
    /**
     * Metodo getter Marca
     */
    public String getMarca(){
        return marca;
    }
    
    /**
     * Metodo getter numTeclas
     */
    public int getNumTeclas(){
        return numTeclas;
    }

    /**
     * Metodo getter RGB
     */
    public boolean getRgb(){
        return rgb;
    }
    
    /**
     * Metodo setter Marca
     */
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    /**
     * Metodo setter numTeclas
     */
    public void setNumTeclas(int teclas){
        numTeclas = teclas;
    }
    
    /**
     * Metodo setter RGB
     */
    public void setRgb(){
        if(rgb == false){
            rgb = true;
        }
        else{
            rgb = false;
        }
    }
    
    /**
     * Metodo imprimir en pantalla
     */
    public void imprimirDetalles(){
        if(rgb == true){
            System.out.println("Marca: " + marca + " | " + "Número de teclas: " + numTeclas + " | " + "¿Tiene RGB?: Si");
        }
        else{
            System.out.println("Marca: " + marca + " | " + "Número de teclas: " + numTeclas + " | " + "¿Tiene RGB?: No" );
        }
    }
    
    /**
     * Metodo que nos devuelve un String
     */
    public String getDetalles(){
        String detalles = "Marca: " + marca + " | " + "Número de teclas: " + numTeclas;
        if(rgb == true){
            detalles = detalles + " | " + "¿Tiene RGB?: Si";
        }
        else{
            detalles = detalles + " | " + "¿Tiene RGB?: No";
        }
        return detalles;
    }
}
