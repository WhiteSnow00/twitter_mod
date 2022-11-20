// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.widget.CompoundButton;
import android.widget.Checkable;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.Switch;
import android.view.accessibility.AccessibilityManager;
import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public class SwitchPreference extends TwoStatePreference
{
    public final SwitchPreference.SwitchPreference$a t1;
    public CharSequence u1;
    public CharSequence v1;
    
    public SwitchPreference(final Context context) {
        this(context, null);
    }
    
    public SwitchPreference(final Context context, final AttributeSet set) {
        this(context, set, cmv.a(context, 2130970770, 16843629));
    }
    
    public SwitchPreference(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public SwitchPreference(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.t1 = new SwitchPreference.SwitchPreference$a(this);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, npe.R0, n, n2);
        this.a0((CharSequence)cmv.l(obtainStyledAttributes, 7, 0));
        this.Z((CharSequence)cmv.l(obtainStyledAttributes, 6, 1));
        this.u1 = cmv.l(obtainStyledAttributes, 9, 3);
        ((Preference)this).x();
        this.v1 = cmv.l(obtainStyledAttributes, 8, 4);
        ((Preference)this).x();
        super.s1 = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }
    
    public void C(final tvk tvk) {
        super.C(tvk);
        this.d0(tvk.q0(16908352));
        this.b0(tvk);
    }
    
    public final void K(final View view) {
        super.K(view);
        if (((AccessibilityManager)((Preference)this).D0.getSystemService("accessibility")).isEnabled()) {
            this.d0(view.findViewById(16908352));
            this.c0(view.findViewById(16908304));
        }
    }
    
    public final void d0(final View view) {
        final boolean b = view instanceof Switch;
        if (b) {
            ((CompoundButton)view).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
        }
        if (view instanceof Checkable) {
            ((Checkable)view).setChecked(super.q1);
        }
        if (b) {
            final Switch switch1 = (Switch)view;
            switch1.setTextOn(this.u1);
            switch1.setTextOff(this.v1);
            ((CompoundButton)switch1).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)this.t1);
        }
    }
}
