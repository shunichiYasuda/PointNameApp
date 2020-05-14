package com.yasudaInternational.tools.PointNameApp;

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
    	String msg =((RadioButton)grp.getSelectedToggle()).getText();
    	log.appendText(msg+"\n");
    }
    
    
}
