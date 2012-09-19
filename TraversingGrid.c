#include <stdio.h>

/**
 * All N by M grids can be reduced to 3 basic grid shapes by taking
 * off the outer loop, e.g. a 4 x 5 grid can be reduce to a 2 x 3
 * grid without affecting the final output. Thus we will have 3
 * basic cases:  
 * 		1 x c  ->  R,  c >= 1
 * 		r x 1  ->  D,  r > 1
 * 		0 x 0  ->  L if N <= M, U if M > N
 *
 */
int main() {
	int t, n, m;
	scanf("%d", &t);

	for (; t > 0; t--) {
		scanf("%d %d", &n, &m);

		if (n <= m) {
			if (n % 2 == 1)
				printf("R\n");
			else
				printf("L\n");
		} else {
			if (m % 2 == 1)
				printf("D\n");
			else
				printf("U\n");
		}
	}
	
	return 0;
}
