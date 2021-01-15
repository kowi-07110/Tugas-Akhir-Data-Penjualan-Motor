package Entity;
public class DaftarPembeliEntity {
   private PembeliEntity pembeli; 
    private boolean isVerified;
    private int indexMotor; 
     public DaftarPembeliEntity(int indexMotor,
             PembeliEntity pembeli, boolean isVerified) { 
         this.indexMotor = indexMotor;
        this.pembeli = pembeli;
        this.isVerified = isVerified;
    }
    public PembeliEntity getPembeli() {
        return pembeli;
    }
    public boolean isIsVerified() {
        return isVerified;
    }
    public int getIndexMotor() {
        return indexMotor;
    }
    public void setPembeli(PembeliEntity pembeli) {
        this.pembeli = pembeli;
    }
    public void setIsVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }
    public void setIndexMotor(int indexMotor) {
        this.indexMotor = indexMotor;
    }
}