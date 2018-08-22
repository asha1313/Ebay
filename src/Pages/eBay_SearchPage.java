package Pages;
import org.openqa.selenium.By;
public class eBay_SearchPage 
{
	public By search_Box=By.xpath("//android.widget.TextView");
	public By searchkey_KeyEnter=By.xpath("//android.widget.EditText[text(),'Search for anything']");
	public By select_autosugguestions=By.xpath("//android.widget.TextView(contains[text='Watches, Parts & Accessories'])");
	public By select_item=By.xpath("//android.widget.RelativeLayout[@index='2']");
	public By add_cart=By.xpath("//android.widget.Button[@content-desc='Add to cart']");
	public By select_size_dropdown=By.xpath("//android.widget.Spinner");
	public By select_size=By.xpath("//android.widget.TextView(contains[text='Black (Woman)'])");
	
			

}
