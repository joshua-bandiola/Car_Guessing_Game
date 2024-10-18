# Car Guessing Game 

## Description 
This project is an Android game developed in Android Studio using Java, where users guess car brands based on images
or identify a car image based on a given car brand. The game includes two main challenges:
1) Guess the brand based on a randomly generated car image.
2) Guess the car image that corresponds to a given brand from a selection of three randomly generated images.

The game features 10 car brands, with 10 different car images per brand. When guessing the car brand, a bitmap is assigned
to each image, and the game checks if the user's selection from the list matches the randomly displayed image.
For the brand guess game, three shuffled images are displayed, and the correct image is determined using a 'tag' of a
random chosen image. The car brand name will appear based on the 'tag' and an if-else statement is implemented to check
the user's choice of image. EG, Audi, Bentley and BMW cars are shown, the chosen random image in this case is 'BMW' 
so a tag will be put on that image. A 'BMW' text by retrieving the 'tag' code and the user will have to click on the image
they think is the 'BMW' 

Game demo is attached in file in zip format.

## Rationale 
This project offers a fun and interactive way for car enthusiasts to test their knowledge of car brands and models. 
It also demonstrates basic principles of game development, such as image manipulation, randomization, 
and user interaction, providing a foundation for building more complex mobile applications.

## Tech Stack
- **Programming Language**: Java
- **Developent Environment**: Android Studio
- **Framework**: Android SDK
