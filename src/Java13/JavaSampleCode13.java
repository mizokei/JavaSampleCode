/*
 * 「Javaサンプルコード集」用ソースコード by mizokei
 */
package Java13;

/**
 *  1-3 変数を使って少数を計算する
 */
public class JavaSampleCode13 {

    public static void main(String[] args) {

        //少数の足し算の結果を変数tashi_sanに入れる
        double tashi_san = 27.8+22.2;
        
        //少数の引き算の結果を変数hiki_sanに入れる
        double hiki_san = 64.2-14.7;
        
        //少数の掛け算の結果を変数kake_sanに入れる
        double kake_san = 13.3*3;
        
        //少数の割り算の結果を変数wari_sanに入れる
        double wari_san = 25.0/2;
        
        //少数の足し算を表示する
        System.out.println("27.8+22.2は"+(tashi_san)+"です。");
        
        //少数の引き算を表示する
        System.out.println("64.2-14.7は"+(hiki_san)+"です。");
        
        //少数の掛け算を表示する
        System.out.println("13.3*3は"+(kake_san)+"です。");

        //少数の割り算を表示する
        System.out.println("25.0/2は"+(wari_san)+"です。");

        /*
         *補足コード
         */
        //少数の掛け算を表示する(桁を調整する)
        System.out.println("13.3*3は"+String.format("%.1f", (kake_san))+"です。");
        
    }
    
}