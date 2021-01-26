/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjdbcdaomvc.event;

import tugasjdbcdaomvc.entity.Pelanggan;
import tugasjdbcdaomvc.model.PelangganModel;

/**
 *
 * @author
 * NAMA   : ANDREAS SURYADI
 * NIM    : 10119918
 * KELAS  : IF-10K
 * 
 */

public interface PelangganListener {
    public void onChange(PelangganModel model);
    
    public void onInsert(Pelanggan pelanggan);
    
    public void onDelete();
    
    public void onUpdate(Pelanggan pelanggan);
}
