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

WebUI.callTestCase(findTestCase('01 - Login/01 - Positive/TC_001_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.setText(findTestObject('03 - Vacancies/08 - Sort Job Posting/TC_032_SortByDatePosted/Page_Busyzeus/input_Search_daterange'), 
    datePosted)

WebUI.sendKeys(findTestObject('03 - Vacancies/08 - Sort Job Posting/TC_032_SortByDatePosted/Page_Busyzeus/input_Search_daterange'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('03 - Vacancies/08 - Sort Job Posting/TC_032_SortByDatePosted/Page_Busyzeus/input_Search_daterange'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('03 - Vacancies/08 - Sort Job Posting/TC_032_SortByDatePosted/Page_Busyzeus/button_ok'), 
    1)

WebUI.click(findTestObject('03 - Vacancies/08 - Sort Job Posting/TC_032_SortByDatePosted/Page_Busyzeus/button_ok'))

WebUI.delay(2)

