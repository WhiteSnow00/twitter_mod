import java.util.Arrays;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zx1 extends h4d
{
    public static final Parcelable$Creator<zx1> CREATOR;
    public final byte[] E0;
    
    static {
        CREATOR = (Parcelable$Creator)new zx1$a();
    }
    
    public zx1(final Parcel parcel) {
        final String string = parcel.readString();
        final int a = cnw.a;
        super(string);
        this.E0 = parcel.createByteArray();
    }
    
    public zx1(final String s, final byte[] e0) {
        super(s);
        this.E0 = e0;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && zx1.class == o.getClass()) {
            final zx1 zx1 = (zx1)o;
            if (!super.D0.equals(zx1.D0) || !Arrays.equals(this.E0, zx1.E0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        return Arrays.hashCode(this.E0) + hmg.f(super.D0, 527, 31);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(super.D0);
        parcel.writeByteArray(this.E0);
    }
}
