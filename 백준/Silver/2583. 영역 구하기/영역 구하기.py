import sys
sys.setrecursionlimit(10**6)

M, N, K = map(int, input().split())
graph = [ [0]*N for _ in range(M) ]

row = [1, -1, 0, 0]
col = [0, 0, 1, -1]

for _ in range(K):
    lx, by, rx, ty = map(int, input().split())
    for y in range(by, ty):
        for x in range(lx, rx):
            graph[M-y-1][x] = 1
            
def dfs(x, y):
    if x < 0 or y < 0 or x >= N or y >= M:
        return 0
    if graph[y][x] == 1:
        return 0
    
    cnt = 1
    graph[y][x] = 1
    for i in range(4):
        dx = col[i] + x
        dy = row[i] + y
        cnt += dfs(dx, dy)
    return cnt
    
result = []
for y in range(M):
    for x in range(N):
        if graph[y][x] == 0:
            result.append(dfs(x, y))

result.sort()
print(len(result))
print(' '.join(map(str, result)))