import java.lang.*;
import java.lang.Character;

public class Line {
    public static void character(Character[] args) {
        int first = -1;
        int second = -1;
        char le;

        if(first == 1){
            lin = Character.ALine;
        }else if(first ==2){
            lin = Character.KLine;
        }else if(first ==3){
            lin = Character.SLine;
        }else if(first ==4){
            lin = Character.TLine;
        }else if(first ==5){
            lin = Character.NLine;
        }else if(first ==6){
            lin = Character.HLine;
        }else if(first ==7){
            lin = Character.MLine;
        }else if(first ==8){
            lin = Character.YLine;
        }else if(first ==9){
            lin = Character.RLine;
        }else if(first ==0){
            lin = Character.WLine;
        }else{
            System.out.println("0から9の範囲で入力してください。");
        }

         le=lin[second];
    }
}
