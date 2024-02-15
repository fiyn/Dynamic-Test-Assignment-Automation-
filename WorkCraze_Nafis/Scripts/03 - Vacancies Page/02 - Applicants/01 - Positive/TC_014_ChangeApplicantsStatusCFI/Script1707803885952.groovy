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

WebUI.callTestCase(findTestCase('03 - Vacancies Page/02 - Applicants/01 - Positive/TC_010_ViewJobSummary'), [('jobTitle') : jobTitle], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 - Vacancies/02 - Applicants/TC_011_ViewApplicants/Page_Busyzeus/button_Applicants'))

WebUI.verifyElementVisible(findTestObject('03 - Vacancies/02 - Applicants/TC_011_ViewApplicants/Page_Busyzeus/h2_Information regarding all applicants for this vacancy'))

WebUI.click(findTestObject('03 - Vacancies/02 - Applicants/TC_013_ChangeApplicantsStatus/Page_Busyzeus/div_Status selection box', [('applicants') : applicants]))

WebUI.click(findTestObject('03 - Vacancies/02 - Applicants/TC_013_ChangeApplicantsStatus/Page_Busyzeus/span_Rejected', [('status') : status]))

WebUI.setText(findTestObject('03 - Vacancies/02 - Applicants/TC_014_ChangeApplicantsStatusCFI/Page_Busyzeus/input_Date_date'), date)

WebUI.setText(findTestObject('03 - Vacancies/02 - Applicants/TC_014_ChangeApplicantsStatusCFI/Page_Busyzeus/input_Time_time'), time)

WebUI.click(findTestObject('03 - Vacancies/02 - Applicants/TC_014_ChangeApplicantsStatusCFI/Page_Busyzeus/div_Personal Interview'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('03 - Vacancies/02 - Applicants/TC_014_ChangeApplicantsStatusCFI/Page_Busyzeus/span_Web Interview', [('interviewType') : interviewType]))

if (interviewType == 'Web Interview') {
    WebUI.setText(findTestObject('03 - Vacancies/02 - Applicants/TC_014_ChangeApplicantsStatusCFI/Page_Busyzeus/input_Interview Link_invitation_link'), 
        interviewLink)

    WebUI.setText(findTestObject('03 - Vacancies/02 - Applicants/TC_014_ChangeApplicantsStatusCFI/Page_Busyzeus/input_Note_notes'), notes)

    WebUI.click(findTestObject('03 - Vacancies/02 - Applicants/TC_014_ChangeApplicantsStatusCFI/Page_Busyzeus/button_Invite'))

    WebUI.verifyElementVisible(findTestObject('03 - Vacancies/02 - Applicants/TC_014_ChangeApplicantsStatusCFI/Page_Busyzeus/div_Invitation sent successfully'))
} else {
    WebUI.setText(findTestObject('03 - Vacancies/02 - Applicants/TC_014_ChangeApplicantsStatusCFI/Page_Busyzeus/input_Note_notes'), notes)

    WebUI.click(findTestObject('03 - Vacancies/02 - Applicants/TC_014_ChangeApplicantsStatusCFI/Page_Busyzeus/button_Invite'))

    WebUI.verifyElementVisible(findTestObject('03 - Vacancies/02 - Applicants/TC_014_ChangeApplicantsStatusCFI/Page_Busyzeus/div_Invitation sent successfully'))
}

