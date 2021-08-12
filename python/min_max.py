
# find the min and max given an array
def min_max_arr():
    rand_nums = [10, 11, 2, 2, 19, 12]

    # for i in range(0, len(rand_nums)):
    #     smallest_index = i

    #     for j in range(0, len(rand_nums)):
    #         if rand_nums[j] < rand_nums[smallest_index]:
    #             smallest_index = j

    #     temp = rand_nums[i]
    #     rand_nums[i] = rand_nums[smallest_index]
    #     rand_nums[smallest_index] = temp
    #     smallest_index = i 

    #     print(smallest_index)
        

    for i in range(0, len(rand_nums)):
        biggest_index = i
    for j in range(0, len(rand_nums)):
        if rand_nums[i] < rand_nums[j]:
            biggest_index = j 
    
    temp = rand_nums[j]
    rand_nums[j] = rand_nums[biggest_index]
    rand_nums[biggest_index] = temp 

    biggest_index = j 

    print(biggest_index)



def max_arr(arr):
    biggest = -1
    for i in range(0, len(arr)):
        if arr[i] > biggest:
            biggest = arr[i]
    print(biggest)

if __name__ == '__main__':
    min_max_arr()

