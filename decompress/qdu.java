import java.util.Objects;
import java.io.IOException;
import java.util.List;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qdu implements s4d
{
    public static final zr2<qdu, a> O0;
    public final UserIdentifier D0;
    public final String E0;
    public final String F0;
    @d5d
    public final int G0;
    public final String H0;
    public final xdw I0;
    public final boolean J0;
    public final boolean K0;
    @d5d
    public int L0;
    @d5d
    public long M0;
    public final List<pq4> N0;
    
    static {
        qdu.O0 = new b();
    }
    
    public qdu(final a a) {
        this.D0 = a.a;
        final String b = a.b;
        this.E0 = b;
        this.F0 = cgv.b(a.c, b);
        this.G0 = a.d;
        this.H0 = a.e;
        this.I0 = a.f;
        this.L0 = a.j;
        this.M0 = a.k;
        this.N0 = a.g;
        final Boolean h = a.h;
        final boolean b2 = false;
        this.J0 = (h != null && h);
        final Boolean i = a.i;
        boolean booleanValue = b2;
        if (i != null) {
            booleanValue = i;
        }
        this.K0 = booleanValue;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (o == null) {
                return b2;
            }
            b2 = b;
            if (!(o instanceof qdu)) {
                return b2;
            }
            final qdu qdu = (qdu)o;
            final boolean b3 = this == qdu || (this.D0.equals((Object)qdu.D0) && c5j.a((Object)this.E0, (Object)qdu.E0) && c5j.a((Object)this.F0, (Object)qdu.F0) && c5j.a((Object)this.J0, (Object)qdu.J0) && c5j.a((Object)this.K0, (Object)qdu.K0) && this.L0 == qdu.L0 && this.M0 == qdu.M0 && c5j.a((Object)this.N0, (Object)qdu.N0));
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    public final long getId() {
        return this.D0.getId();
    }
    
    @Override
    public final int hashCode() {
        return c5j.q((List)this.N0) + (((oqf.l(this.F0, oqf.l(this.E0, c5j.f((Object)this.D0) * 31, 31), 31) + (this.J0 ? 1 : 0)) * 31 + (this.K0 ? 1 : 0)) * 31 + this.L0) * 31;
    }
    
    public static final class a extends n4j<qdu>
    {
        public UserIdentifier a;
        public String b;
        public String c;
        public int d;
        public String e;
        public xdw f;
        public List<pq4> g;
        public Boolean h;
        public Boolean i;
        public int j;
        public long k;
        
        public a() {
            this.a = UserIdentifier.UNDEFINED;
            final gdd$b e0 = gdd.E0;
            final int a = c5j.a;
            this.g = (List<pq4>)e0;
            this.j = 0;
        }
        
        public a(final cgv cgv) {
            this.a = UserIdentifier.UNDEFINED;
            final gdd$b e0 = gdd.E0;
            final int a = c5j.a;
            this.g = (List<pq4>)e0;
            this.j = 0;
            this.a = cgv.f();
            this.b = cgv.K0;
            this.c = cgv.c();
            this.d = cgv.i1;
            this.e = cgv.E0;
            this.f = cgv.u1;
            this.j = cgv.I1;
            this.k = cgv.Z0;
            this.g = cgv.r1;
            this.h = cgv.B1;
            this.i = cgv.h();
        }
        
        public a(final qdu qdu) {
            this.a = UserIdentifier.UNDEFINED;
            final gdd$b e0 = gdd.E0;
            final int a = c5j.a;
            this.g = (List<pq4>)e0;
            this.j = 0;
            this.a = qdu.D0;
            this.b = qdu.E0;
            this.c = qdu.F0;
            this.d = qdu.G0;
            this.e = qdu.H0;
            this.f = qdu.I0;
            this.j = qdu.L0;
            this.k = qdu.M0;
            this.g = qdu.N0;
            this.h = qdu.J0;
            this.i = qdu.K0;
        }
        
        public final Object i() {
            return new qdu(this);
        }
        
        public final boolean l() {
            return this.a.isRegularUser();
        }
        
        public final boolean n() {
            if (!this.l()) {
                ho0.z("Tried to build user with an invalid id.");
                return false;
            }
            return true;
        }
        
        public final a o(List<pq4> e0) {
            if (e0 == null) {
                e0 = gdd.E0;
                final int a = c5j.a;
            }
            this.g = (List<pq4>)e0;
            return this;
        }
    }
    
    public static final class b extends zr2<qdu, a>
    {
        public b() {
            super(4);
        }
        
        public final void f(final wlp wlp, final Object o) throws IOException {
            final qdu qdu = (qdu)o;
            wlp.y(qdu.D0.getId()).E(qdu.E0).E(qdu.F0).x(qdu.G0).E(qdu.H0).x(qdu.L0).y(qdu.M0);
            ((y4j)xdw.b).c(wlp, (Object)qdu.I0);
            ((y4j)new vp4$a((rlp)pq4.a.b)).c(wlp, (Object)qdu.N0);
            final int a = c5j.a;
            wlp.r(qdu.J0).r(qdu.K0);
        }
        
        public final n4j g() {
            return new a();
        }
        
        public final void h(final vlp vlp, final n4j n4j, final int n) throws IOException, ClassNotFoundException {
            final a a = (a)n4j;
            final long y = vlp.y();
            Objects.requireNonNull(a);
            a.a = UserIdentifier.fromId(y);
            a.b = vlp.G();
            a.c = vlp.G();
            a.d = vlp.x();
            a.e = vlp.G();
            a.j = vlp.x();
            a.k = vlp.y();
            a.f = (xdw)((y4j)xdw.b).a(vlp);
            if (n < 2) {
                final gdd$b e0 = gdd.E0;
                final int a2 = c5j.a;
                a.o((List<pq4>)e0);
            }
            else {
                a.o((List<pq4>)((y4j)new vp4$a((rlp)pq4.a.b)).a(vlp));
            }
            if (n < 3) {
                a.h = Boolean.FALSE;
            }
            else {
                a.h = vlp.s();
            }
            if (n < 4) {
                a.i = Boolean.FALSE;
            }
            else {
                a.i = vlp.s();
            }
        }
    }
}
