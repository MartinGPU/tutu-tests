# Auto tests for <code><img height="50" src="https://cdn3.tu-tu.ru/wp-content/uploads/2021/04/01_01.png"></code>

# Allure TestOps <code><img height="50" src="https://github.com/Vasili888-QA/Vasili888-QA/blob/master/images/logo/AllureTestOps.png"></code>
<a target="_blank" href="https://allure.autotests.cloud/project/1899/dashboards">allure.autotests.cloud/project/1899/dashboards</a>

<code><img height="400" src="https://user-images.githubusercontent.com/80305279/221429649-f84bc99d-d6c5-40df-b735-1bd0d1efbfc1.png"></code>

<code><img height="400" src="https://user-images.githubusercontent.com/80305279/221429788-90483082-4e1e-4ee5-87d0-1b9c0e1699f8.png"></code>

# Jenkins job <code><img height="50" src="https://user-images.githubusercontent.com/80305279/221430862-8421ed62-79eb-477f-be8f-c276f501925b.png"></code>
<a target="_blank" href="https://jenkins.autotests.cloud/job/C08-Marat-jenkins_allure-testops_13_tutu_test/">jenkins.autotests.cloud/job/C08-Marat-jenkins_allure-testops_13_tutu_test</a>

<code><img height="400" src="https://user-images.githubusercontent.com/80305279/221429999-86753823-8250-4dcd-aaec-aa822b42689d.png"></code>

# Selenoid video <code><img height="50" src="https://user-images.githubusercontent.com/80305279/221432799-cf28da9c-b438-4083-b9bb-26f04f54d5de.png"></code>
<code><img height="400" src="https://github.com/MartinGPU/tutu-tests/blob/secondary/src/test/resources/img/136a4e620704f68ebb7b1923d574977c%20(1).gif?raw=true"></code>

# Integration with Jira <code><img height="50" src="https://user-images.githubusercontent.com/80305279/221431422-c0ca55bf-b3a1-46fb-8ed8-4d71ecf294b2.png"></code>
<a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-544">jira.autotests.cloud/browse/HOMEWORK-544</a>

# Telegram notifications <code><img height="50" src="https://user-images.githubusercontent.com/80305279/221431072-3ea96458-4744-4948-b96d-5fc42bbb0aa2.png"></code>

<code><img height="400" src="https://user-images.githubusercontent.com/80305279/221431129-53fe2d24-b904-4bcc-ad7a-b765e4517bfa.png"></code>

# USAGE examples

### For run remote tests need fill remote.properties or to pass value:

* browser (default opera)
* browserVersion (default 23)
* browserSize (default 1366x768)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)


Run tests with filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Run tests with not filled remote.properties:
```bash
gradle clean test
```

Serve report:
```bash
allure serve build/allure-results
```




