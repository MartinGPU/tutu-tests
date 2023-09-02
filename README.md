# Auto tests for <code><img height="50" src="https://cdn3.tu-tu.ru/wp-content/uploads/2021/04/01_01.png"></code>

# Language & tools
<table>
<tbody>
<tr>
<td align="center"><src="https://www.jetbrains.com/idea/"><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/IntelliJ_IDEA_Icon.svg/1200px-IntelliJ_IDEA_Icon.svg.png" width="40" height="40"><br>IntelliJ IDEA</td>
<td align="center"><src="https://www.jetbrains.com/idea/"><img src="https://cdn-icons-png.flaticon.com/512/226/226777.png" width="40" height="40"><br>Java</td>
<td align="center"><src="https://www.jetbrains.com/idea/"><img src="https://static-00.iconduck.com/assets.00/gradle-icon-256x256-jq2wrvfo.png" width="40" height="40"><br>Gradle</td>
<td align="center"><src="https://www.jetbrains.com/idea/"><img src="https://junit.org/junit5/assets/img/junit5-logo.png" width="40" height="40"><br>JUnit5</td>
<td align="center"><src="https://www.jetbrains.com/idea/"><img src="https://media.trustradius.com/product-logos/M1/My/B8NQDTOWGI16.PNG" width="40" height="40"><br>Rest-Assured</td>
<td align="center"><src="https://www.jetbrains.com/idea/"><img src="https://github.com/MartinGPU/final-project/blob/main/resources/img/icons/And.jpg" width="60" height="40"><br>Android</td>
</tr>
<tr>
<td align="center"><src="https://www.jetbrains.com/idea/"><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Jenkins_logo.svg/1200px-Jenkins_logo.svg.png" width="40" height="40"><br>Jenkins</td>
<td align="center"><src="https://www.jetbrains.com/idea/"><img src="https://github.githubassets.com/images/modules/logos_page/GitHub-Mark.png" width="40" height="40"><br>Github</td>
<td align="center"><src="https://www.jetbrains.com/idea/"><img src="https://img.stackshare.io/service/40438/default_a9d9f8f8546d65b5f12a32106e6d03e6921e11fa.png" width="40" height="40"><br>Allure TestOps</td>
<td align="center"><src="https://www.jetbrains.com/idea/"><img src="https://logowik.com/content/uploads/images/jira2966.logowik.com.webp" width="40" height="40"><br>Jira</td>
<td align="center"><src="https://www.jetbrains.com/idea/"><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Telegram_logo.svg/2048px-Telegram_logo.svg.png" width="40" height="40"><br>Telegram Bot</td>
<td align="center"><src="https://www.jetbrains.com/idea/"><img src="https://github.com/MartinGPU/final-project/blob/main/resources/img/icons/appium.png" width="60" height="40"><br>Appium</td>
</tr>
</tbody>
</table>

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
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 global_run_tests
```

Run tests with not filled remote.properties:
```bash
gradle clean global_run_tests
```

Serve report:
```bash
allure serve build/allure-results
```




