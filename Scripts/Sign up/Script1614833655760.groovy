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

WebUI.click(findTestObject('Object Repository/Page_Avanti West Coast  Buy Train Tickets  _adc929/a_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Avanti West Coast  Book Cheap Train Ti_b0a4f0/a_Create a new account'))

WebUI.setText(findTestObject('Object Repository/Page_Avanti West Coast  Book Cheap Train Ti_b0a4f0/input_Country_country'), 
    'India')

WebUI.setText(findTestObject('Object Repository/Page_Avanti West Coast  Book Cheap Train Ti_b0a4f0/input__mat-input-2'), 
    'satyendradattamajumder@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Avanti West Coast  Book Cheap Train Ti_b0a4f0/input__mat-input-3'), 
    'satyendradattamajumder@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Avanti West Coast  Book Cheap Train Ti_b0a4f0/div_Choose Title'))

WebUI.click(findTestObject('Object Repository/Page_Avanti West Coast  Book Cheap Train Ti_b0a4f0/span_Mr'))

WebUI.setText(findTestObject('Object Repository/Page_Avanti West Coast  Book Cheap Train Ti_b0a4f0/input__firstName'), 'SD')

WebUI.setText(findTestObject('Object Repository/Page_Avanti West Coast  Book Cheap Train Ti_b0a4f0/input__lastName'), 'Majumder')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Avanti West Coast  Book Cheap Train Ti_b0a4f0/input__password'), 
    'yqlBak/7cRt5WI1zW6H+ag==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Avanti West Coast  Book Cheap Train Ti_b0a4f0/input__confirmPassword'), 
    'yqlBak/7cRt5WI1zW6H+ag==')

WebUI.setText(findTestObject('Object Repository/Page_Avanti West Coast  Book Cheap Train Ti_b0a4f0/input__postCode'), '110001')

WebUI.setText(findTestObject('Object Repository/Page_Avanti West Coast  Book Cheap Train Ti_b0a4f0/input__address1'), 'New Ashok Nagar')

WebUI.click(findTestObject('Object Repository/Page_Avanti West Coast  Book Cheap Train Ti_b0a4f0/mat-card-content_Email Repeat EmailPlease T_0bf8a5'))

WebUI.setText(findTestObject('Object Repository/Page_Avanti West Coast  Book Cheap Train Ti_b0a4f0/input__city'), 'Delhi')

WebUI.click(findTestObject('Object Repository/Page_Avanti West Coast  Book Cheap Train Ti_b0a4f0/div_Nectar Account number_mat-checkbox-inne_704d73'))

WebUI.click(findTestObject('Object Repository/Page_Avanti West Coast  Book Cheap Train Ti_b0a4f0/div_Terms and Conditions_mat-checkbox-inner_4ee8b8'))

WebUI.click(findTestObject('Object Repository/Page_Avanti West Coast  Book Cheap Train Ti_b0a4f0/span_Create'))

WebUI.click(findTestObject('Object Repository/Page_Avanti West Coast  Book Cheap Train Ti_b0a4f0/input_No marketing communications will be sent to under 16s_preferenceover_16'))

WebUI.click(findTestObject('Object Repository/Page_Avanti West Coast  Book Cheap Train Ti_b0a4f0/span_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Avanti West Coast  Book Cheap Train Ti_b0a4f0/button_Keep typing your address to display _0561c4'))

