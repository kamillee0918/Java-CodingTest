package programmers.lv3;

import java.util.*;

public class 카드_짝_맞추기 {
    private final int[] directionRow = {0, 0, -1, 1}; // 상하좌우 이동을 위한 행 변화
    private final int[] directionCol = {-1, 1, 0, 0}; // 상하좌우 이동을 위한 열 변화

    /**
     * 문제를 해결하기 위한 메서드. 게임 보드와 시작 위치를 받아
     * 최소 이동 횟수를 반환함.
     *
     * @param board 4 x 4 크기의 2차원 배열
     * @param r 커서의 최초 세로(행) 위치
     * @param c 커서의 최초 가로(행) 위치
     * @return {@code 이동 횟수의 최솟값}
     */
    public int solution(int[][] board, int r, int c) {
        return process(board, r, c);
    }

    /**
     * 재귀적으로 모든 카드를 제거할 때까지의 최소 이동 횟수를 계산하는 메서드.
     * 모든 카드 쌍에 대하여 어떤 카드를 먼저 선택할지를 고려하고,
     * 제거 후 남은 카드들에 대해 다시 최소 이동 횟수를 계산함.
     *
     * @param board 4 x 4 크기의 2차원 배열
     * @param r 커서의 최초 세로(행) 위치
     * @param c 커서의 최초 가로(행) 위치
     * @return {@code 이동 횟수의 최솟값}
     */
    private int process(int[][] board, int r, int c){

        // 모든 카드가 제거된 경우
        if(isFinished(board)) {
            return 0;
        }

        int answer = Integer.MAX_VALUE;

        for (int k = 1; k <= 6; k++) {
            
            // k와 일치하는 카드 위치 모두 찾기
            ArrayList<Point> list = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (board[i][j] == k) {
                        list.add(new Point(i, j));
                    }
                }
            }

            // k 카드를 못찾으면 continue
            if (list.isEmpty()) {
                continue;
            }

            int case1 = getDistance(board, r, c, list.get(0).r, list.get(0).c, list.get(1).r, list.get(1).c, true);
            int case2 = getDistance(board, r, c, list.get(1).r, list.get(1).c, list.get(0).r, list.get(0).c, true);

            board[list.get(0).r][list.get(0).c] = 0;
            board[list.get(1).r][list.get(1).c] = 0;

            answer = Math.min(answer, Math.min(case1 + process(board, list.get(1).r, list.get(1).c),
                    case2 + process(board, list.get(0).r, list.get(0).c)));

            board[list.get(0).r][list.get(0).c] = k;
            board[list.get(1).r][list.get(1).c] = k;
        }

        return answer;
    }

    /**
     * 두 카드 사이의 최소 이동 횟수를 BFS 알고리즘을 사용하여 계산하는 메서드.
     * 이동 시에는 '직선 이동 및 Ctrl+방향키 이동'을 모두 고려함.
     *
     * @param board
     * @param r1
     * @param c1
     * @param r2
     * @param c2
     * @return {@code 두 카드 사이의 이동 횟수의 최솟값}
     */
    private int getDistance(int[][] board, int r1, int c1, int r2, int c2, int r3, int c3, boolean isCtrl) {
        // r1, c1에서 r2, c2로 이동하는 횟수 구하기
        int dist1 = bfs(board, r1, c1, r2, c2);

        // r2,c2에서 r3, c3로 이동하는 횟수 구하기
        int dist2 = bfs(board, r2, c2, r3, c3);

        if (isCtrl) {
            return (dist1 + dist2) + 2;
        }
        return dist1 + dist2;
    }

    private int bfs(int[][] board, int r1, int c1, int r2, int c2) {
        Queue<Point> queue = new LinkedList<>();
        boolean[][] visited = new boolean[4][4];

        // 시작 노드 큐에 삽입 및 방문 처리
        queue.add(new Point(r1, c1, 0));

        // BFS 시작
        while (!queue.isEmpty()) {
            Point p = queue.poll();

            // 목적지 도착 시 최소 거리 반환
            if (p.r == r2 && p.c == c2) {
                return p.move;
            }

            // 상하좌우 이동
            for (int i = 0; i < 4; i++) {
                int fr = p.r + directionRow[i];
                int fc = p.c + directionCol[i];

                if (isRange(fr, fc) && !visited[fr][fc]) {
                    visited[fr][fc] = true;
                    queue.add(new Point(fr, fc, p.move + 1));
                }

                // Ctrl+방향키 이동
                while (isRange(fr + directionRow[i], fc + directionCol[i])) {
                    if (board[fr][fc] != 0) {
                        break;
                    }
                    fr += directionRow[i];
                    fc += directionCol[i];
                }

                if (isRange(fr, fc) && !visited[fr][fc]) {
                    visited[fr][fc] = true;
                    queue.add(new Point(fr, fc, p.move + 1));
                }
            }
        }

        return 0;
    }

    /**
     * 모든 카드가 제거되었는지 확인하는 메서드.
     *
     * @param board
     * @return {@code true} (제거되지 않은 카드가 존재하면 {@code false}를 반환
     */
    private boolean isFinished(int[][] board) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (board[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * 주어진 위치가 보드 범위 내에 있는지 확인하는 메서드.
     *
     * @param x 보드의 가로 길이
     * @param y 보드의 세로 길이
     * @return 4 x 4 크기의 보드
     */
    private boolean isRange(int x, int y) {
        return x >= 0 && y >= 0 && x < 4 && y < 4;
    }

    /***
     * 카드의 위치와 이동 횟수를 저장하는 클래스.
     * 생성자 오버로딩을 통해 이동 횟수가 포함된 경우와
     * 포함되지 않는 경우를 구분함.
     */
    static class Point {
        int r, c, move;
        public Point(int r, int c) {
            this.r = r; this.c = c;
        }

        public Point(int r, int c, int move) {
            this.r = r; this.c = c; this.move = move;
        }
    }

    public static void testCase(int[][] board, int r, int c, int expected) {
        카드_짝_맞추기 solution = new 카드_짝_맞추기();

        int result = solution.solution(board, r, c);

        System.out.println("입력값 〉 "
                + Arrays.deepToString(board) + ", "
                + r + ", "
                + c
        );
        System.out.println("기댓값 〉 " + expected);

        if (result == expected) {
            System.out.println("실행 결과 〉 " + "\033[36m테스트를 통과하였습니다.\033[0m" + "\n");
        } else {
            System.out.println("실행 결과 〉 " + "\033[31m실행한 결괏값 " + result
                    + "이 기댓값 " + expected + "과 다릅니다.\033[0m" + "\n");
        }
    }

    public static void main(String[] args) {
        int[][][] boards = {
                { {1, 0, 0, 3}, {2, 0, 0, 0}, {0, 0, 0, 2}, {3, 0, 1, 0} },
                { {3, 0, 0, 2}, {0, 0, 1, 0}, {0, 1, 0, 0}, {2, 0, 0, 3} }
        };
        int[] r = {1, 0};
        int[] c = {0, 1};
        int[] expects = {14, 16};

        for (int i = 0; i < boards.length; i++) {
            System.out.println("테스트 " + (i + 1));
            testCase(boards[i], r[i], c[i], expects[i]);
        }
    }
}
