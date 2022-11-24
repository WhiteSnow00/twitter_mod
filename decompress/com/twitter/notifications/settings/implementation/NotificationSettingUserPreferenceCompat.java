// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.notifications.settings.implementation;

import android.view.View;
import com.twitter.media.ui.image.UserImageView;
import android.util.AttributeSet;
import android.content.Context;
import kotlin.Metadata;
import androidx.preference.Preference;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/twitter/notifications/settings/implementation/NotificationSettingUserPreferenceCompat;", "Landroidx/preference/Preference;", "subsystem.tfa.notifications.tweet-settings.implementation_release" }, k = 1, mv = { 1, 7, 1 })
public final class NotificationSettingUserPreferenceCompat extends Preference
{
    public gvi q1;
    
    public NotificationSettingUserPreferenceCompat(final Context context, final AttributeSet set) {
        e0e.f((Object)context, "context");
        this(context, set, 0);
    }
    
    public NotificationSettingUserPreferenceCompat(final Context context, final AttributeSet set, final int n) {
        e0e.f((Object)context, "context");
        super(context, set, n);
        super.j1 = 2131625942;
    }
    
    public final void C(final kwk kwk) {
        super.C(kwk);
        kwk.a1 = false;
        kwk.b1 = false;
        final View f0 = kwk.F0;
        String i0 = null;
        UserImageView userImageView;
        if (f0 != null) {
            userImageView = (UserImageView)f0.findViewById(2131430745);
        }
        else {
            userImageView = null;
        }
        e0e.c((Object)userImageView);
        final gvi q1 = this.q1;
        if (q1 != null) {
            i0 = q1.I0;
        }
        userImageView.L(i0);
    }
}
