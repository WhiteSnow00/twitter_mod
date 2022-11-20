import android.os.IInterface;
import android.os.Parcelable;
import android.os.Parcel;
import android.os.IBinder;
import com.google.android.gms.maps.model.LatLng;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nlg extends rd
{
    public static final Parcelable$Creator<nlg> CREATOR;
    public LatLng D0;
    public String E0;
    public String F0;
    public ddf G0;
    public float H0;
    public float I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public float M0;
    public float N0;
    public float O0;
    public float P0;
    public float Q0;
    
    static {
        CREATOR = (Parcelable$Creator)new yaz();
    }
    
    public nlg() {
        this.H0 = 0.5f;
        this.I0 = 1.0f;
        this.K0 = true;
        this.L0 = false;
        this.M0 = 0.0f;
        this.N0 = 0.5f;
        this.O0 = 0.0f;
        this.P0 = 1.0f;
    }
    
    public nlg(final LatLng d0, final String e0, final String f0, final IBinder binder, final float h0, final float i0, final boolean j0, final boolean k0, final boolean l0, final float m0, final float n0, final float o0, final float p14, final float q0) {
        this.H0 = 0.5f;
        this.I0 = 1.0f;
        this.K0 = true;
        this.L0 = false;
        this.M0 = 0.0f;
        this.N0 = 0.5f;
        this.O0 = 0.0f;
        this.P0 = 1.0f;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        if (binder == null) {
            this.G0 = null;
        }
        else {
            this.G0 = new ddf(l2d$a.x(binder));
        }
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p14;
        this.Q0 = q0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d1 = fli.d1(parcel, 20293);
        fli.X0(parcel, 2, (Parcelable)this.D0, n);
        fli.Y0(parcel, 3, this.E0);
        fli.Y0(parcel, 4, this.F0);
        final ddf g0 = this.G0;
        IBinder binder;
        if (g0 == null) {
            binder = null;
        }
        else {
            binder = ((IInterface)g0.D0).asBinder();
        }
        fli.S0(parcel, 5, binder);
        fli.Q0(parcel, 6, this.H0);
        fli.Q0(parcel, 7, this.I0);
        fli.K0(parcel, 8, this.J0);
        fli.K0(parcel, 9, this.K0);
        fli.K0(parcel, 10, this.L0);
        fli.Q0(parcel, 11, this.M0);
        fli.Q0(parcel, 12, this.N0);
        fli.Q0(parcel, 13, this.O0);
        fli.Q0(parcel, 14, this.P0);
        fli.Q0(parcel, 15, this.Q0);
        fli.g1(parcel, d1);
    }
}
