
import java.util.Arrays;
import java.util.Scanner;
public class Hhhh {
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

}




