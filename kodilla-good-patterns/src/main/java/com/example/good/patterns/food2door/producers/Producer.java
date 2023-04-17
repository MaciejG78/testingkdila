package com.example.good.patterns.food2door.producers;

import com.example.good.patterns.food2door.OrderRequest;

public interface Producer {

    void process(OrderRequest orderRequest);
}
