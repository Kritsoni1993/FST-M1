from selenium import webdriver
from selenium.webdriver import ActionChains, Keys
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.remote.webelement import WebElement
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.select import Select
from selenium.webdriver.support.wait import WebDriverWait
from webdriver_manager.firefox import GeckoDriverManager


service = FirefoxService(GeckoDriverManager().install())


with webdriver.Firefox(service=service) as driver:

    wait = WebDriverWait(driver, 10)

    driver.get("https://v1.training-support.net/selenium/popups")

    print("Page title is: ", driver.title)

    signin_button = driver.find_element(By.CLASS_NAME, "orange")

    ActionChains(driver).move_to_element(signin_button).perform()

    tooltip_text = signin_button.get_attribute("data-tooltip")
    print("Button tooltip text: ", tooltip_text)

    signin_button.click()

    username = driver.find_element(By.ID, "username")
    password = driver.find_element(By.ID, "password")

    username.send_keys("admin")
    password.send_keys("password")

    driver.find_element(By.XPATH, "/html/body/div[4]/div/div[2]/div/div/button").click()

    message = driver.find_element(By.ID, "action-confirmation")
    print("Confirmation message: ", message.text)