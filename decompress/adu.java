import java.util.Objects;
import java.io.IOException;
import java.util.List;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adu implements n5d
{
    public static final js2<adu, a> N0;
    public final UserIdentifier C0;
    public final String D0;
    public final String E0;
    @y5d
    public final int F0;
    public final String G0;
    public final kdw H0;
    public final boolean I0;
    public final boolean J0;
    @y5d
    public int K0;
    @y5d
    public long L0;
    public final List<rr4> M0;
    
    static {
        adu.N0 = new b();
    }
    
    public adu(final a a) {
        this.C0 = a.a;
        final String b = a.b;
        this.D0 = b;
        this.E0 = hfv.b(a.c, b);
        this.F0 = a.d;
        this.G0 = a.e;
        this.H0 = a.f;
        this.K0 = a.j;
        this.L0 = a.k;
        this.M0 = a.g;
        final Boolean h = a.h;
        final boolean b2 = false;
        this.I0 = (h != null && h);
        final Boolean i = a.i;
        boolean booleanValue = b2;
        if (i != null) {
            booleanValue = i;
        }
        this.J0 = booleanValue;
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
            if (!(o instanceof adu)) {
                return b2;
            }
            final adu adu = (adu)o;
            final boolean b3 = this == adu || (this.C0.equals((Object)adu.C0) && w4j.a((Object)this.D0, (Object)adu.D0) && w4j.a((Object)this.E0, (Object)adu.E0) && w4j.a((Object)this.I0, (Object)adu.I0) && w4j.a((Object)this.J0, (Object)adu.J0) && this.K0 == adu.K0 && this.L0 == adu.L0 && w4j.a((Object)this.M0, (Object)adu.M0));
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    @Override
    public final long getId() {
        return this.C0.getId();
    }
    
    @Override
    public final int hashCode() {
        return w4j.q((List)this.M0) + (((l7k.e(this.E0, l7k.e(this.D0, w4j.f((Object)this.C0) * 31, 31), 31) + (this.I0 ? 1 : 0)) * 31 + (this.J0 ? 1 : 0)) * 31 + this.K0) * 31;
    }
    
    public static final class a extends h4j<adu>
    {
        public UserIdentifier a;
        public String b;
        public String c;
        public int d;
        public String e;
        public kdw f;
        public List<rr4> g;
        public Boolean h;
        public Boolean i;
        public int j;
        public long k;
        
        public a() {
            this.a = UserIdentifier.UNDEFINED;
            final ced$b d0 = ced.D0;
            final int a = w4j.a;
            this.g = (List<rr4>)d0;
            this.j = 0;
        }
        
        public a(final adu adu) {
            this.a = UserIdentifier.UNDEFINED;
            final ced$b d0 = ced.D0;
            final int a = w4j.a;
            this.g = (List<rr4>)d0;
            this.j = 0;
            this.a = adu.C0;
            this.b = adu.D0;
            this.c = adu.E0;
            this.d = adu.F0;
            this.e = adu.G0;
            this.f = adu.H0;
            this.j = adu.K0;
            this.k = adu.L0;
            this.g = adu.M0;
            this.h = adu.I0;
            this.i = adu.J0;
        }
        
        public a(final hfv hfv) {
            this.a = UserIdentifier.UNDEFINED;
            final ced$b d0 = ced.D0;
            final int a = w4j.a;
            this.g = (List<rr4>)d0;
            this.j = 0;
            this.a = hfv.f();
            this.b = hfv.J0;
            this.c = hfv.c();
            this.d = hfv.h1;
            this.e = hfv.D0;
            this.f = hfv.t1;
            this.j = hfv.H1;
            this.k = hfv.Y0;
            this.g = hfv.q1;
            this.h = hfv.A1;
            this.i = hfv.h();
        }
        
        public final Object i() {
            return new adu(this);
        }
        
        public final boolean l() {
            return this.a.isRegularUser();
        }
        
        public final boolean n() {
            if (!this.l()) {
                zi.A("Tried to build user with an invalid id.");
                return false;
            }
            return true;
        }
        
        public final a o(List<rr4> d0) {
            if (d0 == null) {
                d0 = ced.D0;
                final int a = w4j.a;
            }
            this.g = (List<rr4>)d0;
            return this;
        }
    }
    
    public static final class b extends js2<adu, a>
    {
        public b() {
            super(4);
        }
        
        public final void f(final flp flp, final Object o) throws IOException {
            final adu adu = (adu)o;
            flp.A(adu.C0.getId()).G(adu.D0).G(adu.E0).z(adu.F0).G(adu.G0).z(adu.K0).A(adu.L0);
            ((s4j)kdw.b).c(flp, (Object)adu.H0);
            ((s4j)new xq4$a((alp)rr4$a.b)).c(flp, (Object)adu.M0);
            final int a = w4j.a;
            flp.t(adu.I0).t(adu.J0);
        }
        
        public final h4j g() {
            return new a();
        }
        
        public final void h(final elp elp, final h4j h4j, final int n) throws IOException, ClassNotFoundException {
            final a a = (a)h4j;
            final long a2 = elp.A();
            Objects.requireNonNull(a);
            a.a = UserIdentifier.fromId(a2);
            a.b = elp.I();
            a.c = elp.I();
            a.d = elp.z();
            a.e = elp.I();
            a.j = elp.z();
            a.k = elp.A();
            a.f = (kdw)((s4j)kdw.b).a(elp);
            if (n < 2) {
                final ced$b d0 = ced.D0;
                final int a3 = w4j.a;
                a.o((List<rr4>)d0);
            }
            else {
                a.o((List<rr4>)((s4j)new xq4$a((alp)rr4$a.b)).a(elp));
            }
            if (n < 3) {
                a.h = Boolean.FALSE;
            }
            else {
                a.h = elp.u();
            }
            if (n < 4) {
                a.i = Boolean.FALSE;
            }
            else {
                a.i = elp.u();
            }
        }
    }
}
