import sys 


def print_right_triangle(num_lines=16):

    # loop through all the lines 
    for line_number in range(0, num_lines):
        num_stars = line_number + 1     # sets the number of stars to the line number + 1

        # print 'number of stars' in one line
        for star_number in range(0, num_stars):
            print('*', end='')

        # prints a newline
        print()


if __name__ == '__main__':
    if len(sys.argv) != 2:
        print_right_triangle()
    else:
        print_right_triangle(int(sys.argv[1]))
