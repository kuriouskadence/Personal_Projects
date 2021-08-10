
def  main():
    for x in range (0,10):
        print('f(' + str(x) + ') = ' + str(func1(x)))


def func1(x):
    return 2 * x**2 + 3 * x + 4 


if __name__== '__main__':
    main()