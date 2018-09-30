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
public class OrdenarMatricula extends LerArquivo {

    @Override
    public boolean compara(Professor professor1, Professor professor2) {
        if (Integer.parseInt(professor1.getMatricula()) < Integer.parseInt(professor2.getMatricula())) {
            return true;
        } else {
            return false;
        }

    }

}
