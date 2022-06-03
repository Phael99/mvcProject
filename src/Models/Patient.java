package Models;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class Patient extends DAO{

    
    
    private String name, cpf, gender;
    private int age;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Patient(){}

    public Patient(String name, String cpf, String gender, int age) {
        this.name = name;
        this.cpf = cpf;
        this.gender = gender;
        this.age = age;
    }
      
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    public boolean save(){
    
        String sql = "insert into patient(name, cpf, gender, age) values(?, ?, ?, ?)";
        
        try{
            this.connect();
            pst = this.conn.prepareStatement(sql);
            pst.setString(1, getName());
            pst.setString(2, getCpf());
            pst.setString(3, getGender());
            pst.setInt(4, getAge());
            pst.executeUpdate();
            System.out.println("Paciente cadastrado com sucesso");
            this.disconnect(this.conn);
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean update(String name, String cpf, String gender, int age, int id){
    
        String sql = "update patient set name=?, cpf=?, gender=?, age=? where id=?";
        
        try{
            this.connect();
            pst = this.conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, cpf);
            pst.setString(3, gender);
            pst.setInt(4, age);
            pst.setInt(5, id);
            pst.executeUpdate();
            System.out.println("Paciente atualizado com sucesso");
            this.disconnect(this.conn);
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public boolean destroy(int id){
        String sql = "delete from patient where id=?";
        
        try{
            this.connect();
            pst = this.conn.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
            System.out.println("Paciente excluido com sucesso");
            this.disconnect(this.conn);
            return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public TableModel all(){
        String sql = "select * from patient";
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
    
    public TableModel findByName(String query){
        String sql = "select * from patient where name like ?";
        TableModel tb = null;
        
        try{
            this.connect();
            pst = this.conn.prepareStatement(sql);
            pst.setString(1, query + "%");
            rs = pst.executeQuery();
            tb = DbUtils.resultSetToTableModel(rs);
            this.disconnect(conn);
            return tb;
        }catch(SQLException e){
            System.out.println(e);
            return tb;
        }
    }
    
    public TableModel findByCpf(String query){
        String sql = "select * from patient where cpf like ?";
        TableModel tb = null;
        
        try{
            this.connect();
            pst = this.conn.prepareStatement(sql);
            pst.setString(1, query + "%");
            rs = pst.executeQuery();
            tb = DbUtils.resultSetToTableModel(rs);
            this.disconnect(conn);
            return tb;
        }catch(SQLException e){
            System.out.println(e);
            return tb;
        }
    }
    
    public Patient getById(int id){
        String sql = "select name, cpf, gender, age from patient where id=?";
        Patient p= new Patient();
        
        try{
            this.connect();
            pst = this.conn.prepareStatement(sql);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            while(rs.next()) {
                p = new Patient(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            }
            
            this.disconnect(conn);
            return p;
        }catch(SQLException e){
            System.out.println(e);
            return p;
        }
    }
}
