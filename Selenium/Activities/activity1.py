from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

service = FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:
    driver.get("https://v1.training-support.net/")

    print("Page title is: ", driver.title)

    driver.find_element(By.ID, "about-link").click()

    print("New page title is: ", driver.title)