
from selenium import webdriver
from selenium.webdriver import ActionChains, Keys
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait
from webdriver_manager.firefox import GeckoDriverManager


service = FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:

    wait = WebDriverWait(driver, 10)

    driver.get("https://v1.training-support.net/selenium/dynamic-controls")

    print("Page title is: ", driver.title)

    checkbox = driver.find_element(By.ID, "dynamicCheckbox")

    checkbox_toggle = driver.find_element(By.ID, "toggleCheckbox")

    print("Checkbox is visible: ", checkbox.is_displayed())

    checkbox_toggle.click()
    # Wait till the checkbox diappears
    wait.until(expected_conditions.invisibility_of_element(checkbox))
    # Verify again if the checkbox is displayed or not
    print("Checkbox is visible: ", checkbox.is_displayed())