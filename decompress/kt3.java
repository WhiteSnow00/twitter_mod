import android.os.Parcelable;
import java.util.Arrays;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kt3 extends c5d
{
    public static final Parcelable$Creator<kt3> CREATOR;
    public final String D0;
    public final int E0;
    public final int F0;
    public final long G0;
    public final long H0;
    public final c5d[] I0;
    
    static {
        CREATOR = (Parcelable$Creator)new kt3$a();
    }
    
    public kt3(final Parcel parcel) {
        super("CHAP");
        final String string = parcel.readString();
        final int a = imw.a;
        this.D0 = string;
        this.E0 = parcel.readInt();
        this.F0 = parcel.readInt();
        this.G0 = parcel.readLong();
        this.H0 = parcel.readLong();
        final int int1 = parcel.readInt();
        this.I0 = new c5d[int1];
        for (int i = 0; i < int1; ++i) {
            this.I0[i] = (c5d)parcel.readParcelable(c5d.class.getClassLoader());
        }
    }
    
    public kt3(final String d0, final int e0, final int f0, final long g0, final long h0, final c5d[] i0) {
        super("CHAP");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    @Override
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && kt3.class == o.getClass()) {
            final kt3 kt3 = (kt3)o;
            if (this.E0 != kt3.E0 || this.F0 != kt3.F0 || this.G0 != kt3.G0 || this.H0 != kt3.H0 || !imw.a((Object)this.D0, (Object)kt3.D0) || !Arrays.equals(this.I0, kt3.I0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int e0 = this.E0;
        final int f0 = this.F0;
        final int n = (int)this.G0;
        final int n2 = (int)this.H0;
        final String d0 = this.D0;
        int hashCode;
        if (d0 != null) {
            hashCode = d0.hashCode();
        }
        else {
            hashCode = 0;
        }
        return ((((527 + e0) * 31 + f0) * 31 + n) * 31 + n2) * 31 + hashCode;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        parcel.writeString(this.D0);
        parcel.writeInt(this.E0);
        parcel.writeInt(this.F0);
        parcel.writeLong(this.G0);
        parcel.writeLong(this.H0);
        parcel.writeInt(this.I0.length);
        final c5d[] i2 = this.I0;
        int length;
        for (length = i2.length, i = 0; i < length; ++i) {
            parcel.writeParcelable((Parcelable)i2[i], 0);
        }
    }
}
