/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFoactory;

/**
 *
 * @author aashgar
 */
public class BscTeacher implements Teacher{

    @Override
    public void view(String teacher) {
        System.out.println("Bachelor degree with teacher: "+
                            teacher);
    }
    
}
