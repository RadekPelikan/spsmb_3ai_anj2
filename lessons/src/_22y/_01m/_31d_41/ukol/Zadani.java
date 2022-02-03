package _22y._01m._31d_41.ukol;
// 1. Napište program, který vypisuje jména všech podadresářů v zadaném rodičovském adresáři.
// 2. Modifikujte předchozí program tak, že budou vypisovány i všechny vnořené adresáře
//    z těchto podadresářů.
// 3. Napište program, který vypíše podle zadané masky všechny soubory, které se nacházejí v zadaném
//    rodičovském adresáři.
// 4. Modifikujte předchozí program tak, že budou vypisovány i soubory ze všech vnořených adresářů
//    z těchto podadresářů.

import java.io.File;

public class Zadani {
    public static void main(String[] args) {

//        File f = new File(".\\src\\_21y\\_12m");
//        File f = new File(".\\src\\_21y\\_10m\\_04d_12");
        File f = new File(".\\src");
//        File[] fileListDir = f.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return (new File(dir, name)).isDirectory();
//            }
//        });

        File[] fileListDir = f.listFiles(File::isDirectory);
        assert fileListDir != null;
        File[] fileList = f.listFiles();

        ////////////// 1 //////////////
//        System.out.println("1 - just dirs");
//        for (File file : fileListDir) {
//            System.out.println(file.getName());
//        }
//        ////////////// 2 //////////////
//        System.out.println("2 - dirs inside dirs");
//        File[] tempFileList = null;
//        for (File file : fileListDir) {
//            System.out.printf("============ %s ============\n", file.getName());
//            ;
//            printFiles(file.listFiles(File::isDirectory));
//        }
        ////////////// 3 //////////////
//        System.out.println("3 - formats");
//        String mask = ".java";
//        File[] fileListMask = f.listFiles(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return name.toLowerCase().endsWith(mask);
//            }
//        });
        ////////////// 4 //////////////
//        System.out.println("4 - ALL");
//        for (File file : fileList) {
//            if (file.isFile()) {
//                file.getName();
//                continue;
//            }
//            System.out.printf("============ %s ============\n", file.getName());
//            printFiles(file.listFiles());
//        }



        ////////////// 5 //////////////
        System.out.println("5 - Recursive");
        recursive(fileList);
    }

    public static void printFiles(File[] dir) {
        for (File file : dir) {
            System.out.println(file.getName());
        }
    }

    public static void recursive(File[] dir) {
        System.out.println(recursive(dir,"", 0));
    };

    public static int recursive(File[] dir, String depth, int count) {
        for (File file : dir) {
            count++;
            System.out.printf("%s%s%s", depth, file.isFile() ? "|": "",file.getName());
            if (file.isFile()) {
                System.out.println();
                continue;
            }
            System.out.println("\\");
            count = recursive(file.listFiles(), depth += " ", count);
        }
        return count;
    }
}
