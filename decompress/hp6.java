import com.twitter.util.user.UserIdentifier;
import java.util.Objects;
import com.twitter.model.vibe.Vibe;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.ArrayList;
import android.os.Parcel;
import java.util.Map;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hp6 implements Parcelable, s5d
{
    public static final Parcelable$Creator<hp6> CREATOR;
    public final vg3 F0;
    public final gjl G0;
    public final hp6 H0;
    public final boolean I0;
    public final agv J0;
    public final i2d K0;
    public final Long L0;
    public final long M0;
    public int N0;
    public final int O0;
    public final r7a[] P0;
    public final List<jx9> Q0;
    public final b1p R0;
    public final lxk S0;
    public final ufu T0;
    public final agv U0;
    public final kmu V0;
    public final kmu W0;
    public final yus X0;
    public final nnu Y0;
    public final Map<n0m$b$a, Long> Z0;
    public z1t a1;
    public final eeu b1;
    public final n0j c1;
    public final int d1;
    public final long e1;
    
    static {
        CREATOR = (Parcelable$Creator)new hp6$a();
    }
    
    public hp6(final Parcel parcel) {
        final ClassLoader classLoader = hp6.class.getClassLoader();
        this.F0 = (vg3)parcel.readParcelable(classLoader);
        this.O0 = parcel.readInt();
        this.G0 = (gjl)swj.h(parcel, (nmp)gjl.n);
        final int int1 = parcel.readInt();
        boolean i0 = false;
        hp6 h0;
        if (int1 == 1) {
            h0 = new hp6(parcel);
        }
        else {
            h0 = null;
        }
        this.H0 = h0;
        final long long1 = parcel.readLong();
        Long value;
        if (long1 == 0L) {
            value = null;
        }
        else {
            value = long1;
        }
        this.L0 = value;
        final ArrayList arrayList = parcel.readArrayList(classLoader);
        final int a = o5j.a;
        this.Q0 = arrayList;
        this.M0 = parcel.readLong();
        if (parcel.readInt() == 1) {
            i0 = true;
        }
        this.I0 = i0;
        final List list = (List)swj.h(parcel, (nmp)new ar4$a((nmp)olc.K0));
        r7a[] p;
        if (list == null) {
            p = null;
        }
        else {
            p = list.toArray(new r7a[list.size()]);
        }
        this.P0 = p;
        this.d1 = parcel.readInt();
        this.R0 = (b1p)swj.h(parcel, (nmp)b1p.x);
        this.e1 = parcel.readLong();
        final agv.c s0 = agv.S0;
        this.J0 = (agv)swj.h(parcel, (nmp)s0);
        this.a1 = (z1t)swj.h(parcel, (nmp)z1t.c);
        this.S0 = (lxk)swj.h(parcel, (nmp)lxk.c);
        this.T0 = (ufu)swj.h(parcel, (nmp)ufu.e);
        this.U0 = (agv)swj.h(parcel, (nmp)s0);
        final kmu.b h2 = kmu.h;
        this.V0 = (kmu)swj.h(parcel, (nmp)h2);
        this.W0 = (kmu)swj.h(parcel, (nmp)h2);
        this.K0 = (i2d)swj.h(parcel, (nmp)i2d.J0);
        this.Y0 = (nnu)swj.h(parcel, (nmp)nnu.d);
        final rx6$h a2 = rx6.a;
        Object f0;
        if ((f0 = swj.h(parcel, (nmp)new fr4((nmp)new sx6((Class)n0m$b$a.class), (nmp)rx6.c))) == null) {
            f0 = m3a.F0;
        }
        this.Z0 = (Map<n0m$b$a, Long>)f0;
        this.b1 = (eeu)swj.h(parcel, (nmp)eeu.e);
        this.c1 = null;
        this.X0 = (yus)swj.h(parcel, (nmp)yus.d);
        this.N0 = parcel.readInt();
    }
    
    public hp6(final b b) {
        this.F0 = b.g;
        this.O0 = b.e;
        this.G0 = b.k;
        this.H0 = b.f;
        this.L0 = b.o;
        Object q0;
        if ((q0 = b.q) == null) {
            q0 = h3a.F0;
        }
        this.Q0 = (List<jx9>)q0;
        this.R0 = b.n;
        this.M0 = b.l;
        this.I0 = b.m;
        this.P0 = b.p;
        this.d1 = b.t;
        this.e1 = b.u;
        this.J0 = b.r;
        this.K0 = b.s;
        this.a1 = b.x;
        this.S0 = b.w;
        this.T0 = b.y;
        this.U0 = b.z;
        this.V0 = b.A;
        this.W0 = b.B;
        this.Y0 = b.D;
        Object z0;
        if ((z0 = b.F) == null) {
            z0 = m3a.F0;
        }
        this.Z0 = (Map<n0m$b$a, Long>)z0;
        this.b1 = b.G;
        this.c1 = b.E;
        this.X0 = b.C;
        this.N0 = b.v;
    }
    
    public static String C(final hp6 hp6) {
        String x2;
        if (hp6 != null) {
            x2 = hp6.X2();
        }
        else {
            x2 = null;
        }
        return x2;
    }
    
    public static String y(final long n, final String s) {
        return String.format(Locale.US, "https://twitter.com/%1$s/status/%2$d", s, n);
    }
    
    public final String A() {
        return this.F0.j1.J0;
    }
    
    public final rfu B() {
        final vg3 f0 = this.F0;
        final rfu o0 = f0.O0;
        final rfu n0 = f0.N0;
        rfu rfu = o0;
        if (o0 == null) {
            rfu = n0;
        }
        return rfu;
    }
    
    public final boolean B0() {
        return (this.F0.U0 & 0x2000) != 0x0;
    }
    
    public final boolean C0() {
        return this.F0.R0 > 0L;
    }
    
    public final long D() {
        return this.F0.a(false);
    }
    
    public final boolean D0() {
        return this.F0.F1 != null;
    }
    
    public final String E() {
        return this.F0.N0.F0;
    }
    
    public final boolean E0() {
        return this.F0.n1 > 0L;
    }
    
    public final int F() {
        final String l1 = this.F0.l1;
        if (l1 == null) {
            return 1;
        }
        if (l1.isEmpty()) {
            return 3;
        }
        return 2;
    }
    
    public final boolean F0() {
        final int f = this.F();
        boolean b = true;
        if (f == 1) {
            b = false;
        }
        return b;
    }
    
    public final long G() {
        return this.F0.a(true);
    }
    
    public final boolean G0() {
        final uwv a1 = this.F0.a1;
        final boolean b = false;
        if (a1 == null || !a1.a(lyv.o1)) {
            final ck3 z0 = this.F0.Z0;
            boolean b2 = b;
            if (z0 == null) {
                return b2;
            }
            b2 = b;
            if (!"1493954797359222784:note".equals(z0.a)) {
                return b2;
            }
        }
        return true;
    }
    
    public final a5l H() {
        final apu y1 = this.F0.y1;
        a5l a5l;
        if (y1 == null) {
            a5l = a5l.I0;
        }
        else {
            a5l = y1.a;
        }
        return a5l;
    }
    
    public final boolean H0() {
        return (this.F0.U0 & 0x40) != 0x0;
    }
    
    public final uwv I() {
        if (this.O2()) {
            final rq k = this.G0.k;
            if (k != null) {
                return k.b;
            }
        }
        return null;
    }
    
    public final long J() {
        final vg3 f0 = this.F0;
        final fvm f2 = f0.F1;
        long n;
        if (f2 != null) {
            n = f2.b;
        }
        else {
            n = f0.j1.getId();
        }
        return n;
    }
    
    public final boolean J0() {
        return (this.F0.j1.I0 & 0x2) != 0x0;
    }
    
    public final boolean K0() {
        final hrx o1 = this.F0.o1;
        return o1 != null && o1.a();
    }
    
    public final void L0(final int n) {
        this.F0.G0 = Math.max(n, 0);
    }
    
    public final String M() {
        final vg3 f0 = this.F0;
        final fvm f2 = f0.F1;
        String s;
        if (f2 != null) {
            s = f2.c;
        }
        else {
            s = f0.j1.G0;
        }
        return s;
    }
    
    public final void M0(final int n) {
        this.F0.I0 = Math.max(n, 0);
    }
    
    public final boolean N0() {
        if (!this.P() && !this.U() && !this.c0()) {
            return this.B0() && this.F0.N0.K0.g.isEmpty();
        }
        return this.B0();
    }
    
    public final boolean O() {
        final ck3 z0 = this.F0.Z0;
        return z0 != null && z0.k();
    }
    
    public final boolean O2() {
        return this.G0 != null;
    }
    
    public final boolean P() {
        final jvg g = this.F0.N0.K0.g;
        final List<wtg$c> a = qvg.a;
        final Iterator<wtg> iterator = g.iterator();
        while (iterator.hasNext()) {
            if (qvg.r(iterator.next())) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean Q() {
        final jvg g = this.F0.N0.K0.g;
        final List<wtg$c> a = qvg.a;
        for (final wtg wtg : g) {
            if (qvg.v(wtg) && wtg.V0 == wtg$c.J0) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean R() {
        final boolean u = this.U();
        boolean b = false;
        if (!u) {
            final int u2 = this.F0.U0;
            if ((u2 & 0x4) == 0x0 && (u2 & 0x8) == 0x0) {
                return b;
            }
        }
        b = true;
        return b;
    }
    
    public final boolean S() {
        final ck3 z0 = this.F0.Z0;
        return z0 != null && z0.r();
    }
    
    public final boolean U() {
        final int u0 = this.F0.U0;
        boolean b = true;
        if ((u0 & 0x1) == 0x0) {
            b = false;
        }
        return b;
    }
    
    public final boolean V() {
        return kr4.t((Collection)this.Q0) ^ true;
    }
    
    public final boolean W() {
        return this.F0.K0 > 0;
    }
    
    public final boolean X() {
        final agv j0 = this.J0;
        return j0 != null && j0.O0 != -1 && flr.g((CharSequence)j0.P0);
    }
    
    public final String X2() {
        final b1p r0 = this.R0;
        if (r0 != null && flr.g((CharSequence)r0.f)) {
            return this.R0.f;
        }
        return "tweet";
    }
    
    public final boolean Y() {
        final vg3 f0 = this.F0;
        return f0.a1 != null || f0.Z0 != null;
    }
    
    public final String Y0() {
        return String.valueOf(this.D());
    }
    
    public final int a() {
        final vg3 f0 = this.F0;
        final int g0 = f0.G0;
        final zyk c1 = f0.C1;
        int a;
        if (c1 != null) {
            a = c1.a;
        }
        else {
            a = 0;
        }
        return g0 + a;
    }
    
    public final boolean a0() {
        final boolean b0 = this.B0();
        boolean b2 = true;
        if (b0) {
            if (kr4.k((Iterable)this.F0.N0.K0.a) <= 1) {
                b2 = false;
            }
            return b2;
        }
        return kr4.s((Iterable)this.F0.N0.K0.a) ^ true;
    }
    
    public final int b() {
        final vg3 f0 = this.F0;
        final int j0 = f0.J0;
        final zyk c1 = f0.C1;
        int c2;
        if (c1 != null) {
            c2 = c1.c;
        }
        else {
            c2 = 0;
        }
        return j0 + c2;
    }
    
    public final boolean b0() {
        final jvg g = this.F0.N0.K0.g;
        final List<wtg$c> a = qvg.a;
        final Iterator<wtg> iterator = g.iterator();
        while (iterator.hasNext()) {
            final boolean empty = iterator.next().p1.isEmpty();
            final boolean b = true;
            if (empty ^ true) {
                return b;
            }
        }
        return false;
    }
    
    public final int c() {
        final vg3 f0 = this.F0;
        final int k0 = f0.K0;
        final zyk c1 = f0.C1;
        int b;
        if (c1 != null) {
            b = c1.b;
        }
        else {
            b = 0;
        }
        return k0 + b;
    }
    
    public final boolean c0() {
        return qvg.p(this.F0.N0.K0.g);
    }
    
    public final int d() {
        final vg3 f0 = this.F0;
        final int i0 = f0.I0;
        final zyk c1 = f0.C1;
        int d;
        if (c1 != null) {
            d = c1.d;
        }
        else {
            d = 0;
        }
        return i0 + d;
    }
    
    public final boolean d0() {
        final ck3 z0 = this.F0.Z0;
        return z0 != null && z0.x();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final boolean e0() {
        return this.F0.g1 != null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof hp6 && this.D() == ((hp6)o).D());
    }
    
    public final Iterable<wtg> f() {
        return this.F0.N0.K0.g;
    }
    
    public final boolean f0() {
        final z1t a1 = this.a1;
        final boolean b = true;
        final boolean b2 = a1 != null && a1.b != null;
        boolean b3 = b;
        if (!b2) {
            b3 = (this.y0() && b);
        }
        return b3;
    }
    
    public final Iterable<w6w> g() {
        return this.F0.N0.K0.a;
    }
    
    public final boolean g0() {
        return (this.F0.j1.I0 & 0x200000) != 0x0;
    }
    
    public final long getId() {
        return this.D();
    }
    
    public final String h() {
        return qgv.b(this.u(), this.x());
    }
    
    public final boolean h0() {
        return (this.d1 & 0x2) != 0x0;
    }
    
    @Override
    public final int hashCode() {
        return o5j.d(this.D());
    }
    
    public final boolean j0() {
        return (this.d1 & 0x4) != 0x0;
    }
    
    public final wtg k() {
        return qvg.h(this.F0.N0.K0.g);
    }
    
    public final boolean k0() {
        return (this.d1 & 0x8) != 0x0;
    }
    
    public final qku l() {
        return this.F0.N0.K0;
    }
    
    public final boolean l0() {
        return (this.d1 & 0x10) != 0x0;
    }
    
    public final int n() {
        return this.F0.j1.N0;
    }
    
    public final boolean n0() {
        final gjl g0 = this.G0;
        return g0 != null && g0.d();
    }
    
    public final boolean o() {
        return this.F0.j1.L0;
    }
    
    public final boolean o0() {
        final String k1 = this.F0.k1;
        return k1 != null && !k1.isEmpty();
    }
    
    public final mew p() {
        final new k0 = this.F0.j1.K0;
        mew a;
        if (k0 == null) {
            a = null;
        }
        else {
            a = k0.a;
        }
        return a;
    }
    
    public final pcf s(final zcf zcf) {
        final vcf d1 = this.F0.D1;
        if (d1 != null) {
            final List a = d1.a;
            if (a != null) {
                for (final mcf mcf : a) {
                    if (zcf == mcf.a) {
                        return mcf.b;
                    }
                }
            }
        }
        return null;
    }
    
    public final boolean s0() {
        if (!this.D0()) {
            final gjl g0 = this.G0;
            if (g0 != null && g0.h && !g0.d()) {
                return true;
            }
        }
        return false;
    }
    
    public final String t() {
        final vg3 f0 = this.F0;
        final fvm f2 = f0.F1;
        String s;
        if (f2 != null) {
            s = f2.d;
        }
        else {
            s = f0.j1.H0;
        }
        return s;
    }
    
    public final boolean t0() {
        return this.L0 != null;
    }
    
    public final String u() {
        return this.F0.j1.H0;
    }
    
    public final long v() {
        long n;
        if (this.D0()) {
            n = this.w();
        }
        else {
            n = this.J();
        }
        return n;
    }
    
    public final boolean v0(final qgv qgv) {
        return this.J() == qgv.F0 && this.D() == qgv.m1;
    }
    
    public final long w() {
        return this.F0.j1.getId();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.F0, n);
        parcel.writeInt(this.O0);
        swj.l(parcel, (Object)this.G0, (nmp)gjl.n);
        int n2;
        if (this.H0 != null) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        parcel.writeInt(n2);
        final hp6 h0 = this.H0;
        if (h0 != null) {
            h0.writeToParcel(parcel, n);
        }
        final Long l0 = this.L0;
        long longValue;
        if (l0 != null) {
            longValue = l0;
        }
        else {
            longValue = 0L;
        }
        parcel.writeLong(longValue);
        parcel.writeList((List)this.Q0);
        parcel.writeLong(this.M0);
        parcel.writeInt((int)(this.I0 ? 1 : 0));
        final List y = ojf.y((Object[])this.P0);
        swj.l(parcel, (Object)ojf.y((Object[])y.toArray(new olc[y.size()])), (nmp)new ar4$a((nmp)olc.K0));
        parcel.writeInt(this.d1);
        swj.l(parcel, (Object)this.R0, (nmp)b1p.x);
        parcel.writeLong(this.e1);
        final agv j0 = this.J0;
        final agv.c s0 = agv.S0;
        swj.l(parcel, (Object)j0, (nmp)s0);
        swj.l(parcel, (Object)this.a1, (nmp)z1t.c);
        swj.l(parcel, (Object)this.S0, (nmp)lxk.c);
        swj.l(parcel, (Object)this.T0, (nmp)ufu.e);
        swj.l(parcel, (Object)this.U0, (nmp)s0);
        final kmu v0 = this.V0;
        final kmu.b h2 = kmu.h;
        swj.l(parcel, (Object)v0, (nmp)h2);
        swj.l(parcel, (Object)this.W0, (nmp)h2);
        swj.l(parcel, (Object)this.K0, (nmp)i2d.J0);
        swj.l(parcel, (Object)this.Y0, (nmp)nnu.d);
        final Map<n0m$b$a, Long> z0 = this.Z0;
        final rx6$h a = rx6.a;
        swj.l(parcel, (Object)z0, (nmp)new fr4((nmp)new sx6((Class)n0m$b$a.class), (nmp)rx6.c));
        swj.l(parcel, (Object)this.b1, (nmp)eeu.e);
        swj.l(parcel, (Object)this.X0, (nmp)yus.d);
        parcel.writeInt(this.N0);
    }
    
    public final String x() {
        return this.F0.j1.G0;
    }
    
    public final boolean y0() {
        final z1t a1 = this.a1;
        return a1 != null && a1.a != null;
    }
    
    public final boolean z0() {
        return jb2.w0(this.F0.j1.I0);
    }
    
    public static final class b extends z4j<hp6>
    {
        public kmu A;
        public kmu B;
        public yus C;
        public nnu D;
        public n0j E;
        public Map<n0m$b$a, Long> F;
        public eeu G;
        public final vg3$b a;
        public final geu$a b;
        public final fvm.a c;
        public boolean d;
        public int e;
        public hp6 f;
        public vg3 g;
        public boolean h;
        public double i;
        public double j;
        public gjl k;
        public long l;
        public boolean m;
        public b1p n;
        public Long o;
        public r7a[] p;
        public List<jx9> q;
        public agv r;
        public i2d s;
        public int t;
        public long u;
        public int v;
        public lxk w;
        public z1t x;
        public ufu y;
        public agv z;
        
        public b() {
            this.u = -1L;
            this.v = -1;
            this.a = new vg3$b();
            this.b = new geu$a();
            this.c = new fvm.a();
        }
        
        public b(final hp6 hp6) {
            this.u = -1L;
            this.v = -1;
            this.a = new vg3$b(hp6.F0);
            this.b = new geu$a(hp6.F0.j1);
            final fvm f1 = hp6.F0.F1;
            if (f1 != null) {
                this.c = new fvm.a(f1);
            }
            else {
                this.c = new fvm.a();
            }
            this.e = hp6.O0;
            this.h = hp6.D0();
            final jw6 x0 = hp6.F0.X0;
            if (x0 != null) {
                this.d = true;
                this.i = x0.a;
                this.j = x0.b;
            }
            this.k = hp6.G0;
            this.l = hp6.M0;
            this.m = hp6.I0;
            this.n = hp6.R0;
            this.f = hp6.H0;
            this.o = hp6.L0;
            this.p = hp6.P0;
            this.q = hp6.Q0;
            this.r = hp6.J0;
            this.s = hp6.K0;
            this.t = hp6.d1;
            this.u = hp6.e1;
            this.w = hp6.S0;
            this.x = hp6.a1;
            this.y = hp6.T0;
            this.z = hp6.U0;
            this.A = hp6.V0;
            this.B = hp6.W0;
            this.C = hp6.X0;
            this.D = hp6.Y0;
            this.F = hp6.Z0;
            this.G = hp6.b1;
            this.E = hp6.c1;
            this.v = hp6.N0;
        }
        
        @Deprecated
        public b(oh0 u) {
            this.u = -1L;
            this.v = -1;
            this.a = new vg3$b(u.K0);
            this.b = new geu$a(u.K0.j1);
            final fvm f1 = u.K0.F1;
            if (f1 != null) {
                this.c = new fvm.a(f1);
            }
            else {
                this.c = new fvm.a();
            }
            final jw6 x0 = u.K0.X0;
            if (x0 != null) {
                this.d = true;
                this.i = x0.a;
                this.j = x0.b;
            }
            this.k = u.M0;
            final gqu i0 = u.I0;
            if (i0 != null) {
                u = nv8.u(i0);
                if (u != null) {
                    this.f = (hp6)new b(u).e();
                }
            }
        }
        
        public final b A(final b1p n) {
            this.n = n;
            return this;
        }
        
        public final b B(final long u) {
            this.u = u;
            return this;
        }
        
        public final b C(final wfu a0) {
            this.a.a0 = a0;
            return this;
        }
        
        public final b D(final nnu d) {
            this.D = d;
            return this;
        }
        
        public final b E(final Vibe x) {
            this.a.X = x;
            return this;
        }
        
        public final Object i() {
            return new hp6(this);
        }
        
        public final void m() {
            final vg3$b a = this.a;
            final boolean d = this.d;
            final fvm.a a2 = null;
            jw6 r;
            if (d) {
                r = new jw6(this.i, this.j);
            }
            else {
                r = null;
            }
            a.r = r;
            a.c = (geu)((z4j)this.b).e();
            fvm.a c = a2;
            if (this.h) {
                c = this.c;
            }
            a.C = c;
            this.g = (vg3)((z4j)a).e();
        }
        
        public final b o(final to4 w) {
            this.a.W = w;
            return this;
        }
        
        public final b p(final int t) {
            this.t = t;
            return this;
        }
        
        public final b q(final tr9 y) {
            this.a.Y = y;
            return this;
        }
        
        public final b r(final kmu a) {
            this.A = a;
            return this;
        }
        
        public final b s(final boolean m) {
            this.m = m;
            return this;
        }
        
        public final b t(final vcf b0) {
            this.a.b0 = b0;
            return this;
        }
        
        public final b u(final n0j e) {
            this.E = e;
            return this;
        }
        
        public final b v(final long n) {
            final geu$a b = this.b;
            Objects.requireNonNull(b);
            b.a = UserIdentifier.fromId(n);
            return this;
        }
        
        public final b w(final List<jx9> q) {
            this.q = q;
            return this;
        }
        
        public final b x(final zyk z) {
            this.a.Z = z;
            return this;
        }
        
        public final b y(final hp6 f) {
            this.f = f;
            if (f != null) {
                this.a.t = f.D();
            }
            return this;
        }
        
        public final b z(final long l) {
            this.l = l;
            return this;
        }
    }
}
