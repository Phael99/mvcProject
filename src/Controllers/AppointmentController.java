
package Controllers;

import Models.Appointment;
import javax.swing.table.TableModel;


public class AppointmentController {
    
    public boolean create(String date, int patientId){
        return new Appointment(date, patientId).save();
    }
    
    public boolean edit(String date, int id){
        return new Appointment().update(date, id);
    }
    
    public boolean delete(int id){
        return new Appointment().destroy(id);
    }
    
    public TableModel showByPatient(int id){
        return new Appointment().showByPatientId(id);
    } 
    
    public TableModel showAll(){
        return new Appointment().all();
    }
}
