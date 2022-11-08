// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.navigation;

import android.os.Parcelable;
import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;

class NavigationBarView$SavedState extends fa
{
    public static final Parcelable$Creator<NavigationBarView$SavedState> CREATOR;
    public Bundle menuPresenterState;
    
    static {
        CREATOR = (Parcelable$Creator)new NavigationBarView$SavedState$a();
    }
    
    public NavigationBarView$SavedState(final Parcel parcel, final ClassLoader classLoader) {
        super(parcel, classLoader);
        ClassLoader classLoader2 = classLoader;
        if (classLoader == null) {
            classLoader2 = this.getClass().getClassLoader();
        }
        this.readFromParcel(parcel, classLoader2);
    }
    
    public NavigationBarView$SavedState(final Parcelable parcelable) {
        super(parcelable);
    }
    
    private void readFromParcel(final Parcel parcel, final ClassLoader classLoader) {
        this.menuPresenterState = parcel.readBundle(classLoader);
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeBundle(this.menuPresenterState);
    }
}
