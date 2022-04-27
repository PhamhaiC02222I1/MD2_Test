package View;

import Controller.DanhBaController;
import Service.DanhBa.IDanhBaServiceIMPL;
import Model.DanhBa;

import java.util.Scanner;

public class DanhBaView {
    Scanner sc = new Scanner(System.in);
    DanhBaController danhBaController = new DanhBaController();
    IDanhBaServiceIMPL iDanhBaServiceIMPL = new IDanhBaServiceIMPL();


    public void ShowListDanhSach() {
        System.out.println(danhBaController.showListDanhBa());
        System.out.println("Nhap bat ki de tiep tuc hoac 'quit' de thoat: ");
        String backMenu = sc.nextLine();
        if (backMenu.equalsIgnoreCase("quit")) {
            new Main();
        }

    }


    public void DeleteById() {
        System.out.println(danhBaController.showListDanhBa());
        System.out.println("===<>===Xóa Danh ba theo ten===<>===");
        String name = sc.nextLine();
        new IDanhBaServiceIMPL().Delete(name);
        System.out.println("Nhap bat ki de tiep tuc hoac 'quit' de thoat: ");
        String backMenu = sc.nextLine();
        if (backMenu.equalsIgnoreCase("quit")) {
            new Main();
        }
    }

    public void editDanhBaByID() {
        System.out.println(danhBaController.showListDanhBa());
        System.out.println("Nhap id");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập SĐT mới: ");
        int numPhone = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập nhóm mới: ");
        String nhom = sc.nextLine();
        System.out.println("Nhập họ và tên mới: ");
        String name = sc.nextLine();
        System.out.println("Nhập giới tính mới: ");
        String gTinh = sc.nextLine();
        System.out.println("Nhập địa chỉ mới: ");
        String address = sc.nextLine();
        System.out.println("Nhập ngày sinh mới: ");
        String date = sc.nextLine();
        System.out.println("Nhập Email mới: ");
        String email = sc.nextLine();
        iDanhBaServiceIMPL.editDanhBaByID(id, numPhone, nhom, name, gTinh, address, date, email);

        System.out.println("Edit success!");

        System.out.println("Nhap bat ki de tiep tuc hoac 'quit' de thoat: ");
        String backMenu = sc.nextLine();
        if (backMenu.equalsIgnoreCase("quit")) {
            new Main();
        }

    }


    public void findDanhBaByName() {
        System.out.println("Nhập tên cần tìm: ");
        String name = sc.nextLine();
        boolean check = true;
        for (int i = 0; i < IDanhBaServiceIMPL.danhBaList.size(); i++) {
            if (name.equalsIgnoreCase(IDanhBaServiceIMPL.danhBaList.get(i).getName())) {
                check = false;
            }
        }

        System.out.println(new IDanhBaServiceIMPL().findByName(name));
        System.out.println("Nhap chu bat ky de tiep tuc! ");
        System.out.println("Nhap 'quit' de quay lai Main ");
        String backMenu = sc.nextLine();
        if (backMenu.equalsIgnoreCase("quit")) {
            new Main();
        }

    }
    public void add(){
        while (true) {
            int id;
            if (IDanhBaServiceIMPL.danhBaList.size() == 0) {
                id = 1;
            } else {
                id = IDanhBaServiceIMPL.danhBaList.get(IDanhBaServiceIMPL.danhBaList.size() - 1).getId() + 1;
            }
            System.out.println("====<>====Thêm danh bạ====<>====");
            System.out.println("Nhập SĐT: ");
            int numPhone = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhập nhóm: ");
            String nhom = sc.nextLine();
            System.out.println("Nhập họ và tên: ");
            String nameDanhBa = sc.nextLine();
            System.out.println("Nhập giới tính: ");
            String gTinh = sc.nextLine();
            System.out.println("Nhập địa chỉ: ");
            String address = sc.nextLine();
            System.out.println("Nhập ngày sinh: ");
            String date = sc.nextLine();
            System.out.println("Nhập Email: ");
            String email = sc.nextLine();
            DanhBa danhBa = new DanhBa(id, numPhone, nhom, nameDanhBa, gTinh, address, date, email);
            danhBaController.writeToDanhBa(danhBa);

            System.out.println("Nhap chu bat ky de tiep tuc! ");
            System.out.println("Nhap 'quit' de quay lai Main ");
            String backMenu = sc.nextLine();
            if (backMenu.equalsIgnoreCase("quit")) {
                new Main();
            }
        }
    }
}



