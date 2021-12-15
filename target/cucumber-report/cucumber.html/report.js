$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("computerPageTest.feature");
formatter.feature({
  "line": 1,
  "name": "Computers page test",
  "description": "As a user I should navigate to Computers page successfully",
  "id": "computers-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8255322100,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 7,
  "name": "Verify User Should Navigate To Computer Page Successfully",
  "description": "",
  "id": "computers-page-test;verify-user-should-navigate-to-computer-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Sanity"
    },
    {
      "line": 6,
      "name": "@Smoke"
    },
    {
      "line": 6,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I click on Computers tab",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should navigate to Computers page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageTestSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 185794100,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageTestSteps.iClickOnComputersTab()"
});
formatter.result({
  "duration": 1351614700,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageTestSteps.iShouldNavigateToComputersPageSuccessfully()"
});
formatter.result({
  "duration": 90114300,
  "status": "passed"
});
formatter.after({
  "duration": 121200,
  "status": "passed"
});
formatter.before({
  "duration": 4296909800,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 13,
  "name": "Verify user should navigate to Desktop page successfully",
  "description": "",
  "id": "computers-page-test;verify-user-should-navigate-to-desktop-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Smoke"
    },
    {
      "line": 12,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I click on Computers tab",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I should navigate to Computers page successfully",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on Desktop link",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I should navigate to Desktop page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageTestSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 55800,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageTestSteps.iClickOnComputersTab()"
});
formatter.result({
  "duration": 1663891800,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageTestSteps.iShouldNavigateToComputersPageSuccessfully()"
});
formatter.result({
  "duration": 86898800,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageTestSteps.iClickOnDesktopLink()"
});
formatter.result({
  "duration": 1301631800,
  "status": "passed"
});
formatter.match({
  "location": "ComputerPageTestSteps.iShouldNavigateToDesktopPageSuccessfully()"
});
formatter.result({
  "duration": 73134000,
  "status": "passed"
});
formatter.after({
  "duration": 58800,
  "status": "passed"
});
formatter.uri("loginPageTest.feature");
formatter.feature({
  "line": 1,
  "name": "Login page Test",
  "description": "User should be able to login successfully with valid credentials",
  "id": "login-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5198754300,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "user should navigate to login page successfully",
  "description": "",
  "id": "login-page-test;user-should-navigate-to-login-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Sanity"
    },
    {
      "line": 4,
      "name": "@Smoke"
    },
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User clicks on login link",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User should navigate to login page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageTestSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 45300,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTestSteps.userClicksOnLoginLink()"
});
formatter.result({
  "duration": 944906800,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTestSteps.userShouldNavigateToLoginPage()"
});
formatter.result({
  "duration": 92652000,
  "status": "passed"
});
formatter.after({
  "duration": 75500,
  "status": "passed"
});
formatter.before({
  "duration": 5027805600,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "verify the error message with invalid credentials",
  "description": "",
  "id": "login-page-test;verify-the-error-message-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Smoke"
    },
    {
      "line": 10,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User clicks on login link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User enters email",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enters password \"Bob1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User can see the error message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageTestSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 33900,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTestSteps.userClicksOnLoginLink()"
});
formatter.result({
  "duration": 1638328200,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTestSteps.userEntersEmail()"
});
formatter.result({
  "duration": 513954900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bob1234",
      "offset": 22
    }
  ],
  "location": "LoginPageTestSteps.userEntersPassword(String)"
});
formatter.result({
  "duration": 196988800,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTestSteps.userClicksOnLoginButton()"
});
formatter.result({
  "duration": 597605400,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTestSteps.userCanSeeTheErrorMessage()"
});
formatter.result({
  "duration": 80993000,
  "status": "passed"
});
formatter.after({
  "duration": 56200,
  "status": "passed"
});
formatter.before({
  "duration": 4956583500,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "User should login successfully with valid credentials",
  "description": "",
  "id": "login-page-test;user-should-login-successfully-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@Smoke"
    },
    {
      "line": 19,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User clicks on login link",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User enters email",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User enters password \"Bob123\"",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User can see the log out link is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageTestSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 47900,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTestSteps.userClicksOnLoginLink()"
});
formatter.result({
  "duration": 881657200,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTestSteps.userEntersEmail()"
});
formatter.result({
  "duration": 316527800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bob123",
      "offset": 22
    }
  ],
  "location": "LoginPageTestSteps.userEntersPassword(String)"
});
formatter.result({
  "duration": 191708400,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTestSteps.userClicksOnLoginButton()"
});
formatter.result({
  "duration": 1212839200,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageTestSteps.userCanSeeTheLogOutLinkIsDisplayed()"
});
formatter.result({
  "duration": 20055801500,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[normalize-space()\u003d\u0027Log out\u0027]\"}\n  (Session info: chrome\u003d96.0.4664.110)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.0.0\u0027, revision: \u00273a21814679\u0027\nSystem info: host: \u0027LAPTOP-OJIPPDE6\u0027, ip: \u0027192.168.50.90\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [e0f531f8c1b35722f2d222331f3c93d9, findElement {using\u003dxpath, value\u003d//a[normalize-space()\u003d\u0027Log out\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 96.0.4664.110, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: C:\\Users\\hiren\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:54147}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:54147/devtoo..., se:cdpVersion: 96.0.4664.110, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: e0f531f8c1b35722f2d222331f3c93d9\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:139)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:559)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:383)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:375)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy23.isDisplayed(Unknown Source)\r\n\tat com.nopcommerce.demo.utility.Utility.verifyThatElementIsDisplayed(Utility.java:286)\r\n\tat com.nopcommerce.demo.pages.HomePage.logoutLinkDisplayed(HomePage.java:87)\r\n\tat com.nopcommerce.demo.cucumber.steps.LoginPageTestSteps.userCanSeeTheLogOutLinkIsDisplayed(LoginPageTestSteps.java:48)\r\n\tat ✽.Then User can see the log out link is displayed(loginPageTest.feature:26)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1458412100,
  "status": "passed"
});
formatter.uri("registerPageTest.feature");
formatter.feature({
  "line": 1,
  "name": "Register Test",
  "description": "As a user I should register successfully",
  "id": "register-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4174119200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 6,
  "name": "Verify user should navigate to register page successfully",
  "description": "",
  "id": "register-test;verify-user-should-navigate-to-register-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Sanity"
    },
    {
      "line": 5,
      "name": "@Smoke"
    },
    {
      "line": 5,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I am on register page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageTestSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 44000,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageTestSteps.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 1603659800,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageTestSteps.iAmOnRegisterPage()"
});
formatter.result({
  "duration": 116669300,
  "status": "passed"
});
formatter.after({
  "duration": 36400,
  "status": "passed"
});
formatter.before({
  "duration": 5304718100,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "I am on homepage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "line": 12,
  "name": "verify That First Name Last Name Email Password And Confirm Password Fields Are Mandatory",
  "description": "",
  "id": "register-test;verify-that-first-name-last-name-email-password-and-confirm-password-fields-are-mandatory",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Smoke"
    },
    {
      "line": 11,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "User is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I click on register button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I get error message \u0027First name is required\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I get error message \u0027Last name is required\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I get error message \u0027Email is required\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I get error message \u0027Password is required\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I get error message \u0027Confirm Password is required\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I am not able to register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageTestSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 42600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageTestSteps.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 1980243300,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageTestSteps.iClickOnRegisterButton()"
});
formatter.result({
  "duration": 369777100,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageTestSteps.iGetErrorMessageFirstNameIsRequired()"
});
formatter.result({
  "duration": 123937200,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageTestSteps.iGetErrorMessageLastNameIsRequired()"
});
formatter.result({
  "duration": 92784100,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageTestSteps.iGetErrorMessageEmailIsRequired()"
});
formatter.result({
  "duration": 102737600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageTestSteps.iGetErrorMessagePasswordIsRequired()"
});
formatter.result({
  "duration": 70571700,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageTestSteps.iGetErrorMessageConfirmPasswordIsRequired()"
});
formatter.result({
  "duration": 90201400,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageTestSteps.iAmNotAbleToRegisterSuccessfully()"
});
formatter.result({
  "duration": 39800,
  "status": "passed"
});
formatter.after({
  "duration": 77800,
  "status": "passed"
});
});