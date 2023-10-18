## WebShop Automation Selenium TestNG

# Content
- [Introduction](https://github.com/SHANJIDA-HRIDE/WebShop_Automation_Selenium_TestNG.git#introduction)
- [Technologies used in this project](https://github.com/SHANJIDA-HRIDE/WebShop_Automation_Selenium_TestNG.git#technologies-used-in-this-project)
- [Install](https://github.com/SHANJIDA-HRIDE/WebShop_Automation_Selenium_TestNG.git#install)
- [To Run This Project](https://github.com/SHANJIDA-HRIDE/WebShop_Automation_Selenium_TestNG.git#to-run-this-project)

# Introduction
-This project provides automation scripts to demonstrate how to automate interactions with the Demowebshop using Selenium WebDriver, a popular browser automation framework.

# Technologies used in this project
- Java Development Kit (JDK): [JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
- Selenium WebDriver for Java: [Selenium WebDriver](https://www.selenium.dev/downloads/)
- Aquality Selenium: [Aquality Selenium 4.0.0](https://github.com/aquality-automation/aquality-selenium-java)
- TestNG: [TestNG 7.8.1](https://mvnrepository.com/artifact/org.testng/testng)

# Install
**Java**  
https://www.oracle.com/java/technologies/downloads/

**Maven**

 https://maven.apache.org/download.cgi
 
 Click =>Binaries    
 =>**apache-maven-3.9.4-bin.zip**


# To Run This Project
**Prerequisites**
- Java 8 and above are supported.
- Maven 3 and above are supported.
- Install the above programs (Java, Maven)
- If the above link working then go to **Running Procedures**

  **Running Procedures**
  - Clone this repository.
  - Install all the dependencies from the POM file
  - Config src/main/resources/config.json this file
  - Build this project as a maven project.
  - Run src/test/java/tests/TestOfLogin.java this file.
  - You can see logs in the terminal.
 ## Scenario:
 - Registration of new users in the system
- Login to Web Shop demo site: https://demowebshop.tricentis.com/
- Now go to PIM dashboard and search by 1st user name. Assert that the user is found.
- Now click on the user from the search table and update id by random userid
- Now again search the user by new user id from the PIM dashboard menu and assert that the user is found
- Now logout from admin and login with the 2nd user from your JSON list
- Now click on My Info menu
- Select Gender and Blood Type and save it
- Click on contact details and input address and email
- Logout the user


https://github.com/SHANJIDA-HRIDE/WebShop_Automation_Selenium_TestNG/assets/62147630/53023e23-cf62-421f-889c-b9b25f458632

https://github.com/SHANJIDA-HRIDE/WebShop_Automation_Selenium_TestNG/assets/62147630/84548a47-ce88-49e3-a0b5-feadd7951437

https://github.com/SHANJIDA-HRIDE/WebShop_Automation_Selenium_TestNG/assets/62147630/8bd98841-33a2-423d-b925-2261e25b6367









