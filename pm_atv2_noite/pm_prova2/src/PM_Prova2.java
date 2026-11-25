/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package src;

import java.util.Scanner;

import src.abstrato.Atividade;
import src.abstrato.Plano;
import src.enums.StatusAtividade;
import src.model.Musculacao;
import src.model.Natacao;
import src.model.PlanoBasico;
import src.model.PlanoPremium;
import src.model.Spinning;

/**
 *
 * @author glbra
 */
public class PM_Prova2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Academia academia = new Academia();
        String opcao = "";
        
        while(!opcao.equals("8")){

            System.out.println(
        "Escolha uma opção: \r\n" +
    "1. Associar atividades a um plano\r\n" + //
                        "2. Exibir todas as atividades cadastradas\r\n" + //
                        "3. Exibir todos os planos cadastrados\r\n" + //
                        "4. Exibir apenas planos ativos\r\n" + //
                        "5. Emitir certificado para objetos que implementam a interface Certificavel\r\n" + //
                        "6. Registrar presença em atividades que implementam a interface ControladorPresenca\r\n" + //
                        "7. Remover atividades inativas do sistema");
            opcao = sc.nextLine();  
            switch (opcao) {
                case "1":
                    
                    break;
                case "2":
                    academia.exibirAtividadesCadastrados();
                    break;
                case "3":
                    academia.exibirPlanosCadastrados();
                    break;
                case "4":
                    academia.exibirPlanosAtivos();
                    break;
                case "5":
                    //academia.emitirCertificado();
                    break;
                case "6":
                    
                    break;
                case "7":
                    
                    break;
                
            
                default:
                    break;
            }
        }

    }

    protected void executar(){
        Atividade musculacao = new Musculacao("Gabriel", 20, 4, 200, StatusAtividade.LOTADA , 0);
        Atividade natacao = new Natacao("Gabriel", 20, 4, 200, StatusAtividade.LOTADA, 100, true, 10);
        //Atividade spinning = new Spinning("Gabriel", 20, 4, 200, StatusAtividade.LOTADA , 0);

        Plano planoBasic = new PlanoBasico(null, 0, 0, null);
        Plano planoPremium = new PlanoPremium(null, 0, 0, null);

    }

}
