/*
    Question 1
    Problem Statement : Branch Reset Groups
    URL : https://www.hackerrank.com/challenges/branch-reset-groups/problem
    Language : PHP

    Question 2
    Problem Statement : Matching Same Text Again & Again
    URL : https://www.hackerrank.com/challenges/matching-same-text-again-again/problem
    Language JavaScript

    Question 3
    Problem Statement : Backreferences To Failed Groups
    URL : https://www.hackerrank.com/challenges/backreferences-to-failed-groups/problem
    Language JavaScript

    Question 4
    Problem Statement : Forward References
    URL : https://www.hackerrank.com/challenges/forward-references/problem
    Language Java

*/
module.exports = [
    question1 = {
        regex : '/^\d{2}(-(?:--)?|\.|:)\d{2}\1\d{2}\1\d{2}$/'
    },
    question2 = {
        regex : '/^([a-z]\w\s\W\d\D[A-Z][a-zA-Z][aeiouAEIOU]\S)\1$/'
    },
    question3 = {
        regex : '/([\d]{8})|(^([\d]{2}-){3}[\d]{2}$)/'
    },
    question4 = {
        regex : '^(\\2tic|(tac))+$'
    }
]