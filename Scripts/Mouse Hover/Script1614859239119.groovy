import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.avantiwestcoast.co.uk/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Avanti West Coast  Buy Train Tickets  _adc929/button_Agree to all'))

WebUI.mouseOver(findTestObject('Page_Avanti West Coast  Buy Train Tickets  No Booking Fee/a_Where We Go'))

WebUI.mouseOver(findTestObject('Page_Avanti West Coast  Buy Train Tickets  No Booking Fee/a_Our destinations'))

WebUI.click(findTestObject('Page_Avanti West Coast  Buy Train Tickets  No Booking Fee/span_London'))

WebUI.scrollToElement(findTestObject('Page_Avanti West Coast  Buy Train Tickets  No Booking Fee/a_Site Map'), 5)
Date dt = new Date();
String filename = dt.getTime() + ".png";
WebUI.takeScreenshot((System.getProperty("user.dir") + "\\screenshots\\"+filename))

//WebUI.takeScreenshot('C:\\Users\\Administrator\\Desktop\\screenshots\\1st.png')

