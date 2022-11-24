import java.util.ArrayList;
import java.util.Collections;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c3r extends a3r
{
    public static final Parcelable$Creator<c3r> CREATOR;
    public final long F0;
    public final boolean G0;
    public final boolean H0;
    public final boolean I0;
    public final boolean J0;
    public final long K0;
    public final long L0;
    public final List<b> M0;
    public final boolean N0;
    public final long O0;
    public final int P0;
    public final int Q0;
    public final int R0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<c3r>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new c3r(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new c3r[n];
            }
        };
    }
    
    public c3r(final long f0, final boolean g0, final boolean h0, final boolean i0, final boolean j0, final long k0, final long l0, final List<b> list, final boolean n0, final long o0, final int p13, final int q0, final int r0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = Collections.unmodifiableList((List<? extends b>)list);
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p13;
        this.Q0 = q0;
        this.R0 = r0;
    }
    
    public c3r(final Parcel parcel) {
        this.F0 = parcel.readLong();
        final byte byte1 = parcel.readByte();
        final boolean b = false;
        this.G0 = (byte1 == 1);
        this.H0 = (parcel.readByte() == 1);
        this.I0 = (parcel.readByte() == 1);
        this.J0 = (parcel.readByte() == 1);
        this.K0 = parcel.readLong();
        this.L0 = parcel.readLong();
        final int int1 = parcel.readInt();
        final ArrayList list = new ArrayList<Object>(int1);
        for (int i = 0; i < int1; ++i) {
            list.add(new b(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.M0 = Collections.unmodifiableList((List<? extends b>)list);
        boolean n0 = b;
        if (parcel.readByte() == 1) {
            n0 = true;
        }
        this.N0 = n0;
        this.O0 = parcel.readLong();
        this.P0 = parcel.readInt();
        this.Q0 = parcel.readInt();
        this.R0 = parcel.readInt();
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        parcel.writeLong(this.F0);
        parcel.writeByte((byte)(byte)(this.G0 ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.H0 ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.I0 ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.J0 ? 1 : 0));
        parcel.writeLong(this.K0);
        parcel.writeLong(this.L0);
        final int size = this.M0.size();
        parcel.writeInt(size);
        b b;
        for (i = 0; i < size; ++i) {
            b = this.M0.get(i);
            parcel.writeInt(b.a);
            parcel.writeLong(b.b);
            parcel.writeLong(b.c);
        }
        parcel.writeByte((byte)(byte)(this.N0 ? 1 : 0));
        parcel.writeLong(this.O0);
        parcel.writeInt(this.P0);
        parcel.writeInt(this.Q0);
        parcel.writeInt(this.R0);
    }
    
    public static final class b
    {
        public final int a;
        public final long b;
        public final long c;
        
        public b(final int a, final long b, final long c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public b(final int a, final long b, final long c, final c3r$a parcelable$Creator) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
