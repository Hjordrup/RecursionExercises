import java.io.File;
import java.util.Scanner;

public class DirectorySize {


    // The size of a directory can be define as size(d) = size(f1) + size(f2) + ... size(fm) + size(d1) + size(d2) + ... size(dn)
    //Where f are files and d are other directories in the upper directory.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a directory or a file : ");
        String dir = sc.nextLine();

        System.out.println(getSize(new File(dir)) + "Bytes ");

    }

    private static long getSize(File file) {
        long size = 0;

        if(file.isDirectory()){
            File[] files = file.listFiles();
            for (int i = 0; files != null && i < files.length; i++) {
                size += getSize(files[i]);
            }
        }else {
            size += file.length();
        }
        return size;
    }


}
