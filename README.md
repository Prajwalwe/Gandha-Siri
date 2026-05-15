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
