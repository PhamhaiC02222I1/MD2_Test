package Model;

import java.io.Serializable;

public class DanhBa implements Serializable {
    private int id;
    private int sdt;
    private String nhomDanhBa;
    private String name;
    private String gioiTinh;
    private String address;
    private String ngaySinh;
    private String email;

    public DanhBa() {
    }

    public DanhBa(int id, int sdt, String nhomDanhBa, String name, String gioiTinh, String address, String ngaySinh, String email) {
        this.id = id;
        this.sdt = sdt;
        this.nhomDanhBa = nhomDanhBa;
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.address = address;
        this.ngaySinh = ngaySinh;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getNhomDanhBa() {
        return nhomDanhBa;
    }

    public void setNhomDanhBa(String nhomDanhBa) {
        this.nhomDanhBa = nhomDanhBa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", sdt=" + sdt +
                ", nhomDanhBa='" + nhomDanhBa + '\'' +
                ", name='" + name + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", address='" + address + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", email='" + email + "\n";
    }
}
