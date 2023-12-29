from selenium import webdriver
from selenium.webdriver import ActionChains, Keys
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait
from webdriver_manager.firefox import GeckoDriverManager


service = FirefoxService(GeckoDriverManager().install())


with webdriver.Firefox(service=service) as driver:

    driver.get("https://v1.training-support.net/selenium/dynamic-controls")

    print("Page title is: ", driver.title)

    checkbox = driver.find_element(By.CSS_SELECTOR, "input.willDisappear")

    checkbox.click()

    print("Checkbox is selected: ", checkbox.is_selected())

    checkbox.click()

    print("Checkbox is selected: ", checkbox.is_selected())