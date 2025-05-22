import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static int N, M, answer = Integer.MAX_VALUE;
    static int[][] city;
    static int[][] houses;
    static int[][] chickens;
    static int houseCnt = 0, chickenCnt = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        city = new int[N][N];
        houses = new int[2*N][2];
        chickens = new int[13][2];
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int v = Integer.parseInt(st.nextToken());
                city[i][j] = v;
                
                if (v == 1) {
                    houses[houseCnt][0] = i;
                    houses[houseCnt][1] = j;
                    houseCnt++;
                }
                else if (v == 2) {
                    chickens[chickenCnt][0] = i;
                    chickens[chickenCnt][1] = j;
                    chickenCnt++;
                }
            }
        }
        
        dfs(0, 0, new boolean[chickenCnt]);
        bw.write(answer + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
      
    static void dfs(int idx, int cnt, boolean[] v) {
        if (cnt == M) {
            int sum = 0;
            for (int i = 0; i < houseCnt; i++) {
                int min = Integer.MAX_VALUE;
                for (int j = 0; j < chickenCnt; j++) {
                    if (v[j]) {
                        min = Math.min(min,
                            Math.abs(houses[i][0] - chickens[j][0]) + 
                            Math.abs(houses[i][1] - chickens[j][1]));
                    }
                }
                sum += min;
            }
            answer = Math.min(answer, sum);
            return;
        }
        
        for (int i = idx; i < chickenCnt; i++) {
            v[i] = true;
            dfs(i+1, cnt+1, v);
            v[i] = false;
        }
    }
}