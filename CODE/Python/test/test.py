from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.action_chains import ActionChains

import time

while 1:
    time.sleep(0.1)
    driver = webdriver.Chrome()
    url = 'http://cafe.daum.net/breakjob/YRx/2526'
    driver.get(url)
    action = ActionChains(driver)
    driver.close()
    time.sleep(0.1)
    driver = webdriver.Chrome()
    url = 'http://cafe.daum.net/breakjob/8paQ/24'
    driver.get(url)
    action = ActionChains(driver)
    driver.close()
    time.sleep(0.1)
    driver = webdriver.Chrome()
    url = 'http://cafe.daum.net/breakjob/8SdF/1749'
    driver.get(url)
    action = ActionChains(driver)
    driver.close()
    time.sleep(0.1)
    driver = webdriver.Chrome()
    url = 'http://cafe.daum.net/breakjob/8SdF/1747'
    driver.get(url)
    action = ActionChains(driver)
    driver.close()

