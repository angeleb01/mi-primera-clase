
/**
 * Write a description of class tecladoDeOrdenador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tecladoDeOrdenador
{
    //Atributos de la clase
    private String marca;
    private int numTeclas;
    private boolean RGB;
    /**
     * Constructor de la clase tecladoDeOrdenador
     */
    public tecladoDeOrdenador (String marcas, int numT){
        marca = marcas;
        numTeclas = numT;
        RGB = false;
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
    public boolean getRGB(){
        return RGB;
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
        this.numTeclas = teclas;
    }
    
    /**
     * Metodo setter RGB
     */
    public void setRGB(){
        this.RGB = RGB;
    }
    
    /**
     * Metodo imprimir en pantalla
     */
    public void imprimirDetalles(){
        System.out.println("Marca: " + marca + " | " + "Número de teclas: " + numTeclas + " | " + "¿Tiene RGB?: " + RGB);
    }
    
    /**
     * Metodo que nos devuelve un String
     */
    public String getDetalles(){
        String detalles = "Marca: " + marca + " | " + "Número de teclas: " + numTeclas + " | " + "¿Tiene RGB?: " + RGB;
        return detalles;
    }
}
