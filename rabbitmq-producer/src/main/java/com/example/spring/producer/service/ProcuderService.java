package com.example.spring.producer.service;

import com.example.spring.producer.dto.Message;

public interface ProcuderService {
    void sendToConsumer(Message message);
}
