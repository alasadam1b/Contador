
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
     */
    public void incrementar()    {
         valor ++;
    }

    /**
     *  
     * Decrementa el valor en 1
     * @param    
     */
    public void decrementar()    {
         valor --;
    }

    /**
     *  
     * Resetea el valor a 0
     * @param  
     */
    public void reset()    {
         valor = 0;
    }

    /**
     *  
     * Devuelve por patalla el valor del contador
     * @param 
     * @print
     */
    public void printContador()    {
         System.out.println("Valor: " + valor);  
    }
}
