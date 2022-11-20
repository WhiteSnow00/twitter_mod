// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.dm.widget;

import android.view.View;
import android.widget.TextView;
import java.util.List;
import android.view.View$OnClickListener;
import com.twitter.dm.ui.DMAvatar;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import androidx.preference.Preference;

public class DMAvatarPreference extends Preference
{
    public final UserIdentifier o1;
    public final ypa<qo7, String> p1;
    public qo7 q1;
    
    public DMAvatarPreference(final Context context) {
        this(context, null);
    }
    
    public DMAvatarPreference(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public DMAvatarPreference(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        super.h1 = 2131624357;
        final UserIdentifier current = UserIdentifier.getCurrent();
        this.o1 = current;
        this.p1 = new pt6(super.D0, current);
    }
    
    public final void C(final tvk tvk) {
        super.C(tvk);
        final qo7 q1 = this.q1;
        final int n = 0;
        CharSequence text = null;
        String c;
        boolean i;
        if (q1 != null) {
            final View q2 = tvk.q0(2131428729);
            final int a = c5j.a;
            final DMAvatar dmAvatar = (DMAvatar)q2;
            dmAvatar.setConversation(this.q1);
            ((View)dmAvatar).setOnClickListener((View$OnClickListener)new fpf(this, 9));
            text = (String)this.p1.a((Object)this.q1);
            final qo7 q3 = this.q1;
            c = q3.c;
            i = a48.i(q3.g, (List)q3.h);
        }
        else {
            c = null;
            i = false;
        }
        final View q4 = tvk.q0(2131428734);
        final int a2 = c5j.a;
        final TextView textView = (TextView)q4;
        textView.setText(text);
        int visibility;
        if (ikr.e(text)) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        ((View)textView).setVisibility(visibility);
        final TextView textView2 = (TextView)tvk.q0(2131428733);
        textView2.setText((CharSequence)c);
        int visibility2;
        if (ikr.e((CharSequence)c)) {
            visibility2 = 8;
        }
        else {
            visibility2 = 0;
        }
        ((View)textView2).setVisibility(visibility2);
        final View q5 = tvk.q0(2131428767);
        int visibility3;
        if (i) {
            visibility3 = n;
        }
        else {
            visibility3 = 8;
        }
        q5.setVisibility(visibility3);
    }
}
