
package com.auth.integration.service;

import com.auth.integration.model.User;

public interface UserService {
    User signup(User user);
    User getUserByEmail(String email);
}
