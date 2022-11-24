import android.os.Parcelable;
import java.util.List;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wru implements n1p
{
    public static final Parcelable$Creator<wru> CREATOR;
    public final hp6 F0;
    
    static {
        CREATOR = (Parcelable$Creator)new wru$a();
    }
    
    public wru(final Parcel parcel) {
        this.F0 = (hp6)parcel.readParcelable(hp6.class.getClassLoader());
    }
    
    public wru(final hp6 f0) {
        this.F0 = f0;
    }
    
    public final List<ufv> G3(final Context context, final String s) {
        return eg4.k(context, this.F0, s);
    }
    
    public final String X2() {
        return hp6.C(this.F0);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.F0, n);
    }
}
