package Service.DanhBa;

import Config.ConfigReadAndWriteFile;
import Model.DanhBa;

import java.util.List;

public class IDanhBaServiceIMPL implements IDanhBaService {
    public static String PATH_DANHBA = ConfigReadAndWriteFile.PATH+"danhba.txt";

    public static List<DanhBa>danhBaList =new ConfigReadAndWriteFile<DanhBa>().readFromFile(PATH_DANHBA);


    @Override
    public List findAll() {
        new ConfigReadAndWriteFile<DanhBa>().writeToFile(PATH_DANHBA, danhBaList);
        return danhBaList;
    }

    @Override
    public void save(Object o) {

    }

    @Override
    public void save(DanhBa danhBa) {
        danhBaList.add(danhBa);
    }



    @Override
    public void editDanhBaByID(int id, int sdt, String nhomDanhBa, String name, String gioiTinh, String address, String ngaySinh, String email) {
        for (int i = 0; i < danhBaList.size(); i++) {
            if (id == danhBaList.get(i).getId()){
                danhBaList.get(i).setSdt(sdt);
                danhBaList.get(i).setNhomDanhBa(nhomDanhBa);
                danhBaList.get(i).setName(name);
                danhBaList.get(i).setGioiTinh(gioiTinh);
                danhBaList.get(i).setAddress(address);
                danhBaList.get(i).setNgaySinh(ngaySinh);
                danhBaList.get(i).setEmail(email);
            }
        }
    }

    @Override
    public void Delete(String name) {
        String checkName = null;
        for (int i = 0; i < danhBaList.size(); i++) {
            if (name.equals(danhBaList.get(i).getName())){
                danhBaList.remove(danhBaList.get(i));
                System.out.println("Delete successfully");
                findAll();
            }else System.out.println("Khong ton tai danh ba do");
        }
    }

    @Override
    public DanhBa findByName(String name) {
        int id = 0;
        for (int i = 0; i < danhBaList.size(); i++) {
            if (name.equalsIgnoreCase(danhBaList.get(i).getName())){
                id = i;
            }
        }
        return danhBaList.get(id);
    }


}
