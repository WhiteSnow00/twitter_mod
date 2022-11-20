import android.os.Parcel;
import com.twitter.model.vibe.Vibe;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vf3 implements Parcelable, s4d
{
    public static final Parcelable$Creator<vf3> CREATOR;
    public final iyk A1;
    public final ybf B1;
    public final long C1;
    public boolean D0;
    public final qum D1;
    public int E0;
    public boolean F0;
    public int G0;
    public int H0;
    public int I0;
    public oyl J0;
    public boolean K0;
    public final cfu L0;
    public final cfu M0;
    public final long N0;
    public final long O0;
    public final long P0;
    public final String Q0;
    public final long R0;
    public final int S0;
    public final String T0;
    public final String U0;
    public final dv6 V0;
    public final qev W0;
    public final bj3 X0;
    public final hwv Y0;
    public final ak3 Z0;
    public final String a1;
    public final iq6 b1;
    public final long c1;
    public final boolean d1;
    public final yfx e1;
    public final jz1 f1;
    public final String g1;
    public final qdu h1;
    public final String i1;
    public final String j1;
    public final long k1;
    public final long l1;
    public final qqx m1;
    public final String n1;
    public final boolean o1;
    public final String p1;
    public final h6w q1;
    public final long r1;
    public final tg5 s1;
    public final heu t1;
    public final hfu u1;
    public final wzv v1;
    public final oou w1;
    public final on4 x1;
    public final Vibe y1;
    public final qq9 z1;
    
    static {
        CREATOR = (Parcelable$Creator)new vf3$a();
    }
    
    public vf3(final Parcel parcel) {
        this.C1 = parcel.readLong();
        this.h1 = (qdu)dwj.h(parcel, (rlp)qdu.O0);
        this.N0 = parcel.readLong();
        this.O0 = parcel.readLong();
        this.P0 = parcel.readLong();
        this.Q0 = parcel.readString();
        final int int1 = parcel.readInt();
        final boolean b = false;
        this.F0 = (int1 == 1);
        this.D0 = (parcel.readInt() == 1);
        this.G0 = parcel.readInt();
        this.H0 = parcel.readInt();
        this.E0 = parcel.readInt();
        this.R0 = parcel.readLong();
        this.I0 = parcel.readInt();
        this.T0 = parcel.readString();
        this.U0 = parcel.readString();
        this.S0 = parcel.readInt();
        this.V0 = (dv6)dwj.h(parcel, (rlp)dv6.c);
        this.W0 = (qev)dwj.h(parcel, (rlp)qev.m);
        this.k1 = parcel.readLong();
        this.q1 = (h6w)dwj.h(parcel, (rlp)h6w.L0);
        this.X0 = (bj3)dwj.h(parcel, (rlp)bj3.i);
        this.Y0 = (hwv)dwj.h(parcel, (rlp)hwv.l);
        this.c1 = parcel.readLong();
        final cfu$b j0 = cfu.J0;
        this.L0 = (cfu)dwj.h(parcel, (rlp)j0);
        this.M0 = (cfu)dwj.h(parcel, (rlp)j0);
        this.l1 = parcel.readLong();
        this.m1 = (qqx)dwj.h(parcel, (rlp)qqx.e);
        this.n1 = parcel.readString();
        this.D1 = (qum)dwj.h(parcel, (rlp)qum.g);
        this.o1 = (parcel.readInt() == 1);
        this.Z0 = (ak3)dwj.h(parcel, (rlp)ak3.c);
        this.p1 = parcel.readString();
        this.a1 = parcel.readString();
        this.b1 = (iq6)dwj.h(parcel, (rlp)iq6.c);
        this.d1 = (parcel.readInt() == 1);
        this.e1 = (yfx)dwj.h(parcel, (rlp)yfx.f);
        this.f1 = (jz1)dwj.h(parcel, (rlp)jz1.g);
        this.g1 = parcel.readString();
        final oyl oyl = (oyl)dwj.h(parcel, (rlp)oyl.c);
        oyl a = null;
        Label_0504: {
            if (oyl != null) {
                a = oyl;
                if (!this.D0) {
                    break Label_0504;
                }
                a = oyl;
                if (oyl.a != null) {
                    break Label_0504;
                }
            }
            a = oyl.Companion.a(this.D0, this.E0);
        }
        this.J0 = a;
        this.i1 = parcel.readString();
        this.j1 = parcel.readString();
        this.r1 = parcel.readLong();
        this.s1 = (tg5)dwj.h(parcel, (rlp)tg5.I);
        this.v1 = (wzv)dwj.h(parcel, (rlp)wzv.b);
        this.w1 = (oou)dwj.h(parcel, (rlp)oou.b);
        boolean k0 = b;
        if (parcel.readInt() == 1) {
            k0 = true;
        }
        this.K0 = k0;
        this.x1 = (on4)dwj.h(parcel, (rlp)on4$a.b);
        this.y1 = (Vibe)dwj.h(parcel, Vibe.SERIALIZER);
        this.z1 = (qq9)dwj.h(parcel, (rlp)qq9.f);
        this.A1 = (iyk)dwj.h(parcel, (rlp)iyk.e);
        this.t1 = (heu)dwj.h(parcel, (rlp)heu.b);
        this.u1 = (hfu)dwj.h(parcel, (rlp)hfu.c);
        this.B1 = (ybf)dwj.h(parcel, (rlp)ybf.b);
    }
    
    public vf3(final b b) {
        this.C1 = b.b;
        this.h1 = b.c;
        this.N0 = b.d;
        this.O0 = b.e;
        this.P0 = b.f;
        this.Q0 = b.g;
        this.F0 = b.h;
        this.D0 = b.i;
        this.G0 = b.j;
        this.H0 = b.k;
        this.E0 = b.l;
        this.R0 = b.m;
        this.I0 = b.n;
        String o;
        if ((o = b.o) == null) {
            o = "und";
        }
        this.T0 = o;
        this.U0 = b.p;
        this.S0 = b.q;
        this.V0 = b.r;
        this.W0 = b.s;
        this.k1 = b.t;
        this.q1 = b.G;
        this.X0 = b.u;
        this.Y0 = b.v;
        this.c1 = b.x;
        final cfu y = b.y;
        final cfu k0 = cfu.K0;
        cfu l0;
        if ((l0 = y) == null) {
            l0 = k0;
        }
        this.L0 = l0;
        cfu m0;
        if ((m0 = b.z) == null) {
            m0 = xli.s0(l0);
        }
        this.M0 = m0;
        this.l1 = b.A;
        this.m1 = b.w;
        this.n1 = b.B;
        final qum$a c = b.C;
        qum d1;
        if (c != null) {
            d1 = (qum)((n4j)c).e();
        }
        else {
            d1 = null;
        }
        this.D1 = d1;
        this.o1 = b.D;
        this.Z0 = b.E;
        this.p1 = b.F;
        this.a1 = b.H;
        this.b1 = b.I;
        this.d1 = b.J;
        this.e1 = b.K;
        this.f1 = b.L;
        this.g1 = b.M;
        this.J0 = b.O;
        this.j1 = b.N;
        this.i1 = b.P;
        this.r1 = b.Q;
        this.s1 = b.R;
        this.t1 = b.S;
        this.u1 = b.a0;
        this.v1 = b.T;
        this.w1 = b.U;
        this.K0 = b.V;
        this.x1 = b.W;
        this.y1 = b.X;
        this.z1 = b.Y;
        this.A1 = b.Z;
        this.B1 = b.b0;
    }
    
    public final String X0() {
        return String.valueOf(this.a(false));
    }
    
    public final long a(final boolean b) {
        if (b) {
            final qum d1 = this.D1;
            if (d1 != null) {
                return d1.a;
            }
        }
        return this.C1;
    }
    
    public final boolean b() {
        return this.l1 > 0L;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (!(o instanceof vf3)) {
                return b2;
            }
            final vf3 vf3 = (vf3)o;
            final boolean b3 = this == vf3 || (vf3 != null && this.C1 == vf3.C1);
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    public final long getId() {
        return this.a(false);
    }
    
    @Override
    public final int hashCode() {
        return c5j.d(this.C1);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.C1);
        dwj.l(parcel, (Object)this.h1, (rlp)qdu.O0);
        parcel.writeLong(this.N0);
        parcel.writeLong(this.O0);
        parcel.writeLong(this.P0);
        parcel.writeString(this.Q0);
        parcel.writeInt((int)(this.F0 ? 1 : 0));
        parcel.writeInt((int)(this.D0 ? 1 : 0));
        parcel.writeInt(this.G0);
        parcel.writeInt(this.H0);
        parcel.writeInt(this.E0);
        parcel.writeLong(this.R0);
        parcel.writeInt(this.I0);
        parcel.writeString(this.T0);
        parcel.writeString(this.U0);
        parcel.writeInt(this.S0);
        dwj.l(parcel, (Object)this.V0, (rlp)dv6.c);
        dwj.l(parcel, (Object)this.W0, (rlp)qev.m);
        parcel.writeLong(this.k1);
        dwj.l(parcel, (Object)this.q1, (rlp)h6w.L0);
        dwj.l(parcel, (Object)this.X0, (rlp)bj3.i);
        dwj.l(parcel, (Object)this.Y0, (rlp)hwv.l);
        parcel.writeLong(this.c1);
        final cfu l0 = this.L0;
        final cfu$b j0 = cfu.J0;
        dwj.l(parcel, (Object)l0, (rlp)j0);
        dwj.l(parcel, (Object)this.M0, (rlp)j0);
        parcel.writeLong(this.l1);
        dwj.l(parcel, (Object)this.m1, (rlp)qqx.e);
        parcel.writeString(this.n1);
        dwj.l(parcel, (Object)this.D1, (rlp)qum.g);
        parcel.writeInt((int)(this.o1 ? 1 : 0));
        dwj.l(parcel, (Object)this.Z0, (rlp)ak3.c);
        parcel.writeString(this.p1);
        parcel.writeString(this.a1);
        dwj.l(parcel, (Object)this.b1, (rlp)iq6.c);
        parcel.writeInt((int)(this.d1 ? 1 : 0));
        dwj.l(parcel, (Object)this.e1, (rlp)yfx.f);
        dwj.l(parcel, (Object)this.f1, (rlp)jz1.g);
        parcel.writeString(this.g1);
        dwj.l(parcel, (Object)this.J0, (rlp)oyl.c);
        parcel.writeString(this.i1);
        parcel.writeString(this.j1);
        parcel.writeLong(this.r1);
        dwj.l(parcel, (Object)this.s1, (rlp)tg5.I);
        dwj.l(parcel, (Object)this.v1, (rlp)wzv.b);
        dwj.l(parcel, (Object)this.w1, (rlp)oou.b);
        parcel.writeInt((int)(this.K0 ? 1 : 0));
        dwj.l(parcel, (Object)this.x1, (rlp)on4$a.b);
        dwj.l(parcel, (Object)this.y1, Vibe.SERIALIZER);
        dwj.l(parcel, (Object)this.z1, (rlp)qq9.f);
        dwj.l(parcel, (Object)this.A1, (rlp)iyk.e);
        dwj.l(parcel, (Object)this.t1, (rlp)heu.b);
        dwj.l(parcel, (Object)this.u1, (rlp)hfu.c);
        dwj.l(parcel, (Object)this.B1, (rlp)ybf.b);
    }
    
    public static final class b extends n4j<vf3>
    {
        public long A;
        public String B;
        public qum$a C;
        public boolean D;
        public ak3 E;
        public String F;
        public h6w G;
        public String H;
        public iq6 I;
        public boolean J;
        public yfx K;
        public jz1 L;
        public String M;
        public String N;
        public oyl O;
        public String P;
        public long Q;
        public tg5 R;
        public heu S;
        public wzv T;
        public oou U;
        public boolean V;
        public on4 W;
        public Vibe X;
        public qq9 Y;
        public iyk Z;
        public boolean a;
        public hfu a0;
        public long b;
        public ybf b0;
        public qdu c;
        public long d;
        public long e;
        public long f;
        public String g;
        public boolean h;
        public boolean i;
        public int j;
        public int k;
        public int l;
        public long m;
        public int n;
        public String o;
        public String p;
        public int q;
        public dv6 r;
        public qev s;
        public long t;
        public bj3 u;
        public hwv v;
        public qqx w;
        public long x;
        public cfu y;
        public cfu z;
        
        public b() {
            this.a = fes.d;
            this.b = -1L;
            this.k = -1;
            this.m = -1L;
            this.Q = -1L;
        }
        
        public b(final b b) {
            this.a = fes.d;
            this.b = -1L;
            this.k = -1;
            this.m = -1L;
            this.Q = -1L;
            this.b = b.b;
            this.c = b.c;
            this.y = b.y;
            this.d = b.d;
            this.e = b.e;
            this.f = b.f;
            this.g = b.g;
            this.h = b.h;
            this.i = b.i;
            this.j = b.j;
            this.k = b.k;
            this.l = b.l;
            this.m = b.m;
            this.n = b.n;
            this.o = b.o;
            this.p = b.p;
            this.q = b.q;
            this.r = b.r;
            this.s = b.s;
            this.t = b.t;
            this.G = b.G;
            this.u = b.u;
            this.v = b.v;
            this.w = b.w;
            this.x = b.x;
            this.A = b.A;
            this.B = b.B;
            this.C = b.C;
            this.F = b.F;
            this.H = b.H;
            this.I = b.I;
            this.J = b.J;
            this.K = b.K;
            this.L = b.L;
            this.M = b.M;
            this.N = b.N;
            this.O = b.O;
            this.P = b.P;
            this.Q = b.Q;
            this.R = b.R;
            this.S = b.S;
            this.T = b.T;
            this.U = b.U;
            this.V = b.V;
            this.W = b.W;
            this.X = b.X;
            this.Y = b.Y;
            this.Z = b.Z;
            this.a0 = b.a0;
            this.b0 = b.b0;
        }
        
        public b(final vf3 vf3) {
            this.a = fes.d;
            this.b = -1L;
            this.k = -1;
            this.m = -1L;
            this.Q = -1L;
            this.b = vf3.C1;
            this.c = vf3.h1;
            this.y = vf3.L0;
            this.d = vf3.N0;
            this.e = vf3.O0;
            this.f = vf3.P0;
            this.g = vf3.Q0;
            this.h = vf3.F0;
            this.i = vf3.D0;
            this.j = vf3.G0;
            this.k = vf3.H0;
            this.l = vf3.E0;
            this.m = vf3.R0;
            this.n = vf3.I0;
            this.o = vf3.T0;
            this.p = vf3.U0;
            this.q = vf3.S0;
            this.r = vf3.V0;
            this.s = vf3.W0;
            this.t = vf3.k1;
            this.G = vf3.q1;
            this.u = vf3.X0;
            this.v = vf3.Y0;
            this.w = vf3.m1;
            this.x = vf3.c1;
            this.A = vf3.l1;
            this.B = vf3.n1;
            final qum d1 = vf3.D1;
            qum$a c;
            if (d1 != null) {
                c = new qum$a(d1);
            }
            else {
                c = null;
            }
            this.C = c;
            this.F = vf3.p1;
            this.H = vf3.a1;
            this.I = vf3.b1;
            this.J = vf3.d1;
            this.K = vf3.e1;
            this.L = vf3.f1;
            this.M = vf3.g1;
            this.O = vf3.J0;
            this.P = vf3.i1;
            this.N = vf3.j1;
            this.Q = vf3.r1;
            this.R = vf3.s1;
            this.S = vf3.t1;
            this.T = vf3.v1;
            this.U = vf3.w1;
            this.V = vf3.K0;
            this.W = vf3.x1;
            this.X = vf3.y1;
            this.Y = vf3.z1;
            this.Z = vf3.A1;
            this.a0 = vf3.u1;
            this.b0 = vf3.B1;
        }
        
        public final Object i() {
            return new vf3(this);
        }
        
        public final boolean l() {
            return (!this.a || this.b > 0L) && this.c != null && (this.u == null || this.v == null);
        }
        
        public final void m() {
            final cfu y = this.y;
            final cfu k0 = cfu.K0;
            cfu cfu = y;
            if (y == null) {
                cfu = k0;
            }
            if (xli.k0((CharSequence)((oxm)cfu).D0, cfu.I0)) {
                this.q |= 0x10;
            }
            if (this.t > 0L) {
                this.q |= 0x2000;
            }
            final bj3 u = this.u;
            if (u != null) {
                final int q = this.q;
                final boolean i = u.k();
                final int n = 8;
                int n2;
                if (i) {
                    n2 = 16388;
                }
                else if (u.s()) {
                    n2 = 4;
                }
                else {
                    n2 = n;
                    if (!u.u()) {
                        u.v();
                        n2 = n;
                    }
                }
                int n3 = n2;
                if (u.x()) {
                    n3 = (n2 | 0x8000);
                }
                int n4 = n3;
                if (u.o()) {
                    n4 = (n3 | 0x1000);
                }
                this.q = (q | n4);
            }
            final int q2 = this.q;
            final pug g = cfu.I0.g;
            int j;
            final boolean b = (j = (g.j(dtg.c.F0) ? 1 : 0)) != 0;
            if (g.j(dtg.c.G0)) {
                j = ((b ? 1 : 0) | 0x200);
            }
            int n5 = j;
            if (g.j(dtg.c.H0)) {
                n5 = (j | 0x400);
            }
            int n6 = n5;
            if (g.l()) {
                n6 = (n5 | 0x1000);
            }
            this.q = (q2 | n6);
            final oyl o = this.O;
            if (o == null || (this.i && o.a == null)) {
                this.O = oyl.Companion.a(this.i, this.l);
            }
        }
        
        public final long o(final boolean b) {
            if (b) {
                final qum$a c = this.C;
                if (c != null) {
                    return c.a;
                }
            }
            return this.b;
        }
        
        public final b p(final int n) {
            this.l = Math.max(n, 0);
            return this;
        }
        
        public final b q(final int n) {
            this.n = Math.max(n, 0);
            return this;
        }
        
        public final b r(final int n) {
            this.j = Math.max(n, 0);
            return this;
        }
        
        public final b s(final long n) {
            this.m = Math.max(n, 0L);
            return this;
        }
    }
}
