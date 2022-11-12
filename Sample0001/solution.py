n = input()
numbers_str = input().split(' ')
numbers = [int(x) for x in numbers_str]

num_sum = 0
for num in numbers:
    num_sum += num

print(num_sum)