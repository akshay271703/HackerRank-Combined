/*
    Question 1
    Problem Statement : Matching Word Boundaries
    URL : https://www.hackerrank.com/challenges/matching-word-boundaries/problem

    Question 2
    Problem Statement : Capturing & Non-Capturing Groups
    URL : https://www.hackerrank.com/challenges/capturing-non-capturing-groups/problem

    Question 3
    Problem Statement : Alternative Matching
    URL : https://www.hackerrank.com/challenges/alternative-matching/problem
*/
module.exports = [
    question1 = {
        regex : '/\b[eaiouAEIOU][a-z]*\b/'
    },
    question2 = {
        regex : '/(ok){3,}/'
    },
    question3 = {
        regex : '/^((Mr\.)|(Mrs\.)|(Dr\.)|(Er\.)|(Ms\.))[a-zA-Z]+$/'
    }
]