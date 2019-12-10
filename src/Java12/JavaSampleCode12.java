/*
 * 「Javaサンプルコード集」用ソースコード by mizokei
 */
package Java12;

/**
 *  1-2 変数を使って四則演算を行う
 */
public class JavaSampleCode12 {

    public static void main(String[] args) {
        
        //足し算の結果を変数tashi_sanに入れる
        int tashi_san = 19+14;
        
        //引き算の結果を変数hiki_sanに入れる
        int hiki_san = 25-13;
        
        //掛け算の結果を変数kake_sanに入れる
        int kake_san = 54*2;
        
        //割り算の結果を変数wari_sanに入れる
        int wari_san = 24/3;
        
        //割った余りの結果を変数amariに入れる
        int amari = 18%4;
        
        //足し算を表示する
        System.out.println("19+14は"+(tashi_san)+"です。");
        
        //引き算を表示する
        System.out.println("25-13は"+(hiki_san)+"です。");
        
        //掛け算を表示する
        System.out.println("54*2は"+(kake_san)+"です。");
        
        //割り算を表示する
        System.out.println("24/3は"+(wari_san)+"です。");

        //割った余りを表示する
        System.out.println("18%4は"+(amari)+"です。");
        
    }
    
}