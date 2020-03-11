package hoon.byeungoo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

    @GetMapping("/hello")
    public String hell() {
        throw new SampleException();
    }

    //SampleController 안에서 발생하는 SampleException은 이 핸들러를 사용한다.
    @ExceptionHandler(SampleException.class)
    public @ResponseBody
    AppError sampleError(SampleException e) {
        AppError appError = new AppError();
        appError.setMessage("error.app.key");
        appError.setReason("IDK IDK IDK");

        return appError;
    }

}
