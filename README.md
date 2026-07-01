# Skytrac Golf Micro Aim Assistant

- A Java utility designed to allow for micro aim adjustments via the keyboard for the SkyTrac golf sim software.

## How to use
  * Alt + [ moves the cursor one pixel up
  * Alt + / moves the cursor one pixel down
  * Alt + ; moves the cursor one pixel left
  * Alt + ' moves the cursor one pixel right
  * Alt + a left clicks to finalize aiming position

## How to download 
  * Download both the GolfAim.jar and golf-launcher.bat files
  * Edit the golf-launcher.bat file to include your corrected file paths
  * Add the golf-launcher.bat file as a shortcut to your desktop

## How it works
  * When the golf-launcher.bat file runs, it simultaneously opens both the GolfAim.jar file and the SkyTrac app. GolfAim.jar will run in the background and allow for micro aim adjustments. When the SkyTrac window is terminated, GolfAim.jar will automatically be terminated as well.

## License
  * This project is open-source and available under the MIT License.

## Credits
This project uses the following open-source libraries:
* [JNativeHook](https://github.com/kamyu126/jnativehook) - Used for global keyboard and mouse listening under the LGPL v3 License.

## Sidenote
  * I am a beginner programmer and this is my first project that I am putting out there. Any feedback would be greatly appreciated.
