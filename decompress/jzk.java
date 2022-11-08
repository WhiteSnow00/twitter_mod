import java.util.Arrays;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jzk extends c5d
{
    public static final Parcelable$Creator<jzk> CREATOR;
    public final String D0;
    public final byte[] E0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<jzk>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new jzk(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new jzk[n];
            }
        };
    }
    
    public jzk(final Parcel parcel) {
        super("PRIV");
        final String string = parcel.readString();
        final int a = imw.a;
        this.D0 = string;
        this.E0 = parcel.createByteArray();
    }
    
    public jzk(final String d0, final byte[] e0) {
        super("PRIV");
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && jzk.class == o.getClass()) {
            final jzk jzk = (jzk)o;
            if (!imw.a((Object)this.D0, (Object)jzk.D0) || !Arrays.equals(this.E0, jzk.E0)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final String d0 = this.D0;
        int hashCode;
        if (d0 != null) {
            hashCode = d0.hashCode();
        }
        else {
            hashCode = 0;
        }
        return Arrays.hashCode(this.E0) + (527 + hashCode) * 31;
    }
    
    @Override
    public final String toString() {
        final String c0 = super.C0;
        final String d0 = this.D0;
        final StringBuilder sb = new StringBuilder(dia.o(d0, dia.o(c0, 8)));
        sb.append(c0);
        sb.append(": owner=");
        sb.append(d0);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.D0);
        parcel.writeByteArray(this.E0);
    }
}
