import time

print('Введите b:')
b = int(input())
print('Введите c:')
c = int(input())
print('Введите i:')
g = int(input())
start_time = time.time()
global answer
answer = 0

for i in range(1, g+1):
    answer += (b*2+c-i)*100000000
print(answer)
print("--- %s seconds ---" % (time.time() - start_time))
