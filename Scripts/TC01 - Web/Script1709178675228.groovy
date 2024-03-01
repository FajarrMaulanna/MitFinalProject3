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

def data = findTestData('Data Files/Data List')

def eMail = data.getObjectValue('email', 1)

def passWord = data.getObjectValue('password', 1)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://store.kontan.co.id/')

WebUI.click(findTestObject('Web Kontan Store/Page_Kontan Store/a_Masuk'))

WebUI.setText(findTestObject('Web Kontan Store/Page_Login - Kontan.co.id/input_Email_identity'), eMail)

WebUI.setText(findTestObject('Web Kontan Store/Page_Login - Kontan.co.id/input_Forgot_password'), passWord)

WebUI.click(findTestObject('Web Kontan Store/Page_Login - Kontan.co.id/button_Login'))

WebUI.click(findTestObject('Web Kontan Store/Page_Kontan Store/a_Best Seller'))

WebUI.verifyElementText(findTestObject('Web Kontan Store/Page_Best Seller/h1_Best Seller'), 'BEST SELLER')

WebUI.click(findTestObject('Web Kontan Store/Page_Best Seller/img_Langganan Business Insight_lozad'))

WebUI.click(findTestObject('Web Kontan Store/Page_KONTAN DIGITAL PREMIUM ACCESS/button_Beli'))

WebUI.click(findTestObject('Web Kontan Store/Page_KONTAN DIGITAL PREMIUM ACCESS/div_Konfirmasi Pembayaran_logo__img'))

def searchValue = data.getObjectValue('searchvalue', 1)

WebUI.setText(findTestObject('Web Kontan Store/Page_Kontan Store/input_Masuk_q'), searchValue)

WebUI.click(findTestObject('Web Kontan Store/Page_Kontan Store/input_Masuk_search__submit'))

WebUI.verifyElementPresent(findTestObject('Web Kontan Store/Page_Search tabloid/div_Hasil Pencarian tabloid'), 1)

WebUI.click(findTestObject('Web Kontan Store/Page_Search tabloid/img'))

WebUI.click(findTestObject('Web Kontan Store/Page_Personalized Inside Page Tabloid Reprint (27x42 CM)/button_Beli'))

WebUI.click(findTestObject('Web Kontan Store/Page_Personalized Inside Page Tabloid Reprint (27x42 CM)/span_Masuk_icon icon-cart'))

WebUI.verifyElementText(findTestObject('Web Kontan Store/Page_Cart/h3_Ringkasan Pembayaran'), 'RINGKASAN PEMBAYARAN')

WebUI.closeBrowser()

