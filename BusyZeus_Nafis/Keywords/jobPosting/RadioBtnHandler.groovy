package jobPosting
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class RadioBtnHandler {
	/**
	 * Set Status
	 */
	@Keyword (keywordObject = 'Set Status')
	def setStatus(String status) {
		String statusIs = ''
		
		switch (status) {
			case "Active":
				statusIs = 'status1'
				break;
			case "Close":
				statusIs = 'status2'
				break;
			default:
				statusIs = 'status1'
				break;
		}
		
		return statusIs
	}

	/**
	 * Set Contract Type
	 */
	@Keyword (keywordObject = 'Set Contract Type')
	def setContractType(String contractType) {
		String contractTypeIs = ''
		
		switch (contractType) {
			case "Permanent":
				contractTypeIs = '1'
				break;
			case "Contract":
				contractTypeIs = '2'
				break;
			case "Temporary":
				contractTypeIs = '3'
				break;
			case "Part Time":
				contractTypeIs = '4'
				break;
			case "Internship":
				contractTypeIs = '5'
				break;
			default:
				contractTypeIs = '1'
				break;
		}
		
		println contractTypeIs
		return contractTypeIs
	}

	/**
	 * Set Hour Per Week
	 */
	@Keyword (keywordObject = 'Set Hour Per Week')
	def setHourPerWeek(String hourPerWeek) {
		String hourPerWeekIs = ''
		
		switch (hourPerWeek) {
			case "Normal Hour":
				hourPerWeekIs = '1'
				break;
			case "3 Shift Time":
				hourPerWeekIs = '2'
				break;
			case "2 Shift Time":
				hourPerWeekIs = '3'
				break;
			case "Flexible":
				hourPerWeekIs = '4'
				break;
			case "Night Shift":
				hourPerWeekIs = '5'
				break;
			default:
				hourPerWeekIs = '1'
				break;
		}
		
		println hourPerWeekIs
		return hourPerWeekIs
	}
	
	/**
	 * Set Working Arrangement
	 */
	@Keyword (keywordObject = 'Set Working Arrangement')
	def setWorkingMode(String workingMode) {
		String workingModeIs = ''
				
				switch (workingMode) {
				case "On Site":
					workingModeIs = '6'
					break;
				case "Work From Home":
					workingModeIs = '7'
					break;
				case "Both":
					workingModeIs = '8'
					break;
				default:
					workingModeIs = '6'
					break;
				}
		
		println workingModeIs
		return workingModeIs
	}
	
	/**
	 * Set Citizenship
	 */
	@Keyword (keywordObject = 'Set Citizenship')
	def setCitizenship(String citizenship) {
		String citizenshipIs = ''
				
				switch (citizenship) {
				case "Malaysian":
					citizenshipIs = 'citizenship1'
					break;
				case "Non-Malaysian":
					citizenshipIs = 'citizenship2'
					break;
				default:
					citizenshipIs = 'citizenship1'
					break;
				}
		
		println citizenshipIs
		return citizenshipIs
	}
	/**
	 * Set Visa Support
	 */
	@Keyword (keywordObject = 'Visa Support')
	def setVisaSupp(String visaSupport) {
		String visaSupportIs = ''
				
				switch (visaSupport) {
				case "Yes":
					visaSupportIs = 'visa1'
					break;
				case "No":
					visaSupportIs = 'visa2'
					break;
				default:
					visaSupportIs = 'visa2'
					break;
				}
		
		println visaSupportIs
		return visaSupportIs
	}
}