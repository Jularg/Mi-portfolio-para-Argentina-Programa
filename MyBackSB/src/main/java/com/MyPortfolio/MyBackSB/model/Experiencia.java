package com.MyPortfolio.MyBackSB.model;
 
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Experiencia implements Serializable  {
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
   @Basic
    private String cargo;
    private String anio;
    private String conocimiento;
    private String image;
    
    public Experiencia (){
    }

    public Experiencia(Long id, String cargo, String anio, String conocimiento, String image) {
        this.id = id;
        this.cargo = cargo;
        this.anio = anio;
        this.conocimiento = conocimiento;
        this.image = image;
    }
    
}
 