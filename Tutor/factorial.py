def main(n):

    result = 1
    for num in range(1, n + 1):
        result = result * num

    print(result)


if __name__ == '__main__':
    number_to_choose = int(input('Choose a number greater than 0: '))
    main(number_to_choose)