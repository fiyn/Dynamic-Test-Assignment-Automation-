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

WebUI.click(findTestObject('03 - Vacancies/06 - Modify Job Posting/TC_027_EditJobPosting/Page_Busyzeus/a_Edit'))

WebUI.sendKeys(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/input_Vacancy Title_vacancy_title'), Keys.chord(
        Keys.LEFT_CONTROL, 'a'))

WebUI.sendKeys(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/input_Vacancy Title_vacancy_title'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/input_Vacancy Title_vacancy_title'), vacancyTitle)

WebUI.setText(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/input_Position Number only'), position)

WebUI.setText(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/textarea_c) Skill Sets_skillsets'), skillSet)

WebUI.click(findTestObject('02 - Job Posting/TC_005_SaveJob/Page_Busyzeus/button_Save'))

WebUI.verifyElementVisible(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/div_Job updated successfully (Saved)'))

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/button_Post'))

WebUI.verifyElementVisible(findTestObject('02 - Job Posting/TC_005_SaveJob/Page_Busyzeus/div_Job posted successfully'))

