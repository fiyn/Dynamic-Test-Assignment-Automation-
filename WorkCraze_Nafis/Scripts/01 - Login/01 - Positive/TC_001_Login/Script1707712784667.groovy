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

WebUI.navigateToUrl(GlobalVariable.urlAddress)

WebUI.click(findTestObject('01 - Login/TC_001_Login/Page_Busyzeus/a_Register Now'))

WebUI.click(findTestObject('01 - Login/TC_001_Login/Page_Busyzeus/a_to Log In page'))

WebUI.setText(findTestObject('01 - Login/TC_001_Login/Page_Busyzeus/input_Email_email'), GlobalVariable.email)

WebUI.setEncryptedText(findTestObject('01 - Login/TC_001_Login/Page_Busyzeus/input_Password_password'), GlobalVariable.password)

WebUI.click(findTestObject('01 - Login/TC_001_Login/Page_Busyzeus/button_Login'))

WebUI.waitForElementVisible(findTestObject('01 - Login/TC_001_Login/Page_Busyzeus/div_Success  User logged in successfully'), 
    2)

WebUI.verifyElementVisible(findTestObject('01 - Login/TC_001_Login/Page_Busyzeus/div_User logged in successfully'))

not_run: isOpened = WebUI.verifyElementVisible(findTestObject('01 - Login/TC_001_Login/Page_Busyzeus/div_X close pop up'), 
    FailureHandling.STOP_ON_FAILURE)

isOpened = WebUI.verifyElementPresent(findTestObject('01 - Login/TC_001_Login/Page_Busyzeus/div_X close pop up'), 0, FailureHandling.OPTIONAL)

println(isOpened)

if (isOpened) {
    WebUI.click(findTestObject('01 - Login/TC_001_Login/Page_Busyzeus/div_X close pop up'))
} else {
    WebUI.delay(1)
}

