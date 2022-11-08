// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public final class Scope extends sd implements ReflectedParcelable
{
    public static final Parcelable$Creator<Scope> CREATOR;
    public final int C0;
    public final String D0;
    
    static {
        CREATOR = (Parcelable$Creator)new a9y();
    }
    
    public Scope(final int c0, final String d0) {
        xd.r(d0, (Object)"scopeUri must not be null or empty");
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public Scope(final String d0) {
        xd.r(d0, (Object)"scopeUri must not be null or empty");
        this.C0 = 1;
        this.D0 = d0;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof Scope && this.D0.equals(((Scope)o).D0));
    }
    
    public final int hashCode() {
        return this.D0.hashCode();
    }
    
    public final String toString() {
        return this.D0;
    }
    
    public final void writeToParcel(final Parcel parcel, int x0) {
        x0 = ri4.x0(parcel, 20293);
        ri4.n0(parcel, 1, this.C0);
        ri4.s0(parcel, 2, this.D0);
        ri4.A0(parcel, x0);
    }
}
