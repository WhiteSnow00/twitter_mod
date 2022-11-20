// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.widget.Checkable;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.CompoundButton;
import android.view.accessibility.AccessibilityManager;
import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public class CheckBoxPreference extends TwoStatePreference
{
    public final CheckBoxPreference.CheckBoxPreference$a t1;
    
    public CheckBoxPreference(final Context context) {
        this(context, null);
    }
    
    public CheckBoxPreference(final Context context, final AttributeSet set) {
        this(context, set, cmv.a(context, 2130968862, 16842895));
    }
    
    public CheckBoxPreference(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public CheckBoxPreference(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.t1 = new CheckBoxPreference.CheckBoxPreference$a(this);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, npe.I0, n, n2);
        this.a0((CharSequence)cmv.l(obtainStyledAttributes, 5, 0));
        this.Z((CharSequence)cmv.l(obtainStyledAttributes, 4, 1));
        super.s1 = obtainStyledAttributes.getBoolean(3, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }
    
    public void C(final tvk tvk) {
        super.C(tvk);
        this.d0(tvk.q0(16908289));
        this.b0(tvk);
    }
    
    public final void K(final View view) {
        super.K(view);
        if (((AccessibilityManager)((Preference)this).D0.getSystemService("accessibility")).isEnabled()) {
            this.d0(view.findViewById(16908289));
            this.c0(view.findViewById(16908304));
        }
    }
    
    public final void d0(final View view) {
        final boolean b = view instanceof CompoundButton;
        if (b) {
            ((CompoundButton)view).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
        }
        if (view instanceof Checkable) {
            ((Checkable)view).setChecked(super.q1);
        }
        if (b) {
            ((CompoundButton)view).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)this.t1);
        }
    }
}
