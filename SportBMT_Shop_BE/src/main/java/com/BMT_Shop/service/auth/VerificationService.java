package com.BMT_Shop.service.auth;

import com.BMT_Shop.dto.authentication.RegistrationRequest;
import com.BMT_Shop.dto.authentication.ResetPasswordRequest;
import com.BMT_Shop.dto.authentication.UserRequest;

public interface VerificationService {

    Long generateTokenVerify(UserRequest userRequest);

    void resendRegistrationToken(Long userId);

    void confirmRegistration(RegistrationRequest registration);

    void changeRegistrationEmail(Long userId, String emailUpdate);

    void forgetPassword(String email);

    void resetPassword(ResetPasswordRequest resetPasswordRequest);

}
