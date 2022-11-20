// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.widget.Checkable;
import android.widget.CompoundButton$OnCheckedChangeListener;
import androidx.appcompat.widget.SwitchCompat;
import android.view.accessibility.AccessibilityManager;
import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public class SwitchPreferenceCompat extends TwoStatePreference
{
    public final SwitchPreferenceCompat.SwitchPreferenceCompat$a t1;
    public CharSequence u1;
    public CharSequence v1;
    
    public SwitchPreferenceCompat(final Context context) {
        this(context, null);
    }
    
    public SwitchPreferenceCompat(final Context context, final AttributeSet set) {
        this(context, set, 2130970769);
    }
    
    public SwitchPreferenceCompat(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public SwitchPreferenceCompat(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.t1 = new SwitchPreferenceCompat.SwitchPreferenceCompat$a(this);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, npe.S0, n, n2);
        this.a0((CharSequence)cmv.l(obtainStyledAttributes, 7, 0));
        this.Z((CharSequence)cmv.l(obtainStyledAttributes, 6, 1));
        this.u1 = cmv.l(obtainStyledAttributes, 9, 3);
        ((Preference)this).x();
        this.v1 = cmv.l(obtainStyledAttributes, 8, 4);
        ((Preference)this).x();
        super.s1 = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }
    
    public final void C(final tvk tvk) {
        super.C(tvk);
        this.d0(tvk.q0(2131431866));
        this.b0(tvk);
    }
    
    public final void K(final View view) {
        super.K(view);
        if (((AccessibilityManager)((Preference)this).D0.getSystemService("accessibility")).isEnabled()) {
            this.d0(view.findViewById(2131431866));
            this.c0(view.findViewById(16908304));
        }
    }
    
    public final void d0(final View view) {
        final boolean b = view instanceof SwitchCompat;
        if (b) {
            ((SwitchCompat)view).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
        }
        if (view instanceof Checkable) {
            ((Checkable)view).setChecked(super.q1);
        }
        if (b) {
            final SwitchCompat switchCompat = (SwitchCompat)view;
            switchCompat.setTextOn(this.u1);
            switchCompat.setTextOff(this.v1);
            switchCompat.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)this.t1);
        }
    }
}
