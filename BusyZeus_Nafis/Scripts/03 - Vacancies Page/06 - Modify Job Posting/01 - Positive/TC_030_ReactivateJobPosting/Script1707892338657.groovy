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

isOpened = WebUI.verifyElementVisible(findTestObject('01 - Login/TC_001_Login/Page_Busyzeus/div_X close pop up'), FailureHandling.STOP_ON_FAILURE)

if (isOpened) {
    WebUI.click(findTestObject('01 - Login/TC_001_Login/Page_Busyzeus/div_X close pop up'))

    WebUI.delay(2)

    WebUI.click(findTestObject('03 - Vacancies/06 - Modify Job Posting/TC_030_ReactivateJobPosting/Page_Busyzeus/a_Personal Shopper_vacancies-edit-link', 
            [('jobTitle') : jobTitle]))

    WebUI.click(findTestObject('03 - Vacancies/06 - Modify Job Posting/TC_030_ReactivateJobPosting/Page_Busyzeus/button_Re-active'))
} else {
    WebUI.delay(2)

    WebUI.click(findTestObject('03 - Vacancies/06 - Modify Job Posting/TC_030_ReactivateJobPosting/Page_Busyzeus/a_Personal Shopper_vacancies-edit-link', 
            [('jobTitle') : jobTitle]))

    WebUI.click(findTestObject('03 - Vacancies/06 - Modify Job Posting/TC_030_ReactivateJobPosting/Page_Busyzeus/button_Re-active'))
}

