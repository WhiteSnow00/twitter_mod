import android.os.Parcelable;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m6g extends rd implements psm
{
    public static final Parcelable$Creator<m6g> CREATOR;
    public final Status D0;
    public final n6g E0;
    
    static {
        CREATOR = (Parcelable$Creator)new fcy();
    }
    
    public m6g(final Status d0) {
        this.D0 = d0;
        this.E0 = null;
    }
    
    public m6g(final Status d0, final n6g e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final Status l() {
        return this.D0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int d1 = fli.d1(parcel, 20293);
        fli.X0(parcel, 1, (Parcelable)this.D0, n);
        fli.X0(parcel, 2, (Parcelable)this.E0, n);
        fli.g1(parcel, d1);
    }
}
