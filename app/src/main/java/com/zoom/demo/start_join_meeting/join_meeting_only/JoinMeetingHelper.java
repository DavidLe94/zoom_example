package com.zoom.demo.start_join_meeting.join_meeting_only;

import android.content.Context;

import com.zoom.demo.in_meeting_function.zoom_meeting_ui.ZoomMeetingUISettingHelper;

import us.zoom.sdk.JoinMeetingOptions;
import us.zoom.sdk.JoinMeetingParams;
import us.zoom.sdk.MeetingService;
import us.zoom.sdk.ZoomSDK;

public class JoinMeetingHelper {
    private final static String TAG = "JoinMeetingHelper";

    private static JoinMeetingHelper mJoinMeetingHelper;

    private ZoomSDK mZoomSDK;

    private final static String DISPLAY_NAME = "Hau Le";

    private JoinMeetingHelper() {
        mZoomSDK = ZoomSDK.getInstance();
    }

    public synchronized static JoinMeetingHelper getInstance() {
        mJoinMeetingHelper = new JoinMeetingHelper();
        return mJoinMeetingHelper;
    }

    public int joinMeetingWithNumber(Context context, String meetingNo, String meetingPassword) {
        int ret = -1;
        MeetingService meetingService = mZoomSDK.getMeetingService();
        if(meetingService == null) {
            return ret;
        }

        JoinMeetingOptions opts = ZoomMeetingUISettingHelper.getJoinMeetingOptions();

        JoinMeetingParams params = new JoinMeetingParams();

        params.displayName = DISPLAY_NAME;
        params.meetingNo = meetingNo;
        params.password = meetingPassword;
        return meetingService.joinMeetingWithParams(context, params,opts);
    }

    public int joinMeetingWithVanityId(Context context, String vanityId, String meetingPassword) {
        int ret = -1;
        MeetingService meetingService = mZoomSDK.getMeetingService();
        if(meetingService == null) {
            return ret;
        }

        JoinMeetingOptions opts =ZoomMeetingUISettingHelper.getJoinMeetingOptions();
        JoinMeetingParams params = new JoinMeetingParams();
        params.displayName = DISPLAY_NAME;
        params.vanityID = vanityId;
        params.password = meetingPassword;
        return meetingService.joinMeetingWithParams(context, params,opts);
    }
}
