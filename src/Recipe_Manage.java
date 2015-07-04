import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;

public class Recipe_Manage {
    public static void main(String[] args){

        //ファイル入出力処理における例外処理
        try {
            //ファイル読み込み
            BufferedReader br = new BufferedReader(new FileReader(new File("recipe-title-data.txt")));

            String title = br.readLine();
            while(title != null) {
                System.out.println(title);

                title = br.readLine();
            }

            br.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
