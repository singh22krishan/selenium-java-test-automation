# Selenium Java Test Automation

[![Java UI Tests](https://github.com/singh22krishan/selenium-java-test-automation/actions/workflows/tests.yml/badge.svg)](https://github.com/singh22krishan/selenium-java-test-automation/actions/workflows/tests.yml)

A modern UI test automation portfolio project built with **Java, Selenium WebDriver, JUnit, Maven, and GitHub Actions**.

## Project Background

This repository is a clean portfolio version of my earlier Java/Selenium browser-automation practice. The original exercises covered browser launch and navigation, Selenium locators, form interactions, search flows, and Chrome/Firefox/Edge execution.

The portfolio version reorganizes those concepts into a maintainable test project with reusable setup, page objects, assertions, explicit waits, configurable browsers, headless execution, and CI. Stable Selenium test pages are used instead of third-party accounts or credential-based workflows.

## Tech Stack

- Java 17
- Selenium WebDriver 4
- JUnit Jupiter
- Maven
- Selenium Manager
- GitHub Actions

## What It Demonstrates

- Cross-browser WebDriver setup for Chrome, Firefox, and Edge
- Browser selection through a system property
- Headless execution for CI
- Page Object Model-style separation
- Explicit waits instead of fixed sleeps
- JUnit assertions and reusable setup/cleanup
- Form interaction and end-to-end UI validation
- Automated GitHub Actions execution

## Project Structure

```text
src/test/java/com/krishansingh/automation/
├── core/
│   ├── BaseUiTest.java
│   └── DriverFactory.java
├── pages/
│   └── WebFormPage.java
└── tests/
    ├── BrowserSmokeTest.java
    └── WebFormTest.java
```

## Run Locally

Prerequisites: Java 17+, Maven 3.9+, and a supported browser.

```bash
mvn test -Dbrowser=chrome
mvn test -Dbrowser=firefox
mvn test -Dbrowser=edge
mvn test -Dbrowser=chrome -Dheadless=true
```

Selenium Manager handles compatible browser drivers automatically, so no local driver executable paths are stored in this repository.

## CI

GitHub Actions runs the Maven test suite in headless Chrome on pushes and pull requests.

## Security and Privacy

This clean portfolio repository contains no personal email addresses, saved credentials, browser-driver paths, API keys, or third-party login information.

## Portfolio Note

Educational/portfolio project demonstrating Selenium and Java test-engineering fundamentals.
