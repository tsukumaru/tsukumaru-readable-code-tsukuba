import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class RecipeManageApp {

    public static boolean isNumber(String s){
        try {
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args){
        RecipeManager recipeManager = new RecipeManager();
        int argLen = args.length;

        switch (argLen % 2){
            case 1:
                if (isNumber(args[argLen - 1])) {
                    int id = Integer.parseInt(args[argLen - 1]) - 1;
                    int index = 0;

                    for(int i = 1; i < argLen; i+=2) {
                        recipeManager.showUserName(args[i-1]);

                        recipeManager.readRecipeData(args[i]);
                        int recipeLen = recipeManager.getRecipeList().size();

                        boolean idMatchFlg = false;
                        for(int j = 0; j < recipeLen - index; j++){
                            if(j+index == id) {
                                idMatchFlg = true;
                                break;
                            }
                        }

                        if(idMatchFlg)
                            recipeManager.showRecipeById(id);

                        System.out.println();

                        index += recipeLen - index;

                    }
                }
                break;
            case 0:
                int index = 0;

                for(int i = 1; i < argLen; i+=2) {
                    recipeManager.showUserName(args[i-1]);

                    recipeManager.readRecipeData(args[i]);
                    int recipeLen = recipeManager.getRecipeList().size();

                    for(int j = 0; j < recipeLen - index; j++)
                        recipeManager.showRecipeById(j+index);

                    index += recipeLen - index;

                }
        }
    }

}
