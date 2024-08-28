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
import com.kms.katalon.core.configuration.RunConfiguration

'Membuka browser'
WebUI.openBrowser('')

'\'Melakukan maximize browser\''
WebUI.maximizeWindow()

'Membuka browser dengan navigate url yang ditentukan'
WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

'Memastikan label cura health service muncul'
WebUI.verifyElementPresent(findTestObject('Page_Home/label_curaHealtService'), 0)

'Memastikan button make appointment muncul'
WebUI.verifyElementPresent(findTestObject('Page_Home/button_MakeAppointment'), 0)

'Melakukan klik button make appointment'
WebUI.click(findTestObject('Page_Home/button_MakeAppointment'), FailureHandling.STOP_ON_FAILURE)

'Memastikan label login muncul'
WebUI.verifyElementPresent(findTestObject('Page_Login/label_login'), 0)

'Memastikan textbox username muncul'
WebUI.verifyElementPresent(findTestObject('Page_Login/textbox_username'), 0)

'Memastikan textbox password muncul'
WebUI.verifyElementPresent(findTestObject('Page_Login/textbox_password'), 0)

'Memastikan button login muncul'
WebUI.verifyElementPresent(findTestObject('Page_Login/button_login'), 0)

'Melakukan input pada textbox username'
WebUI.sendKeys(findTestObject('Page_Login/textbox_username'), 'John Doe')

'Melakukan input pada textbox password'
WebUI.sendKeys(findTestObject('Page_Login/textbox_password'), 'ThisIsNotAPassword')

'Melakukan klik pada button login'
WebUI.click(findTestObject('Page_Login/button_login'), FailureHandling.STOP_ON_FAILURE)

'Memastikan label make appointment muncul'
WebUI.verifyElementPresent(findTestObject('Page_makeAppointment/label_makeAppointment'), 0)

'Memastikan dropdown facility muncul'
WebUI.verifyElementPresent(findTestObject('Page_makeAppointment/dropdown_facility'), 0)

'Melakukan screenshot berhasil login'
WebUI.takeScreenshot('screenshot/loginBerhasil.png')

