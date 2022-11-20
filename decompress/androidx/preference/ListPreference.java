// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.text.TextUtils;
import android.view.AbsSavedState;
import android.os.Parcelable;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public class ListPreference extends DialogPreference
{
    public CharSequence[] u1;
    public CharSequence[] v1;
    public String w1;
    public String x1;
    public boolean y1;
    
    public ListPreference(final Context context, final AttributeSet set) {
        this(context, set, cmv.a(context, 2130969198, 16842897), 0);
    }
    
    public ListPreference(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, 0);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, npe.K0, n, 0);
        this.u1 = cmv.m(obtainStyledAttributes, 2, 0);
        this.v1 = cmv.m(obtainStyledAttributes, 3, 1);
        obtainStyledAttributes.recycle();
        final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(set, npe.M0, n, 0);
        this.x1 = cmv.l(obtainStyledAttributes2, 32, 7);
        obtainStyledAttributes2.recycle();
    }
    
    public final Object F(final TypedArray typedArray, final int n) {
        return typedArray.getString(n);
    }
    
    public final void H(final Parcelable parcelable) {
        if (!parcelable.getClass().equals(ListPreference.ListPreference$SavedState.class)) {
            super.H(parcelable);
            return;
        }
        final ListPreference.ListPreference$SavedState listPreference$SavedState = (ListPreference.ListPreference$SavedState)parcelable;
        super.H(((AbsSavedState)listPreference$SavedState).getSuperState());
        this.Z(listPreference$SavedState.value);
    }
    
    public final Parcelable I() {
        ((Preference)this).m1 = true;
        final AbsSavedState empty_STATE = AbsSavedState.EMPTY_STATE;
        if (((Preference)this).V0) {
            return (Parcelable)empty_STATE;
        }
        final ListPreference.ListPreference$SavedState listPreference$SavedState = new ListPreference.ListPreference$SavedState((Parcelable)empty_STATE);
        listPreference$SavedState.value = this.w1;
        return (Parcelable)listPreference$SavedState;
    }
    
    public final void J(final Object o) {
        this.Z(((Preference)this).s((String)o));
    }
    
    public final void R(final CharSequence charSequence) {
        super.R(charSequence);
        if (charSequence == null && this.x1 != null) {
            this.x1 = null;
        }
        else if (charSequence != null && !charSequence.equals(this.x1)) {
            this.x1 = charSequence.toString();
        }
    }
    
    public final int Y(final String s) {
        if (s != null) {
            final CharSequence[] v1 = this.v1;
            if (v1 != null) {
                for (int i = v1.length - 1; i >= 0; --i) {
                    if (this.v1[i].equals(s)) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
    
    public final void Z(final String w1) {
        final boolean b = TextUtils.equals((CharSequence)this.w1, (CharSequence)w1) ^ true;
        if (b || !this.y1) {
            this.w1 = w1;
            this.y1 = true;
            ((Preference)this).L(w1);
            if (b) {
                ((Preference)this).x();
            }
        }
    }
    
    public final CharSequence u() {
        final int y = this.Y(this.w1);
        CharSequence charSequence = null;
        Label_0031: {
            if (y >= 0) {
                final CharSequence[] u1 = this.u1;
                if (u1 != null) {
                    charSequence = u1[y];
                    break Label_0031;
                }
            }
            charSequence = null;
        }
        final String x1 = this.x1;
        if (x1 == null) {
            return ((Preference)this).L0;
        }
        CharSequence charSequence2;
        if ((charSequence2 = charSequence) == null) {
            charSequence2 = "";
        }
        return String.format(x1, charSequence2);
    }
}
