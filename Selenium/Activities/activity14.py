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

    columns = driver.find_elements(By.XPATH, "//table[@id='sortableTable']/thead/tr/th")
    print("Number of columns: ", len(columns))

    rows = driver.find_elements(By.XPATH, "//table[@id='sortableTable']/tbody/tr")
    print("Number of rows: ", len(rows))


    second_row_second_cell_before_sort = driver.find_element(By.XPATH, "//table[@id='sortableTable']/tbody/tr[2]/td[2]")

    print("Cell value at second row and second column: ", second_row_second_cell_before_sort.text)


    driver.find_element(By.XPATH, "//table[@id='sortableTable']/thead/tr/th[1]").click()


    second_row_second_cell_after_sort = driver.find_element(By.XPATH, "//table[@id='sortableTable']/tbody/tr[2]/td[2]")

    print("Cell value at second row and second column: ", second_row_second_cell_after_sort.text)