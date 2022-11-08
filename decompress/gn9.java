import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gn9 implements Parcelable
{
    public static final Parcelable$Creator<gn9> CREATOR;
    public static final alp<gn9> J0;
    public final cxw C0;
    public final String D0;
    public final long E0;
    public final String F0;
    public final String G0;
    public final boolean H0;
    public final List<i2h> I0;
    
    static {
        gn9.J0 = new gn9.gn9$b();
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<gn9>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new gn9(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new gn9[n];
            }
        };
    }
    
    public gn9(final Parcel parcel) {
        this.D0 = parcel.readString();
        this.E0 = parcel.readLong();
        this.F0 = parcel.readString();
        this.G0 = parcel.readString();
        final byte byte1 = parcel.readByte();
        boolean h0 = true;
        if (byte1 != 1) {
            h0 = false;
        }
        this.H0 = h0;
        this.I0 = parcel.readArrayList(i2h.class.getClassLoader());
        this.C0 = (cxw)parcel.readParcelable(cxw.class.getClassLoader());
    }
    
    public gn9(final String d0, final long e0, final String f0, final boolean h0, final List<i2h> list, final cxw c0, final String g0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = ijf.x((List)list);
        this.C0 = c0;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && gn9.class == o.getClass()) {
            final gn9 gn9 = (gn9)o;
            return w4j.a((Object)this.D0, (Object)gn9.D0) && this.E0 == gn9.E0 && w4j.a((Object)this.F0, (Object)gn9.F0) && w4j.a((Object)this.G0, (Object)gn9.G0) && this.H0 == gn9.H0 && w4j.a((Object)this.C0, (Object)gn9.C0) && w4j.a((Object)this.I0, (Object)gn9.I0);
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
        final int e = l7k.e(this.G0, l7k.e(this.F0, (Long.valueOf(this.E0).hashCode() + hashCode2 * 31) * 31, 31), 31);
        final int h0 = this.H0 ? 1 : 0;
        final cxw c0 = this.C0;
        int hashCode3;
        if (c0 != null) {
            hashCode3 = c0.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final List<i2h> i0 = this.I0;
        if (i0 != null) {
            hashCode = i0.hashCode();
        }
        return ((e + h0) * 31 + hashCode3) * 31 + hashCode;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.D0);
        parcel.writeLong(this.E0);
        parcel.writeString(this.F0);
        parcel.writeString(this.G0);
        parcel.writeByte((byte)(byte)(this.H0 ? 1 : 0));
        parcel.writeList((List)this.I0);
        parcel.writeParcelable((Parcelable)this.C0, n);
    }
}
