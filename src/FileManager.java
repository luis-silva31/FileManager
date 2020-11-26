public class FileManager {

    int maxSpace = 2;
    int filesCount = 1;

    public boolean isLoggedIn(){
        return true;
    }

    public void getFile(){

    }
    public boolean isEmpty(){
        return false;
    }

    public void createFile() throws NotEnoughPermissionsException {
        if (this.isLoggedIn() && filesCount < this.maxSpace) {
            File file = new File("ficheiro.");
            this.filesCount++;
        } else {
            if (!this.isLoggedIn()) {
                throw new NotEnoughPermissionsException("Not logged in.");
            }
            if (this.filesCount >= this.maxSpace) {
                try {
                    throw new NotEnoughSpaceException("Not enough space.");
                } catch (NotEnoughSpaceException ex) {
                    System.out.println(ex);;
                }
            }
        }
    }

    public void notFound() throws FileNotFoundException{
        if(isEmpty()){
            throw new FileNotFoundException("File not found.");
        }
    }
}
