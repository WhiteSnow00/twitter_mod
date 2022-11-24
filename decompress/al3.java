import java.util.List;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class al3 implements n1p
{
    public static final Parcelable$Creator<al3> CREATOR;
    public final ck3 F0;
    public final b1p G0;
    
    static {
        CREATOR = (Parcelable$Creator)new al3$a();
    }
    
    public al3(final Parcel parcel) {
        final ck3 f0 = (ck3)swj.h(parcel, (nmp)ck3.i);
        vmw.g((Object)f0);
        this.F0 = f0;
        this.G0 = (b1p)swj.h(parcel, (nmp)b1p.x);
    }
    
    public al3(final ck3 f0, final b1p g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final List<ufv> G3(final Context context, final String s) {
        return ojf.v((Object)eg4.d(context, this.F0, s));
    }
    
    public final String X2() {
        final b1p g0 = this.G0;
        String f;
        if (g0 != null) {
            f = g0.f;
        }
        else {
            f = null;
        }
        String s = f;
        if (f == null) {
            s = "";
        }
        return s;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        swj.l(parcel, (Object)this.F0, (nmp)ck3.i);
        swj.l(parcel, (Object)this.G0, (nmp)b1p.x);
    }
}
