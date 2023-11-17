package poo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class pessoa{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

private String nome;
private String email;

public pessoa(){

}

public pessoa(String nome, String email){
    this.nome = nome;
    this.email = email;
}
public pessoa(long id, String nome, String email){
    this.id = id;
    this.nome = nome;
    this.email = email;
}
public long getId(){
    return this.id;
}

}