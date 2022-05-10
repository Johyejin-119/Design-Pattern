package com.company.design.adapter;

// 110V를 가지는 헤어드라이기 제품
public class HairDryer implements Electronic110V {
    @Override
    public void powerOn() {
        System.out.println("헤어 드라이기 110v on");
    }
}
