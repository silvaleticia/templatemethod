/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import classeDados.Professor;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author leticiasilva
 */
public abstract class LerArquivo {
    
   

    private static final String Arquivo1 = new File("/Users/leticiasilva/NetBeansProjects/ProfessorTemolate/src/dados/Professores.csv").getAbsolutePath();
    private static final String Arquivo2 = new File("/Users/leticiasilva/NetBeansProjects/ProfessorTemolate/src/dados/DadosGerais.csv").getAbsolutePath();

    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        //lerCsv();
    }
    
     public abstract boolean compara(Professor professor1, Professor professor2);

    public  ArrayList<Professor> lerCsv() throws Exception {

        try {
            ArrayList<Professor> professores = new ArrayList<>();

            FileReader lerArquivo1 = new FileReader(Arquivo1);
            FileReader lerArquivo2 = new FileReader(Arquivo2);

            BufferedReader br = new BufferedReader(lerArquivo1);
            BufferedReader p = new BufferedReader(lerArquivo2);

            String linha = "";
            String linha2 = "";

            while ((linha = br.readLine()) != null) {
                Professor objetoAux = new Professor();
                String[] teste = linha.split(";");
                String testes2 = "";

                while ((linha2 = p.readLine()) != null) {
                    String[] teste3 = linha2.split(";");
                    if (teste[0].equals(teste3[0])) {
                        testes2 = linha2;
                        break;
                    }
                }
                objetoAux.materializar(linha + ";" + testes2);

                professores.add(objetoAux);
            }
            /*Collections.sort(professores, Comparator.comparing(Professor::getNome));
            for (int i = 0; i < professores.size(); i++) {
                //System.out.println(professores.get(i).desmaterializar());
            }*/
            //P
           

            br.close();
            p.close();
            
            //Ordenar
            for (int i = 0; i < professores.size(); i++) {
                for (int j = i; j < professores.size(); j++) {
                    
                    if (!compara(professores.get(i),professores.get(j))) {    
                        Professor temp = professores.get(j);
                        professores.set(j, professores.get(i));
                        professores.set(i, temp);
                    }
                }
            }
            
            return professores;

        } catch (Exception e) {
            throw e;
        }

    }
}
