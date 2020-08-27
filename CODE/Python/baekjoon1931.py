# 조건
# 회의는 한번 시작하면 종료할수 없다
# 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다
# 회의의 시작 시간과 끝나는 시간이 같을수도 있다.
# 결정사항
# 내부적으로 파이썬에 내장되어있는 sort 함수의 시간 복잡도는 평균적으로 nlogn이므로 별도의 정렬 메소드를 다시 짤 필요는 없다.
# 풀이 방법
# 기존에 정렬이 된 리스트를 파이썬 내부정렬 함수를 이용해 문제에서 주어진 기준으로 재정렬을 한다면, 기존 기준의 결과값을 최대한 유지하면서 정렬되도록 한다. 이문제에서는 시작시간과 종료시간이 일치하더라도 회의실 배정이 가능하다는 조건이있다. 즉 (1,2) (2, 2)는 모두 회의실을 배정 가능하다는 말이다
import sys
n = int(sys.stdin.readline())
arr = []
for a in range(n):
    arr.append(list(map(int, sys.stdin.readline().split())))
arr = sorted(arr, key=lambda x: x[0])
arr = sorted(arr, key=lambda x: x[1])
for a in range(1, n):
    try:
        while True:
            if arr[a][0] < arr[a-1][1]:
                del arr[a]
                continue
            else:
                break
    except:
        break
arr.append('>>')
print(arr.index('>>'))
