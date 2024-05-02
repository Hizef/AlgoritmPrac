// 2023년 11월 풀이

#include <stdio.h>
int main(void)
{
	int test_case;
	int T;
    
    setbuf(stdout, NULL);
	scanf("%d", &T);
	for (test_case = 1; test_case <= T; ++test_case) {
		int beforeHour, beforeMin, beforeSec, beforeTime;
		int afterHour, afterMin, afterSec, afterTime;
        int resultHour, resultMin, resultSec;
        
        scanf("%d:%d:%d ", &beforeHour, &beforeMin, &beforeSec);
        scanf("%d:%d:%d ", &afterHour, &afterMin, &afterSec);
        
        beforeTime = beforeHour * 3600 + beforeMin * 60 + beforeSec;
        afterTime = afterHour * 3600 + afterMin * 60 + afterSec;
        
        if (beforeTime > afterTime) {
            afterHour += 24;
        } if (afterSec < beforeSec) {
            afterMin--;
            afterSec += 60;
        } resultSec = afterSec - beforeSec;
        
        if (afterMin < beforeMin) {
            afterHour--;
            afterMin += 60;
        } 
        resultMin = afterMin - beforeMin;
        resultHour = afterHour - beforeHour;
        
        printf("#%d %02d:%02d:%02d \n", test_case, resultHour, resultMin, resultSec);
	}
	return 0; //정상종료시 반드시 0을 리턴해야 합니다.
}