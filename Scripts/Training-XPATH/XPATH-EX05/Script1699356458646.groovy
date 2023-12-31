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

WebUI.navigateToUrl(url_EX05)

WebUI.setText(findTestObject('Training-XPATH/EX05/username'), 'testuser')

WebUI.setText(findTestObject('Training-XPATH/EX05/password'), 'testpass')

WebUI.setText(findTestObject('Training-XPATH/EX05/nickname'), 'testnickname')

WebUI.click(findTestObject('Training-XPATH/EX05/Dropdown'))

WebUI.click(findTestObject('Training-XPATH/EX05/Dropdown_Select_Doppio'))

WebUI.click(findTestObject('Training-XPATH/EX05/checkbox-Iamfine'))

WebUI.click(findTestObject('Training-XPATH/EX05/finish-button'))

alertText = WebUI.getAlertText()

println('alert = ' + alertText)

WebUI.verifyMatch(alertText, expect, false)

WebUI.closeBrowser()

