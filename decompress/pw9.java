import java.util.Objects;
import android.os.Parcelable$Creator;
import com.twitter.util.serialization.util.OptionalFieldException;
import java.util.Collection;
import java.util.ArrayList;
import android.net.Uri;
import java.io.IOException;
import java.util.Set;
import java.util.List;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pw9 extends jw9<yzw> implements gas, cqh, xe3
{
    public static final rlp<pw9> Y0;
    public static final rlp<edq> Z0;
    public int H0;
    public int I0;
    public boolean J0;
    public ah3 K0;
    public boolean L0;
    public File M0;
    public List<pa6> N0;
    public File O0;
    public swg P0;
    public edq Q0;
    public Set<aip> R0;
    public i6d S0;
    public edq T0;
    public boolean U0;
    public boolean V0;
    public boolean W0;
    public List<u0h> X0;
    
    static {
        pw9.Y0 = b.b;
        pw9.Z0 = new y4j<edq>() {
            public final Object d(final vlp vlp, final int n) throws IOException, ClassNotFoundException {
                return edq.g(vlp.x(), vlp.x());
            }
            
            public final void f(final wlp wlp, final Object o) throws IOException {
                final edq edq = (edq)o;
                wlp.x(edq.a);
                wlp.x(edq.b);
            }
        };
    }
    
    public pw9(final yzw yzw, final Uri uri, final vzg vzg, final i6d s0, final boolean u0) {
        super((jvg)yzw, uri, vzg);
        this.N0 = new ArrayList<pa6>();
        this.V0 = false;
        this.W0 = false;
        final qw9$a a = qw9.a(yzw.j, -1);
        this.H0 = a.a;
        this.I0 = a.b;
        this.M0 = null;
        this.O0 = null;
        final qdd$b e0 = qdd.E0;
        final int a2 = c5j.a;
        this.R0 = (Set<aip>)e0;
        this.S0 = s0;
        if (s0 != null) {
            this.T0 = ((jvg)s0).b;
        }
        this.U0 = u0;
        this.X0 = (List<u0h>)gdd.E0;
    }
    
    public final List<u0h> a() {
        return this.X0;
    }
    
    public final void c(final swg p) {
        this.P0 = p;
    }
    
    public final swg d() {
        return this.P0;
    }
    
    public final Set<aip> e() {
        return this.R0;
    }
    
    public final boolean equals(final Object o) {
        final boolean b = false;
        if (this != o) {
            boolean b2 = b;
            if (!(o instanceof pw9)) {
                return b2;
            }
            final pw9 pw9 = (pw9)o;
            boolean b3 = false;
            Label_0274: {
                Label_0272: {
                    if (this != pw9) {
                        if (pw9 != null && this.i((jw9)pw9) && pw9.H0 == this.H0 && pw9.I0 == this.I0 && pw9.J0 == this.J0 && c5j.a((Object)pw9.P0, (Object)this.P0) && c5j.a((Object)pw9.K0, (Object)this.K0) && pw9.N0.equals(this.N0) && c5j.a((Object)pw9.Q0, (Object)this.Q0) && pw9.L0 == this.L0 && c5j.a((Object)pw9.R0, (Object)this.R0) && c5j.a((Object)pw9.S0, (Object)this.S0) && c5j.a((Object)pw9.T0, (Object)this.T0) && pw9.U0 == this.U0 && pw9.V0 == this.V0 && pw9.W0 == this.W0) {
                            Object o2;
                            if ((o2 = pw9.X0) == null) {
                                o2 = f2a.D0;
                            }
                            Object o3;
                            if ((o3 = this.X0) == null) {
                                o3 = f2a.D0;
                            }
                            if (i5e.c((Iterable)o2, (Iterable)o3)) {
                                break Label_0272;
                            }
                        }
                        b3 = false;
                        break Label_0274;
                    }
                }
                b3 = true;
            }
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    public final jw9 f() {
        final pw9 pw9 = new pw9((yzw)super.D0, super.E0, super.F0, this.S0, this.U0);
        pw9.H0 = this.H0;
        pw9.I0 = this.I0;
        pw9.J0 = this.J0;
        pw9.P0 = this.P0;
        pw9.K0 = this.K0;
        pw9.M0 = this.M0;
        pw9.O0 = this.O0;
        pw9.N0 = new ArrayList<pa6>(this.N0);
        pw9.L0 = this.L0;
        pw9.Q0 = this.Q0;
        pw9.R0 = this.R0;
        pw9.V0 = this.V0;
        pw9.W0 = this.W0;
        pw9.X0 = this.X0;
        return pw9;
    }
    
    public final oj h() {
        return (oj)new qbk(this, 20);
    }
    
    public final int hashCode() {
        final int hashCode = super.hashCode();
        final int h0 = this.H0;
        final int i0 = this.I0;
        final int j0 = this.J0 ? 1 : 0;
        final int a = c5j.a;
        return c5j.q((List)this.X0) + ((((c5j.f((Object)this.T0) + (c5j.f((Object)this.S0) + (c5j.e((Iterable)this.R0) + (c5j.f((Object)this.Q0) + ((this.N0.hashCode() + (c5j.f((Object)this.O0) + (c5j.f((Object)this.M0) + (c5j.f((Object)this.K0) + (c5j.f((Object)this.P0) + (((hashCode * 31 + h0) * 31 + i0) * 31 + j0) * 31) * 31) * 31) * 31) * 31) * 31 + (this.L0 ? 1 : 0)) * 31) * 31) * 31) * 31) * 31 + (this.U0 ? 1 : 0)) * 31 + (this.V0 ? 1 : 0)) * 31 + (this.W0 ? 1 : 0)) * 31;
    }
    
    public final float l() {
        final edq t0 = this.T0;
        if (t0 != null) {
            return t0.h();
        }
        return ((jvg)super.D0).b.h();
    }
    
    public final boolean o() {
        final int h0 = this.H0;
        if (h0 <= 0) {
            final int i0 = this.I0;
            if (i0 >= ((yzw)super.D0).j) {
                if (i0 - h0 <= 30000) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public final void p(final int n) {
        if (!this.L0 && n != 45000) {
            final qw9$a a = qw9.a(((yzw)super.D0).j, n);
            this.H0 = a.a;
            this.I0 = a.b;
        }
    }
    
    public static final class b extends y4j<pw9>
    {
        public static final b b;
        
        static {
            b = new b();
        }
        
        public b() {
            super(18);
        }
        
        public final Object d(final vlp vlp, final int n) throws IOException, ClassNotFoundException {
            Object g = ((rlp)yzw.k).b(vlp);
            final String a = vlp.A();
            final int x = vlp.x();
            final int x2 = vlp.x();
            final boolean b = true;
            final boolean j0 = n >= 2 && vlp.s();
            final File file = null;
            while (true) {
                try {
                    final String g2 = vlp.G();
                    Uri parse;
                    if (g2 != null) {
                        parse = Uri.parse(g2);
                    }
                    else {
                        parse = null;
                    }
                    Uri g3 = parse;
                    if (parse == null) {
                        g3 = ((jvg)g).g();
                    }
                    vzg a2;
                    try {
                        final Parcelable$Creator<vzg> creator = vzg.CREATOR;
                        a2 = (vzg)((y4j)vzg$b.b).a(vlp);
                    }
                    catch (final IOException ex) {
                        a2 = null;
                    }
                    if (a2 == null) {
                        a2 = vzg.a(a);
                    }
                    final pw9 pw9 = new pw9((yzw)g, g3, a2, null, false);
                    try {
                        pw9.P0 = (swg)((y4j)swg.i).a(vlp);
                    }
                    catch (final OptionalFieldException ex2) {}
                    if (n >= 3) {
                        pw9.K0 = (ah3)((y4j)ah3$b.b).a(vlp);
                    }
                    if (n >= 4) {
                        final String g4 = vlp.G();
                        File m0;
                        if (g4 != null) {
                            m0 = new File(g4);
                        }
                        else {
                            m0 = null;
                        }
                        pw9.M0 = m0;
                    }
                    if (n >= 5 && n < 9) {
                        jee.l(((y4j)new vp4$a((rlp)qa6.b)).a(vlp));
                    }
                    if (n >= 6) {
                        g = vlp.G();
                        File o0 = file;
                        if (g != null) {
                            o0 = new File((String)g);
                        }
                        pw9.O0 = o0;
                    }
                    if (n >= 7) {
                        final Object a3 = ((y4j)new vp4$a((rlp)pa6.a)).a(vlp);
                        jee.l(a3);
                        pw9.N0 = new ArrayList<pa6>((Collection<?>)a3);
                    }
                    if (n >= 8) {
                        pw9.Z0.a(vlp);
                    }
                    if (n >= 10) {
                        pw9.Z0.a(vlp);
                    }
                    if (n >= 11) {
                        aip.b();
                        pw9.R0 = dnp.u((Set)((y4j)new yp4((rlp)aip.E0)).a(vlp));
                    }
                    if (n >= 12) {
                        pw9.S0 = (i6d)((y4j)i6d.j).a(vlp);
                    }
                    if (n >= 13) {
                        pw9.T0 = (edq)pw9.Z0.a(vlp);
                    }
                    if (n >= 14) {
                        pw9.U0 = (vlp.t() != 0);
                    }
                    if (n >= 15) {
                        pw9.V0 = (vlp.t() != 0);
                        pw9.W0 = (vlp.t() != 0);
                    }
                    if (n >= 16) {
                        pw9.Q0 = (edq)pw9.Z0.a(vlp);
                    }
                    if (n >= 17) {
                        pw9.L0 = (vlp.t() != 0 && b);
                    }
                    if (n >= 18) {
                        pw9.X0 = rif.x((List)((y4j)new vp4$a((rlp)u0h.d)).a(vlp));
                    }
                    pw9.H0 = x;
                    pw9.I0 = x2;
                    pw9.J0 = j0;
                    return pw9;
                }
                catch (final IOException ex3) {
                    continue;
                }
                break;
            }
        }
        
        public final void f(wlp s, final Object o) throws IOException {
            final pw9 pw9 = (pw9)o;
            ((y4j)yzw.k).c(s, (Object)pw9.D0);
            final wlp e = s.E(pw9.F0.E0).x(pw9.H0).x(pw9.I0).r(pw9.J0).E(pw9.E0.toString());
            final vzg f0 = pw9.F0;
            final Parcelable$Creator<vzg> creator = vzg.CREATOR;
            final vzg$b b = vzg$b.b;
            Objects.requireNonNull(e);
            ((y4j)b).c(e, (Object)f0);
            final int a = c5j.a;
            ((y4j)swg.i).c(e, (Object)pw9.P0);
            ((y4j)ah3$b.b).c(e, (Object)pw9.K0);
            final File m0 = pw9.M0;
            String path;
            if (m0 != null) {
                path = m0.getPath();
            }
            else {
                path = null;
            }
            final wlp e2 = e.E(path);
            final File o2 = pw9.O0;
            String path2;
            if (o2 != null) {
                path2 = o2.getPath();
            }
            else {
                path2 = null;
            }
            final wlp e3 = e2.E(path2);
            final List<pa6> n0 = pw9.N0;
            final vp4$a vp4$a = new vp4$a((rlp)pa6.a);
            Objects.requireNonNull(e3);
            ((y4j)vp4$a).c(e3, (Object)n0);
            final y4j<edq> z0 = pw9.Z0;
            z0.c(e3, (Object)null);
            z0.c(e3, (Object)null);
            final Set<aip> r0 = pw9.R0;
            aip.b();
            ((y4j)new yp4((rlp)aip.E0)).c(e3, (Object)r0);
            ((y4j)i6d.j).c(e3, (Object)pw9.S0);
            z0.c(e3, (Object)pw9.T0);
            final wlp s2 = e3.s((byte)(byte)(pw9.U0 ? 1 : 0)).s((byte)(byte)(pw9.V0 ? 1 : 0)).s((byte)(byte)(pw9.W0 ? 1 : 0));
            final edq q0 = pw9.Q0;
            Objects.requireNonNull(s2);
            z0.c(s2, (Object)q0);
            s = s2.s((byte)(byte)(pw9.L0 ? 1 : 0));
            final List<u0h> x0 = pw9.X0;
            final vp4$a vp4$a2 = new vp4$a((rlp)u0h.d);
            Objects.requireNonNull(s);
            ((y4j)vp4$a2).c(s, (Object)x0);
        }
    }
}
