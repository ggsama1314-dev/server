
package com.example.ecommerce.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

public class TokenUtils {

    private static final String SECRET = "ecommerce-secret";

    public static String createToken(String username){
        return JWT.create()
                .withAudience(username)
                .sign(Algorithm.HMAC256(SECRET));
    }
}
