package com.rpg.demo.shared.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@AllArgsConstructor
public class ResponseDto<T> {

    private String mensagem;
    private T dados;

}
