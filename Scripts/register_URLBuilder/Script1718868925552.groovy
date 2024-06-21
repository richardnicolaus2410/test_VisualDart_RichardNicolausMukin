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

WebUI.navigateToUrl('https://sendbird-uikit-react.netlify.app/url-builder')

WebUI.setText(findTestObject('Object Repository/Page_Testing App/input_appId_appId'), '37C8DB25-8B44-435F-A528-5BA9B9965FD0')

WebUI.setText(findTestObject('Object Repository/Page_Testing App/input_userId_userId'), 'richnico01')

WebUI.setText(findTestObject('Object Repository/Page_Testing App/input_nickname_nickname'), 'richnicolaus01')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_Enable_enableProfileEdit-enabled'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_enableProfileEdit_enableProfileEdit'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_Enable_enableMultipleFilesMessage-enabled'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_enableMultipleFilesMessage_enableMult_185100'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_Enable_common_enableUsingDefaultUserP_120c0a'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_common_enableUsingDefaultUserProfile__0c5541'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_Enable_groupChannel_enableOgtag-enabled'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_groupChannel_enableOgtag_groupChannel_6386a3'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_Enable_groupChannel_enableTypingIndic_92b9dd'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_groupChannel_enableTypingIndicator_gr_36022a'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_Enable_groupChannel_enableReactions-enabled'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_groupChannel_enableReactions_groupCha_0e1357'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/label_Enable'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_groupChannel_enableReactionsSupergrou_d8680c'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_Enable_groupChannel_enableMention-enabled'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_groupChannel_enableMention_groupChann_b0445a'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_Enable_groupChannel_replyType-enabled'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_Enable_groupChannel_threadReplySelect_97cf74'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_Enable_groupChannel_enableVoiceMessag_5d6052'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_groupChannel_enableVoiceMessage_group_5139f0'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_Enable_groupChannel_input_camera_enab_94cac6'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_groupChannel_input_camera_enablePhoto_ccd320'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_Enable_groupChannel_input_camera_enab_fbe4af'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_groupChannel_input_camera_enableVideo_23f2d2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_Enable_groupChannel_input_gallery_ena_312593'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_groupChannel_input_gallery_enablePhot_3e613b'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_Enable_groupChannel_input_gallery_ena_d39e3c'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/label_groupChannel_input_gallery_enableVideo'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_Enable_groupChannel_input_enableDocum_4a7f5c'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/label_groupChannel_input_enableDocument'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_Enable_groupChannel_typingIndicatorTy_dc793f'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_Enable_groupChannel_enableFeedback-enabled'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_groupChannel_enableFeedback_groupChan_e2db79'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_Enable_groupChannel_enableSuggestedRe_06cf33'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_groupChannel_enableSuggestedReplies_g_67fddf'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_Enable_groupChannel_showSuggestedRepl_57f9fe'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_Enable_groupChannel_enableMarkdownFor_1296a2'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_groupChannel_enableMarkdownForUserMes_a455a4'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_Enable_groupChannelList_enableTypingI_9a4e86'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_groupChannelList_enableTypingIndicato_defe84'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_Enable_groupChannelList_enableMessage_10a4dd'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_groupChannelList_enableMessageReceipt_508928'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_Enable_groupChannelSettings_enableMes_c6099d'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/input_groupChannelSettings_enableMessageSea_257b9f'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Testing App/button_Copy'))

