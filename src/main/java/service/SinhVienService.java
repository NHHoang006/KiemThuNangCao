package service;

import entity.SinhVien;

public class SinhVienService {

    //subDuLieu
    protected SinhVien sinhVien = new SinhVien(
            "SV0001",
            "Nguyễn Huy Hoàng",
            20,
            8F,
            5,
            "Công nghệ thông tin");

    public SinhVien getSinhVien() {
        return sinhVien;
    }
    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }


    public void UpdateSinhVien(SinhVien sinhVien1) {
       if(sinhVien1==null) {
           throw new IllegalArgumentException("Đối tượng sinh viên không được để trống");
       }
       if(sinhVien1.getMaSV()==null || sinhVien1.getMaSV().isEmpty()
       || sinhVien1.getTen()==null || sinhVien1.getTen().isEmpty()
       || sinhVien1.getChuyenNganh()==null || sinhVien1.getChuyenNganh().isEmpty()) {
           throw  new IllegalArgumentException("Các trường không được để rỗng");
       }
       if(sinhVien1.getDiemTrungBinh()<0 || sinhVien1.getDiemTrungBinh()>10) {
           throw new IllegalArgumentException("Điểm phải nằm trong khoảng từ 0 đến 10");
       }
       if (sinhVien1.getTuoi()<18){
           throw  new IllegalArgumentException("Tuổi phải lớn hơn hoặc bằng 18");
       }

       sinhVien.setMaSV(sinhVien1.getMaSV());
       sinhVien.setTen(sinhVien1.getTen());
       sinhVien.setChuyenNganh(sinhVien1.getChuyenNganh());
       sinhVien.setDiemTrungBinh(sinhVien1.getDiemTrungBinh());
       sinhVien.setTuoi(sinhVien1.getTuoi());

    }
}
