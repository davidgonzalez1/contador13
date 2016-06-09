package Simulador.contado.rmanual;

public class ClaseContadorManual {
  private int valor;
    
    public ClaseContadorManual() {
        valor = 0;
    }
    
    public void contar() {
        valor = valor + 1;
    }
    
    public int getConteoActual() {
        return valor;
    }
    
    public void reiniciarConteo() {
        valor = 0;
    }  
}
