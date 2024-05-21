package com.multi.c_network;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws Exception {
        //1. 서버의 포트를 정함 (0~65535) -> 0~1023은 이미 사용 중
        ServerSocket server = new ServerSocket(9200);
        System.out.println("클라이언트의 요청을 기다리는 중");
        int count = 0;  // 요청의 수 counting
        while (true){
            // 2. 클라이언트에서 접속 요청이 오면 요청을 수락한 후 클라이언트에 대한 소켓 생성
            Socket socket = server.accept(); // 기다리고 있다가 요청이 오면 소켓으로 담아줌
            count++;
            System.out.println(count + "클라이언트 연결됨 > " + count + "번째 접속");

            // 3. 연결된 클라이언트와 스트림 생성
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);  // flush: 남은거 비우기
            out.println("java programmer");

            // 4. 소켓 닫기
            out.close();
            socket.close();
            
        }
    }
}
