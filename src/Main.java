public class Main {
    public static void main(String[] args) throws NotEnoughSpaceException {

        FileManager fileManager = new FileManager();

        try {
            fileManager.createFile();
            fileManager.notFound();
        } catch (NotEnoughPermissionsException ex){
            System.out.println(ex);
        } catch (FileNotFoundException ex2){
            System.out.println(ex2);
        }
    }
}
