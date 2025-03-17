********************************
What's this all about ?
************************************
-This is a simple demo project for QAs who are keen to learn test automation skills.
-This is a simple Test Automation project, developed using Java+Cucumber+Maven
-In addition, below I have added ...lessons learned section, explaining the issues which one might encounter
and possible solutions to prevent/solve/fix those issues!


What does it test?
-It will launch a browser,
-will navigate to a website
-and will check if a certain text exists or not(i.e in this case "ORANGE CRM")
-If exists, it will "Pass" the test else it will "Fail" the test

-Cucumber Feature File
  For this project, I have ONLY added one feature file


Scenario:
    Given I Launch the browser
    When  I provide the URL for Home page of orangecrm.com
    Then  Home page is loaded and checks if the text 'Orange CRM' exists or not
    And   Close browser

    And it was implemented in the "newUserRegistrationsteps" class inside stepDefinitions folder

-To run this test, simply right click on the feature file
-And click on Run Feature:... button

-Wait for the magic to happen!!You should see the test results on the panel below(If you are using IntelliJ and if not, you should!)





***********************************************************
How to execute the tests ?
*********************************************************
-Launch IntelliJ
-Select Clone the repo
-Copy and paste the https link of the repo
-Create a directory with exact name as remote..(i.e, Cucumber-selenium-java_project1)
-Click ok to download the repo completely.
-Once done,click on Build
-Click on Build Project

Once done, open the Feature file
Click on Run button next to Feature: key word or Scenario key word

All 4 steps of the Scenario should  pass!



************************************************************************************************
How to create a repo and push your project into GitHub(Assuming this is your first ever project!)
*************************************************************************************************

Create a working project in your computer-All ready to push to repo

-Then download Git for Windows
-Install Git in your PC
-Open your github account by opening a browser
-Create a new repository by giving a name(note:it's empty, but it's fine)
-Back on your pc , in command prompt CD into your project folder

Go back to Github page and only copy the below lines of instructions
-git init
-git add README.md
(you might have to press enter once to execute all of the above commands)

Now make sure you give below 2 commands
-git config --global user.email "xxxxx@xxxxx.com"
-git config --global user.name "xxx22"


Then go back to the repo again
-Copy the rest of the 4 lines of code(Note:They are as per below)
-git commit -m "first commit"
-git branch -M main
-git remote add origin https://github.com/xxxx/Cucumber-Java.git
-git push -u origin main

-This might prompt you to login in to your personal account and authorise the request
-Once done you will see "Read me" file  has been added to the repo

--Now if you want to add further files you can give the below command with correct path names.
git add src\test\java\Features\Registration.feature

-git config --global user.email "YOURemail@y...com"
-git config --global user.name "XXXX"


*************************************************************
Some of the errors & lessons learned
*************************************************************

-When Creating the Feature file don't leave a space between the word Feature and : It  will throw an error
-Make sure to link   the feature file.(i.e, to -Set Glue  value  to point to step definition file(i.e,checktext))
-Also Feature or Folder path is set as per below(Full path as per below)
-You can do this by highlighting the feature file and then clicking on "Edit Config..." option under "Run" option
'.........'/src/test/java/Features/Registration.feature
 Also, when running the test, if you see the below warning message, just ignore it..It's because it's nothing to do with your test.
 It's because, the Selenium version may not be compatible with your Chromedriver version.Future Selenium upgrades might resolve this issue in future.

-Mar 15, 2025 8:52:50 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
 WARNING: Unable to find an exact match for CDP version 134, returning the closest version; found: 133; Please update to a Selenium version that supports CDP