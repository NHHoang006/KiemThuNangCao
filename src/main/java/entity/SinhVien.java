package entity;

public class SinhVien {

    private String maSV;
    private String ten;
    private Integer tuoi;
    private float diemTrungBinh;
    private Integer kiHoc;
    private String chuyenNganh;

    public SinhVien( String maSV, String ten, Integer tuoi, float diemTrungBinh, Integer kiHoc, String chuyenNganh) {
        this.ten = ten;
        this.maSV = maSV;
        this.tuoi = tuoi;
        this.diemTrungBinh = diemTrungBinh;
        this.kiHoc = kiHoc;
        this.chuyenNganh = chuyenNganh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public Integer getKiHoc() {
        return kiHoc;
    }

    public void setKiHoc(Integer kiHoc) {
        this.kiHoc = kiHoc;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
}
