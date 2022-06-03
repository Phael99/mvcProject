
package Controllers;

import Models.Patient;
import javax.swing.table.TableModel;

public class PatientController {
    
    public TableModel index(){
        return new Patient().all();
    }
    
    public TableModel findName(String query){
        return new Patient().findByName(query);
    }
    
    public TableModel findCpf(String query){
        return new Patient().findByCpf(query);
    }
    
    public boolean create(String name, String cpf, String gender, int age){
        return new Patient(name, cpf, gender, age).save();
    }
    
    public boolean edit(String name, String cpf, String gender, int age, int id){
        return new Patient().update(name, cpf, gender, age, id);
    }
    
    public boolean delete(int id){
        return new Patient().destroy(id);
    }
    
    public Patient showById(int id){
        return new Patient().getById(id);
    }
}
