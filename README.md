# Android Project: Login & Tube Volume Calculator

This is a simple Android project developed as part of a college assignment. The project includes a login screen and a program to calculate the volume of a cylinder (tube) using user-provided height and radius. The application is built using Java and XML in Android Studio.

## Features

- **Login Screen**: Users must input a username and password to access the application.
- **Volume Calculation**: Once logged in, users can calculate the volume of a tube by entering the height and radius values.

## Screenshots

![Login Screen](Screenshoot/login_screen.png)  
*Login Screen*

![Volume Calculator](Screenshoot/volume_calculator.png)  
*Volume Calculator*

## How It Works

1. **Login**: Users are prompted to enter a username and password. Once authenticated, they proceed to the calculation screen.
2. **Dashboard**: The user inputs the height and radius of the tube. The app calculates the volume using the formula:
   \[
   \text{Volume} = \pi \times \text{radius}^2 \times \text{height}
   \]
3. **Result Display**: The calculated volume is displayed on the screen on dashboard .

## Code Structure

- **Java**: Contains the logic for handling login validation and volume calculation.
  - `MainActivity.java`: Handles user login.
  - `DashboardActivity.java`: Contains the code for calculating tube volume based on user input.
  
- **XML**: Defines the UI layout.
  - `activity_main.xml`: Layout for the login screen.
  - `activity_dashboard.xml`: Layout for the volume calculator screen.

## Formulas Used

The volume of a tube (cylinder) is calculated using the formula:
\[
\text{Volume} = \pi \times r^2 \times h
\]
where:
- \( r \) is the radius of the tube (provided by the user).
- \( h \) is the height of the tube (provided by the user).
- \( \pi \approx 3.14 \).

## Getting Started

### Prerequisites
- **Android Studio**: Ensure Android Studio is installed and for me, i'm using Android Studio Koala | 2024.1.1 Patch 2.
- **Java Development Kit (JDK)**: Version 8 or above and for me, i'm using Version 17.0.11.

### Running the Project
1. Clone this repository to your local machine.
   ```bash
   git clone https://github.com/yourusername/your-repo-name.git

Replace `yourusername/your-repo-name` in the `git clone` command with your actual GitHub repository name, and update any screenshot paths if you add them. This README covers the project's main details and provides context for users or reviewers.
