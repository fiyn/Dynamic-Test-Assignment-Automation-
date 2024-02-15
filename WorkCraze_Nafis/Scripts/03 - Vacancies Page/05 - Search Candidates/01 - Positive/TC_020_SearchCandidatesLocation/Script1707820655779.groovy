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

WebUI.callTestCase(findTestCase('03 - Vacancies Page/02 - Applicants/01 - Positive/TC_010_ViewJobSummary'), [('jobTitle') : jobTitle], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('03 - Vacancies/05 - Search Candidates/TC_020_SearchCandidatesLocation/Page_Busyzeus/button_Search candidates'))

WebUI.verifyElementVisible(findTestObject('03 - Vacancies/05 - Search Candidates/TC_020_SearchCandidatesLocation/Page_Busyzeus/h2_Information regarding all applicants for this vacancy'))

WebUI.setText(findTestObject('03 - Vacancies/05 - Search Candidates/TC_020_SearchCandidatesLocation/Page_Busyzeus/input_i. Location_location'), 
    location)

WebUI.click(findTestObject('03 - Vacancies/05 - Search Candidates/TC_020_SearchCandidatesLocation/Page_Busyzeus/button_Search'))

WebUI.verifyElementVisible(findTestObject('03 - Vacancies/05 - Search Candidates/TC_020_SearchCandidatesLocation/Page_Busyzeus/h3_Search Result'))

