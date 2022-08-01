
package com.MyPortfolio.MyBackSB.model;
 
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Setter @Getter
@Entity
public class Habilidad implements Serializable  {
  @Id
     @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
   @Basic
    private String skill;
   private String tipo;  
   private Long porcentaje;
    
    
    public Habilidad (){
        
    }

    public Habilidad(Long id, String skill,String tipo, Long porcentaje) {
        this.id = id;
        this.skill= skill;
        this.porcentaje = porcentaje;
        this.tipo = tipo; 
    }


}
