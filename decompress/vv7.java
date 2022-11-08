import java.util.List;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vv7 implements c0p
{
    public static final Parcelable$Creator<vv7> CREATOR;
    public final or7 C0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<vv7>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new vv7(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new vv7[n];
            }
        };
    }
    
    public vv7(final Parcel parcel) {
        final or7 c0 = (or7)yvj.h(parcel, (alp)qr7.b);
        pf8.r(c0);
        this.C0 = c0;
    }
    
    public vv7(final or7 c0) {
        this.C0 = c0;
    }
    
    @Override
    public final List<lev> G3(final Context context, final String v) {
        final or7 c0 = this.C0;
        final lev lev = new lev();
        lev.a = c0.k();
        lev.c = 6;
        lev.v = v;
        if (c0.L() != null) {
            lev.l = c0.L().a;
        }
        return ijf.v((Object)lev);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        yvj.l(parcel, (Object)this.C0, (alp)qr7.b);
    }
}
