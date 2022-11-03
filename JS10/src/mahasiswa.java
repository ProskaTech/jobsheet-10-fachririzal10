// created by fachri rizal
public class mahasiswa {
    String nama, smt;
    int nim;
    double ip;
    public void data(){
        mahasiswa a = new mahasiswa();
        
        a.nama = "joni";
        a.nim = 1234;
        a.smt = "v";
        a.ip = 3.5;

        System.out.println("Nama Mahasiswa  : "+ a.nama);
        System.out.println("NIM \t\t: "+ a.nim);
        System.out.println("Semester \t: "+ a.smt);
        System.out.println("IP Semester Ini : "+ a.ip);
        System.out.println("===============================================");
        
    }

    public void method() {
    if(ip >= 3.5){
        System.out.println("Anda Berhak Mengontrak 24 SKS pada Semester v");
        System.out.println("");
    }
    
    else if(ip >= 3.0){
        System.out.println("Anda berhak Mengontrak 22 SKS Pada Semester v");
        System.out.println("");
    }
    
    else if(ip >= 2.5){
        System.out.println("Anda berhak Mengontrak 20 SKS pada Semester v");
        System.out.println("");
    }
    
    else if(ip >= 2.0){
        System.out.println("Anda Berhak Mengontrak 18 SKS pada Semester v");
        System.out.println("");
    }
    
    else if(ip < 2.0){
    System.out.println("Anda Berhak Mengontrak 15 SKS Pada Semester v");
    System.out.println("");
    }    
    }   
    public static void main(String[]args){
        mahasiswa a = new mahasiswa();
        a.data();
        a.method();
    }
}