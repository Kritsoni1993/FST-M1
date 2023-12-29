from selenium import webdriver
from selenium.webdriver import ActionChains, Keys
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.support import expected_conditions
from selenium.webdriver.support.wait import WebDriverWait
from webdriver_manager.firefox import GeckoDriverManager


service = FirefoxService(GeckoDriverManager().install())


with webdriver.Firefox(service=service) as driver:

    driver.get("https://v1.training-support.net/selenium/tables")

    print("Page title is: ", driver.title)


    columns = driver.find_elements(By.XPATH, "//table[contains(@class, 'striped')]/tbody/tr[1]/td")
    print("Number of columns: ", len(columns))

    rows = driver.find_elements(By.XPATH, "//table[contains(@class, 'striped')]/tbody/tr")
    print("Number of rows: ", len(rows))


    third_row = driver.find_elements(By.XPATH, "//table[contains(@class, 'striped')]/tbody/tr[3]/td")

    print("Cell values of third row:")
    for row in third_row:
        print("Cell value: ", row.text)

    second_row_second_cell = driver.find_element(By.XPATH, "//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]")

    print("Cell value at second row and second column: ", second_row_second_cell.text)