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

WebUI.navigateToUrl('https://www.airbnb.com/')

WebUI.click(findTestObject('Object Repository/Page_Vacation Homes  Condo Rentals - Airbnb/div_Anywhere'))

WebUI.click(findTestObject('Object Repository/Page_Vacation Homes  Condo Rentals - Airbnb/img_Europe_i1q1697z dir dir-ltr'))

WebUI.click(findTestObject('Object Repository/Page_Vacation Homes  Condo Rentals - Airbnb/div_9'))

WebUI.click(findTestObject('Object Repository/Page_Vacation Homes  Condo Rentals - Airbnb/div_7'))

WebUI.click(findTestObject('Object Repository/Page_Vacation Homes  Condo Rentals - Airbnb/div_WhoAdd guests'))

WebUI.click(findTestObject('Object Repository/Page_Vacation Homes  Condo Rentals - Airbnb/svg'))

WebUI.click(findTestObject('Object Repository/Page_Vacation Homes  Condo Rentals - Airbnb/span_Add guests_t1dqvypu dir dir-ltr'))

WebUI.closeBrowser()

