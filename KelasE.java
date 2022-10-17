
package tugas.Sesi3;
import java.util.ArrayList;
import java.util.Scanner;

public class KelasE extends NilaiMahasiswa{
    
    public KelasE(String nama, String nim, int nilai) {
        super(nama, nim, nilai);
    }
    
    public static void main(String[] args) {
        Scanner nm = new Scanner(System.in);
        
        ArrayList <NilaiMahasiswa> nms = new ArrayList<>();
        ArrayList <NilaiMahasiswa> lulus = new ArrayList<>();
        ArrayList <NilaiMahasiswa> tidaklulus = new ArrayList<>();
        
        for (int i = 0; i<4; i++){
            System.out.println("Masukan NIM : ");
            String nim = nm.nextLine();
            
            System.out.println("Masukkan Nama : ");
            String nama = nm.nextLine();
            
            System.out.println("Masukkan Nilai : ");
            int nilai = Integer.parseInt(nm.nextLine());
            
            nms.add(new NilaiMahasiswa(nama, nim, nilai));
            if((nms.get(i).getGrade().compareTo("A") == 0) || (nms.get(i).getGrade().compareTo("B") == 0) || (nms.get(i).getGrade().compareTo("C") == 0)){
                lulus.add(new NilaiMahasiswa(nama, nim, nilai));
            }
            else{
                tidaklulus.add(new NilaiMahasiswa(nama, nim, nilai));
            }
            System.out.println("=====================================");
        }
        
        System.out.println("Jumlah Mahasiswa : "+ nms.size());
        System.out.println("Jumlah Mahasiswa yang lulus : ");
        printNms(lulus);
        System.out.println("Jumlah Mahasiswa yang tidak lulus : ");
        printNms(tidaklulus);
        printNilai(nms, "A");
        printNilai(nms, "B");
        printNilai(nms, "C");
        printNilai(nms, "D");
        printNilai(nms, "E");
        System.out.println("Rata - rata Nilai : ");
        rataRata(nms);
        
        nm.close();
    }
    
    public static void printNms(ArrayList<NilaiMahasiswa> nms) {
        System.out.print(nms.size()+ "yaitu ");
        for (int i = 0; i < nms.size(); i++){
            System.out.print(nms.get(i).getNama()+ ", ");
        }
        System.out.println();
    }
    
    public static void printNilai(ArrayList<NilaiMahasiswa>nms, String nilai) {
        if(jumlahGrade(nms, nilai)>0){
            System.out.println();
            System.out.print("Jumlah mahasiswa dengan nilai "+ nilai +":"+ jumlahGrade(nms, nilai)+"yaitu "); 
        }
        for(int i = 0; i < nms.size(); i++){
            if(nms.get(i).getGrade().equals(nilai)){
                System.out.print(nms.get(i).getNama()+ "; ");
            }
        }
    }
    public static int jumlahGrade(ArrayList<NilaiMahasiswa>nms, String nilai){
        int jumlah = 0;
        for(int i = 0; i <nms.size(); i++){
            if(nms.get(i).getGrade().equals(nilai)){
                jumlah++;
            }
        }
        return jumlah;
    }
    
    public static float rataRata(ArrayList<NilaiMahasiswa> nms){
        System.out.println();
        int jumlah = 0;
        for(int i = 0; i <nms.size(); i++){
            if(nms.get(i).getNilai()<= 100 && nms.get(i).getNilai()>=0){
            jumlah += nms.get(i).getNilai();
            System.out.print(nms.get(i).getNilai()+ "+");
        }
        
            else{
                System.out.println("0= ");
            }
    }
    System.out.print("="+ (float)jumlah/nms.size());
    
    return jumlah / nms.size();
  }  
}
