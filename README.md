# OrangeHRM Login Page Automation Testing

This project contains a set of automated tests for the login page of the OrangeHRM website using Java and Selenium WebDriver.

## Prerequisites

Before you begin, ensure you have the following installed on your system:

- Java JDK (version 8 or later)
- Gradle
- An IDE like IntelliJ IDEA or Eclipse
- Mozilla Firefox (or another web browser)
- FirefoxWebDriver (or the WebDriver for your preferred browser)

## Setup Instructions

### 1. Clone the Repository

Clone this repository to your local machine using the following command:

```bash
git clone https://github.com/your-username/orangehrm-login-automation.git

2. Open the Project
Open the cloned project in your IDE.

3. Configure Dependencies
Ensure the pom.xml file includes the necessary dependencies for Selenium and TestNG (or JUnit). Here’s an example of a basic pom.xml:
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>orangehrm-login-automation</artifactId>
    <version>1.0-SNAPSHOT</version>
    <dependencies>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.1.2</version>
        </dependency>
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.4.0</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M5</version>
                <configuration>
                    <suiteXmlFiles>
                        <suiteXmlFile>testng.xml</suiteXmlFile>
                    </suiteXmlFiles>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>

4. Download WebDriver
Download the WebDriver for the browser you are using (e.g., ChromeDriver for Google Chrome) and place it in a directory of your choice. Make sure to update the path to the WebDriver in your test script.

Contributing
Contributions are welcome! Please fork the repository and create a pull request with your changes.

License
This project is licensed under the MIT License 
