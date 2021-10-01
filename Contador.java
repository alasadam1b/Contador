
/**
 *  
 * 
 * @author  
 * @version  
 */
public class Contador
{
    int valor;

    /**
     * Constructor  
     */
    public Contador()    {
         valor = 0;
    }

    /**
     *  
     * Devuelve el valor
     * @param   
     * @return    
     */
    public int getValor()    {
         return valor;
    }

    /**
     *  
     * Incrementa el valor en 1
     * @param   
     * @return    
     */
    public void incrementar()    {
         valor ++;
    }

    /**
     *  
     * Decrementa el valor en 1
     * @param   
     * @return    
     */
    public void decrementar()    {
         valor --;
    }
}
