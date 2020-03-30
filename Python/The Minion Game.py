def minion_game(string):
    # your code goes here
    kevin=0
    stuart=0

    length=len(string) # counts length of original string
    for i in range(length):
        if(string[i] in ['A','E','I','O','U']):
            kevin = kevin + (length-i) 
        else:
            stuart=stuart + (length-i)

    if(kevin > stuart):
        print ("Kevin",kevin)
    elif(kevin < stuart):
        print("Stuart",stuart)
    else:
        print("Draw")
