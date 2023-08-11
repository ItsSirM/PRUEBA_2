/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaa;

/**
 *
 * @author AdminColeexz
 */
public abstract class JuegoAhorcadoBase implements JuegoAhorcado{
    
    abstract void actualizarPalabraActual(char letra);
    abstract boolean verificarLetra();
    abstract boolean hasGanado();
    
    
    @Override
    public void jugar(){
        
    }
    
    @Override
    public void inicializarPalabraSecreta(){
        
    }
}
