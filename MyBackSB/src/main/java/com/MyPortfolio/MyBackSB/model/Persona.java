
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
  public class Persona implements Serializable {
     @Id
     @GeneratedValue(strategy= GenerationType.AUTO)
     private Long id;
     @Basic
     private String nombre;
     private String apellido;
     private String titulo;
     private String image;
     private String backImage;

   

 public  Persona (Long id, String nombre, String apellido, String titulo, String image, String backImage) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo= titulo; 
        this.image= image;
        this.backImage= backImage; 
    
}
}


 
 
 
 
