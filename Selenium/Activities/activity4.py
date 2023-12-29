from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

service = FirefoxService(GeckoDriverManager().install())

with webdriver.Firefox(service=service) as driver:
    driver.get("https://v1.training-support.net/selenium/target-practice")

    print("Page title is: ", driver.title)

    third_heading = driver.find_element(By.XPATH, "//h3[@id='third-header']")
    print("Third heading text is: ", third_heading.text)

    fifth_heading = driver.find_element(By.XPATH, "//h5")
    print("Fifth heading colour is: ", fifth_heading.value_of_css_property("color"))

    violet_button = driver.find_element(By.CLASS_NAME, "violet")
    print("Violet button's classes are: ", violet_button.get_attribute("class"))

    grey_button = driver.find_element(By.CLASS_NAME, "grey")
    print("Text in grey button is: ", grey_button.text)