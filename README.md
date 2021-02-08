# GraphQLwithRetrofit
GraphQL with Retrofit on Android

The app calls to [graphql-weather-api](https://github.com/konstantinmuenster/graphql-weather-api)

<p align="center">
  <a href="http://www.youtube.com/watch?feature=player_embedded&v=Jkd0SIs5Tsk
" target="_blank"><img src="http://img.youtube.com/vi/Jkd0SIs5Tsk/0.jpg" 
alt="GraphQL on Android" width="480" height="360" border="10" />
  </a>
  
# Note: 
  
  if you need a mutation should be to change this line
```kotlin
paramObject.put("query", "query {users(userid:$userId){username}}")
```
to
```kotlin
paramObject.put("query", "mutation {users(userid:$userId){username}}")
```

You can find more information in this **[blog](https://thedeveloperworldisyours.com/android/how-to-use-graphql-with-retrofit-on-android/)**.

<a href="http://thedeveloperworldisyours.com/">
  <img alt="The developer world is yours" src="https://github.com/CabezasGonzalezJavier/AddTextViewButton/blob/master/TheDeveloperWordIsYours.png" />
</a>

# Requirements

    - Android Studio

    - Gradle


# Installation

    - Install Android Studio:

    https://developer.android.com/sdk/installing/index.html

    - Install gradle:

    http://gradle.org/docs/current/userguide/installation.html

# Usage
    Compile with Android Studio and gradle


Feel free to contribute, and contact me for any issues.

Developed By
------------
* Javier González Cabezas - <javiergonzalezcabezas@gmail.com>

<a href="https://es.linkedin.com/in/javier-gonz%C3%A1lez-cabezas-8b4b2231">
  <img alt="Add me to Linkedin" src="https://github.com/JorgeCastilloPrz/EasyMVP/blob/master/art/linkedin.png" />
</a>

License
-------

    Copyright 2020 Javier González

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
