import java.io.IOException;
import java.util.Objects;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agv implements Parcelable, o5t
{
    public static final Parcelable$Creator<agv> CREATOR;
    public static final ss2<agv, b> S0;
    public final int F0;
    public final String G0;
    public final int H0;
    public final int I0;
    public final int J0;
    public final int K0;
    public final String L0;
    public final int M0;
    public final String N0;
    public final int O0;
    public final String P0;
    public final c9t Q0;
    public final List<String> R0;
    
    static {
        agv.S0 = new c();
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<agv>() {
            public final Object createFromParcel(final Parcel parcel) {
                return new agv(parcel);
            }
            
            public final Object[] newArray(final int n) {
                return new agv[n];
            }
        };
    }
    
    public agv(final b b) {
        this.F0 = b.a;
        this.G0 = b.e;
        this.H0 = b.b;
        this.I0 = b.c;
        this.J0 = b.d;
        this.K0 = b.f;
        this.L0 = b.g;
        this.M0 = b.h;
        this.N0 = b.i;
        this.O0 = b.j;
        this.P0 = b.k;
        this.Q0 = b.l;
        Object r0;
        if ((r0 = b.m) == null) {
            r0 = h3a.F0;
        }
        this.R0 = (List<String>)r0;
    }
    
    public agv(final Parcel parcel) {
        this.F0 = parcel.readInt();
        this.G0 = parcel.readString();
        this.H0 = parcel.readInt();
        this.I0 = parcel.readInt();
        this.J0 = parcel.readInt();
        this.K0 = parcel.readInt();
        this.L0 = parcel.readString();
        this.M0 = parcel.readInt();
        this.N0 = parcel.readString();
        this.O0 = parcel.readInt();
        this.P0 = parcel.readString();
        this.Q0 = (c9t)swj.h(parcel, (nmp)c9t.a);
        this.R0 = parcel.createStringArrayList();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (!(o instanceof agv)) {
                return b2;
            }
            final agv agv = (agv)o;
            final boolean b3 = this == agv || (agv != null && this.F0 == agv.F0 && o5j.a((Object)this.G0, (Object)agv.G0) && this.H0 == agv.H0 && this.J0 == agv.J0 && this.I0 == agv.I0 && this.K0 == agv.K0 && o5j.a((Object)this.L0, (Object)agv.L0) && this.M0 == agv.M0 && o5j.a((Object)this.N0, (Object)agv.N0) && this.O0 == agv.O0 && o5j.a((Object)this.P0, (Object)agv.P0) && o5j.a((Object)this.Q0, (Object)agv.Q0) && o5j.a((Object)this.R0, (Object)agv.R0));
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return o5j.q((List)this.R0) + (o5j.f((Object)this.Q0) + ffe.l(this.P0, (ffe.l(this.N0, (ffe.l(this.L0, ((((ffe.l(this.G0, this.F0 * 31, 31) + this.H0) * 31 + this.I0) * 31 + this.J0) * 31 + this.K0) * 31, 31) + this.M0) * 31, 31) + this.O0) * 31, 31)) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("TwitterSocialProof{type=");
        f.append(this.F0);
        f.append(", name='");
        go9.r(f, this.G0, '\'', ", favoriteCount=");
        f.append(this.H0);
        f.append(", retweetCount=");
        f.append(this.I0);
        f.append(", followCount=");
        f.append(this.J0);
        f.append(", friendship=");
        f.append(this.K0);
        f.append(", secondName='");
        go9.r(f, this.L0, '\'', ", othersCount=");
        f.append(this.M0);
        f.append(", text='");
        go9.r(f, this.N0, '\'', ", serverType=");
        f.append(this.O0);
        f.append(", serverText='");
        go9.r(f, this.P0, '\'', ", serverUrl=");
        f.append(this.Q0);
        f.append(", serverContextImageUrls=");
        f.append(this.R0);
        f.append('}');
        return f.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.F0);
        parcel.writeString(this.G0);
        parcel.writeInt(this.H0);
        parcel.writeInt(this.I0);
        parcel.writeInt(this.J0);
        parcel.writeInt(this.K0);
        parcel.writeString(this.L0);
        parcel.writeInt(this.M0);
        parcel.writeString(this.N0);
        parcel.writeInt(this.O0);
        parcel.writeString(this.P0);
        swj.l(parcel, (Object)this.Q0, (nmp)c9t.a);
        parcel.writeStringList((List)this.R0);
    }
    
    public static final class b extends z4j<agv>
    {
        public int a;
        public int b;
        public int c;
        public int d;
        public String e;
        public int f;
        public String g;
        public int h;
        public String i;
        public int j;
        public String k;
        public c9t l;
        public List<String> m;
        
        public b() {
            this.a = -1;
            this.f = 0;
            this.j = -1;
        }
        
        public final Object i() {
            return new agv(this);
        }
        
        public final boolean k() {
            return this.a != -1 || this.f != 0 || this.j != -1;
        }
    }
    
    public static final class c extends ss2<agv, b>
    {
        public c() {
            super(3);
        }
        
        public final void f(smp g, final Object o) throws IOException {
            final agv agv = (agv)o;
            g = g.z(agv.F0).z(agv.H0).z(agv.I0).z(agv.J0).G(agv.G0).z(agv.K0).G(agv.L0).z(agv.M0).G(agv.N0).z(agv.O0).G(agv.P0);
            final c9t q0 = agv.Q0;
            final tx6 a = c9t.a;
            Objects.requireNonNull(g);
            ((k5j)a).c(g, (Object)q0);
            final int a2 = o5j.a;
            j98.k(rx6.f, g, (List)agv.R0);
        }
        
        public final z4j g() {
            return new b();
        }
        
        public final void h(final rmp rmp, final z4j z4j, final int n) throws IOException, ClassNotFoundException {
            final b b = (b)z4j;
            b.a = rmp.z();
            b.b = rmp.z();
            b.c = rmp.z();
            b.d = rmp.z();
            b.e = rmp.I();
            b.f = rmp.z();
            b.g = rmp.I();
            b.h = rmp.z();
            b.i = rmp.I();
            b.j = rmp.z();
            b.k = rmp.I();
            if (n < 2) {
                final String i = rmp.I();
                if (flr.g((CharSequence)i)) {
                    final ief$a ief$a = new ief$a();
                    ief$a.a = i;
                    b.l = (c9t)((z4j)ief$a).e();
                }
            }
            else {
                b.l = (c9t)((k5j)c9t.a).a(rmp);
            }
            if (n < 3) {
                gmp.d(rmp);
            }
            b.m = (List)m58.u(rx6.f, rmp);
        }
    }
}
