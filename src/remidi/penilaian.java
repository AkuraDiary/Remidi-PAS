/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remidi;
import java.util.Scanner;
/**
 *
 * @author userMM
 */
public class penilaian {

    /**
     * @param args the command line arguments
     */
    
    //ini variabnlenyua
    static double tugas1, tugas2, tugas3, praktik, ujian;
    static int kkm = 75, absen;
    static String nama, kelas;
    
    static void Input(){
        border();
        System.out.print("masukan Nama anda : ");
        Scanner Nama = new Scanner(System.in);
        nama = Nama.nextLine();
        
        System.out.print("masukan nomor absen anda : ");
        Scanner Absen = new Scanner(System.in);
        absen = Absen.nextInt();
        
        System.out.print("masukan kelas anda : ");
        Scanner Kelas = new Scanner(System.in);
        kelas = Kelas.nextLine();
        border();
        System.out.print("masukan nilai tugas 1 : ");
        Scanner Tugas1 = new Scanner(System.in);
        tugas1 = Tugas1.nextInt();
        
        System.out.print("masukan nilai tugas 2 : ");
        Scanner Tugas2 = new Scanner(System.in);
        tugas2 = Tugas2.nextInt();
        
        System.out.print("masukan nilai tugas 3 : ");
        Scanner Tugas3 = new Scanner(System.in);
        tugas3 = Tugas3.nextInt();
        
        System.out.print("masukan nilai praktek : ");
        Scanner Praktek = new Scanner(System.in);
        praktik = Praktek.nextInt();
        
        System.out.print("masukan nilai ujian : ");
        Scanner Ujian = new Scanner(System.in);
        ujian = Ujian.nextInt();
        border();
        System.out.println("\n");
        
    }
    
    static String keterangan(double nilai){
        String hasil = (nilai >= kkm) ? "lulus":"tidak lulus";
        return hasil;
    }
    
    static String grade(double nilai){
        if(nilai>=85){
            return "A";
        }else if(nilai < 85 && nilai >=75 ){
            return "B";
        }else if(nilai < 75 && nilai >= 65){
            return "C";
        }
        else if(nilai < 65 && nilai >= 55){
            return "D";
        }else{
            return "E";
        }
    }
    
    static void yangPerluDiperbaiki(){
        System.out.print((tugas1>=kkm)? " ":"tugas1" + "(" + tugas1 + ")"+",");
        System.out.print((tugas2>=kkm)? " ":"tugas2" + "(" + tugas2 + ")"+",");
        System.out.print((tugas3>=kkm)? " ":"tugas2" + "(" + tugas3 + ")"+",");
        
        System.out.print((praktik>=kkm)? " ":"praktik" + "(" + praktik + ")"+",");
        System.out.print((ujian>=kkm)? " ":"ujian" + "(" + ujian + ")"+",");
    }
    
    static void hiasan(){
        System.out.println("+------------------------+");
    }
    
    static void border(){
        System.out.println("------------------");
    }
    static void Output(double nilaiAkhir){
        hiasan();
        System.out.println("| "+"Nama : " + nama);
        System.out.println("| "+"Kelas/absen  : " + kelas + " / " + absen);
        
        System.out.print("|");border();
        System.out.println("| "+ "daftar nilai :");
        System.out.println("| "+"nilai tugas 1 : " + tugas1);
        System.out.println("| "+"nilai tugas 2 : " + tugas2);
        System.out.println("| "+"nilai tugas 3 : " + tugas3);
        System.out.println("| "+"nilai tugas praktik : " + praktik);
        System.out.println("| "+"nilai Ujian : " + ujian);
        
        System.out.print("|");border();
        
        System.out.println("| "+"Nilai akhir : " + (int)nilaiAkhir);
        System.out.println("| "+"keterangan : " + keterangan(nilaiAkhir));
        System.out.println("| "+"predikat : " + grade(nilaiAkhir));
        
        System.out.print("|");border();
        
        System.out.println("| "+"catatan! \n| nilai yang harus diperbaiki:");
        yangPerluDiperbaiki();
        System.out.print("\n");
        hiasan();
        
    }
    public static void main(String[] args) {
        //nilai untuk lulus  >= 75
        /*catatan
        nilai t1 + t2 + t3 = 20% nilai akhir
        nilai praktik = 30%
        nilai ujian = 50%*/
        // TODO code application logic here
        double nilaiT,nilaiP, nilaiU, nilaiAkhir;
        
        //ini bagian inputan
        Input();
        
        //ini proses
        //menghitung bobot nilai
        nilaiT = (20*((tugas1/100)+(tugas2/100)+(tugas3/100))) / 3;
        nilaiP = praktik *30 / 100;
        nilaiU = ujian * 50 / 100;
        nilaiAkhir = nilaiT + nilaiP + nilaiU;
        
        //ini bagian output
        Output(nilaiAkhir);
        
        
    }
    
}

