from collections import deque

N, M = map(int, input().split())
graph = [[]*N for _ in range(N+1)]

for _ in range(1, M+1):
    A, B = map(int, input().split())
    graph[A].append(B)
    graph[B].append(A)
    
result = []
def bfs(start):
    queue = deque([start])
    visited = [0] * (N+1)
    dist = [0] * (N+1)
    
    visited[start] = 1
    
    while queue:
        cur_node = queue.popleft()
        
        for next_node in graph[cur_node]:
            if visited[next_node] == 0:        
                queue.append(next_node)
                visited[next_node] = 1
                dist[next_node] = dist[cur_node]+1
    return sum(dist)
    
for i in range(1, N+1):
    result.append(bfs(i))

print(result.index(min(result))+1)