package Entity;
import java.util.Date;
public class PembeliEntity  extends BeliMotor{ 
    protected Date tgl_beli; 
    
    public PembeliEntity(String id,String nama,
    String alamat, String noIdentitas,String notelp,Date tgl_beli){
        super(id,nama,alamat,noIdentitas,notelp); 
        this.tgl_beli=tgl_beli;
        
    }
    public PembeliEntity(){
    }    

   @Override 
     public String getId() {
        return id;
    }
 
    public void setid(String id) {
        this.id = id;
    }

    public Date getTgl_beli() {
        return tgl_beli;
    }

   
}
