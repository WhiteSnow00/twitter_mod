import java.util.Arrays;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z1c extends c5d
{
    public static final Parcelable$Creator<z1c> CREATOR;
    public final String D0;
    public final String E0;
    public final String F0;
    public final byte[] G0;
    
    static {
        CREATOR = (Parcelable$Creator)new z1c$a();
    }
    
    public z1c(final Parcel parcel) {
        super("GEOB");
        final String string = parcel.readString();
        final int a = imw.a;
        this.D0 = string;
        this.E0 = parcel.readString();
        this.F0 = parcel.readString();
        this.G0 = parcel.createByteArray();
    }
    
    public z1c(final String d0, final String e0, final String f0, final byte[] g0) {
        super("GEOB");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && z1c.class == o.getClass()) {
            final z1c z1c = (z1c)o;
            if (!imw.a((Object)this.D0, (Object)z1c.D0) || !imw.a((Object)this.E0, (Object)z1c.E0) || !imw.a((Object)this.F0, (Object)z1c.F0) || !Arrays.equals(this.G0, z1c.G0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final String d0 = this.D0;
        int hashCode = 0;
        int hashCode2;
        if (d0 != null) {
            hashCode2 = d0.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String e0 = this.E0;
        int hashCode3;
        if (e0 != null) {
            hashCode3 = e0.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String f0 = this.F0;
        if (f0 != null) {
            hashCode = f0.hashCode();
        }
        return Arrays.hashCode(this.G0) + (((527 + hashCode2) * 31 + hashCode3) * 31 + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final String c0 = super.C0;
        final String d0 = this.D0;
        final String e0 = this.E0;
        final String f0 = this.F0;
        return xa0.B(xpa.n(dia.o(f0, dia.o(e0, dia.o(d0, dia.o(c0, 36)))), c0, ": mimeType=", d0, ", filename="), e0, ", description=", f0);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.D0);
        parcel.writeString(this.E0);
        parcel.writeString(this.F0);
        parcel.writeByteArray(this.G0);
    }
}
