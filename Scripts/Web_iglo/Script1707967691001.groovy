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

WebUI.navigateToUrl('https://www.indocyber.co.id/')

WebUI.click(findTestObject('Object Repository/Web_iglo/Page_Home  Indocyber/a_About Us'))

WebUI.click(findTestObject('Object Repository/Web_iglo/Page_About Us  Indocyber/a_Bootcamp'))

WebUI.click(findTestObject('Object Repository/Web_iglo/Page_Join Bootcamp at Indocyber  Indocyber/button_Apply Now'))

WebUI.setText(findTestObject('Object Repository/Web_iglo/Page_Join Bootcamp at Indocyber  Indocyber/input_name'), 'hardy')

WebUI.setText(findTestObject('Object Repository/Web_iglo/Page_Join Bootcamp at Indocyber  Indocyber/input_email'), 'suhardi@indocyber.id')

WebUI.setText(findTestObject('Object Repository/Web_iglo/Page_Join Bootcamp at Indocyber  Indocyber/input_handphone'), '08128182812818212')

WebUI.closeBrowser()

