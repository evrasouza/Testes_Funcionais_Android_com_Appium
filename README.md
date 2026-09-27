# 📱 Android Functional Testing with Appium

Study project focused on **functional test automation for Android applications using Appium and Java**.

The repository demonstrates the basic setup and execution of automated mobile tests, including Android emulator configuration, Appium server setup, and test execution against an Android application.

> ⚠️ **Project Status**
>
> This is an older study project and uses tooling/configuration from the period when it was created.
>
> The repository is maintained as part of my QA automation portfolio to demonstrate my experience and studies with **mobile test automation using Appium**.

## 🛠 Tech Stack

- Java
- Appium
- Android
- UIAutomator2
- Maven
- Android Studio
- Eclipse

## 🎯 Project Purpose

The main objective of this project was to explore automated functional testing for Android applications.

The project covers concepts such as:

- Android emulator configuration
- Mobile UI automation
- Appium server configuration
- Desired Capabilities
- UIAutomator2 automation
- Interaction with Android applications
- Java-based automated tests

## 📁 Project Structure

```text
Testes_Funcionais_Android_com_Appium/
├── src/               # Test source code
├── pom.xml            # Maven dependencies
├── .classpath         # Eclipse configuration
├── .project           # Eclipse project configuration
└── README.md
```

## ⚙️ Environment Setup

To execute the project, the environment originally required:

- Java JDK
- Android Studio
- Android SDK
- Android Virtual Device (AVD)
- Appium Server
- Maven-compatible Java IDE

### Java

Install the JDK and configure the Java environment variables.

### Android SDK

Install Android Studio and configure the Android SDK.

Example environment variable:

```bash
ANDROID_HOME=/path/to/android/sdk
```

The Android SDK tools must also be available in the system `PATH`.

Common directories used by the project setup included:

```text
platform-tools
tools
tools/bin
```

> Note: Modern Android SDK installations may use a different directory structure.

## 📱 Android Emulator

Create an Android Virtual Device (AVD) using Android Studio.

The emulator should be running before starting the automated tests.

## 🚀 Appium Configuration

Start the Appium server before executing the tests.

The original project used capabilities similar to:

```text
platformName: Android
deviceName: <device-name>
automationName: UiAutomator2
```

These capabilities define the Android platform, target device, and automation engine used by Appium.

## 🧪 Mobile Test Automation

The tests interact with Android UI elements through Appium, allowing scenarios such as:

- Opening the application
- Interacting with buttons and input fields
- Navigating through application screens
- Validating UI behavior
- Executing functional mobile test scenarios

## 📚 Learning Context

This repository was created as part of my studies in mobile test automation.

Its purpose was to understand the fundamentals of:

- Appium architecture
- Android test automation
- Device and emulator configuration
- UIAutomator2
- Mobile functional testing

## 📌 Project Status

This project is kept as a **study and reference repository**.

The tooling and setup may no longer reflect the latest Appium and Android ecosystem, but the repository represents part of my learning path in **mobile QA automation**.
