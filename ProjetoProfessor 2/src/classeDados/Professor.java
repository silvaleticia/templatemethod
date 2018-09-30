/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeDados;



/**
 *
 * @author leticiasilva
 */
public class Professor {

    private String nome;
    private String matricula;
    private String departamento;
    private String titulacao;
    private String contrato;

    

    public Professor(String matricula, String nome, String departamento, String titulacao, String contrato) {
        this.nome = nome;
        this.matricula = matricula;
        this.departamento = departamento;
        this.titulacao = titulacao;
        this.contrato = contrato;
    }
    
    public Professor(String str){
        String[] vetor = str.split(";");
        this.matricula = vetor[0];
        this.nome = vetor[1];
        this.departamento = vetor[2];
        this.titulacao = vetor[3];
        this.contrato = vetor[4];
    }

    public Professor() {
    }
    
    

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public String getContrato() {
        return contrato;
    }
    public void materializar(String dados) throws Exception {
        String vetorString[] = dados.split(";");
       
        matricula = vetorString[0];
        nome = vetorString[1];
        departamento = vetorString[3];
        titulacao = vetorString[4];
        contrato = vetorString[5];
    }


    public String desmaterializar() {
        String saida = matricula + ";" + nome + ";" + departamento + ";" + titulacao + ";" + contrato;
        return saida;    
    }
    @Override
    public String toString() {
        return "" + matricula + ";" + nome + ";" + departamento + ";" + titulacao + ";" + contrato + ";";
          
    }

}
