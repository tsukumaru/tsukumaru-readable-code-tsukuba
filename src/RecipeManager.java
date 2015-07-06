import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class RecipeManager {
    private ArrayList<Recipe> recipeList = new ArrayList<Recipe>();

    void readRecipeData(String filePath){
        //ファイル入出力処理における例外処理
        try {
            //ファイル読み込み
            BufferedReader br = new BufferedReader(new FileReader(new File(filePath)));

            String recipeContentLine = br.readLine();
            while(recipeContentLine != null) {
                String[] recipeContents = recipeContentLine.split(" ");
                recipeList.add(new Recipe(recipeContents[0], recipeContents[1]));

                recipeContentLine = br.readLine();
            }

            br.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    void showRecipeById(int id){
        System.out.println(recipeList.get(id).getInfoString());
    }

    void showUserName(String name){
        System.out.println("ユーザー名：" + name);
    }

    void showRecipeWithUserNameById(int id, String name){
        System.out.println("ユーザー名：" + name);
        showRecipeById(id);
    }

    void showAllRecipes(){
        for(Recipe recipe : recipeList){
            System.out.println(recipe.getInfoString());
        }
    }

    ArrayList<Recipe> getRecipeList(){
        return recipeList;
    }
}
