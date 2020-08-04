package io.vengine.restapi.security.oauth2.user;

import java.util.Map;

/**
 * 인증된 사용자의 세부정보를 가져올 때 모든 OAuth2 공급자는 다른 Json 응답을 반환.
 * map 키 - 값 쌍의 형태로 응답을 분석
 */

public abstract class OAuth2UserInfo {

    protected Map<String, Object> attributes;

    public OAuth2UserInfo(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public abstract String getId();

    public abstract  String getName();

    public abstract  String getEmail();

    public abstract String getImageUrl();
}
