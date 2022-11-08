import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import com.twitter.business.features.linkmodule.model.CallToActionDisplay;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ibl
{
    public final g8 a;
    public final ovm b;
    public final c1q c;
    public final bhf d;
    public final xeh e;
    public final pki f;
    
    public ibl(final g8 a, final ovm b, final c1q c, final bhf d, final xeh e, final pki f) {
        zzd.f((Object)a, "aboutModuleRepository");
        zzd.f((Object)b, "revueModuleRepository");
        zzd.f((Object)c, "shopModuleRepository");
        zzd.f((Object)d, "linkModuleRepository");
        zzd.f((Object)e, "mobileAppModuleRepository");
        zzd.f((Object)f, "noModuleRepository");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void a(final ual ual) {
        if (ual instanceof h7) {
            this.a.a((Object)ual);
        }
        else if (ual instanceof nvm) {
            this.b.a((Object)ual);
        }
        else if (ual instanceof g0q) {
            ((ggm)this.c).a((Object)ual);
        }
        else {
            final boolean b = ual instanceof ief;
            String h0 = null;
            if (b) {
                final bhf d = this.d;
                final ief ief = (ief)ual;
                Objects.requireNonNull(d);
                zzd.f((Object)ief, "value");
                final ngf a = d.a;
                Objects.requireNonNull(d.b);
                final kgf a2 = ief.a;
                CallToActionDisplay b2;
                if ((b2 = a2.b) == null) {
                    b2 = new CallToActionDisplay(null, null, 3, null);
                }
                final w5w a3 = a2.a;
                String j0;
                if (a3 != null) {
                    j0 = a3.J0;
                }
                else {
                    j0 = null;
                }
                if (a3 != null) {
                    h0 = a3.H0;
                }
                ((ggm)a).a((Object)new mgf(b2, j0, h0));
            }
            else if (ual instanceof sch) {
                final xeh e = this.e;
                final sch sch = (sch)ual;
                Objects.requireNonNull(e);
                zzd.f((Object)sch, "value");
                final oeh a4 = e.a;
                Objects.requireNonNull(e.b);
                final rch a5 = sch.b.a;
                final List<qch> b3 = a5.b;
                final boolean b4 = b3 != null;
                List<qch> a6;
                if ((a6 = b3) == null) {
                    a6 = a5.a;
                }
                Object c0;
                if (a6 != null) {
                    final ArrayList list = new ArrayList<neh>(kr4.h1((Iterable)a6, 10));
                    final Iterator<Object> iterator = a6.iterator();
                    int n = 0;
                    while (true) {
                        c0 = list;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        final qch next = iterator.next();
                        if (n < 0) {
                            tdy.V0();
                            throw null;
                        }
                        final qch qch = next;
                        final String a7 = qch.a;
                        final String b5 = qch.b;
                        final String s = "";
                        String s2;
                        if ((s2 = b5) == null) {
                            s2 = "";
                        }
                        String c2;
                        if ((c2 = qch.c) == null) {
                            c2 = "";
                        }
                        final String d2 = qch.d;
                        Object a8;
                        if (d2 != null) {
                            a8 = lrc.a(d2, 0);
                        }
                        else {
                            a8 = null;
                        }
                        if (a8 == null) {
                            a8 = s;
                        }
                        final String string = gkr.W1((CharSequence)or4.G1(new z9m("\\R").e((CharSequence)a8, 0))).toString();
                        final lfh e2 = qch.e;
                        Double value;
                        if (e2 != null) {
                            value = e2.a;
                        }
                        else {
                            value = null;
                        }
                        final lfh e3 = qch.e;
                        String b6;
                        if (e3 != null) {
                            b6 = e3.b;
                        }
                        else {
                            b6 = null;
                        }
                        final String f = qch.f;
                        final nch g = qch.g;
                        String s3 = null;
                        Label_0543: {
                            if (g != null) {
                                final sf0 b7 = g.b;
                                if (b7 != null && (s3 = b7.c) != null) {
                                    break Label_0543;
                                }
                            }
                            s3 = qch.h;
                        }
                        list.add((Object)new neh(n, a7, s2, c2, string, value, b6, f, s3, qch.i, qch.j, qch.k, b4));
                        ++n;
                    }
                }
                else {
                    c0 = v2a.C0;
                }
                a4.a(c0);
            }
            else {
                this.f.a.a((Object)oyv.a);
            }
        }
    }
}
