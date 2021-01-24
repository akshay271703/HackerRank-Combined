/*
    Question 1
    Problem Statement : Matching Specific String
    URL : https://www.hackerrank.com/challenges/matching-specific-string/problem
*/
/*
    Question 2
    Problem Statement : Matching Anything But a Newline
    URL : https://www.hackerrank.com/challenges/matching-anything-but-new-line/problem
*/
/*
    Question 3
    Problem Statement : Matching Digits & Non-Digit Characters
    URL : https://www.hackerrank.com/challenges/matching-digits-non-digit-character/problem
*/
/*
    Question 4
    Problem Statement : Matching Whitespace & Non-Whitespace Character
    URL : https://www.hackerrank.com/challenges/matching-whitespace-non-whitespace-character/problem
*/
/*
    Question 5
    Problem Statement : Matching Start & End
    URL : https://www.hackerrank.com/challenges/matching-start-end/problem
*/
module.exports = [
    question1 = {
        regex : '/(hackerrank)/'
    },
    question2 = {
        regex : '/^...\....\....\....$/'
    },
    question3 = {
        regex : '/\d{2}\D\d{2}\D\d{4}/'
    },
    question4 = {
        regex : '/(\S{2}\s){2}\S{2}/'
    },
    question5 = {
        regex : '/^\d\w{4}\.$/'
    }
]