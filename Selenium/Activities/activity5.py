from selenium import webdriver
from selenium.webdriver import ActionChains
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager


service = FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:
    actions = ActionChains(driver)

    driver.get("https://v1.training-support.net/selenium/input-events")

    print("Page title is: ", driver.title)

    actions.click().perform()
    active_side = driver.find_element(By.CLASS_NAME, "active")
    print("Active side number after left click: ", active_side.text)

    actions.double_click().perform()
    active_side = driver.find_element(By.CLASS_NAME, "active")
    print("Active side number after double click: ", active_side.text)

    actions.context_click().perform()
    active_side = driver.find_element(By.CLASS_NAME, "active")
    print("Active side number after right click: ", active_side.text)