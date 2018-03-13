/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;


public class Gato extends Animal {
    
   @Override
   String emitirsonido() {
       return "MIAUUUUU";   
    
}
   
    String emitirsonido(String rabia) {
        
       return "GRRRRR MIAUU";   
    }

}