package Day18;

public class DeleteFile {
    public static void main(String[] args){
        java.io.File file = new java.io.File("H1.txt");
        try{
            if(file.delete()){
                System.out.println("Deleted the file: " + file.getName());
            }else{
                System.out.println("Failed to delete the file.");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
