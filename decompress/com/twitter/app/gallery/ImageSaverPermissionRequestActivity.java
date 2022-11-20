// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.gallery;

import android.content.Context;
import android.os.Bundle;
import com.twitter.permissions.PermissionRequestActivity;

public class ImageSaverPermissionRequestActivity extends PermissionRequestActivity
{
    public static final int w1 = 0;
    public d8d v1;
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.v1 = new d8d(((Context)this).getApplicationContext());
        f.i(((vmd)this).v0().D().v0(), (n93)new jgk((Object)this, 8));
    }
}
