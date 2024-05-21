package com.multi.c_network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver {
    public static void main(String[] args) throws IOException {
        // UDP 소켓 생성
        DatagramSocket socket = new DatagramSocket(9300);
        
        // 바이트 배열로 받기 위한 공간 할당
        byte[] data = new byte[256];
        
        // 패킷을 생성하여 데이터의 길이만큼 받을 준비
        // 받을 패킷을 생성해놓고 대기
        DatagramPacket packet = new DatagramPacket(data, data.length);
        System.out.println("받을 준비 중");
        
        // 패킷이 전달된다면 받아서 소켓의 receive 메소드로 받음
        socket.receive(packet);

        System.out.println(new String(data));
        
        // 소켓 닫기
        socket.close();
    }
}
