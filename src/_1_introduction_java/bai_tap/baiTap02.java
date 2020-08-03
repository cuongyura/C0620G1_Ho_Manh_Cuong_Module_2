package _1_introduction_java.bai_tap;

public class baiTap02 {
    public static void main(String[] args) {

        int n = 6666;
         docSo(n);
    }
        public static void docChuSo(int chuSo){
            if (chuSo == 0) {
                System.out.println(" Không ");
            } else if (chuSo == 1) {
                System.out.println(" Một ");
            } else if (chuSo == 2) {
                System.out.println(" Hai ");
            } else if (chuSo == 3) {
                System.out.println(" Ba ");
            } else if (chuSo == 4) {
                System.out.println(" Bốn ");
            } else if (chuSo == 5) {
                System.out.println(" Năm ");
            } else if (chuSo == 6) {
                System.out.println(" Sáu ");
            } else if (chuSo == 7) {
                System.out.println(" Bảy ");
            } else if (chuSo == 8) {
                System.out.println(" Tám ");
            } else if (chuSo == 9) {
                System.out.println(" Chín ");
            }
        }

        public static int demSoLuongChuSo(int n){
            int dem = 0;
            while (n != 0) {
                n /= 10;
                dem++;
            }
            return dem;
        }

        public static void docSo(int n){
            /* đảo lại số : 12345 => 54321 */
            int soDao = 0;
            while (n != 0) {
                soDao = soDao * 10 + n % 10;
                n /= 10;
            }
            int soLuong = demSoLuongChuSo(soDao);
            while (soDao != 0) {
                docChuSo(soDao % 10);
                if (soLuong == 4) {
                    System.out.printf(" Ngàn ");
                }
                if (soLuong == 3) {
                    System.out.println(" Trăm ");
                }
                if (soLuong == 2) {
                    System.out.println(" Mươi ");
                }
                soLuong--;

                soDao /= 10;
            }
        }
    }
