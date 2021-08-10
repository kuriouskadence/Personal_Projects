import random
# Calculate sum of all elements in a given array
def sum_arr():

    sum = 0
    rand_nums = [random.randint(1, 100) for i in range(0,8)]
    for elem in rand_nums:
        sum = sum + elem 

    print(sum)
   


if __name__ == '__main__':
    sum_arr()