from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.support.select import Select
from selenium.webdriver.support.wait import WebDriverWait
from webdriver_manager.firefox import GeckoDriverManager

# Set up the Firefox Driver with WebDriverManger
service1 = FirefoxService(GeckoDriverManager().install())


# Start the Driver
with webdriver.Firefox(service=service1) as driver:

    wait = WebDriverWait(driver, 10)
    # Open the browser to the URL
    driver.get("https://alchemy.hguy.co/jobs")
    title = driver.title

    print("Page title is : ", driver.title)

    driver.find_element(By.XPATH, "//a[text()='Post a Job']").click()

    driver.find_element(By.XPATH, "//input[@id='create_account_email']").send_keys("raj@gmail.com")

    driver.find_element(By.XPATH, "//input[@id='job_title']").send_keys("Test specialist")

    driver.find_element(By.XPATH, "//input[@id='job_location']").send_keys("UK")

    jobType = driver.find_element(By.ID, "job_type")
    dropdown = Select(jobType)

    #wait.until()

    dropdown.select_by_value("Full Time")

    driver.find_element(By.XPATH, "//iframe[@id='job_description_ifr']").send_keys("Automating the app")

    driver.find_element(By.XPATH, "//input[@id='application']").send_keys("raj@gmail.com")

    driver.find_element(By.XPATH, "//input[@id='company_name']").send_keys("Google")

    driver.find_element(By.XPATH, "//input[@name='submit_job']").click()

    driver.find_element(By.XPATH, "//input[@id='job_preview_submit_button']").click()

    driver.find_element(By.XPATH, "//a[text()='click here']").click()
    job = driver.find_element(By.XPATH, "//h1[contains(@class, 'entry-title')]")
    jobTitle = job.text

    assert jobTitle == "Test specialist"


