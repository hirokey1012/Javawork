package keisan;

//importでパッケージの宣言が不要になる
import keisansub.CalcLogic;	//keisansubはソースファイル名,CalcLogicはクラス名

public class Calc {

	//実行するのはmainメソッドが含まれているクラスの名前
	public static void main(String[] arg){
		int a =10; int b=2;
		int total = CalcLogic.tasu(a,b);	//パッケージ名.ソースファイル名.クラス名（引数）;
		int delta = CalcLogic.hiku(a, b);	//パッケージが異なれば同じクラス名を使ってもOK
		System.out.println("足したら" + total +"、引いたら" + delta);
	}
}
