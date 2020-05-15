package com.yasudaInternational.tools.PointNameApp;

import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

public class PrimaryController {
	@FXML
	ToggleGroup grp;
	@FXML
	TextArea log;
	@FXML
	RadioButton semi1;
	@FXML
	RadioButton semi2;
	@FXML
	RadioButton semi3;
	@FXML
	RadioButton basicClass;
    @FXML
    private void quitAction() {
    	System.exit(0);
    }
    @FXML
    private void pointAction() { 	
    	int point = gen.nextInt(target.length);
    	log.appendText(target[point]+"\n");
    }
    @FXML
    private void clearAction() {
    	log.clear();
    }
    @FXML
    private void semi1Action() {
    	//target = name2;
    }
    @FXML
    private void semi2Action() {
    	target = name2;
    }
    @FXML
    private void semi3Action() {
    	target = name3;
    }
    @FXML
    private void basicClassAction() {
    	target = basic;
    }
    //ランダムシード
    private Random gen = new Random();
    //名簿配列
    private String[] target = null;
    private final String[] name2 = {
    		"稲田　浩之",
    		"近藤　加奈",
    		"高畑　龍人",
    		"丹　直哉",
    		"中川　雄斗",
    		"文谷　成一",
    		"稲葉　光留",
    		"久米　裕貴",
    		"築山　瑞樹",
    		"西村　正和",
    		"兵頭　柊汰",
    		"山本　晴也",
    		"梅本　拓飛",
    		"古泉　春那",
    		"重信　蒼真",
    		"陳　元博",
    		"中井　亮治",
    		"山本　尚季"
    };
    private final String[] name3 = {
    		"淺野　拓巳",
    		"安西　悠",
    		"石﨑　大雅",
    		"稲田　修人",
    		"宇都宮　聖人",
    		"越智　惇",
    		"木下　昇磨",
    		"儀寳　嶺",
    		"齊藤　達哉",
    		"下藤　尚輝",
    		"髙垣　駿介",
    		"田中　綜太郎",
    		"中澤　伸之",
    		"新山　啓輔",
    		"萩尾　洸希",
    		"本山　拓登"
    };
    private final String[] basic = {
    		"畝中　翔真	ウネナカ　ショウマ",
    		"岡　泰佑	オカ　タイスケ",
    		"河口　泰智	カワグチ　タイチ",
    		"白井　空	シライ　ソラ",
    		"副島　ももな	ソエジマ　モモナ",
    		"高須賀　欽志郎	タカスカ　キンシロウ",
    		"中矢　裕己	ナカヤ　ヒロキ	",
    		"西尾　智弥	ニシオ　トモヤ",
    		"能瀬　雄斗	ノセ　ユウト",
    		"乘松　凜太朗	ノリマツ　リンタロウ",
    		"林　亮汰郎	ハヤシ　リョウタロウ",
    		"松浦　億典	マツウラ　カズノリ",
    		"水池　勇登	ミズチ　ハヤト",
    		"森本　望友	モリモト　ミユ",
    		"安田　愛由香	ヤスダ　アユカ",
    		"若本　美優	ワカモト　ミユウ",
    		"高瀬　雅之	タカセ　マサユキ"
    };
    
}
