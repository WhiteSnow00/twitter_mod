import java.util.List;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yw4 implements c0p
{
    public static final Parcelable$Creator<yw4> CREATOR;
    public final xw4 C0;
    
    static {
        CREATOR = (Parcelable$Creator)new yw4$a();
    }
    
    public yw4(final Parcel parcel) {
        final xw4 c0 = (xw4)yvj.h(parcel, (alp)xw4.b());
        pf8.r(c0);
        this.C0 = c0;
    }
    
    public yw4(final xw4 c0) {
        this.C0 = c0;
    }
    
    @Override
    public final List<lev> G3(final Context context, final String s) {
        final lev lev = new lev();
        lev.K0 = this.C0;
        return ijf.v((Object)lev);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        yvj.l(parcel, (Object)this.C0, (alp)xw4.b());
    }
}
