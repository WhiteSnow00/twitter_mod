import android.os.Parcelable;
import java.util.Arrays;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lt3 extends c5d
{
    public static final Parcelable$Creator<lt3> CREATOR;
    public final String D0;
    public final boolean E0;
    public final boolean F0;
    public final String[] G0;
    public final c5d[] H0;
    
    static {
        CREATOR = (Parcelable$Creator)new lt3$a();
    }
    
    public lt3(final Parcel parcel) {
        super("CTOC");
        final String string = parcel.readString();
        final int a = imw.a;
        this.D0 = string;
        final byte byte1 = parcel.readByte();
        final boolean b = true;
        int i = 0;
        this.E0 = (byte1 != 0);
        this.F0 = (parcel.readByte() != 0 && b);
        this.G0 = parcel.createStringArray();
        final int int1 = parcel.readInt();
        this.H0 = new c5d[int1];
        while (i < int1) {
            this.H0[i] = (c5d)parcel.readParcelable(c5d.class.getClassLoader());
            ++i;
        }
    }
    
    public lt3(final String d0, final boolean e0, final boolean f0, final String[] g0, final c5d[] h0) {
        super("CTOC");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && lt3.class == o.getClass()) {
            final lt3 lt3 = (lt3)o;
            if (this.E0 != lt3.E0 || this.F0 != lt3.F0 || !imw.a((Object)this.D0, (Object)lt3.D0) || !Arrays.equals(this.G0, lt3.G0) || !Arrays.equals(this.H0, lt3.H0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int e0 = this.E0 ? 1 : 0;
        final int f0 = this.F0 ? 1 : 0;
        final String d0 = this.D0;
        int hashCode;
        if (d0 != null) {
            hashCode = d0.hashCode();
        }
        else {
            hashCode = 0;
        }
        return ((527 + e0) * 31 + f0) * 31 + hashCode;
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        parcel.writeString(this.D0);
        parcel.writeByte((byte)(byte)(this.E0 ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.F0 ? 1 : 0));
        parcel.writeStringArray(this.G0);
        parcel.writeInt(this.H0.length);
        final c5d[] h0 = this.H0;
        int length;
        for (length = h0.length, i = 0; i < length; ++i) {
            parcel.writeParcelable((Parcelable)h0[i], 0);
        }
    }
}
