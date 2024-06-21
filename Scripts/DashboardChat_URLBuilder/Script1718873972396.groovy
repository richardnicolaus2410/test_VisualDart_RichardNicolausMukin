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

WebUI.navigateToUrl('https://sendbird-uikit-react.netlify.app/group_channel?appId=37C8DB25-8B44-435F-A528-5BA9B9965FD0&userId=richnico01&nickname=richnicolaus01&enableProfileEdit=true&enableMultipleFilesMessage=true&common_enableUsingDefaultUserProfile=true&groupChannel_enableOgtag=true&groupChannel_enableTypingIndicator=true&groupChannel_enableReactions=true&groupChannel_enableReactionsSupergroup=true&groupChannel_enableMention=true&groupChannel_replyType=none&groupChannel_threadReplySelectType=thread&groupChannel_enableVoiceMessage=true&groupChannel_input_camera_enablePhoto=true&groupChannel_input_camera_enableVideo=true&groupChannel_input_gallery_enablePhoto=true&groupChannel_input_gallery_enableVideo=true&groupChannel_input_enableDocument=true&groupChannel_typingIndicatorTypes=&groupChannel_enableFeedback=true&groupChannel_enableSuggestedReplies=true&groupChannel_showSuggestedRepliesFor=all_messages&groupChannel_enableMarkdownForUserMessage=true&groupChannelList_enableTypingIndicator=true&groupChannelList_enableMessageReceiptStatus=true&groupChannelSettings_enableMessageSearch=true')

WebUI.click(findTestObject('Object Repository/Page_Chat Testing App/Page_Testing App/svg'))

WebUI.click(findTestObject('Object Repository/Page_Chat Testing App/Page_Testing App/div_Group'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Chat Testing App/Page_Testing App/span_richnicolaus1_sendbird-checkbox--checkmark'))

WebUI.click(findTestObject('Object Repository/Page_Chat Testing App/Page_Testing App/button_Create'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Chat Testing App/Page_Testing App/svg_1'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Chat Testing App/Page_Testing App/svg_1'), 'Halo')

WebUI.delay (2)

WebUI.click(findTestObject('Object Repository/Page_Chat Testing App/Page_Testing App/svg_1_2'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Chat Testing App/Page_Testing App/svg_1_2_3'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Chat Testing App/Page_Testing App/div_halo_sendbird-thumbnail-message-item-bo_576f73'))

WebUI.delay(3)



WebUI.closeBrowser()

