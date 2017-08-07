/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc1.git;
/**
 *
 * @author karto
 */
public class Exerc1Git {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         InteracaoUsuario iu = new InteracaoUsuario();
    
        double base, altura, area;
        
        base = iu.solicitaDouble("Digite o valor da base: ");
        if(base < 0){
            while(base < 0){
                base = iu.solicitaDouble("Digite um valor válido para a base: ");
            }
        }
        
        altura = iu.solicitaDouble("Digite o valor da altura: ");
        if(altura < 0){
            while(altura < 0){
                altura = iu.solicitaDouble("Digite um valor válido para a altura: ");
            }
        }
        
        area = (base * altura)/2;
        
        iu.informaUsuario("A área calculada é: " + area);
    }
    
}
