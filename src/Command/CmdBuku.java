/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import Class.Buku;
import DB.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author A'finarizkia
 */
public class CmdBuku {
    public ArrayList<Buku>getAllBuku() {
        ArrayList<Buku> mybk = new ArrayList<>();
        String query = "Select * from buku";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.LogOn();
        
        try {
            Statement stm = conn.createStatement();
            ResultSet rs  = stm.executeQuery(query);
            while (rs.next()){           
                Buku bk = new Buku();
                bk.setkodebuku(rs.getString("kode buku"));
                bk.setjudulbuku(rs.getString("judul buku"));
                bk.setpengarang(rs.getString("pengarang"));
                bk.setpenerbit(rs.getString("penerbit"));
                mybk.add(bk);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        conMan.LogOff();
        return mybk;
  }
    
    public int updateBuku(Buku bk, String kodebuku) {
        String query = "Update Buku set judulbuku = '"+bk.getjudulbuku()+
                '" where kodebuku = '"s+bk.getkodebuku()+"'";
        int hasil = 0;
        ConnectionManager conMan = new ConnectionManager();
        Connection con = conMan.LogOn();
        try {
            Statement stm = con.createStatement();
            hasil = stm.executeUpdate(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        conMan.LogOff();
        return hasil;
    }
    
    public int saveBuku(Buku bk) {
        int hasil = 0;
        String query = "Insert into Buku (kodebuku, judulbuku, pengarang, penerbit)"
                +"Values('"+bk.getkodebuku()+"";
    }
}