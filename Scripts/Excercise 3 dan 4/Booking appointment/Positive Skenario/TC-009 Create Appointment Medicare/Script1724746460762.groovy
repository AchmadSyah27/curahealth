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

WebUI.callTestCase(findTestCase('Exercise 1 dan 2/Login/Positive Skenario/TC Login Positive'), [:], FailureHandling.STOP_ON_FAILURE)

'Memastikan label pada halaman make appointment muncul'
WebUI.verifyElementPresent(findTestObject('Page_makeAppointment/label_makeAppointment'), 0)

'Memastikan dropdown facility muncul'
WebUI.verifyElementPresent(findTestObject('Page_makeAppointment/dropdown_facility'), 0)

'Melakukan input visit date'
WebUI.sendKeys(findTestObject('Page_makeAppointment/textbox_visitDate'), Keys.chord('01082024', Keys.ENTER))

'Melakukan input visit date'
WebUI.sendKeys(findTestObject('Page_makeAppointment/textbox_comment'), 'Make appointment Tokyo Cura')

'Melakukan klik pada button book appointment'
WebUI.click(findTestObject('Page_makeAppointment/button_appointment'), FailureHandling.STOP_ON_FAILURE)

'Memastikan label appointment confirmation muncul'
WebUI.verifyElementPresent(findTestObject('Page_makeAppointment/label_appointmentConfirmation'), 0)

'Memastikan button go to homepage muncul'
WebUI.verifyElementPresent(findTestObject('Page_makeAppointment/button_goToHomepage'), 0)

'Melakukan screenshot berhasil membuat appointment'
WebUI.takeScreenshot('screenshot/BerhasilMembuatAppointment.png')

