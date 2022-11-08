// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.navigation;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;

public class NavigationView$SavedState extends fa
{
    public static final Parcelable$Creator<NavigationView$SavedState> CREATOR;
    public Bundle menuState;
    
    static {
        CREATOR = (Parcelable$Creator)new NavigationView$SavedState$a();
    }
    
    public NavigationView$SavedState(final Parcel parcel, final ClassLoader classLoader) {
        super(parcel, classLoader);
        this.menuState = parcel.readBundle(classLoader);
    }
    
    public NavigationView$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeBundle(this.menuState);
    }
}
