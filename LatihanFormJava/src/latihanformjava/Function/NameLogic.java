/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanformjava.Function;
import latihanformjava.Model.ModelProgram;
/**
 *
 * @author basazard
 */
public class NameLogic {
    
    public String returnName(ModelProgram modelProgram){
        if(modelProgram.getName().equals("")){
            return "your name couldn't be empty";
        }
        else{
            return "Hello you must be " + modelProgram.getName();
        }
    }
}
