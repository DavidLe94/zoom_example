package com.zoom.demo.in_meeting_function.customized_meeting_ui.view.adapter;

public class CameraMenuItem extends SimpleMenuItem {
    private String cameraId;
    public CameraMenuItem(int action, String label, String cameraId) {
        super(action, label);
        this.cameraId = cameraId;
    }
    public String getCameraId() {
        return cameraId;
    }

    public void setCameraId(String cameraId) {
        this.cameraId = cameraId;
    }
}

