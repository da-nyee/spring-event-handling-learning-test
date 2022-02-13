package com.example.springeventhandling.application

import com.example.springeventhandling.application.dto.OrderRequestDto
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class OrderServiceTest(
    @Autowired
    private val orderService: OrderService
) {

    @Test
    fun `order`() {
        val requestDto = OrderRequestDto(
            1L,
            1L,
            "다니",
            1L,
            "애플워치",
            300_000L
        )

        print(orderService.order(requestDto))
    }
}
