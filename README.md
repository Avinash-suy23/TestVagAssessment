# TestVagAssessment
Project Name - TestVagAssessment
Folders      - 1. src/main/java - it consist 1)Baseclass in libraries package 2)**ImdbWebpage** and **wikiWebpage** in the Page folder(Where Web element initiated using pagefactory).
               2. src/test/java - This folder contains main test case named as **CompareDatenCountryForPushpa** in package **testvagrant.Web_automation**
Aim          - To compare Date of release and country of origin for The movie Pushpa in IMDB and WIKI, where if date of release or country of origin not matches test case should fail.
Execution Process:
1. To initialise driver and launching URL in testcase CompareDatenCountryForPushpa, Baseclass is inherited.
2. Two tests are there in testcase 1. **releaseDatePushpa** 2.**originCountryOfPushpa**
3. In this test case **releaseDatePushpa** release dates are not matching so test fails due to assertionErrorException and in test case **originCountryOfPushpa** Country of origin matches so test case passes.
4. To see reult you have to run **CompareDatenCountryForPushpa** as TestNG suite.
