//ポケットベルの文字入力を再現したものである。
//928313228313410412210423と入力すると、"りゆうきゆうた゛いか゛く"と表示される。
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int let = 0,letter = 0,first = -1,second = -1;
        String sbox;
        Scanner in = new Scanner(System.in);
        System.out.println("ポケベル入力装置起動");
        System.out.println("文字数を入力してください。(濁点や半濁点も1文字としてカウントされます。: ");
        letter = in.nextInt();

        char[] box = new char[letter];

        while (let < letter){
            System.out.println("1つ目の数字を入力してください。: ");
            first = in.nextInt();
            System.out.println("2つ目の数字を入力してください。: ");
            second = in.nextInt();

        }
        sbox =  toString(box[]);
        System.out.println("あなたが入力した文字は、" + sbox + "です。");
        System.out.println("ポケベル入力装置を終了します。");

    }
}
