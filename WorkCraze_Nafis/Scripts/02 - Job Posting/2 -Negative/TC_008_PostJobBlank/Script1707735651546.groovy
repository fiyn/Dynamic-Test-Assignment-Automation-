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

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/a_to Job Posting'))

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/button_Post'))

WebUI.verifyElementVisible(findTestObject('02 - Job Posting/TC_007_SaveJobBlank/Page_Busyzeus/div_Vacancy Title is required'))

WebUI.verifyElementVisible(findTestObject('02 - Job Posting/TC_007_SaveJobBlank/Page_Busyzeus/div_Job start date is required'))

WebUI.verifyElementVisible(findTestObject('02 - Job Posting/TC_007_SaveJobBlank/Page_Busyzeus/div_Job end date is required'))

WebUI.verifyElementVisible(findTestObject('02 - Job Posting/TC_007_SaveJobBlank/Page_Busyzeus/div_Status is required'))

WebUI.verifyElementVisible(findTestObject('02 - Job Posting/TC_007_SaveJobBlank/Page_Busyzeus/div_Country is required'))

WebUI.verifyElementVisible(findTestObject('02 - Job Posting/TC_007_SaveJobBlank/Page_Busyzeus/div_State is required'))

WebUI.verifyElementVisible(findTestObject('02 - Job Posting/TC_007_SaveJobBlank/Page_Busyzeus/div_City is required'))

WebUI.verifyElementVisible(findTestObject('02 - Job Posting/TC_007_SaveJobBlank/Page_Busyzeus/div_Contract type is required'))

WebUI.verifyElementVisible(findTestObject('02 - Job Posting/TC_007_SaveJobBlank/Page_Busyzeus/div_Hour per week is required'))

WebUI.verifyElementVisible(findTestObject('02 - Job Posting/TC_007_SaveJobBlank/Page_Busyzeus/div_Citizenship is required'))

WebUI.verifyElementVisible(findTestObject('02 - Job Posting/TC_007_SaveJobBlank/Page_Busyzeus/div_Description is required'))

WebUI.verifyElementVisible(findTestObject('02 - Job Posting/TC_007_SaveJobBlank/Page_Busyzeus/div_Responsibilities is required'))

WebUI.verifyElementVisible(findTestObject('02 - Job Posting/TC_007_SaveJobBlank/Page_Busyzeus/div_Job highlights is required'))

WebUI.verifyElementVisible(findTestObject('02 - Job Posting/TC_007_SaveJobBlank/Page_Busyzeus/div_Skill sets is required'))

