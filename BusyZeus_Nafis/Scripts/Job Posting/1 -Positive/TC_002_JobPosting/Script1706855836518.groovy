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

WebUI.click(findTestObject('Job Posting/TC_002_JobPosting/Page_Busyzeus/a_to Job Posting'))

WebUI.setText(findTestObject('Job Posting/TC_002_JobPosting/Page_Busyzeus/input_Vacancy Title_vacancy_title'), vacancyTitle)

WebUI.setText(findTestObject('Job Posting/TC_002_JobPosting/Page_Busyzeus/input_Job Start Date_job_start_date'), jobStartDate)

WebUI.setText(findTestObject('Job Posting/TC_002_JobPosting/Page_Busyzeus/input_Job End Date_job_end_date'), jobEndDate)

WebUI.setText(findTestObject('Job Posting/TC_002_JobPosting/Page_Busyzeus/input_Position Number only'), position)

WebUI.setText(findTestObject('Job Posting/TC_002_JobPosting/Page_Busyzeus/input_Currency symbol or code'), currencyCode)

WebUI.setText(findTestObject('Job Posting/TC_002_JobPosting/Page_Busyzeus/input_From salary_from_salary'), salaryFrom)

WebUI.setText(findTestObject('Job Posting/TC_002_JobPosting/Page_Busyzeus/input_To salary_to_salary'), salaryTo)

WebUI.click(findTestObject('Job Posting/TC_002_JobPosting/Page_Busyzeus/div_Select Salary Type'))

WebUI.click(findTestObject('Job Posting/TC_002_JobPosting/Page_Busyzeus/span_Monthly Salary Type List', [('salaryType') : salaryType]))

WebUI.click(findTestObject('Job Posting/TC_002_JobPosting/Page_Busyzeus/input_Active_status'))

WebUI.click(findTestObject('Job Posting/TC_002_JobPosting/Page_Busyzeus/div_Country Location'))

WebUI.click(findTestObject('Job Posting/TC_002_JobPosting/Page_Busyzeus/mat-option_Malaysia'))

WebUI.delay(2)

WebUI.click(findTestObject('Job Posting/TC_002_JobPosting/Page_Busyzeus/div_State Location'))

WebUI.click(findTestObject('Job Posting/TC_002_JobPosting/Page_Busyzeus/span_State  Location List'))

WebUI.click(findTestObject('Job Posting/TC_002_JobPosting/Page_Busyzeus/div_City  Location List'))

WebUI.click(findTestObject('Job Posting/TC_002_JobPosting/Page_Busyzeus/span_City  Location List'))

WebUI.click(findTestObject('Job Posting/TC_002_JobPosting/Page_Busyzeus/input_Contract Type_engagement_type'))

WebUI.click(findTestObject('Job Posting/TC_002_JobPosting/Page_Busyzeus/input_Hour Per Week_hours_per_week'))

WebUI.click(findTestObject('Job Posting/TC_002_JobPosting/Page_Busyzeus/input_Working Arrangement_work_site'))

WebUI.click(findTestObject('Job Posting/TC_002_JobPosting/Page_Busyzeus/div_Education Industries'))

WebUI.click(findTestObject('Job Posting/TC_002_JobPosting/Page_Busyzeus/span_Food Industries List'))

