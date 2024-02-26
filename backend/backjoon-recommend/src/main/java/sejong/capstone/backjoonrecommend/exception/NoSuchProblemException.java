package sejong.capstone.backjoonrecommend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "지원하지 않는 문제입니다.")
public class NoSuchProblemException extends RuntimeException{
    public NoSuchProblemException(String content) {
        super(content);
    }
}
