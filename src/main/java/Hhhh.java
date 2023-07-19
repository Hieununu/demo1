
import java.util.Arrays;
import java.util.Scanner;
//public class Hhhh {
//    public static void main(String[] args){
//        System.out.println("hello");
//    }



//public static void main(String[] args){
//    Scanner input = new Scanner(System.in);
//    System.out.println("nhap 1 so bat ky tu 0 den 9:");
//    int a = input.nextInt();
//    switch(a){
//        case 0: System.out.println("khong");break;
//        case 1:System.out.println("mot");break;
//        case 2:System.out.println("hai");break;
//        case 3:System.out.println("ba");break;
//        case 4:System.out.println("bon");break;
//        case 5:System.out.println("nam");break;
//        case 6:System.out.println("sau");break;
//        case 7:System.out.println("bay");break;
//        case 8:System.out.println("tam");break;
//        default:
//            System.out.println("chi co tu 0 den 9 thoi :))) ");
//    }
//}



//    public static void main(String[] args)
//    {
//        float a, b, c;
//        System.out.println("nhap 3 so bat ky:");
//        Scanner sc = new Scanner(System.in);
//
//        a = sc.nextFloat();
//        b = sc.nextFloat();
//        c = sc.nextFloat();
//
//        if(a+b>c && b+c>a && c+a>b)
//            System.out.println("la 3 canh cua 1 am giac");
//        else
//            System.out.println("khong la 3 canh cua 1 tam giac");
//    }




//    public static void main(String[] args){
//
//
//            float a, b, c;
//            System.out.println("nhap 3 so bat ky:");
//            Scanner sc = new Scanner(System.in);
//
//            a = sc.nextFloat();
//            b = sc.nextFloat();
//            c = sc.nextFloat();
//
//            if(a*a+b*b==c*c || b*b+c*c==a*a || c*c+a*a==b*b)
//                System.out.println("la 3 canh cua tam giac vuong");
//            else
//                System.out.println("khong phai 3 canh cua am giac vuong");
//        }





//    public static void main(String [] args){
//        int tong = 0;
//           Scanner sc = new Scanner(System.in);
//           System.out.println("nhap n= ");
//           int n = sc.nextInt();
//           for(int i = 0;i <=n;i++){
//               tong += i;
//               System.out.println(tong);
//           }
//    }




//    public static void main(String[] args){
//        int n;
//        System.out.println("nhap so nguyen:");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i <= 20; i++)
//        {
//            System.out.println(n + " x " + i + " = " + n*i);
//        }
//    }




//public static void main(String[] args) {
//    int a;
//    a = binhPhuong();
//    System.out.println("binh phuong cua 10 la:"+a);
//}
//public static int binhPhuong(){
//    return 10*10;
//}



//    public static void main(String[] args) {
//        int ketQua, n;
//
//        n = 3;
//        ketQua = tinhBinhPhuong(n);
//        System.out.println("binh phuong cua 3 la: " + ketQua);
//
//        n = 4;
//        ketQua = tinhBinhPhuong(n);
//        System.out.println("binh phuong cua 4 la: " + ketQua);
//
//        n = 5;
//        ketQua = tinhBinhPhuong(n);
//        System.out.println("binh phuong cua 5 la: " + ketQua);
//    }
//
//    static int tinhBinhPhuong(int i) {
//        return i * i;
//    }





//    public static int tong(int a,int b){
//        return a + b;
//    }
//    public static int tich(int x,int y){
//        return x * y;
//    }
//    public static void main(String[] args){
//        System.out.println("tong cua 20 va 30 la:" + tong(20,30));
//        System.out.println("tich cua 20 va 30 la:" + tich(20,30));
//    }

//public static void main(String[] args){
//    int [] mang = {1,2,3,4,5};
//    int [] mangDich1 = Arrays.copyOfRange(mang,0,mang.length);
//    System.out.println("mang 1="+Arrays.toString(mangDich1));
//    int [] mangDich2 = Arrays.copyOfRange(mang,2,4);
//    System.out.println("mang 2="+Arrays.toString(mangDich2));
//}


//public static void main(String[] args){
//    Scanner sc = new Scanner(System.in);
//    System.out.println("nhap 1 so ");
//    double a = sc.nextDouble();
//    System.out.println("so b vua nhap la"+a);
//
//}


    //    public static void main(String[] args) {
//        for(int i =1 ;i<=9;i++){
//            for(int j =1; j<=10;j++){
//                System.out.println( i +"x"+j+"="+i*j);
//            }
//            System.out.println("------");
//        }
//
//    }


//    public static void main(String[] args){
//        int n ;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap 1 so nguyen :");
//        n = sc.nextInt();
//        String nhiPhan = "";
//        while (n>0){
//            nhiPhan = n%2 +nhiPhan;
//            n = n/2;
//        }
//        System.out.println("so he nhi phan la "+ nhiPhan);
//    }

//    public static void  main(String[] args){
//        int n ;
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println("nhap vao n");
//            n = sc.nextInt();
//        }
//        while (n <=0);
//    }

//    public static void main(String[] args){
//        int [] a;
//        int [] b;
//        Scanner sc = new Scanner(System.in);
//        a = new int[5];
//        for(int i = 0; i< a.length;i ++){
//            System.out.println("phan tu thu " + i);
//            a[i] = sc.nextInt();
//        }
//        int tong = 0;
//        for (int i = 0 ; i<a.length;i++){
//            tong += a[i];
//        }
//        System.out.println("tong = "+tong);
//        b = new int[]{1,2,3,4,5};
//        for (int i = 0;i<b.length;i++){
//            System.out.println(b[i]);
//
//
//        }
//    }


//    public static void main(String[] args) {
//        int[] diemToan = { 6, 7,8,9,10};
//        int [] diemToan1 = diemToan;
//        diemToan[0]=10;
//        System.out.println("Mang diem toan 1:");
//        for (int diem: diemToan1){
//            System.out.println(diem + ",");
//        }
//        diemToan1[1] = 10;
//        System.out.println('\n'+"Mang diem toan");
//        for(int diem:diemToan){
//            System.out.println(diem+",");
//        }
//    }


//    public static void main(String[] args) {
//        int[] a = { 1,2,3,4,5,6};
//        int[] b = new int[6];
//        for(int i = 0;i<a.length;++i){
//            a[i] = b[i];
//        }
//        System.out.println(Arrays.toString(b));
//    }

//    public static void main(String[] args) {
//        int[] n1 ={1,2,3,4,5,6};
//        int[] n3 =new int[5];
//        int[] n2 =new int[n1.length];
//        System.arraycopy(n1,0,n2,0,n1.length);
//        System.out.println("mang n2=" + Arrays.toString(n2));
//        System.arraycopy(n1,2,n3,1,2);
//        System.out.println("mang n3=" + Arrays.toString(n3));
//    }

//    public static void main(String[] args) {
//        int[] mangNguon = {1 ,2,3,4,5};
//
//        int[] mangDich1 = Arrays.copyOfRange(mangNguon,0,mangNguon.length);
//        System.out.println("mang dich 1 ="+Arrays.toString(mangDich1));
//        int[] mangDich2 = Arrays.copyOfRange(mangNguon,2,4);
//        System.out.println("mang dich 2= "+Arrays.toString(mangDich2));
//    }

//    public static void main(String[] args) {
//        int[][] mangNguon={
//                {2,3,4},
//                {1,2,3,4},
//                {3},
//        };
//        int[][]mangDich = new int[mangNguon.length][];
//        for(int i = 0;i< mangDich.length;++i ){
//            mangDich[i] = new int[mangNguon[i].length];
//            for(int j = 0; j< mangDich.length;++j){
//                mangDich[i][j] = mangNguon[i][j];
//            }
//        }
//        System.out.println(Arrays.deepToString(mangDich));
//    }


    //    public static void main(String[] args) {
//        int i;
//        for (i = 0; i < 100; ++i) {
//            System.out.println(i + " con cuu");
//        }
//        System.out.println("hoan thanh ");
//    }

//    public static void main(String[] args) {
//        Double so , tong = 0.0;
//        Scanner sc = new Scanner(System.in);
//        while (true){
//            System.out.println("nhap vao 1 so bat ky");
//            so = sc.nextDouble();
//            if(so<0.0){
//                break;
//            }
//            tong += so;
//        }
//        System.out.println("tong cac so vua nhap la:" + tong);
//    }

//    public static void main(String[] args) {
//        for(int i =1;i<=3;i++){
//            System.out.println("Chuong "+ i);
//            for (int j=1;j<=5;j++){
//                System.out.println("Phan "+j);
//                if(j == 4){
//                    System.out.println("het");
//                    break;
//                }
//            }
//        }
//        System.out.println("Ket thuc");
//    }


//    public static void main(String[] args) {
//            vonglap1:
//        for (int i = 1;i<6;i++){
//            vonglap2:
//            for(int j = 1 ; j<3;j++){
//                System.out.println("i ="+i+"j="+j);
//                if(i == 5){
//                    break vonglap1;
//                }
//            }
//        }
//    }


//    public static void main(String[] args) {
//        System.out.print("can bac 2 cua 9 la" + Math.sqrt(9));
//    }
//}

//class Den{
//    private String denSang;
//    public void batDen(){
//        denSang = "Den dang sang";
//    }
//    public void tatDen(){
//        denSang = " Den dang tat";
//    }
//    public void thongBao(){
//        System.out.println("thong bao" + denSang);
//    }
//}
//class TaoDoiTuongDen{
//    public static void main(String[] args){
//        Den den = new Den();
//        den.batDen();
//        den.thongBao();
//        den.tatDen();
//        den.thongBao();
//    }
//}


public class Hhhh {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s;
//        System.out.println("Nhập vào chuỗi: ");
//        s = sc.nextLine();
//        System.out.println("-------");
//        System.out.println(s.length());
//        int doDai = s.length();
//        for(int i = 0; i< doDai;i++){
//            System.out.println("Vị trí"+ i + "là" + s.charAt(i));
//        }
//        char[] arrayChar = new char[10];
//        s.getChars( 2,4,arrayChar,0);
//        for(int i = 0;i<arrayChar.length;i++){
//            System.out.println("Giá trị của mảng tại" + i + " là" + arrayChar[i]);
//        }
//        byte[] arrayBytes = s.getBytes();
////        for (byte b : arrayBytes){
////            System.out.println(b);
//    }



//    public static void main(String[] args) {
//
//
//        String s1 = "DinhKhacHieu";
//        String s2 = "dinhkhachieu";
//        String s3 = "DinhKhacHieu";
//
//        System.out.println("s1 equals s2 " + s1.equals(s2));
//        System.out.println("s1 equals s3 " + s1.equals(s3));
//
//        System.out.println("s1 equalsIgnoreCase s2 " + s1.equalsIgnoreCase(s2));
//        System.out.println("s1 equalsIgnoreCase s3 " + s1.equalsIgnoreCase(s3));
//
//        System.out.println("s1 compareTo s2 " + s1.compareTo(s2));
//        System.out.println("s1 compareTo s3 " + s1.compareTo(s3));
//
//        System.out.println("s1 compareToIgnoreCase s3 " + s1.compareToIgnoreCase(s3));
//        System.out.println("s1 compareToIgnoreCase s3 " + s1.compareToIgnoreCase(s3));
//
//        boolean check = s1.regionMatches(2, s2, 0, 4);
//        System.out.println(check);
//
//        String sdt = "0779282348";
//        System.out.println(sdt.startsWith("077"));
//        System.out.println(sdt.startsWith("037"));
//
//        String tenFile1 = "Javacoban.JPG";
//        String tenFile2 = "Javacoban.EXE";
//        if (tenFile1.endsWith(".JPG")) {
//            System.out.println("File 1 la file JPG ");
//        } else if (tenFile1.endsWith(".EXE")) {
//            System.out.println("File 1 la file EXE");
//        }
//        if (tenFile2.endsWith(".JPG")) {
//            System.out.println("File 2 la file JPG ");
//        } else if (tenFile2.endsWith(".EXE")) {
//            System.out.println("File 2 la file EXE");
//        }
//
//        String a1 = "Dinh Khac Hieu 20 12 2002 Khac";
//        String a2 = "Khac";
//        String a3 = "Nunu";
//
//        System.out.println("vi tri cua a2 trong a1 la " + a1.indexOf(a2));
//        System.out.println("vi tri cua a3 trong a1 la " + a1.indexOf(a3));
//
//        System.out.println("vi tri cua a2 trong a1 la " + a1.indexOf(a2, 2));
//
//        System.out.println("vi tri cua a2 trong a1 tu r sang l la " + a1.lastIndexOf(a2));
//
//        String z1 = "Dinh Khac Hieu      ";
//        String z2 = "Hoc lap trinh Java";
//        String z3 = z1.concat(z2);
//        System.out.println(z3);

//        String z4 = z1.replace("Dinh", "Đinh");
//        System.out.println(z4);

//        String z5 = z1.toLowerCase();
//        System.out.println(z5);

//        String z6 = z2.toUpperCase();
//        System.out.println(z6);

//        String z7 = z1.trim();
//        System.out.println(z7);

//        String z8 = z1.substring(3, 7);
//        System.out.println(z8);
//
//    }





//    public static void main(String[] args) {
//        int [] a = new int[] {1,3,2,4,7,6,8,9,5};
//        int [] b = new int[10];
//
//        System.out.println("a ban dau" + Arrays.toString(a));
//        Arrays.sort(a);
//        System.out.println("a sau khi sap xep" + Arrays.toString(a));
//
//        System.out.println(Arrays.binarySearch(a,5));
//        System.out.println(Arrays.binarySearch(a,10));
//
//        Arrays.fill(b,4);
//        System.out.println("b ban dau" + Arrays.toString(b));
//
//
//    }


//    public static void main(String[] args) {
//        String a = " dinh khac hieu, hieu. nunu";
//        String[] b = a.split(" ");
//        System.out.println(Arrays.toString(b));
//        String[] c = a.split(",");
//        System.out.println(Arrays.toString(c));
//        String[] d = a.split("\\,|\\.");
//        System.out.println(Arrays.toString(d));
//
//        String e = "Dinh Khac Hieu";
//        String[] f = e.split(" ");
//        System.out.println(Arrays.toString(f));
//        System.out.println("ten = "+ f[f.length-1]);
//    }


//    public static void main(String[] args) {
//        double taiKhoan = 1000;
//        Scanner sc = new Scanner(System.in);
//        Locale lc = new Locale("vi","VN");
//        NumberFormat numf = NumberFormat.getInstance(lc);
//        int luaChon = 0;
//        do {
//            System.out.println("------TAI_XIU------");
//            System.out.println("Bấm phím 1 để tiếp tục ");
//            System.out.println("Bấm phím bất kỳ để thoát ");
//            luaChon = sc.nextInt();
//            if (luaChon == 1) {
//                System.out.println("Bắt đầu chơi! ");
//                System.out.println(" Tài khoản của bạn là: " + numf.format(taiKhoan) + "Bạn muốn cược bao nhiêu? ");
//                double datCuoc = 0;
//                do {
//                    System.out.println(" Đặt cược: 0 < tiền cược <" + taiKhoan);
//                    datCuoc = sc.nextDouble();
//                }
//                while (datCuoc <= 0 || datCuoc > taiKhoan);
//                int luaChonDatCuoc = 0;
//                do {
//                    System.out.println(" Chọn xỉu bấm phím 1 ");
//                    System.out.println(" Chọn tài bấm phím 2");
//                    luaChonDatCuoc = sc.nextInt();
//                }
//                while (luaChonDatCuoc != 1 && luaChonDatCuoc != 2);
//
//                Random xx1 = new Random();
//                Random xx2 = new Random();
//                Random xx3 = new Random();
//
//                int giatri1 = xx1.nextInt(5) + 1;
//                int giatri2 = xx2.nextInt(5) + 1;
//                int giatri3 = xx3.nextInt(5) + 1;
//                int tong = giatri1 + giatri2 + giatri3;
//                System.out.println("Kết quả = " + giatri1 + "+" + giatri2 + "+" + giatri3);
//                if (tong == 3 || tong == 18) {
//                    System.out.println("Tổng = " + tong + " Bạn thua. Nhà cái thắng. ");
//                    taiKhoan -= datCuoc;
//                    System.out.println("Tài khoản của bạn bây giờ là:  " + taiKhoan);
//                } else if (tong >= 4 && tong <= 10) {
//                    System.out.println(("Tổng = " + tong + " Xỉu"));
//                    if (luaChonDatCuoc == 1) {
//                        System.out.println("Bạn đã thắng cược. ");
//                        taiKhoan += datCuoc;
//                        System.out.println("Tài khoản bây giờ của bạn là: " + taiKhoan);
//                    } else {
//                        System.out.println("Bạn đã thua cược. ");
//                        taiKhoan -= datCuoc;
//                        System.out.println("Tài khoản bây giờ của bạn là: " + taiKhoan);
//                    }
//                } else {
//                    System.out.println(("Tổng = " + tong + " Tài"));
//                    if (luaChonDatCuoc == 2) {
//                        System.out.println("Bạn đã thắng cược. ");
//                        taiKhoan += datCuoc;
//                        System.out.println("Tài khoản bây giờ của bạn là: " + taiKhoan);
//                    } else {
//                        System.out.println("Bạn đã thua cược. ");
//                        taiKhoan -= datCuoc;
//                        System.out.println("Tài khoản bây giờ của bạn là: " + taiKhoan);
//                    }
//                }
//            }
//
//        }   while (luaChon == 1) ;
//
//
//
//
//    }

//@SuppressWarnings("deprecation")
//    public static void main(String[] args) {
//long t1 = System.currentTimeMillis();
//for (int i = 0;i <10;i++){
//    System.out.println("hieu");
//}
//long t2 = System.currentTimeMillis();
//System.out.println("truoc khi chay for:" + t1);
//    System.out.println("sau khi chay for:" + t2);
//    System.out.println("thoi gian:" + (t2- t1)+"mls");
//    System.out.println("thoi gian:" + ((t2-t1)/1000)+"s");
//
//    System.out.println("100 nam= " + TimeUnit.DAYS.toSeconds(1000*365)+ "s");
//    System.out.println("24h =" +  TimeUnit.HOURS.toSeconds(24)+"s");
//
//    Date d = new Date (System.currentTimeMillis());
//    System.out.println(d.getDate()+"/"+d.getMonth()+"/"+(d.getYear()+1900));
//
//    Calendar c = Calendar.getInstance();
//    System.out.println(c.get(Calendar.DATE)+"-"+c.get(Calendar.MONTH)+"-"+c.get(Calendar.YEAR));
//
//    c.add(Calendar.HOUR,30);
//    System.out.println(c.get(Calendar.DATE)+"-"+c.get(Calendar.MONTH)+"-"+c.get(Calendar.YEAR));
//
//    c.add(Calendar.DATE, 14);
//    System.out.println(c.get(Calendar.DATE)+"-"+c.get(Calendar.MONTH)+"-"+c.get(Calendar.YEAR));
//
//    DateFormat df = new SimpleDateFormat();
//    System.out.println(df.format(d));
//    df = new SimpleDateFormat("dd-MM-yyyy  HH-mm-ss");
//    System.out.println(df.format(d));
//    }

//    public static void main() {
//        int[][] a = {{1,2,3,4},{5,6,7}};
//        System.out.print(a[1][2]);
//        a[1][2] = 9;
//        System.out.println(a[1][2]);
//
//
//
//        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
//        for (int i = 0; i < myNumbers.length; ++i) {
//            for(int j = 0; j < myNumbers[i].length; ++j) {
//                System.out.println(myNumbers[i][j]);
//            }
//        }
//
//    }
//    static void myMethod() {
//        System.out.println("Dinh Khac Hieu");}
//    static void myMethod1(){
//        System.out.println("Dh10C6");
//
//    }
//    public static void main(String[] args){
//        myMethod();
//        myMethod1();
//        myMethod();
//
//    }
//    static void myMethod(String fname,int age){
//        System.out.println(fname + " Dh10C6 " + age + " tuoi");
//    }
//    public static void main(String[] args) {
//        myMethod("Dinh Khac Hieu",21);
//        myMethod("hieununu",21);
//    }


//     static int myMethod(int x,int y){
//        return x*x + 6*x + y;
//}
//    public static void main(String[] args) {
//    int a = myMethod(5,45);
//        System.out.println(a);
//    }



//    static void tuoi(int age) {
//        if (age < 18) {
//            System.out.println("khong duoc xuat khau lao dong ");
//        } else {
//            System.out.println("duoc xuat khau lao dong");
//        }
//    }
//       public static void main(String[] args){
//            tuoi(20);
//        }

//
//        static int myMethod(int x, int y) {
//            return x + y;
//        }
//
//        static double myMethod(double x, double y) {
//            return x + y;
//        }
//
//        public static void main(String[] args) {
//            int myNum1 = myMethod(8, 5);
//            double myNum2 = myMethod(4.3, 6.26);
//            System.out.println("int: " + myNum1);
//            System.out.println("double: " + myNum2);
//        }

//
//        public static void main(String[] args) {
//            int result = sum(10);
//            System.out.println(result);
//        }
//        public static int sum(int k){
//                if (k > 0) {
//                    return k + sum(k - 1);
//                } else {
//                    return 0;
//                }
//            }


//    public static void main(String[] args) {
//        int result = sum(5,10);
//        System.out.println(result);
//    }
//    public static int sum ( int a , int b){
//        if (b>a){
//            return b + sum(a , b-1);
//        }
//        else {
//            return b;
//        }
//    }

//int x = 5;
//    public static void main(String[] args) {
//    Main a = new Main();
//    Main b = new Main();
//    b.x = 50;
//    System.out.println(a.x);
//    System.out.println(b.x);
//    }


//    String name1 = "Hieu";
//    String name2 = "Nunu";
//    int age = 21;
//
//    public static void main(String[] args) {
//        Main a = new Main();
//        System.out.println("Name: "+ a.name1+" "+ a.name2 );
//        System.out.println("Age: " + a.age);
//    }



//    public static void main(String[] args) {
//        int[] a;
//        int n;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap n: ");
//        n = sc.nextInt();
//        a = new int[n];
//        nhap(a,n);
//        xuat(a,n);
//
//        System.out.println("Min: " + min(a,n));
//        System.out.println("Max: " + max(a,n));
//
//        System.out.print("Cac so nguyen to la: ");
//        for (int i=0;i<n;i++) {
//            if (check(a[i])  )
//                System.out.print(a[i] + " ");
//        }
//        System.out.println(" ");
//        sapxep(a,n);
//        xuat(a,n);
//    }
//    public static void nhap(int a[],int n){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Moi nhap vao mang: ");
//        for (int i=0;i<n;i++)
//            a[i] = scanner.nextInt();
//
//    }
//    public static void xuat(int a[],int n){
//        for (int i=0;i<n;i++)
//            System.out.print(a[i] + " ");
//        System.out.println(" ");
//    }
//    public static int min(int a[],int n){
//        int min = a[0];
//        for (int i=1;i<n;i++){
//            if (a[i] < min)
//                min = a[i];
//        }
//        return min;
//    }
//    public static int max(int a[],int n){
//        int max = a[0];
//        for (int i=1;i<n;i++){
//            if (a[i] > max)
//                max = a[i];
//        }
//        return max;
//    }
//    public static boolean check(int n){
//        if(n<=1) return false;
//        for (int i = 2;i<= Math.sqrt(n); i++)
//            if(n%i==0) return false;
//
//        return true;
//    }
//
//    public static void sapxep(int a[],int n){
//     Arrays.sort(a);
//    }


//    public void tocDoToiDa(){
//        System.out.println(" Toc do toi da cua 1 chiec oto la : ");
//    }
//    public void speed(int maxSpeed){
//        System.out.println("maxSpeed = "+maxSpeed + " km/h");
//    }
//
//    public static void main(String[] args) {
//        Main myCar = new Main();
//        myCar.tocDoToiDa();
//        myCar.speed(250);
//    }



//    protected String brand = " Ford";
//public void honk() {
//    System.out.println("Tuut, tuut");
//}
//    private String modelName = "Mustang";
//
//    public static void main(String[] args) {
//        Main myCar = new Main();
//        myCar.honk();
//        System.out.println(myCar.brand + " " + myCar.modelName);
//    }


}





