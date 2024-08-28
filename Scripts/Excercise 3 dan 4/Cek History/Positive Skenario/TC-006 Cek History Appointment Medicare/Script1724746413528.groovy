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

'Precondition: User sudah melakukan login'
WebUI.callTestCase(findTestCase('Exercise 1 dan 2/Login/Positive Skenario/TC Login Positive'), [:], FailureHandling.STOP_ON_FAILURE)

'Precondition: User sudah membuat appointment dengan program medicare'
WebUI.callTestCase(findTestCase('Exercise 1 dan 2/Booking appointment/Positive Skenario/Create Appointment Medicare'), [:], 
    FailureHandling.STOP_ON_FAILURE)

'Memastikan button toggle menu muncul'
WebUI.verifyElementPresent(findTestObject('Page_Home/button_toggleMenu'), 0)

'Melakukan klik pada button toggle menu'
WebUI.click(findTestObject('Page_Home/button_toggleMenu'), FailureHandling.STOP_ON_FAILURE)

'Memastikan toggle menu home muncul'
WebUI.verifyElementPresent(findTestObject('Page_Home/button_toggleMenu_home'), 0)

'Memastikan toggle menu history muncul'
WebUI.verifyElementPresent(findTestObject('Page_Home/button_toggleMenu_history'), 0)

'Melakukan klik pada toggle menu history'
WebUI.click(findTestObject('Page_Home/button_toggleMenu_history'), FailureHandling.STOP_ON_FAILURE)

'Memastikan label history muncul'
WebUI.verifyElementPresent(findTestObject('Page_History/label_history'), 0)

'Memastikan go to homepage muncul'
WebUI.verifyElementPresent(findTestObject('Page_History/button_goToHomepage'), 0)

'Melakukan screenshot halaman history'
WebUI.takeScreenshot('screenshot/halamanHistory.png')

