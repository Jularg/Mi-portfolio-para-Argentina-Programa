
package com.MyPortfolio.MyBackSB.service;


import com.MyPortfolio.MyBackSB.model.Hobbies;
import java.util.List;


public interface IHobbiesServices {
   public List <Hobbies> verHobbies();
    
    public void crearHobby(Hobbies hob);
    
    public void borrarHobby (Long id);
    
    public Hobbies buscarHobby (Long id);
    
}
