## Baigiamasis Darbas

## [Automated functional testing for https://www.ekhartyoga.com/](www.ekhartyoga.com)

## Test Scenarios

1. TC_1 Verify Log in using valid credentials
    1. Open www.ekhartyoga.com
    2. Click 'Sign In' button
    3. Input valid email
    4. Input valid password
    5. Click 'Log In' button
    6. Verify Log In was successful
2. TC_2 Verify Log in using invalid email input
    1. Open www.ekhartyoga.com
    2. Click 'Sign In' button
    3. Input invalid email
    4. Input valid password
    5. Click 'Log in'
    6. Verify Log In was unsuccessful & invalid username or password message displayed
3. TC_3 Verify Log in leaving email input field blank
   1. Open www.ekhartyoga.com
   2. Click 'Sign in' button
   3. Input valid password
   4. Click 'Log In' button
   5. Verify Log In was unsuccessful & username error message is displayed
4. TC_4 Verify Log in leaving password input field blank
   1. Open www.ekhartyoga.com
   2. Click 'Sign in' button
   3. Input valid email
   4. Click 'Log In' button
   5. Verify Log In was unsuccessful & password field error message is displaye
5. TC_5 Verify adding/removing classes to/from Favourites
    1. Log In
    2. Click on 'Classes'
    3. Choose a class and click classes' options
    4. Click 'Add to Favourites'
    5. Click on 'Favourites'
    6. Verify chosen class is in 'Favourites'
    7. Click classes' options
    8. Click 'Remove from Favourites'
    9. Verify class is removed from 'Favourites'
6. TC_6 Verify searching for yoga classes by text input
    1. Click on 'Search' box
    2. Enter search text
    3. Click 'Search' Icon
    4. Verify search result message contains provided search text
    5. Verify filtered classes correspond with the entered text for search
7. TC_7 Verify searching for yoga playlists by attributes
    1. Log In
    2. Click on 'Playlists'
    3. Click drop down menu 'Feeling'
    4. Check an attribute
    5. Click 'Apply'
    6. Click drop down menu 'Level'
    7. Check an attribute
    8. Click 'Apply'
    9. Verify filtered playlists are displayed

