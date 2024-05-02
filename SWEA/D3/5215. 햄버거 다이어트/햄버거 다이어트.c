// 2023 11 11

#include <stdio.h>

int n, l;
int score[30], cal[30];
int sum_cal;
int sum_score;
int max;

void dfs(int ptr) {
    int i;
    
    if(sum_cal > l) return;
    else {
        if (sum_score > max) max = sum_score; }
    
    for (i = ptr; i < n; i++) {
        sum_cal += cal[i];
        sum_score += score[i];
        
        dfs(i+1);
        
        sum_cal -= cal[i];
        sum_score -= score[i];
    }
}


int main(void)
{
	int test_case, T;
    
	scanf("%d", &T);
	for (test_case = 1; test_case <= T; ++test_case)
	{
        sum_cal = 0, sum_score = 0, max = -1;
		scanf("%d %d ", &n, &l);
        
        for (int i = 0; i < n; i++) {
            scanf("%d %d ", &score[i], &cal[i]);
        }
        
        dfs(0);
        
        printf("#%d %d \n", test_case, max);

	}
	return 0; //정상종료시 반드시 0을 리턴해야 합니다.
}