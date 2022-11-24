import android.annotation.SuppressLint;
import java.util.Locale;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kif implements fif
{
    public static final a Companion;
    public final Context a;
    public final sbw b;
    public final UserIdentifier c;
    public final fdi d;
    public final kes e;
    
    static {
        Companion = new a();
    }
    
    public kif(final Context a, final sbw b, final UserIdentifier c, final fdi d, final kes e) {
        e0e.f((Object)a, "appContext");
        e0e.f((Object)b, "eventReporter");
        e0e.f((Object)c, "userIdentifier");
        e0e.f((Object)d, "networkDetails");
        e0e.f((Object)e, "telephonyUtil");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @SuppressLint({ "MissingPropagatedAnnotation" })
    public final void a(final yd4 yd4) {
        e0e.f((Object)yd4, "payload");
        final fg4 fg4 = new fg4(this.c);
        final dda.a companion = dda.Companion;
        final String e = go0.e(yd4.a);
        final String e2 = yd4.e;
        final a companion2 = kif.Companion;
        final boolean c = yd4.c;
        Objects.requireNonNull(companion2);
        String s;
        if (c) {
            s = "promoted";
        }
        else {
            s = "organic";
        }
        ((o1p)fg4).T = companion.e(e, e2, "", s, "click").toString();
        final int a = o5j.a;
        final awj awj = new awj((Object)"network_quality", (Object)this.d.f().toString());
        final String b = this.e.b();
        e0e.e((Object)b, "telephonyUtil.connectionType");
        final Locale english = Locale.ENGLISH;
        ((o1p)fg4).c = flr.t(mlg.U(new awj[] { awj, new awj((Object)"network_type", (Object)a88.l(english, "ENGLISH", b, english, "this as java.lang.String).toLowerCase(locale)")) }));
        iuk.f(fg4, this.a, yd4.b, (String)null);
        this.b.c((tlm)fg4);
    }
    
    public final void b(final gq2 gq2) {
        this.i(fq2.K0, gq2.a, gq2.b);
    }
    
    public final void c(final gq2 gq2) {
        this.i(fq2.J0, gq2.a, gq2.b);
    }
    
    public final void d(final gq2 gq2) {
        this.i(fq2.G0, gq2.a, gq2.b);
    }
    
    public final void e(final gq2 gq2) {
        this.i(fq2.I0, gq2.a, gq2.b);
    }
    
    public final void f(final gq2 gq2) {
        this.i(fq2.L0, gq2.a, gq2.b);
    }
    
    public final void g(final gq2 gq2) {
        this.i(fq2.H0, gq2.a, gq2.b);
    }
    
    public final void h(final gq2 gq2) {
        this.i(fq2.F0, gq2.a, gq2.b);
    }
    
    public final void i(final fq2 fq2, final lq2 lq2, final yp2 yp2) {
        final fg4 fg4 = new fg4(this.c);
        final dda.a companion = dda.Companion;
        final String string = lq2.toString();
        Objects.requireNonNull(kif.Companion);
        String s;
        if (yp2 != null && yp2.O2()) {
            s = "promoted";
        }
        else {
            s = "organic";
        }
        ((o1p)fg4).T = companion.e(string, "", "", s, fq2.toString()).toString();
        final int a = o5j.a;
        n1p t1;
        if (yp2 != null) {
            t1 = yp2.t1();
        }
        else {
            t1 = null;
        }
        iuk.f(fg4, this.a, t1, (String)null);
        this.b.c((tlm)fg4);
    }
    
    public static final class a
    {
    }
}
