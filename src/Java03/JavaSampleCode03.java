/*
 * 「Javaサンプルコード集」用ソースコード by mizokei
 */
package Java03;

/**
 *  0-3 少数を計算する
 */
public class JavaSampleCode03 {

    public static void main(String[] args) {

        //少数の足し算を表示する
        System.out.println("27.8+22.2は"+(27.8+22.2)+"です。");
        
        //少数の引き算を表示する
        System.out.println("64.2-14.7は"+(64.2-14.7)+"です。");
        
        //少数の掛け算を表示する
        System.out.println("13.3*3は"+(13.3*3)+"です。");

        //少数の割り算を表示する
        System.out.println("25.0/2は"+(25.0/2)+"です。");

        /*
         *補足コード
         */
        //少数の掛け算を表示する(桁を調整する)
        System.out.println("13.3*3は"+String.format("%.1f", (13.3*3))+"です。");
        
    }
    
}