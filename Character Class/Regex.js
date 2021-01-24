/*
    Question 1
    Problem Statement : Matching Specific Characters
    URL : https://www.hackerrank.com/challenges/matching-specific-characters/problem
*/
/*
    Question 2
    Problem Statement : Excluding Specific Characters
    URL : https://www.hackerrank.com/challenges/excluding-specific-characters/problem
*/
/*
    Question 3
    Problem Statement : Matching Character Ranges
    URL : https://www.hackerrank.com/challenges/matching-range-of-characters/problem
*/
module.exports = [
    question1 = {
        regex : '/^[123][120][xs0][30Aa][xsu](\.|,)$/'
    },
    question2 = {
        regex : '/^[\D][^aeiou][^bcDF][\S][^AEIOU][^(\.|,)]$/'
    },
    question3 = {
        regex : '/^[a-z][1-9][^a-z][^A-Z][A-Z]/'
    }
]