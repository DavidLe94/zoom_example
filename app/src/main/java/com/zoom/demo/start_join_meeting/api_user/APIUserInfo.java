package com.zoom.demo.start_join_meeting.api_user;

public class APIUserInfo {
    public String userId;
    public String userZoomToken;
    public String userZoomAccessToken;

    public APIUserInfo(String userId, String userZoomToken, String userZoomAccessToken) {
        this.userId = userId;
        this.userZoomToken = userZoomToken;
        this.userZoomAccessToken = userZoomAccessToken;
    }
}
