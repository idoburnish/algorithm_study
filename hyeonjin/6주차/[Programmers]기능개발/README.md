## 문제 유형
스택/큐
## 코드
![img.png](img.png)
## 로직
- 전체 100프로에서 현재 진행 상황 progresses를 뺀 뒤 진행 속도인 speed만큼 나누어서 남은 진행 상황을 배열에 저장
- 배포까지 남은 진행 상황 배열만큼 돌면서 제일 처음 배포까지 남은 진행상황보다 작거나 같은 경우 배포 개수 증가
- 제일 처음 배포까지 남은 진행상황보다 큰 경우 배포까지 남은 진행상황 갱신 및 배포 개수 초기화

## 리뷰
스택/큐를 쓰는 유형의 알고리즘이긴 한데 그냥 배열로 해결되었다..



