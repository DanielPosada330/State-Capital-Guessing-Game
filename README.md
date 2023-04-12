# State-Capital-Guessing-Game
This program is a game that asks the user to correctly guess the capitals of each of the 50 states in the U.S.

## Purpose
The purpose of this program was to practice and really engrained data structures and algorithms (DS&As) into my programming.
I utilized arrays, bubble sorting, hashmaps and treemap sorting to build a program that would ask the user to first input the correct capital city of the corresponding state.
Then once the array was converted into a hashmap and sorted using a treemap, I then had the user input a state which would then return the corresponding capital city.

## Language
This program was written entirely in Java. I was able to implement and experiment with different DS&A's to further my knowledge in Java.

## Build Status
There is still room for improvement. I would like to implement the usage of APIs to grab the states and capitals instead of manually writting them as shown below:

![image](https://user-images.githubusercontent.com/104124602/231454852-2a30c6ed-698a-46db-bfa8-72659db79134.png)

I would also like to develop a GUI for this build, as well as better organized the different sections of the program into different files for easier readability.
As right now there is the inital Guessing Program, bubble sort, hashmap conversion, treemap sort, and the final user input portion.
Another issue I would like to address in the future is when the user gets to the finalized treemap, the user is forced to enter the state as stated in the program below:

![image](https://user-images.githubusercontent.com/104124602/231455366-5a082a32-a328-4060-bcfa-85d50a060761.png)

** Debugging
I problem I constantly ran into was the fact that I needed to iterate a 2d array, while matching up the state and capital cities correctly. I was able to make this
work by implementing the following code:

![image](https://user-images.githubusercontent.com/104124602/231455653-1c2859e5-0b81-4a85-9c38-40698954b4e8.png)

Here I was also able to use equalsIgnoreCase in order to make up for possible user error. Though I will need to update the program to also involve try and catch
statement should the user accidentally input a number or other non valid input.

**Data Structures and Algorithms
As mentioned before, I heavily utilized different DS&As in order to practice concepts learned through my coursework.
I utilized arrays:

![image](https://user-images.githubusercontent.com/104124602/231456151-7950f849-ff55-4c1d-9d27-8a891b0f7005.png)

Bubble Sorting:

![image](https://user-images.githubusercontent.com/104124602/231456341-094614e5-db5f-4aaf-98f2-33a35233d042.png)

HashMaps:

![image](https://user-images.githubusercontent.com/104124602/231456447-e5ea0814-285b-4bea-a882-1b541192c221.png)

And TreeMap Sorting:

![image](https://user-images.githubusercontent.com/104124602/231456578-d4bef4b0-60f9-4869-8990-5d51e7c94902.png)

## Conclusions
Overall this program was a great challenge to learn about DS&A's and further my experience with Java. I am looking forward to improving upon my skills
and creating more advanced programs in the future!
