package com.skypro.charliev.thirdcoursework.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST,reason = "Wrong data")
public class InvalidAmountException extends RuntimeException {
}

