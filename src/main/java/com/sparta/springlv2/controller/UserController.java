package com.sparta.springlv2.controller;

import com.sparta.springlv2.dto.ApiResult;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("api/auth")
public class UserController {

    private final UserService userService;

    // 회원가입 API
    @PostMapping("/signup")
    public ApiResult signup(@Valid @RequestBody SignupRequestDto)



}
