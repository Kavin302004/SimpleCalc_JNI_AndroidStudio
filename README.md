# Simple Calculator App (Android + C++ via JNI)
![image](https://github.com/user-attachments/assets/007eab2c-d22d-4e6a-9470-866dfc7cba0f)


This is a **Simple Calculator App** built using **Android Studio**, which utilizes **C++ (native code) via JNI (Java Native Interface)** to perform arithmetic operations. The app allows users to input two numbers and perform addition, subtraction, multiplication, and division.

---

## Features
✅ Perform Addition, Subtraction, Multiplication, and Division
✅ Uses **C++ (Native Code) via JNI** for calculations
✅ Implements **Android UI using Java & XML**
✅ Displays **calculation history**

---

## Technologies Used
- **C++ (Native Code for Arithmetic Operations)**
- **JNI (Java Native Interface) to bridge Java and C++)**
- **Java (Handles UI & User Interaction in Android Studio)**
- **Android XML (User Interface Layout)**

---

## Project Structure
```
SimpleCalculator/
│── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/simplecalculator/
│   │   │   │   ├── MainActivity.java  # Java logic & JNI calls
│   │   │   ├── cpp/
│   │   │   │   ├── simplecalculator.cpp  # C++ implementation
│   │   │   ├── res/
│   │   │   │   ├── layout/
│   │   │   │   │   ├── activity_main.xml  # UI Design
│── build.gradle
│── CMakeLists.txt
│── AndroidManifest.xml
```

---

## How It Works? (Flow)
1. **User enters two numbers**.
2. **Clicks a button (`+`, `-`, `×`, `÷`)**.
3. **Java calls C++ function via JNI**.
4. **C++ function performs the operation and returns result**.
5. **Java updates the UI with the result**.
6. **History of calculations is updated.**

---

## Why Use C++ (via JNI)?
🔹 **Performance:** C++ executes faster than Java for mathematical operations.
🔹 **Native Code Reuse:** Reuse C++ libraries without rewriting in Java.
🔹 **Memory Efficiency:** More control over memory than Java.

---

## Future Enhancements 🚀
✅ **Handle empty inputs gracefully**
✅ **Add more functions (Square Root, Percentage, Power, etc.)**
✅ **Improve UI with Material Design**
✅ **Save calculation history persistently**

---

## How to Run? 🛠️
1️⃣ Clone the repository:
```sh
git clone https://github.com/yourusername/simple-calculator-android-jni.git
```
2️⃣ Open in **Android Studio**.
3️⃣ Build & Run the project on an **Android emulator or physical device**.

---

## Contributing 🤝
Feel free to submit issues or pull requests! 🚀

