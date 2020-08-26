# Mobile-Automation

This is the sample mobile test automation task in which below test scenario is included:<br />

Scenario: Sample test case for Mobile app Automation <br />
Open QA app in mobile emulator <br />
Enter user credentials for login <br />
Click on sign on button to login in the app <br />
Verify that house image is present in the app <br />

Above scenario is performed for two different users. The focus is only on the architecture not on the test cases. <br />

### Tool Used :- <br />
#### Selenium Cucumber With BDD <br />
<b>Advantage<b><br />
	
It is one the efficient tool for testing<br />
Quick and easy set up and execution<br />
Style of writing tests allow for easier reuse of code in the tests<br />
Feature file contains the scenarios which is written in Simple English language <br />
It allows automation of functional validation in easily readable and understandable format (like plain English) to Business Analysts, Developers, Testers, etc<br />

#### Appium <br />
<b>Advantage<b><br />

By using any kind of test frame work or language you can write and run the tests.<br />
Appium is an open source platform so you can contribute to it easily.<br />
Appium also supports automation test on the physical devices and also for simulator or emulator both.<br />
Appium does not have any dependency on mobile devices.<br />

# Getting Started 

Please follow below instruction to copy the project and running on your local machine for testing purpose

#### Prerequisites

Maven home: apache-maven-3.6.3

Android Studio 4.1

Java version: 1.8.0_231, vendor: Oracle Corporation

Appium Version: 1.18.1

### Android SDK should be downloaded first in the system and once it is downloaded , below properties should be added in bash_profile like below <br />
1. vim ~/.bash_profile <br />
2. add below properties <br />
export ANDROID_HOME=/Users/(userName)/Library/Android/sdk <br />
export PATH=$PATH:/Users/(userName)/Library/Android/sdk/build-tools <br />
export PATH=$PATH:/Users/(userName)/Library/Android/sdk/platform-tools <br />
export PATH=$PATH:/Users/(userName)/Library/Android/sdk/tools <br />
export JAVA_HOME=$(/usr/libexec/java_home) <br />
export PATH=${PATH}$JAVA_HOME/bin <br />

#### " (userName) " is the username of the system. Basically " /Users/<userName>/Library/Android/sdk " is the path of the SDK folder. you can place it at your desktop as well.

3. Open Android sdk and go to <br />
Tools > AVD Manager <br />
4. Download Nexus 6P API level 29 android OS 10.0
5. Apk file is already present inside Project folder so no need to make changes for apk path name in Config.properties <br />


This test was done on MAC but if you are running this code in windows then please update MachineName name in Config.properties like below : <br />
##### MachineName=Windows

# Running the tests

Given scenario is automated using selenium cucumber with BDD.
Gherkin language is used in cucumber for these scenario.

#### Below is the work flow of calling methods in this framework

Feature File >>>> Step Definition File >>>> Main File

For example: Feature file is created for Automation demo in which scenario is written in gherkin language.
This feature file calls step definition file through glue code.
Then step definition file calls main page file in which all methods are defined.

##### Sarita Dash <br />
##### 27thAug-2020
