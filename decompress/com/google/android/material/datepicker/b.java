// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;

public final class b implements a$c
{
    public static final Parcelable$Creator<b> CREATOR;
    public final long C0;
    
    static {
        CREATOR = (Parcelable$Creator)new b$a();
    }
    
    public b() {
        this.C0 = Long.MIN_VALUE;
    }
    
    public b(final long c0, final b$a b$a) {
        this.C0 = c0;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        if (this.C0 != ((b)o).C0) {
            b = false;
        }
        return b;
    }
    
    public final boolean h1(final long n) {
        return n >= this.C0;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.C0 });
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.C0);
    }
}
