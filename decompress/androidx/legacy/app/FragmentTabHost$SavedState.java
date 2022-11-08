// 
// Decompiled by Procyon v0.6.0
// 

package androidx.legacy.app;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

class FragmentTabHost$SavedState extends View$BaseSavedState
{
    public static final Parcelable$Creator<FragmentTabHost$SavedState> CREATOR;
    public String curTab;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<FragmentTabHost$SavedState>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new FragmentTabHost$SavedState(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new FragmentTabHost$SavedState[n];
            }
        };
    }
    
    public FragmentTabHost$SavedState(final Parcel parcel) {
        super(parcel);
        this.curTab = parcel.readString();
    }
    
    public FragmentTabHost$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public String toString() {
        final StringBuilder g = w48.g("FragmentTabHost.SavedState{");
        g.append(Integer.toHexString(System.identityHashCode(this)));
        g.append(" curTab=");
        return hi.I(g, this.curTab, "}");
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeString(this.curTab);
    }
}
