package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem menuItemSeller;
	@FXML
	private MenuItem menuItemDepartment;
	@FXML
	private MenuItem menuItemAbout;

	@FXML
	public void onMenuItemSeller() {
		System.out.println("onMenuItemSeller");
	}
	
	@FXML
	public void menuItemDepartment() {
		System.out.println("menuItemDepartment");
	}
	
	@FXML
	public void menuItemAboutAction() {
		System.out.println("menuItemAbout");
	}

	@Override
	public void initialize(URL uri, ResourceBundle rb) {

	}

}
