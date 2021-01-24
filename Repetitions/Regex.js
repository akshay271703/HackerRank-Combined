/*
    Question 1
    Problem Statement : Matching {x} Repetitions
    URL : https://www.hackerrank.com/challenges/matching-x-repetitions/problem
*/
/*
    Question 2
    Problem Statement : Matching {x, y} Repetitions
    URL : https://www.hackerrank.com/challenges/matching-x-y-repetitions/problem
*/
/*
    Question 3
    Problem Statement : Matching Zero Or More Repetitions
    URL : https://www.hackerrank.com/challenges/matching-zero-or-more-repetitions/problem
*/
/*
    Question 4
    Problem Statement : Matching One Or More Repetitions
    URL : https://www.hackerrank.com/challenges/matching-one-or-more-repititions/problem
*/
/*
    Question 5
    Problem Statement : Matching Ending Items
    URL : https://www.hackerrank.com/challenges/matching-ending-items/problem
*/
module.exports = [
    question1 = {
        regex : '/^([a-zA-Z]|[02468]){40}([13579]|[\s]){5}$/'
    },
    question2 = {
        regex : '/^[\d]{1,2}[a-zA-Z]{3,}[\.]{0,3}$/'
    },
    question3 = {
        regex : '/^[\d]{2,}[a-z]*[A-Z]*$/'
    },
    question4 = {
        regex : '/^[\d]+[A-Z]+[a-z]+$/'
    },
    question5 = {
        regex : '/^[a-zA-z]*(s)$/'
    }
]