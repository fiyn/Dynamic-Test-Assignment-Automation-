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

WebUI.setText(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/input_Vacancy Title_vacancy_title'), vacancyTitle)

WebUI.setText(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/input_Job Start Date_job_start_date'), jobStartDate)

WebUI.setText(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/input_Job End Date_job_end_date'), jobEndDate)

WebUI.setText(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/input_Position Number only'), position)

WebUI.setText(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/input_Currency symbol or code'), currencyCode)

WebUI.setText(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/input_From salary_from_salary'), salaryFrom)

WebUI.setText(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/input_To salary_to_salary'), salaryTo)

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/div_Select Salary Type'))

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/span_Monthly Salary Type List', [('salaryType') : salaryType]))

status = CustomKeywords.'jobPosting.RadioBtnHandler.setStatus'(statusIs)

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/input_Active_status', [('status') : status]))

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/div_Country Location'))

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/span_Country Location List', [('country') : country]))

WebUI.delay(2)

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/div_State Location'))

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/span_State  Location List', [('state') : state]))

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/div_City  Location List'))

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/span_City  Location List', [('city') : city]))

contractTypeIs = CustomKeywords.'jobPosting.RadioBtnHandler.setContractType'(contractType)

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/input_Contract Type_engagement_type', [('contractTypeIs') : contractTypeIs]))

hourPerWeekIs = CustomKeywords.'jobPosting.RadioBtnHandler.setHourPerWeek'(hourPerWeek)

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/input_Hour Per Week_hours_per_week', [('hourPerWeekIs') : hourPerWeekIs]))

workingModeIs = CustomKeywords.'jobPosting.RadioBtnHandler.setWorkingMode'(workingMode)

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/input_Working Arrangement_work_site', [('workingModeIs') : workingModeIs]))

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/div_Education Industries'))

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/span_Food Industries List', [('industry') : industry]))

citizenshipIs = CustomKeywords.'jobPosting.RadioBtnHandler.setCitizenship'(citizenship)

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/input_Citizenship', [('citizenshipIs') : citizenshipIs]))

visaSupportIs = CustomKeywords.'jobPosting.RadioBtnHandler.setVisaSupp'(visaSupport)

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/input_Visa Support', [('visaSupportIs') : visaSupportIs]))

WebUI.setText(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/textarea_a) Description_description'), description)

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/button_X Responsibilities'))

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/button_X Responsibilities'))

WebUI.setText(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/input_b) Responsibilities_responsiblities'), 
    responsibilities)

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/button_X Highlights'))

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/button_X Highlights'))

WebUI.setText(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/input_c) Job Highlights_job_highlights'), jobHighlight)

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/div_BCA Qualification'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/span_MCA Qualification List', [('qualification') : qualification]))

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/div_1 to 2 Years Experiences'))

WebUI.click(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/span_2 to 5 Years Experiences'))

WebUI.setText(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/textarea_c) Skill Sets_skillsets'), skillSet)

WebUI.click(findTestObject('02 - Job Posting/TC_005_SaveJob/Page_Busyzeus/button_Save'))

WebUI.verifyElementVisible(findTestObject('02 - Job Posting/TC_006_PostJob/Page_Busyzeus/div_Job updated successfully (Saved)'))

