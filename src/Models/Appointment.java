
package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


public class Appointment extends DAO{

    
    private String date;
    private int patientId;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Appointment(){}
    
    public Appointment(String date, int patientId){
        this.date = date;
        this.patientId = patientId;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    
    public boolean save(){
    
        String sql = "insert into appointment(date, patientId) values(?, ?)";
        
        try{
            this.connect();
            pst = this.conn.prepareStatement(sql);
            pst.setString(1, getDate());
            pst.setInt(2, getPatientId());
            pst.executeUpdate();
            System.out.println("Consulta cadastrada com sucesso");
            this.disconnect(this.conn);
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean update(String date, int id){
    
        String sql = "update appointment set date=? where id=?";
        
        try{
            this.connect();
            pst = this.conn.prepareStatement(sql);
            pst.setString(1, date);
            pst.setInt(2, id);
            pst.executeUpdate();
            System.out.println("Consulta editada com sucesso");
            this.disconnect(this.conn);
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean destroy(int id){
        String sql = "delete from appointment where id=?";
        
        try{
            this.connect();
            pst = this.conn.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
            System.out.println("Consulta excluída com sucesso");
            this.disconnect(this.conn);
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public TableModel showByPatientId(int id){
        String sql = "select * from appointment where patientId=?";
        TableModel tb = null;
        
        try{
            this.connect();
            pst = this.conn.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            tb = DbUtils.resultSetToTableModel(rs);
            this.disconnect(conn);
            return tb;
        }catch(SQLException e){
            System.out.println(e);
            return tb;
        }
    }
    
    public TableModel all(){
        String sql = "select * from appointment";
        TableModel tb = null;
        
        try{
            this.connect();
            pst = this.conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tb = DbUtils.resultSetToTableModel(rs);
            this.disconnect(conn);
            return tb;
        }catch(SQLException e){
            System.out.println(e);
            return tb;
        }
    }
    
}
