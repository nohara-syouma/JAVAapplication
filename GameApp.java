package app;

public class GameApp {
	
	 // フィールド
	
	public String item;

    /**
     * コンストラクタ(引数なし)
     */
	
	
	public GameApp() {
	}

    
	
	public GameApp(String item) {
		
		this.item = item;
		
	}


   
	
	public String start(String name) {
		
        return name + "さんと" + this.item + "でゲームを開始します";
    }

	
}