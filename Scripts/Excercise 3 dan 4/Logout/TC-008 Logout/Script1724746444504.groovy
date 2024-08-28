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

'Precondition: User berhasil login'
WebUI.callTestCase(findTestCase('Excercise 3 dan 4/Login/Positive Skenario/TC-001 Login Positive'), [('username') : 'John Doe'
        , ('password') : 'ThisIsNotAPassword'], FailureHandling.STOP_ON_FAILURE)

'Memastikan button toggle menu muncul'
WebUI.verifyElementPresent(findTestObject('Page_Home/button_toggleMenu'), 0)

'Melakukan klik pada button toggle menu'
WebUI.click(findTestObject('Page_Home/button_toggleMenu'), FailureHandling.STOP_ON_FAILURE)

'Memastikan toggle menu home muncul'
WebUI.verifyElementPresent(findTestObject('Page_Home/button_toggleMenu_home'), 0)

'Memastikan toggle menu logout muncul'
WebUI.verifyElementPresent(findTestObject('Page_Home/button_toggleMenu_logout'), 0)

'Melakukan klik pada toggle menu logout'
WebUI.click(findTestObject('Page_Home/button_toggleMenu_logout'), FailureHandling.STOP_ON_FAILURE)

'Memastikan label cura health service muncul'
WebUI.verifyElementPresent(findTestObject('Page_Home/label_curaHealtService'), 0)

'Memastikan button make appointment muncul'
WebUI.verifyElementPresent(findTestObject('Page_Home/button_MakeAppointment'), 0)

'Memastikan label login tidak muncul'
WebUI.verifyElementNotPresent(findTestObject('Page_Login/label_login'), 0)

'Melakukan screenshot user berhasil logout dengan kembali ke halaman home'
WebUI.takeScreenshot('screenshot/userBerhasilLogout.png')

'Menutup browser'
WebUI.closeBrowser()

