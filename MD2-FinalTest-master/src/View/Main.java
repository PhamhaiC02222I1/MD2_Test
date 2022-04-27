package View;

import java.util.Scanner;

public class Main {
    public Main(){
        System.out.println("====<>====Chương Trình Quản Lý Danh Bạ====<>====");
        System.out.println("===<>===Chọn chức năng theo số (để tiếp tục)===<>===");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm kiếm");

        System.out.println("Chon chuc nang");
        Scanner sc = new Scanner(System.in);

        int chooseMenu;
        chooseMenu = sc.nextInt();
        switch (chooseMenu){
            case 1:
                new DanhBaView().ShowListDanhSach();
                break;
            case 2:
                new DanhBaView().add();
                break;
            case 3:
                new DanhBaView().editDanhBaByID();
                break;
            case 4:
                new DanhBaView().DeleteById();
                break;
            case 5:
                new DanhBaView().findDanhBaByName();
                break;
        }

    }

    public static void main(String[] args) {
        new Main();
    }
}
