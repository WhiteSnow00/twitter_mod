import android.os.Parcelable;
import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ciz extends sd
{
    public static final Parcelable$Creator<ciz> CREATOR;
    public Bundle F0;
    public gta[] G0;
    public int H0;
    public di6 I0;
    
    static {
        CREATOR = (Parcelable$Creator)new nlz();
    }
    
    public ciz() {
    }
    
    public ciz(final Bundle f0, final gta[] g0, final int h0, final di6 i0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int x1 = xd.x1(parcel, 20293);
        xd.g1(parcel, 1, this.F0);
        xd.v1(parcel, 2, (Parcelable[])this.G0, n);
        xd.n1(parcel, 3, this.H0);
        xd.r1(parcel, 4, (Parcelable)this.I0, n);
        xd.B1(parcel, x1);
    }
}
