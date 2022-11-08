import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hzf extends cbu
{
    public static final Parcelable$Creator<hzf> CREATOR;
    public final String E0;
    public final hil F0;
    
    static {
        CREATOR = (Parcelable$Creator)new hzf$a();
    }
    
    public hzf(final Parcel parcel) {
        super(parcel);
        final String string = parcel.readString();
        pf8.q(string);
        this.E0 = string;
        this.F0 = (hil)parcel.readValue(hil.class.getClassLoader());
    }
    
    public hzf(final vo6 vo6, final String e0, final hil f0) {
        super(vo6);
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final o0v d() {
        return (o0v)new kzf(super.C0, this.E0, this.F0);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeString(this.E0);
        parcel.writeValue((Object)this.F0);
    }
}
