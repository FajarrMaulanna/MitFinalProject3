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

Mobile.startApplication('ecommerce.apk', false)

Mobile.tap(findTestObject('Demo Ecommerce/android.widget.Button - LOGIN front'), 0)

Mobile.setText(findTestObject('Demo Ecommerce/android.widget.EditTextEmail'), eMail, 0)

Mobile.setText(findTestObject('Demo Ecommerce/android.widget.EditTextPassword'), passWord, 0)

Mobile.tap(findTestObject('Demo Ecommerce/android.widget.Button -  LOGIN'), 0)

Mobile.verifyElementVisible(findTestObject('Demo Ecommerce/android.view.ViewHeader'), 1)

Mobile.tap(findTestObject('Demo Ecommerce/android.widget.TextView - product'), 0)

Mobile.tap(findTestObject('Demo Ecommerce/android.widget.Button - ADDproduct'), 0)

def searchValue = data.getObjectValue('searchvalue', 2)

Mobile.setText(findTestObject('Demo Ecommerce/android.widget.EditTextSearch'), searchValue, 0)

Mobile.tap(findTestObject('Demo Ecommerce/android.widget.Button -Search'), 0)

Mobile.tap(findTestObject('Demo Ecommerce/android.widget.Button - ADDapple'), 0)

Mobile.tap(findTestObject('Demo Ecommerce/android.widget.Button -Cart'), 0)

Mobile.verifyElementVisible(findTestObject('Demo Ecommerce/android.view.View - Sub-Total'), 1)

Mobile.closeApplication()

