import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class RecipeManageApp {
    public static void main(String[] args){
        RecipeManager recipeManager = new RecipeManager();
        recipeManager.readRecipeData();
        recipeManager.showAllRecipes();

        System.out.println("表示したいレシピIDとユーザー名を入力してください。");
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("レシピID : ");
            String idstr = br.readLine();
            System.out.print("ユーザー名 : ");
            String name = br.readLine();

            recipeManager.showRecipeWithUserNameById(Integer.parseInt(idstr), name);

        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
