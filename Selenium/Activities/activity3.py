from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

service = FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:

    driver.get("https://v1.training-support.net/selenium/login-form")
    print("Page title is: ", driver.title)

    username = driver.find_element(By.XPATH, "//input[@id='username']")
    password = driver.find_element(By.XPATH, "//input[@id='password']")

    username.send_keys("admin")
    password.send_keys("password")

    login = driver.find_element(By.XPATH, "//button[@type='submit']")
    login.click()

    message = driver.find_element(By.XPATH, "//div[@id='action-confirmation']")
    print("Login message: ", message.text)