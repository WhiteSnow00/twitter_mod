import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nmx
{
    public static final a Companion;
    public static final tba g;
    public final Context a;
    public final qp2 b;
    public final mil c;
    public final String d;
    public final String e;
    public final boolean f;
    
    static {
        Companion = new a();
        g = (tba)sba.Companion.b("web_view", "", "", "");
    }
    
    public nmx(final Context a, final qp2 b, final mil c) {
        zzd.f((Object)c, "promotedLogger");
        this.a = a;
        this.b = b;
        this.c = c;
        final String s = null;
        Object b2;
        if (b != null) {
            b2 = b.b1();
        }
        else {
            b2 = null;
        }
        String d0;
        if (b2 != null) {
            d0 = ((qp2.a)b2).D0;
        }
        else {
            d0 = null;
        }
        this.d = d0;
        String e0 = s;
        if (b2 != null) {
            e0 = ((qp2.a)b2).E0;
        }
        this.e = e0;
        this.f = (b != null && b.O2());
    }
    
    public final zf4 a(String e) {
        final zf4 zf4 = new zf4();
        zf4.T = nca.Companion.c((sba)nmx.g, e).toString();
        final int a = w4j.a;
        zf4.q = this.d;
        e = this.e;
        if (e != null) {
            zf4.j0 = e;
        }
        final qp2 b = this.b;
        if (b != null) {
            wvz.c(zf4, this.a, b.t1(), (String)null);
        }
        return zf4;
    }
    
    public final void b(final jil jil) {
        zzd.f((Object)jil, "promotedEvent");
        if (!this.f) {
            return;
        }
        final qp2 b = this.b;
        hil e;
        if (b != null) {
            e = b.e();
        }
        else {
            e = null;
        }
        if (e != null) {
            final hil e2 = this.b.e();
            zzd.c((Object)e2);
            this.c.b((kil)((h4j)kil.e(jil, e2)).e());
        }
    }
    
    public final void c(final long n) {
        if (this.f) {
            if (n > 0L) {
                Object o = dq2.D0;
                while (((dq2)o).b() * 1000L < n) {
                    this.b(((dq2)o).C0);
                    if ((o = ((dq2)o).e()) == null) {
                        break;
                    }
                }
            }
        }
    }
    
    public final void d(final String s) {
        if (this.b == null) {
            return;
        }
        saw.b((okm)this.a(s));
    }
    
    public static final class a
    {
        public static final void a(final a a, final zf4 zf4) {
            Objects.requireNonNull(a);
            saw.b((okm)zf4);
        }
    }
}
