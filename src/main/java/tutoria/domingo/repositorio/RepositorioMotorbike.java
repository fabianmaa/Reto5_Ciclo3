/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoria.domingo.repositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import tutoria.domingo.modelo.Mensaje;
import tutoria.domingo.modelo.Motorbike;
import tutoria.domingo.interfaces.InterfaceMotorbike;

/**
 *
 * @author USUARIO
 */
@Repository
public class RepositorioMotorbike {
     @Autowired
    private InterfaceMotorbike crud;
    

    public List<Motorbike> getAll(){
        return (List<Motorbike>) crud.findAll();       
    }
    
    public Optional <Motorbike> getMotorbike(int id){
        return crud.findById(id);
    }
    
    public Motorbike save(Motorbike motorbike){
        return crud.save(motorbike);
    }
      public void delete(Motorbike motorbike){
        crud.delete(motorbike);
    }
    
    
}
