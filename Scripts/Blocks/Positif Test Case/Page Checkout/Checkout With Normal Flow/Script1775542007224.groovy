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

WebUI.click(findTestObject('View Product/bttn_viewbucket'))

WebUI.click(findTestObject('Checkout/bttn_process_checkout'))

WebUI.setText(findTestObject('Checkout/textfield_billing_first_name'), 'Timot')

WebUI.setText(findTestObject('Checkout/textfield__billing_last_name'), 'Kurniawan')

WebUI.setText(findTestObject('Checkout/textfield_billing_first_name'), 'Timot')

WebUI.setText(findTestObject('Checkout/textfield_Company Name_billing_company'), 'PT ABC')

WebUI.setText(findTestObject('Checkout/textfield_billing_phone'), '081234567890')

WebUI.click(findTestObject('Checkout/span_country'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Checkout/textfield_input_country'), 'Indonesia', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Checkout/div_result_country'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Checkout/textfield_billing_address'), 'Perum Royal')

WebUI.setText(findTestObject('Checkout/textfield_billing_city'), 'Town 1')

WebUI.click(findTestObject('Checkout/span_province'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Checkout/textfield_input_province'), 'DKI Jakarta')

WebUI.click(findTestObject('Checkout/div_province'))

WebUI.setText(findTestObject('Checkout/textfield_billing_postcode'), '12345')

WebUI.click(findTestObject('Checkout/radio_bttn_payment_method'))

WebUI.click(findTestObject('Checkout/bttn_checkout'))

WebUI.verifyElementText(findTestObject('Checkout/p_order_received'), 'Thank you. Your order has been received.')

