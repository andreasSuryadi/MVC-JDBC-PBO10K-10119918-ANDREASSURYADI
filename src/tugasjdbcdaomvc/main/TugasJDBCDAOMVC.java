/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugasjdbcdaomvc.main;

import tugasjdbcdaomvc.database.KingsBarbershopDatabase;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import tugasjdbcdaomvc.entity.Pelanggan;
import tugasjdbcdaomvc.error.PelangganException;
import tugasjdbcdaomvc.service.PelangganDao;
import tugasjdbcdaomvc.view.MainViewPelanggan;

/**
 *
 * @author
 * NAMA   : ANDREAS SURYADI
 * NIM    : 10119918
 * KELAS  : IF-10K
 * 
 */

public class TugasJDBCDAOMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run () {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch(SQLException e) {
                } catch (PelangganException ex) {
                    Logger.getLogger(TugasJDBCDAOMVC.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
}
