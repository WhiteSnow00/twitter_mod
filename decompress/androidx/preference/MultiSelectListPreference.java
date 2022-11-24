// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.content.SharedPreferences$Editor;
import java.util.Collection;
import android.view.AbsSavedState;
import android.os.Parcelable;
import android.content.res.TypedArray;
import java.util.HashSet;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Set;
import androidx.preference.internal.AbstractMultiSelectListPreference;

public class MultiSelectListPreference extends AbstractMultiSelectListPreference
{
    public CharSequence[] w1;
    public CharSequence[] x1;
    public Set<String> y1;
    
    public MultiSelectListPreference(final Context context, final AttributeSet set) {
        this(context, set, nmv.a(context, 2130969198, 16842897), 0);
    }
    
    public MultiSelectListPreference(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n);
        this.y1 = new HashSet();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, bs4.Z0, n, 0);
        this.w1 = nmv.m(obtainStyledAttributes, 2, 0);
        this.x1 = nmv.m(obtainStyledAttributes, 3, 1);
        obtainStyledAttributes.recycle();
    }
    
    public final Object F(final TypedArray typedArray, int i) {
        final CharSequence[] textArray = typedArray.getTextArray(i);
        final HashSet set = new HashSet();
        int length;
        for (length = textArray.length, i = 0; i < length; ++i) {
            set.add(textArray[i].toString());
        }
        return set;
    }
    
    public final void H(final Parcelable parcelable) {
        if (!parcelable.getClass().equals(MultiSelectListPreference.MultiSelectListPreference$SavedState.class)) {
            super.H(parcelable);
            return;
        }
        final MultiSelectListPreference.MultiSelectListPreference$SavedState multiSelectListPreference$SavedState = (MultiSelectListPreference.MultiSelectListPreference$SavedState)parcelable;
        super.H(((AbsSavedState)multiSelectListPreference$SavedState).getSuperState());
        this.b0(multiSelectListPreference$SavedState.mValues);
    }
    
    public final Parcelable I() {
        ((Preference)this).o1 = true;
        final AbsSavedState empty_STATE = AbsSavedState.EMPTY_STATE;
        if (((Preference)this).X0) {
            return (Parcelable)empty_STATE;
        }
        final MultiSelectListPreference.MultiSelectListPreference$SavedState multiSelectListPreference$SavedState = new MultiSelectListPreference.MultiSelectListPreference$SavedState((Parcelable)empty_STATE);
        multiSelectListPreference$SavedState.mValues = this.y1;
        return (Parcelable)multiSelectListPreference$SavedState;
    }
    
    public final void J(final Object o) {
        this.b0(((Preference)this).t((Set)o));
    }
    
    public final CharSequence[] Y() {
        return this.w1;
    }
    
    public final CharSequence[] Z() {
        return this.x1;
    }
    
    public final Set<String> a0() {
        return this.y1;
    }
    
    public final void b0(final Set<String> set) {
        this.y1.clear();
        this.y1.addAll(set);
        if (((Preference)this).W()) {
            if (!set.equals(((Preference)this).t((Set)null))) {
                final SharedPreferences$Editor b = ((Preference)this).G0.b();
                b.putStringSet(((Preference)this).Q0, (Set)set);
                ((Preference)this).X(b);
            }
        }
    }
}
