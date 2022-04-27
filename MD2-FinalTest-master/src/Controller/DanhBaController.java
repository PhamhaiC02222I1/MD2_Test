package Controller;

import Model.DanhBa;
import Service.DanhBa.IDanhBaServiceIMPL;

import java.util.List;

public class DanhBaController {
    IDanhBaServiceIMPL iDanhBaServiceIMPL = new IDanhBaServiceIMPL();

    public List<DanhBa> showListSong() {
        return iDanhBaServiceIMPL.findAll();
    }

    public void writeToDanhBa(DanhBa danhBa){
        iDanhBaServiceIMPL.save(danhBa);
        iDanhBaServiceIMPL.findAll();
    }

    public List<DanhBa> showListDanhBa(){
        return iDanhBaServiceIMPL.findAll();
    }
}
