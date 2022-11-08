import java.util.ArrayList;
import java.util.Collections;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k1r extends i1r
{
    public static final Parcelable$Creator<k1r> CREATOR;
    public final long C0;
    public final boolean D0;
    public final boolean E0;
    public final boolean F0;
    public final boolean G0;
    public final long H0;
    public final long I0;
    public final List<b> J0;
    public final boolean K0;
    public final long L0;
    public final int M0;
    public final int N0;
    public final int O0;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<k1r>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new k1r(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new k1r[n];
            }
        };
    }
    
    public k1r(final long c0, final boolean d0, final boolean e0, final boolean f0, final boolean g0, final long h0, final long i0, final List<b> list, final boolean k0, final long l0, final int m0, final int n0, final int o0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = Collections.unmodifiableList((List<? extends b>)list);
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = n0;
        this.O0 = o0;
    }
    
    public k1r(final Parcel parcel) {
        this.C0 = parcel.readLong();
        final byte byte1 = parcel.readByte();
        final boolean b = false;
        this.D0 = (byte1 == 1);
        this.E0 = (parcel.readByte() == 1);
        this.F0 = (parcel.readByte() == 1);
        this.G0 = (parcel.readByte() == 1);
        this.H0 = parcel.readLong();
        this.I0 = parcel.readLong();
        final int int1 = parcel.readInt();
        final ArrayList list = new ArrayList<Object>(int1);
        for (int i = 0; i < int1; ++i) {
            list.add(new b(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.J0 = Collections.unmodifiableList((List<? extends b>)list);
        boolean k0 = b;
        if (parcel.readByte() == 1) {
            k0 = true;
        }
        this.K0 = k0;
        this.L0 = parcel.readLong();
        this.M0 = parcel.readInt();
        this.N0 = parcel.readInt();
        this.O0 = parcel.readInt();
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        parcel.writeLong(this.C0);
        parcel.writeByte((byte)(byte)(this.D0 ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.E0 ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.F0 ? 1 : 0));
        parcel.writeByte((byte)(byte)(this.G0 ? 1 : 0));
        parcel.writeLong(this.H0);
        parcel.writeLong(this.I0);
        final int size = this.J0.size();
        parcel.writeInt(size);
        b b;
        for (i = 0; i < size; ++i) {
            b = this.J0.get(i);
            parcel.writeInt(b.a);
            parcel.writeLong(b.b);
            parcel.writeLong(b.c);
        }
        parcel.writeByte((byte)(byte)(this.K0 ? 1 : 0));
        parcel.writeLong(this.L0);
        parcel.writeInt(this.M0);
        parcel.writeInt(this.N0);
        parcel.writeInt(this.O0);
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
        
        public b(final int a, final long b, final long c, final k1r$a parcelable$Creator) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
