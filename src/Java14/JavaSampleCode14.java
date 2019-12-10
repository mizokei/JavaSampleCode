/*
 * 「Javaサンプルコード集」用ソースコード by mizokei
 */
package Java14;

/**
 *  1-4 変数を使って正負を含む計算を行う
 */
public class JavaSampleCode14 {
 
    public static void main(String[] args) {

        //整数の正負を含む足し算の結果を変数seisu_tashi_sanに入れる
        int seisu_tashi_san = 4+(-5);
        
        //整数の正負を含む引き算の結果を変数seisu_hiki_sanに入れる
        int seisu_hiki_san = 13-(-2);
        
        //整数の正負を含む掛け算の結果を変数seisu_kake_sanに入れる
        int seisu_kake_san = -9+(-3);
        
        //整数の正負を含む割り算の結果を変数seisu_wari_sanに入れる
        int seisu_wari_san = -20-(-12);

        //少数の正負を含む足し算の結果を変数shousu_tashi_sanに入れる
        double shousu_tashi_san = 3.0+(-2.5);
        
        //少数の正負を含む引き算の結果を変数shousu_hiki_sanに入れる
        double shousu_hiki_san = 7.2-(-2.3);
        
        //少数の正負を含む掛け算の結果を変数shousu_kake_sanに入れる
        double shousu_kake_san = -4.5+(-7.6);
        
        //少数の正負を含む割り算の結果を変数shousu_wari_sanに入れる
        double shousu_wari_san = -12.34-(-5.67);
        
        /*
        整数の計算
        */
        //正の整数と負の整数の足し算を表示する
        System.out.println("4+(-5)は"+(seisu_tashi_san)+"です。");
        
        //正の整数と負の整数の引き算を表示する
        System.out.println("13-(-2)は"+(seisu_hiki_san)+"です。");
        
        //負の整数と負の整数の足し算を表示する
        System.out.println("-9+(-3)は"+(seisu_kake_san)+"です。");

        //負の整数と負の整数の引き算を表示する
        System.out.println("-20-(-12)は"+(seisu_wari_san)+"です。");
        
        /*
        少数の計算
        */
        //正の少数と負の少数の足し算を表示する
        System.out.println("3.0+(-2.5)は"+(shousu_tashi_san)+"です。");
        
        //正の少数と負の少数の引き算を表示する
        System.out.println("7.2-(-2.3)は"+(shousu_hiki_san)+"です。");
        
        //負の少数と負の少数の足し算を表示する
        System.out.println("-4.5+(-7.6)は"+(shousu_kake_san)+"です。");

        //負の少数と負の少数の引き算を表示する
        System.out.println("-12.34-(-5.67)は"+(shousu_wari_san)+"です。");
   
    }
    
}