# Set up the Firefox Driver with WebDriverManger
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.wait import WebDriverWait
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.firefox.service import Service as FirefoxService

service1 = FirefoxService(GeckoDriverManager().install())


# Start the Driver
with webdriver.Firefox(service=service1) as driver:

    driver.get("https://alchemy.hguy.co/jobs/wp-admin")

    driver.find_element(By.XPATH, "//input[@id='user_login']").send_keys("root")

    driver.find_element(By.XPATH, "//input[@id='user_pass']").send_keys("pa$$w0rd")

    driver.find_element(By.XPATH, "//input[@id='wp-submit']").click()

    pageTitle = driver.title

    print("Title of the page: ", pageTitle)

    assert pageTitle == "Dashboard ‹ Alchemy Jobs — WordPress"

    driver.find_element(By.XPATH, "//div[text()='Job Listings ']").click()

    driver.find_element(By.XPATH, "//a[contains(@class, 'page-title-action')]").click()

    driver.find_element(By.XPATH, "//button[text()='Next']").click()
    driver.find_element(By.XPATH, "//button[text()='Next']").click()
    driver.find_element(By.XPATH, "//button[text()='Next']").click()

    driver.find_element(By.XPATH, "//button[contains(@class, 'components-button components-guide__finish-button is-primary')]").click()

    driver.find_element(By.XPATH, "//textarea[@id='post-title-0']").send_keys("Testor")

    wait = WebDriverWait(driver, 10)



    driver.find_element(By.XPATH, "//div[@id='toolbar-1a0567ea-1c28-4311-8a59-009e7b9b62ac']").click()

    driver.find_element(By.XPATH, "//div[starts-with(@id, 'editor-')]").send_keys("QA")

    driver.find_element(By.XPATH, "//input[@id='_job_location']").send_keys("Flipkart")

    driver.find_element(By.XPATH, "//button[text()='Publish…']").click()

    driver.find_element(By.XPATH, "//button[text()='Publish']").click()

    driver.find_element(By.XPATH, "//a[contains(@class, 'components-button is-secondary')]").click()

    Title = driver.find_element(By.XPATH, "//h1[contains(@class, 'entry-title')]")

    print("Entry title: ", Title.text)

    entryTitle = Title.text

    assert entryTitle == "Testor"

