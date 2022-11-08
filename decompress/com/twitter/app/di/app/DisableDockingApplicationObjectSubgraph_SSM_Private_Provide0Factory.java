// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.di.app;

import com.twitter.android.qrcodes.QRCodeActivity;
import com.twitter.videoeditor.VideoEditorActivity;
import com.twitter.camera.controller.root.CameraActivity;
import java.util.Set;

public final class DisableDockingApplicationObjectSubgraph_SSM_Private_Provide0Factory implements wqa<Set<Class<? extends yl1>>>
{
    public final Object get() {
        return nmp.t((Object)CameraActivity.class, (Object[])new Class[] { VideoEditorActivity.class, QRCodeActivity.class });
    }
}
