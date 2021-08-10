


def main(n):
    if n < 0:
        print('negative number')
    elif n > 0:
        print('positive number')
    else:
        print('neither')
  
    if n % 2 == 0:
       print('even number')
    else:
        print('odd number')

if __name__ == '__main__':
    main(4)