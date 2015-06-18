package keisan;

public class Calc {

	//実行するのはmainメソッドが含まれているクラスの名前
	public static void main(String[] arg){
		int a =10; int b=2;
		int total = keisansub.CalcLogic.tasu(a,b);	//クラスが書かれているソースファイル名.クラス名（引数）;
		int delta = keisansub.CalcLogic.hiku(a, b);
		System.out.println("足したら" + total +"、引いたら" + delta);
	}
}
