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

WebUI.click(findTestObject('Object Repository/Page_Avanti West Coast  Buy Train Tickets  _adc929/input_Leaving from_departingFromPopup'))

WebUI.setText(findTestObject('Object Repository/Page_Avanti West Coast  Buy Train Tickets  _adc929/input_Search for station name_departingFrom'), 
    DepartureStation)

WebUI.click(findTestObject('Object Repository/Page_Avanti West Coast  Buy Train Tickets  _adc929/div_Manchester Piccadilly (MAN)'))

WebUI.click(findTestObject('Object Repository/Page_Avanti West Coast  Buy Train Tickets  _adc929/input_Going to_arrivingToPopup'))

WebUI.setText(findTestObject('Object Repository/Page_Avanti West Coast  Buy Train Tickets  _adc929/input_Search for station name_arrivingTo'), 
    ArrivalStation)

WebUI.click(findTestObject('Object Repository/Page_Avanti West Coast  Buy Train Tickets  _adc929/div_London Euston (EUS)'))

WebUI.click(findTestObject('Object Repository/Page_Avanti West Coast  Buy Train Tickets  _adc929/input_Depart_departureJourneyDateTime'))

WebUI.click(findTestObject('Object Repository/Page_Avanti West Coast  Buy Train Tickets  _adc929/a_8'))

WebUI.click(findTestObject('Object Repository/Page_Avanti West Coast  Buy Train Tickets  _adc929/button_Apply'))

WebUI.click(findTestObject('Object Repository/Page_Avanti West Coast  Buy Train Tickets  _adc929/input_Adult_incrementAdult'))

WebUI.click(findTestObject('Object Repository/Page_Avanti West Coast  Buy Train Tickets  _adc929/a_ Add railcard'))

WebUI.click(findTestObject('Object Repository/Page_Avanti West Coast  Buy Train Tickets  _adc929/button_Add Railcard'))

WebUI.click(findTestObject('Object Repository/Page_Avanti West Coast  Buy Train Tickets  _adc929/button_Find times and prices'))

