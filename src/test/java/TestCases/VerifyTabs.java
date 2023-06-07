package TestCases;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.CommonAss;
import PageObjectModel.TabsObjectModels;
import Resources.BaseClass;
@Test
public class VerifyTabs extends BaseClass {
	
	SoftAssert assertion =new SoftAssert();
	
	public void ValidateTabs() {
	
		TabsObjectModels TOM= new TabsObjectModels(driver);
	    TOM.DeskTopTab().click();
	    String Act1=TOM.DesktopText().getText();
	    String Expt1="PC (0)";
	    CommonAss.assersion(Expt1, Act1, "one");
	    
	  
	    TOM.LaptopandNotebookTab().click();
	    String Act2=TOM.LaptopandNotebookText().getText();
	    String Expt2="Macs (0)";
	    CommonAss.assersion(Expt2, Act2,"two");
	    
	    TOM.componentTab().click();
	    String Act3=TOM.componentText().getText();
	    String Expt3="Mice and Trackballs (0)";	    
	    CommonAss.assersion(Expt3, Act3, "three");
	    
	    TOM.TabletsTab().click();
	    String Act4=TOM.componentTab().getText();
	    String Expt4="Tablets";
	    CommonAss.assersion(Act4, Expt4,"four");
	    
	    TOM.SoftwareTab().click();
	    String Act5=TOM.SoftwareText().getText();
	    String Expt5="Software";
	    CommonAss.assersion(Expt5, Act5, "five");
	    
	    TOM.PhonesAndPDAsTab().click();
	    String Act6=TOM.PhonesAndPDAsText().getText();
	    String Expt6="Phones & PDAs (3)";
	    CommonAss.assersion(Expt6, Act6, "six");
	    
	    TOM.CamerasTab().click();
	    String Act7=TOM.CamerasText().getText();
	    String Expt7="Cameras";
	    CommonAss.assersion(Expt7, Act7, "seven");
	    
	    TOM.MP3PlayersTab().click();
	    String Act8=TOM.MP3PlayersText().getText();
	    String Expt8="MP3 Players";
	    CommonAss.assersion(Expt8, Act8, "eight");
	    
	    TOM.LaptopandNotebookTab().click();
	    String Act9=TOM.LaptopandNotebookText().getText();
	    String Expt9="Laptops & Notebooks";
	    CommonAss.assersion(Expt9, Act9, "nine");

	    
	    
	    
	    
	    
	    
	    
	
	}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	


