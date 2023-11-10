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

WebUI.navigateToUrl('https://academy.katalon.com/courses/test-reusability/')

WebUI.verifyElementText(findTestObject('Object Repository/Handling alerts dialogue boxes and dropdown/Handling dialogue boxes/Page_Increasing Test Reusability for Better_946516/Home_Course_Path'), 
    'Courses')

WebUI.click(findTestObject('Object Repository/Handling alerts dialogue boxes and dropdown/Handling dialogue boxes/Page_Increasing Test Reusability for Better_946516/button_Enroll'))

WebUI.verifyElementText(findTestObject('Object Repository/Handling alerts dialogue boxes and dropdown/Handling dialogue boxes/Page_Increasing Test Reusability for Better_946516/p_Create a Katalon account'), 
    'Create a Katalon account')

WebUI.click(findTestObject('Object Repository/Handling alerts dialogue boxes and dropdown/Handling dialogue boxes/Page_Increasing Test Reusability for Better_946516/a_Log In'))

WebUI.verifyElementText(findTestObject('Object Repository/Handling alerts dialogue boxes and dropdown/Handling dialogue boxes/Page_Increasing Test Reusability for Better_946516/p_Log in to Katalon Academy'), 
    'Log in to Katalon Academy')

WebUI.setText(findTestObject('Object Repository/Handling alerts dialogue boxes and dropdown/Handling dialogue boxes/Page_Increasing Test Reusability for Better_946516/input_Sign up now_username'), 
    'c03151@g-able.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Handling alerts dialogue boxes and dropdown/Handling dialogue boxes/Page_Increasing Test Reusability for Better_946516/input_Sign up now_password'), 
    'SI0GGZob3zMh90awW9WaTA==')

WebUI.click(findTestObject('Object Repository/Handling alerts dialogue boxes and dropdown/Handling dialogue boxes/Page_Increasing Test Reusability for Better_946516/input_Katalon Certification Program_skillat_294bf0'))

WebUI.verifyElementText(findTestObject('Object Repository/Handling alerts dialogue boxes and dropdown/Handling dialogue boxes/Page_Increasing Test Reusability for Better_946516/a_Replay Course'), 
    'Replay Course')

