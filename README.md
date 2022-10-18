## Baigiamasis Darbas

## [Testing website www.ekhartyoga](www.ekhartyoga.com)

## Test Scenarios

1. TC_1 Log in using valid credentials
    1. Open www.ekhartyoga.com
    2. Click 'Sign In' button
    3. Input email
    4. Input password
    5. Click 'Log In' button
    6. Assert Log In was successful
2. TC_2 Log in using invalid input
    1. Open www.ekhartyoga.com
    2. Click 'Sign In' button
    3. Input invalid email
    4. Input password
    5. Assert Log In was unsuccessful
3. TC_3 Adding/removing classes to/from Favourites
    1. Log In
    2. Click on 'Classes'
    3. Choose a class and click classes' options
    4. Click 'Add to Favourites'
    5. Click on 'Favourites'
    6. Assert chosen class is in 'Favourites'
    7. Click classes' options
    8. Click 'Remove from Favourites'
    9. Assert class is removed from 'Favourites'
4. TC_4 Searching for yoga classes by text input
    1. Click on 'Search' box
    2. Enter search text
    3. Click 'Search' Icon
    4. Assert search result message contains provided search text
    5. Assert filtered classes correspond with the entered text for search
5. TC_5 Searching for yoga playlists by attributes
    1. Click on 'Playlists'
    2. Click drop down menu 'Feeling'
    3. Check an attribute
    4. Click 'Apply'
    5. Click drop down menu 'Level'
    6. Check an attribute
    7. Click 'Apply'
    8. Assert filtered playlists are displayed

