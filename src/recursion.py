def power(n):
    if n<0:
        return
    pruint(n)
    power(n-1)


n=int(input("Enter a number: "))

print (power(n))