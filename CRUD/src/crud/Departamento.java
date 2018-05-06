/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.util.ArrayList;

/**
 *
 * @author lucaslimoni
 */
public class Departamento {
    private int Codigo;
    private String Nome;
    ArrayList<Funcionario> ListaFunc;
    
    
    public Departamento(){
        //instanciando o array
        ListaFunc = new ArrayList();
    }
    
    public Departamento(int Codigo, String Nome){
        this.Codigo = Codigo;
        this.Nome = Nome;
        //instanciando o array
        ListaFunc = new ArrayList();
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public ArrayList<Funcionario> getListaFunc() {
        return ListaFunc;
    }

    public void setListaFunc(ArrayList<Funcionario> ListaFunc) {
        this.ListaFunc = ListaFunc;
    }
    
    
    //add um funcionario
    public void addFunc(Funcionario F){
        F.setDep(this);
        ListaFunc.add(F);
    }
    
}
