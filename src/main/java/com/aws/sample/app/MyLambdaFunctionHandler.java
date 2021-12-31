package com.aws.sample.app;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.aws.sample.app.request.APIGatewayRequest;

public class MyLambdaFunctionHandler extends SpringBootRequestHandler<APIGatewayRequest, Object> {

}
