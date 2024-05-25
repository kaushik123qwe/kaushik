package myPackage.DropdownText;

import org.testng.annotations.Test;

import myPackage.DropdownText.reuseablekeywords;

public class webshop extends reuseablekeywords {
	@Test

	public void registration() throws Exception{
		openbrowser();
		click(bookLink);
		Thread.sleep(3000);
		//selectByVisibleText(dropdownLink,sortbybooks);
		//selectByValue(dropdownLink,dropdownValue);
		selectByIndex(dropdownLink,2);
		
		//boolean status=elementPresent(dropdownLink);
		//if(status==false){
			//System.out.println("Sort by Dropdown not present");
		//}
		//else{
			//System.out.println("Sort by Dropdown present");
		//}
		//Thread.sleep(7000);
	}
}
