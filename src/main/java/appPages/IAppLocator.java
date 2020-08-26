package appPages;

import org.openqa.selenium.By;

public interface IAppLocator {

	public static final By emailID = By.id("com.github.fgoncalves.qa:id/email");
    public static final By password = By.id("com.github.fgoncalves.qa:id/password");
    public static final By signONBtn = By.id("com.github.fgoncalves.qa:id/email_sign_in_button");
    public static final By houseImage = By.className("android.widget.ImageView");

}
