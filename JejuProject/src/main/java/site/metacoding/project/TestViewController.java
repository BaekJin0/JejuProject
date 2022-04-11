package site.metacoding.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestViewController {
    // 파일명 가장 끝에 Test가 붙으면 데브툴이 작동하지 않음 -> 서버리로드 안함
    // ex)ViewControllerTest

    @GetMapping("/user/joinForm")
    public String joinForm() {
        return "user/joinForm";
    }

    @GetMapping("/user/loginForm")
    public String loginForm() {
        return "user/loginForm";
    }

    @GetMapping("/user/updateForm")
    public String userUpdateForm() {
        return "user/updateForm";
    }

}
