import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ohs extends ste implements nsb<wfj>
{
    public final mhs D0;
    public final puh<ltd> E0;
    
    public ohs(final mhs d0, final puh<ltd> e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(0);
    }
    
    public final Object invoke() {
        final mhs d0 = this.D0;
        final long a = ((ltd)((m8r)this.E0).getValue()).a;
        czd.f((Object)d0, "manager");
        long n;
        if (d0.k().a.D0.length() == 0) {
            Objects.requireNonNull(wfj.Companion);
            n = wfj.d;
        }
        else {
            final zac zac = (zac)d0.o.getValue();
            int n2;
            if (zac == null) {
                n2 = -1;
            }
            else {
                n2 = nhs$c.a[((Enum)zac).ordinal()];
            }
            if (n2 != -1) {
                int d2;
                if (n2 != 1 && n2 != 2) {
                    if (n2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    d2 = hjs.d(d0.k().b);
                }
                else {
                    final long b = d0.k().b;
                    final hjs$a companion = hjs.Companion;
                    d2 = (int)(b >> 32);
                }
                final int q = rrz.q(d0.b.b(d2), (jj4)zkr.f0((CharSequence)d0.k().a.D0));
                final xhs d3 = d0.d;
                if (d3 != null) {
                    final zis c = d3.c();
                    if (c != null) {
                        final yis a2 = c.a;
                        if (a2 != null) {
                            final long b2 = a2.b(q).b();
                            final xhs d4 = d0.d;
                            if (d4 != null) {
                                final eve g = d4.g;
                                if (g != null) {
                                    final zis c2 = d4.c();
                                    if (c2 != null) {
                                        final eve b3 = c2.b;
                                        if (b3 != null) {
                                            final wfj i = d0.i();
                                            if (i == null) {
                                                Objects.requireNonNull(wfj.Companion);
                                                n = wfj.d;
                                                return new wfj(n);
                                            }
                                            final float d5 = wfj.d(b3.v(g, i.a));
                                            final int f = a2.f(q);
                                            final int j = a2.j(f);
                                            final int e = a2.e(f, true);
                                            final long b4 = d0.k().b;
                                            final hjs$a companion2 = hjs.Companion;
                                            final boolean b5 = (int)(b4 >> 32) > hjs.d(d0.k().b);
                                            final float k = wj1.j(a2, j, true, b5);
                                            final float l = wj1.j(a2, e, false, b5);
                                            final float o = rrz.o(d5, Math.min(k, l), Math.max(k, l));
                                            if (Math.abs(d5 - o) > (int)(a >> 32) / 2) {
                                                Objects.requireNonNull(wfj.Companion);
                                                n = wfj.d;
                                                return new wfj(n);
                                            }
                                            n = g.v(b3, wj1.a(o, wfj.e(b2)));
                                            return new wfj(n);
                                        }
                                    }
                                    Objects.requireNonNull(wfj.Companion);
                                    n = wfj.d;
                                    return new wfj(n);
                                }
                            }
                            Objects.requireNonNull(wfj.Companion);
                            n = wfj.d;
                            return new wfj(n);
                        }
                    }
                }
                Objects.requireNonNull(wfj.Companion);
                n = wfj.d;
            }
            else {
                Objects.requireNonNull(wfj.Companion);
                n = wfj.d;
            }
        }
        return new wfj(n);
    }
}
