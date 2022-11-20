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

public class EditTextPreference extends DialogPreference
{
    public String u1;
    
    public EditTextPreference(final Context context, final AttributeSet set) {
        super(context, set, cmv.a(context, 2130969415, 16842898), 0);
    }
    
    public final Object F(final TypedArray typedArray, final int n) {
        return typedArray.getString(n);
    }
    
    public final void H(final Parcelable parcelable) {
        if (!parcelable.getClass().equals(EditTextPreference.EditTextPreference$SavedState.class)) {
            super.H(parcelable);
            return;
        }
        final EditTextPreference.EditTextPreference$SavedState editTextPreference$SavedState = (EditTextPreference.EditTextPreference$SavedState)parcelable;
        super.H(((AbsSavedState)editTextPreference$SavedState).getSuperState());
        this.Y(editTextPreference$SavedState.text);
    }
    
    public final Parcelable I() {
        ((Preference)this).m1 = true;
        final AbsSavedState empty_STATE = AbsSavedState.EMPTY_STATE;
        if (((Preference)this).V0) {
            return (Parcelable)empty_STATE;
        }
        final EditTextPreference.EditTextPreference$SavedState editTextPreference$SavedState = new EditTextPreference.EditTextPreference$SavedState((Parcelable)empty_STATE);
        editTextPreference$SavedState.text = this.u1;
        return (Parcelable)editTextPreference$SavedState;
    }
    
    public final void J(final Object o) {
        this.Y(((Preference)this).s((String)o));
    }
    
    public final boolean V() {
        return TextUtils.isEmpty((CharSequence)this.u1) || super.V();
    }
    
    public final void Y(final String u1) {
        final boolean v = this.V();
        ((Preference)this).L(this.u1 = u1);
        final boolean v2 = this.V();
        if (v2 != v) {
            ((Preference)this).y(v2);
        }
    }
}
