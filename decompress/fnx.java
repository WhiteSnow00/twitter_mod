import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fnx
{
    public static final a Companion;
    public static final cba g;
    public final Context a;
    public final hp2 b;
    public final zil c;
    public final String d;
    public final String e;
    public final boolean f;
    
    static {
        Companion = new a();
        g = (cba)bba.Companion.b("web_view", "", "", "");
    }
    
    public fnx(final Context a, final hp2 b, final zil c) {
        czd.f((Object)c, "promotedLogger");
        this.a = a;
        this.b = b;
        this.c = c;
        final String s = null;
        Object a2;
        if (b != null) {
            a2 = b.a1();
        }
        else {
            a2 = null;
        }
        String e0;
        if (a2 != null) {
            e0 = ((hp2.a)a2).E0;
        }
        else {
            e0 = null;
        }
        this.d = e0;
        String f0 = s;
        if (a2 != null) {
            f0 = ((hp2.a)a2).F0;
        }
        this.e = f0;
        this.f = (b != null && b.N2());
    }
    
    public final af4 a(String e) {
        final af4 af4 = new af4();
        ((u0p)af4).T = vba.Companion.c((bba)fnx.g, e).toString();
        final int a = c5j.a;
        ((u0p)af4).q = this.d;
        e = this.e;
        if (e != null) {
            ((u0p)af4).j0 = e;
        }
        final hp2 b = this.b;
        if (b != null) {
            q3j.j(af4, this.a, b.s1(), (String)null);
        }
        return af4;
    }
    
    public final void b(final wil wil) {
        czd.f((Object)wil, "promotedEvent");
        if (!this.f) {
            return;
        }
        final hp2 b = this.b;
        uil e;
        if (b != null) {
            e = b.e();
        }
        else {
            e = null;
        }
        if (e != null) {
            final uil e2 = this.b.e();
            czd.c((Object)e2);
            this.c.b((xil)xil.e(wil, e2).e());
        }
    }
    
    public final void c(final long n) {
        if (this.f) {
            if (n > 0L) {
                Object o = tp2.E0;
                while (((tp2)o).b() * 1000L < n) {
                    this.b(((tp2)o).D0);
                    if ((o = ((tp2)o).e()) == null) {
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
        cbw.b((elm)this.a(s));
    }
    
    public static final class a
    {
        public static final void a(final a a, final af4 af4) {
            Objects.requireNonNull(a);
            cbw.b((elm)af4);
        }
    }
}
