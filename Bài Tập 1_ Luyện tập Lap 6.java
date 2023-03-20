public abstract class ChuyenXe {
    private String maSo;
    private String hoTenTX;
    private String soXe;
    protected double doanhThu;

    public ChuyenXe(String maSo, String hoTenTX, String soXe, double doanhThu) {
        this.maSo = maSo;
        this.hoTenTX = hoTenTX;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public abstract void tinhDoanhThu();
}

public class ChuyenXeNoiThanh extends ChuyenXe {
    private int soTuyen;
    private double soKm;

    public ChuyenXeNoiThanh(String maSo, String hoTenTX, String soXe, int soTuyen, double soKm, double doanhThu) {
        super(maSo, hoTenTX, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    @Override
    public void tinhDoanhThu() {
        this.doanhThu = this.soKm * 10000;
    }
}

public class ChuyenXeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgay;

    public ChuyenXeNgoaiThanh(String maSo, String hoTenTX, String soXe, String noiDen, int soNgay,
            double doanhThu) {
        super(maSo, hoTenTX, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgay = soNgay;
    }

    @Override
    public void tinhDoanhThu() {
        this.doanhThu = this.soNgay * 10000;
    }
}