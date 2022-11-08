// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.settings.widget;

import android.net.Uri;
import android.widget.TextView;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.preference.Preference;

public class LinkablePreferenceCompat extends Preference
{
    public final int n1;
    public String[] o1;
    public View p1;
    public final boolean q1;
    public Intent r1;
    public af4 s1;
    
    public LinkablePreferenceCompat(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, h6q.G0, 0, 0);
        this.n1 = obtainStyledAttributes.getResourceId(1, 0);
        final int resourceId = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId != 0) {
            this.o1 = obtainStyledAttributes.getResources().getStringArray(resourceId);
        }
        this.q1 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }
    
    public LinkablePreferenceCompat(final Context context, final AttributeSet set, int resourceId) {
        super(context, set, resourceId);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, h6q.G0, resourceId, 0);
        this.n1 = obtainStyledAttributes.getResourceId(1, 0);
        resourceId = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId != 0) {
            this.o1 = super.C0.getResources().getStringArray(resourceId);
        }
        this.q1 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }
    
    public final void C(final lvk lvk) {
        super.C(lvk);
        this.p1 = lvk.C0;
        this.Y();
    }
    
    public final void M(final boolean b) {
        final boolean w = this.w();
        super.M(b);
        if (w != this.w()) {
            this.Y();
        }
    }
    
    public final void P(final Intent r1) {
        this.r1 = r1;
        this.Y();
    }
    
    public final void Y() {
        if (!this.w() && !this.q1) {
            fif.d(this.p1);
        }
        else {
            final View p1 = this.p1;
            if (p1 != null) {
                final TextView textView = (TextView)p1.findViewById(16908304);
                if (textView != null) {
                    textView.setEnabled(true);
                }
            }
            final Intent r1 = this.r1;
            if (r1 != null) {
                fif.b(super.C0, this.p1, r1);
            }
            else {
                final af4 s1 = this.s1;
                if (s1 != null) {
                    fif.c(this.p1, new Object[] { s1 });
                }
                else {
                    final String[] o1 = this.o1;
                    if (o1 != null && o1.length > 0) {
                        final Context c0 = super.C0;
                        final View p2 = this.p1;
                        final Object[] array = new Object[o1.length];
                        for (int i = 0; i < o1.length; ++i) {
                            array[i] = tdy.F(c0, goz.J(c0, 2130969074), 0, bn.a().a(c0, (zm)new dmx(Uri.parse(o1[i]))));
                        }
                        fif.c(p2, array);
                    }
                    else {
                        fif.a(super.C0, this.p1, this.n1);
                    }
                }
            }
        }
    }
}
