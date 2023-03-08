# Merchant Solutions – Trading Application
> Trading Application is used to process the trade signals.

## Table of Contents
* [General Info](#general-information)
* [Setup](#setup)
* [Usage](#usage)
* [Project Status](#project-status)
* [Room for Improvement](#room-for-improvement)
* [Contact](#contact)
* [License](#license)


## General Information
- This application is developed to process Trading Signals.
- In the current version Signal code 1,2 and 3 are implemented.
- Once in production it is expected that up to 50 new signals will be added per month (600 after year one, 1200 after year two etc). 

## Setup
* All the implementation of signals should be defined in SignalHandlerCode_X_Y_Imp 
* X indicates the starting  and Y indicates the ending integer value of code handler implemented for that release . 
* SignalHandlerCode_X_Y_Imp must extend the previous release SignalHandlerCode_X_Y_Imp class.
* All the SignalHandlerCode_X_X_Imp classes must be abstract class.
* SignalHandler class must be extend the latest SignalHandlerCode_X_X_Imp class created for that release. So it will inherit all the signalHandlerCodeX method.
* All the signalHandlerCodeX method calls must be added to SIGNALS map as follows

` static Map<Integer, Consumer<Integer>> SIGNALS; `

```
signals.put(1, (signal) -> {  
    signalHandlerImp.handleSignalCode1(signal);  
});  
 ```

## Usage
* To process the signal use the following code

``` 
Application application =new Application(); 
application.handleSignal(1);  // To process Signal code 1
application.handleSignal(8);  // To process Signal code 8 
application.handleSignal(5);  // To process Signal code 5

```


## Project Status
Project is:  in progress 


## Room for Improvement
- Exception handling for unimplemented Signal Codes can be improved by proving more detailed information.
 

## To do:
- Implementation of SignalHandler for codes above 10

## Contact
Created by [@mdckani](kdkani89@gmail.com/) - feel free to contact me!


## License
This project is open source and available under the [Apache License 2.0 ]. 
