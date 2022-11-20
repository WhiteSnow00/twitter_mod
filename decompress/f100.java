import java.io.Serializable;
import java.math.BigDecimal;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f100 extends v000
{
    public final t0z g;
    public final bay h;
    
    public f100(final bay h, final String s, final int n, final t0z g) {
        this.h = h;
        super(s, n);
        this.g = g;
    }
    
    public final int a() {
        return this.g.s();
    }
    
    public final boolean b() {
        return false;
    }
    
    public final boolean c() {
        return true;
    }
    
    public final boolean i(final Long n, final Long n2, final s8z s8z, final boolean b) {
        auz.c();
        final boolean t = ((pbz)this.h).D0.J0.t(super.a, uzy.W);
        final boolean y = this.g.y();
        final boolean z = this.g.z();
        final boolean a = this.g.A();
        final boolean b2 = y || z || a;
        Serializable d = null;
        final String s = null;
        final Object o = null;
        if (b && !b2) {
            final n1z q0 = ((pbz)this.h).D0.b().Q0;
            final int b3 = super.b;
            Object value = o;
            if (this.g.B()) {
                value = this.g.s();
            }
            q0.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", (Object)b3, value);
            return true;
        }
        final nzy t2 = this.g.t();
        final boolean y2 = t2.y();
    Label_0351_Outer:
        while (true) {
            Label_0363: {
                if (s8z.I()) {
                    if (!t2.A()) {
                        ((pbz)this.h).D0.b().L0.b("No number filter for long property. property", (Object)((pbz)this.h).D0.P0.f(s8z.x()));
                        d = s;
                        break Label_0577;
                    }
                    d = v000.h(v000.f(s8z.t(), t2.u()), y2);
                    break Label_0577;
                }
                else {
                    if (!s8z.H()) {
                        break Label_0363;
                    }
                    if (!t2.A()) {
                        ((pbz)this.h).D0.b().L0.b("No number filter for double property. property", (Object)((pbz)this.h).D0.P0.f(s8z.x()));
                        d = s;
                        break Label_0577;
                    }
                }
                final double s2 = s8z.s();
                final k0z u = t2.u();
                n1z q2;
                Serializable s3;
                long n3;
                long longValue;
                Block_15_Outer:Block_14_Outer:
                while (true) {
                    try {
                        d = v000.d(new BigDecimal(s2), u, Math.ulp(s2));
                        d = v000.h((Boolean)d, y2);
                        q2 = ((pbz)this.h).D0.b().Q0;
                        if (d == null) {
                            s3 = "null";
                        }
                        else {
                            s3 = d;
                        }
                        q2.b("Property filter result", (Object)s3);
                        if (d == null) {
                            return false;
                        }
                        super.c = Boolean.TRUE;
                        if (a && !(boolean)d) {
                            return true;
                        }
                        if (!b || this.g.y()) {
                            super.d = (Boolean)d;
                        }
                        if ((boolean)d && b2 && s8z.J()) {
                            n3 = s8z.u();
                            if (n != null) {
                                n3 = n;
                            }
                            longValue = n3;
                            if (t) {
                                longValue = n3;
                                if (this.g.y()) {
                                    longValue = n3;
                                    if (!this.g.z()) {
                                        longValue = n3;
                                        if (n2 != null) {
                                            longValue = n2;
                                        }
                                    }
                                }
                            }
                            if (this.g.z()) {
                                super.f = longValue;
                            }
                            else {
                                super.e = longValue;
                            }
                        }
                        return true;
                        Label_0460: {
                            ((pbz)this.h).D0.b().L0.c("Invalid user property value for Numeric number filter. property, value", (Object)((pbz)this.h).D0.P0.f(s8z.x()), (Object)s8z.y());
                        }
                        d = s;
                        continue Label_0351_Outer;
                        Label_0538:
                        ((pbz)this.h).D0.b().L0.b("User property has no value, property", (Object)((pbz)this.h).D0.P0.f(s8z.x()));
                        d = s;
                        continue Label_0351_Outer;
                        Label_0506:
                        d = v000.h(v000.e(s8z.y(), t2.v(), ((pbz)this.h).D0.b()), y2);
                        continue Label_0351_Outer;
                        while (true) {
                            while (true) {
                                while (true) {
                                    d = v000.h(v000.g(s8z.y(), t2.u()), y2);
                                    continue Label_0351_Outer;
                                    ((pbz)this.h).D0.b().L0.b("No string or number filter defined. property", (Object)((pbz)this.h).D0.P0.f(s8z.x()));
                                    d = s;
                                    continue Label_0351_Outer;
                                    Label_0428:
                                    iftrue(Label_0460:)(!voz.L(s8z.y()));
                                    continue Block_15_Outer;
                                }
                                iftrue(Label_0428:)(t2.A());
                                continue Block_14_Outer;
                            }
                            iftrue(Label_0538:)(!s8z.K());
                            iftrue(Label_0506:)(t2.C());
                            continue;
                        }
                    }
                    catch (final NumberFormatException ex) {
                        continue;
                    }
                    break;
                }
            }
            break;
        }
    }
}
