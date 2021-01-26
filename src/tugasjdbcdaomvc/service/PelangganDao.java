/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjdbcdaomvc.service;

import java.util.List;
import tugasjdbcdaomvc.entity.Pelanggan;
import tugasjdbcdaomvc.error.PelangganException;

/**
 *
 * @author
 * NAMA   : ANDREAS SURYADI
 * NIM    : 10119918
 * KELAS  : IF-10K
 * 
 */

public interface PelangganDao {
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
    
    public void deletePelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(Integer id) throws PelangganException;
    
    public Pelanggan getPelanggan(String email) throws PelangganException;
    
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
}
