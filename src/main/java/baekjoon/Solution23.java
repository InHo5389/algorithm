package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 신입 사원
 * - 선발 시험은 1차 서류 심사, 2차 면접 시험
 * - 지원자의 두 성적이 다른 어떤 지원자보다 모두 낮으면 탈락
 *
 * Interviewer객체를 만들어 Comparable인터페이스를 구현해 서류성적을 오룸차순
 * 으로 만들어 첫번째 사람은 선발하고 그 interviewRank를 최소 interviewRank로 지정
 * 오름차순이라 interviewRank만 비교하면되서 interviewRank가 최소 interviewRank
 * 보다 작을 경우 최소 interviewRank를 갱싱하며 비교 하며 문제를 풀었습니다.
 */
class Interviewer implements Comparable<Interviewer> {
    int documentRank;
    int interviewRank;

    public Interviewer(int documentRank, int interviewRank) {
        this.documentRank = documentRank;
        this.interviewRank = interviewRank;
    }

    @Override
    public int compareTo(Interviewer o) {
        return this.documentRank - o.documentRank;
    }
}

public class Solution23 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            List<Interviewer> list = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int documentRank = Integer.parseInt(st.nextToken());
                int interviewRank = Integer.parseInt(st.nextToken());
                list.add(new Interviewer(documentRank, interviewRank));
            }

            Collections.sort(list);

            int count = 1;
            int minInterviewRank = list.get(0).interviewRank;

            for (int j = 1; j < n; j++) {
                if (list.get(j).interviewRank < minInterviewRank) {
                    count++;
                    minInterviewRank = list.get(j).interviewRank;
                }
            }
            System.out.println(count);
        }
    }
}