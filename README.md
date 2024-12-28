# TrafficLight 🚦

**TrafficLight** is an Android application developed in Kotlin that simulates a traffic light system. The app illustrates the cycles of red, yellow, and green lights with automatic transitions, while incorporating a night mode where only the yellow light blinks.

## Features ✨

- **Normal traffic light cycle** 🚦:  
  - **Red light** 🔴 stays on for 5 seconds.  
  - **Yellow light** 🟡 stays on for 2 seconds.  
  - **Green light** 🟢 stays on for 10 seconds.  

- **Night mode** 🌙 (between 00:00 and 04:00):  
  - Only the **yellow light** 🟡 blinks (1 second on, 1 second off).

- **Simple and intuitive interface** 🖥️:  
  - **Logo** with the traffic light colors (red for STOP, yellow for SLOW, green for GO) on the splash screen.

- **Cycle management with Kotlin Coroutines** 🏃‍♂️ for a smooth experience, without blocking the user interface.

## Technologies Used ⚙️

- **Kotlin** 🦸 for Android app development.
- **Android Coroutines** ⏳ to handle delays and transitions without blocking the user interface.
- **XML** for user interface layout.

## Installation 🛠️

### Prerequisites 📋

- Android Studio (version 4.1 or higher).
- An Android emulator or physical device to test the app.

### Installation Steps ⚡

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/TrafficLight.git
2. **Open the project in Android Studio**.
3. **Run the app** on an emulator or a physical Android device.

## Usage 🚀

- **Show the splash screen logo** 👁️: Upon opening the app, a logo with the colors of the traffic lights is displayed.
- **Start the normal cycle** 🎮:  start the traffic light cycle (red, yellow, green).
- **Night mode** 🌙: Between **00:00** and **04:00**, only the yellow light blinks.

## Contributions 🤝

Contributions are welcome! If you have suggestions or fixes, feel free to:
- Open an **issue**.
- Submit a **pull request**.
