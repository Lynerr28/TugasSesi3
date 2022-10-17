
package tugas.Sesi3;


public class NilaiMahasiswa {
    String nama, nim, grade;
    int nilai;
    
    NilaiMahasiswa(String nama,String nim,int nilai){
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
        setGrade();
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getNim(){
        return nim;
    }
    
    public int getNilai(){
        return nilai;
    }
    
    public String getGrade(){
        return this.grade;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public void setNilai(int nilai){
        this.nilai = nilai;
    }
    
    public void setGrade(String grade){
        this.grade = grade;
    }

    public void setGrade() {
        int getNilai = 0;
        if(getNilai() >= 80 && getNilai() <= 100){
            setGrade("A");
        }
        
        else if(getNilai() >= 70 && getNilai < 80){
            setGrade("B");
        }
        
        else if((getNilai() >= 60 && getNilai()< 70)){
            setGrade("C");
        }
        
        else if((getNilai() >= 50 && getNilai()< 60)){
            setGrade("D");
        }
        
        else if((getNilai()< 50)){
            setGrade("E");
        }
        else{
            setGrade("Nilai anda salah!");
        
        }
    }
    public void infoNilaiMahasiswa(){
        System.out.println("NAMA : "+ getNama());
        System.out.println("NIM : "+ getNim());
        System.out.println("Nilai : "+ getNilai());
        System.out.println("GRADE : "+ getGrade());
        System.out.println("================================");
    }
}
