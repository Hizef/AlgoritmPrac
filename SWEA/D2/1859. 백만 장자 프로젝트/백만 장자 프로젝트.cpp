// long long AB;
// long long AB = 12345678901234567L;
// 2023년 11월 풀이

#include <stdio.h>

long long N;
long long price[1000001];

long long findMaxPrice(long long idx) {
    long long tmp = 0;
    long long tmpX = 0;
    for (long long i = idx; i < N; i++) {
        if (tmp < price[i]) {
         	tmp = price[i];   
        	tmpX = i;
        }
        else if (tmp == price[i]) { 
            tmpX = i; 
        }
    }
    return tmpX; // 최댓값의 마지막 인덱스를 return
}

int main(void) {
	long long test_case, T;
	scanf("%lld ", &T);
	for(test_case = 1; test_case <= T; ++test_case) {
		scanf("%lld ", &N);
        for (long long i = 0; i < N; i++) {
            scanf("%lld ", &price[i]);
        }
        long long profit = 0;
        
        for (long long i = 0; i < N;) {
            long long goal = findMaxPrice(i);
            while (i != goal) {
                profit += price[goal] - price[i];
                i++;
            }
            i++;
        }
        printf("#%lld %lld \n", test_case, profit);
	}
	return 0;//정상종료시 반드시 0을 리턴해야합니다.
}