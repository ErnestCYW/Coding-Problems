io = input().split(' ')

x = int(io[0])
y = int(io[1])
n = int(io[2])

for i in range(1,n+1):
    toReturn = ""
    if i % x == 0:
        toReturn += "Fizz"
    if i % y == 0: 
        toReturn += "Buzz"
    
    if not toReturn:
        print(i)
    else:
        print(toReturn) 