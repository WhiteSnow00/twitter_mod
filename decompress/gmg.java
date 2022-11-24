import android.os.IInterface;
import android.os.Parcelable;
import android.os.Parcel;
import android.os.IBinder;
import com.google.android.gms.maps.model.LatLng;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gmg extends sd
{
    public static final Parcelable$Creator<gmg> CREATOR;
    public LatLng F0;
    public String G0;
    public String H0;
    public aef I0;
    public float J0;
    public float K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public float O0;
    public float P0;
    public float Q0;
    public float R0;
    public float S0;
    
    static {
        CREATOR = (Parcelable$Creator)new xbz();
    }
    
    public gmg() {
        this.J0 = 0.5f;
        this.K0 = 1.0f;
        this.M0 = true;
        this.N0 = false;
        this.O0 = 0.0f;
        this.P0 = 0.5f;
        this.Q0 = 0.0f;
        this.R0 = 1.0f;
    }
    
    public gmg(final LatLng f0, final String g0, final String h0, final IBinder binder, final float j0, final float k0, final boolean l0, final boolean m0, final boolean n0, final float o0, final float p14, final float q0, final float r0, final float s0) {
        this.J0 = 0.5f;
        this.K0 = 1.0f;
        this.M0 = true;
        this.N0 = false;
        this.O0 = 0.0f;
        this.P0 = 0.5f;
        this.Q0 = 0.0f;
        this.R0 = 1.0f;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        if (binder == null) {
            this.I0 = null;
        }
        else {
            this.I0 = new aef(l3d.a.x(binder));
        }
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p14;
        this.Q0 = q0;
        this.R0 = r0;
        this.S0 = s0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int x1 = xd.x1(parcel, 20293);
        xd.r1(parcel, 2, (Parcelable)this.F0, n);
        xd.s1(parcel, 3, this.G0);
        xd.s1(parcel, 4, this.H0);
        final aef i0 = this.I0;
        IBinder binder;
        if (i0 == null) {
            binder = null;
        }
        else {
            binder = ((IInterface)i0.F0).asBinder();
        }
        xd.m1(parcel, 5, binder);
        xd.k1(parcel, 6, this.J0);
        xd.k1(parcel, 7, this.K0);
        xd.e1(parcel, 8, this.L0);
        xd.e1(parcel, 9, this.M0);
        xd.e1(parcel, 10, this.N0);
        xd.k1(parcel, 11, this.O0);
        xd.k1(parcel, 12, this.P0);
        xd.k1(parcel, 13, this.Q0);
        xd.k1(parcel, 14, this.R0);
        xd.k1(parcel, 15, this.S0);
        xd.B1(parcel, x1);
    }
}
