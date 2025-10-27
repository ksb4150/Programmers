def dfs(v):
    visited[v] = True
    next = arr[v]
    if not visited[next]:
        dfs(next)
    return

t = int(input())

for _ in range(t):
    cnt = 0
    n = int(input())
    visited = [False]*(n+1)
    arr = [0] + list(map(int, input().split()))
    
    for i in range(1, n+1):
        if not visited[i]:
            dfs(i)
            cnt+=1
            
    print(cnt)