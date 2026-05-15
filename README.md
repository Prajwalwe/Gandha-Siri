# Gandha-Siri (ಗಂಧ-ಸಿರಿ) 🌳

<p align="center">
  <img src="app_screenshot.png" width="300" title="Gandha-Siri App Interface">
</p>

**Android App Development using GenAI - Natural Resources**

Gandha-Siri is a digital guardian for Sandalwood farmers. It aims to revitalize the "Sandalwood State" status by removing the fear of theft and legal complexity.

## 📋 Problem Statement
Sandalwood is a high-value resource in Karnataka, but farmers often avoid growing it due to high theft risks and complex forest department regulations. Gandha-Siri digitizes tree management to provide security and legal transparency.

## 🌟 Key Features
* **Digital Tree Registry:** Tag trees with GPS precision using `FusedLocationProviderClient`.
* **Maturity Calculator:** AI-driven estimation of heartwood formation based on girth-to-age ratios.
* **Panic Button:** Instant simulated SMS/Notification system to alert neighbors of suspicious activity.
* **Sandalwood Palette:** A clean, minimalist UI designed with earth tones for rural usability.

## 🛠 Tech Stack
* **Language:** Kotlin
* **UI:** Jetpack Compose
* **Database:** Room DB (Offline-first for remote farms)
* **Architecture:** MVVM (Model-View-ViewModel)

## 📂 Project Structure
```text
app/src/main/java/com/gandhasiri/
├── data/       # Room DB entities and local storage
├── domain/     # Business logic & Growth calculators
├── security/   # Alert systems and mesh network logic
└── ui/         # Jetpack Compose screens and themes
```
## 🚀 Setup & Installation
Follow these steps to set up the project locally for evaluation:

1. **Clone the Repository**
   ```bash
   git clone https://github.com/Prajwalwe/Gandha-Siri.git```
 2. **Open in Android Studio**
   * Launch Android Studio (Ladybug or newer recommended).
   * Select **Open** and navigate to the cloned Gandha-Siri folder.
 3. **Sync Project with Gradle Files**
   * Wait for the IDE to finish the Gradle sync to download dependencies like Jetpack Compose and Google Play Services.
 4. **Environment Requirements**
   * **Minimum SDK:** 24
   * **Target SDK:** 34
   * **JDK:** 17
## 🏃 How to Run
 1. Connect an Android device via USB (with Debugging enabled) or start an Emulator.
 2. Click the **Run** (green play icon) in the top toolbar of Android Studio.
 3. Alternatively, use the terminal command:
```bash
   ./gradlew installDebug```

