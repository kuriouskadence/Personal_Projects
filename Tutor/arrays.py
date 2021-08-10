import random


def main():
    rand_nums = [random.randint(1,100) for i in range(0, 10)]
    # rand_nums = [5, 7, 6, 2, 10, 4, 3]
    print('Random Numbers Array: ', rand_nums)
    
    for i in range(0, len(rand_nums) - 1):
        for j in range(i + 1, len(rand_nums)):
            if rand_nums[j] <  rand_nums[i]:
                temp  = rand_nums[i]
                rand_nums[i] = rand_nums[j]
                rand_nums[j] = temp

    
    print('Sorted Random Numbers Array: ', rand_nums)
    




if __name__ == '__main__':
    main()