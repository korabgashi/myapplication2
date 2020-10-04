
package phonebook;


public class Phonebook {

        private int id;
        private String emri;
        private String mbiemri;
        private int telefoni;
        private String titulli;
        
        public Phonebook(int ID, String Emri, String Mbiemri, int Telefoni, String Titulli){
            this.id = ID;
            this.emri = Emri;
            this.mbiemri = Mbiemri;
            this.telefoni = Telefoni;
            this.titulli = Titulli;
        }
        
        public int getId(){
        return id;
        }
        public String getEmri(){
        return emri;
        }
        public String getMbiemri(){
        return mbiemri;
        }
        public int getTelefoni(){
        return telefoni;
        }
        public String getTitulli(){
        return titulli;
        }
    
}
