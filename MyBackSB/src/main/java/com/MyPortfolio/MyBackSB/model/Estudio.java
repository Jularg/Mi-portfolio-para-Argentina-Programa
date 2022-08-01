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
public class Estudio implements Serializable {
  @Id
     @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
 @Basic
    private String titulo;
    private String institucion; 
    private String anio;
    private String credencial; 
    private String image;

    
    public Estudio(){
        
    }

    public Estudio(Long id, String titulo, String institucion, String anio, String credencial, String image) {
        this.id = id;
        this.titulo = titulo;
        this.institucion = institucion;
        this.anio = anio;
        this.credencial = credencial;
        this.image = image; 
    }

    
}
