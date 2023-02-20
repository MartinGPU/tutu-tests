<h1>Auto tests for tutu.ru</h1>

# Project in Allure TestOps with manual & automated tests
<a target="_blank" href="https://allure.autotests.cloud/project/1899/dashboards">allure.autotests.cloud/project/1899/dashboards</a>

# Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/C08-Marat-jenkins_allure-testops_13_tutu_test/">jenkins.autotests.cloud/job/C08-Marat-jenkins_allure-testops_13_tutu_test</a>

# Integration with Jira
<a target="_blank" href="https://jira.autotests.cloud/browse/HOMEWORK-544">jira.autotests.cloud/browse/HOMEWORK-544</a>

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
gradle clean test
```

Run tests with not filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Serve report:
```bash
allure serve build/allure-results
```



