/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import classeDados.Professor;
/**
 *
 * @author leticiasilva
 */
public class OrdenarNome extends LerArquivo  {



   

    @Override
    public boolean compara(Professor professor1, Professor professor2) {
        if (professor1.getNome().compareToIgnoreCase(professor2.getNome()) <= 0) {
            return true;
        } else {
            return false;
        }
    }

}
