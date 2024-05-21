package com.multi.c_network;

import java.awt.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {
    public static void main(String[] args) throws Exception {
        // 소켓 생성
        DatagramSocket socket = new DatagramSocket();
        
        // 패킷에 ip와 port를 넘겨줘야 하므로 ip 변수에 담기
        InetAddress ip = InetAddress.getByName("127.0.0.1");    //localhost
        
        // 보낼 메세지
        String str = "java programmer";
        
        // 바이트로 변환해서 바이트 배열로 담기
        byte[] data = str.getBytes();
        
        // 패킷 생성, 데이터, 길이, ip, port로 생성
        DatagramPacket packet = new DatagramPacket(data, data.length,ip,9300);
        
        // 소켓을 사용해서 packet 전달
        socket.send(packet);
        
        // 소켓 닫기
        socket.close();

    }
}
