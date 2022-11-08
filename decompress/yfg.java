import android.content.res.Resources;
import java.util.Objects;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import androidx.fragment.app.p;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yfg implements n5t
{
    public final tqm a;
    public final p b;
    public final Activity c;
    public final dgg d;
    public final tnc e;
    public final ggg$a f;
    public final egd g;
    public final a1s h;
    public final l5t i;
    public final mbi<?> j;
    
    public yfg(final tqm a, final p b, final Activity c, final dgg d, final tnc e, final ggg$a f, final egd g, final a1s h, final l5t i, final mbi<?> j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final void a(final h5t h5t) {
        final Fragment d = this.d.d();
        this.i.c(h5t);
        if (d instanceof m5t) {
            ((m5t)r9x.i(this.d.d(), (Class)m5t.class)).r();
        }
        else if (d instanceof onc) {
            final esj a = this.e.a(this.a, this.f.b());
            final dgg d2 = this.d;
            ((jsj)d2).x(((jsj)d2).k(), a);
            ((jsj)this.d).s(a);
            this.c(h5t);
        }
        this.c(h5t);
    }
    
    public final void b() {
        final fw8 fw8 = new fw8(this.b, "MainContentViewProvider");
        final k5t e0 = new k5t((n5t)this, this.h, this.i, (mbi)this.j);
        fw8.E0 = (ew8)e0;
        final Resources b = this.a.b;
        final h5t b2 = this.i.b();
        e0.H0 = b2.E0;
        Objects.requireNonNull(e0.E0);
        final boolean b3 = b2 == h5t.G0;
        final a1s d0 = e0.D0;
        final boolean b4 = d0.b;
        int d2 = 2131232176;
        String b5 = null;
        String s = null;
        int n = 0;
        String s2 = null;
        Label_0248: {
            if (b4) {
                if (d0.a()) {
                    b5 = b.getString(2131958641);
                    s = b.getString(2131958645);
                    n = 6;
                    s2 = b.getString(2131958646);
                    break Label_0248;
                }
                b5 = b.getString(2131958642);
                s = b.getString(2131958643);
                n = 5;
                s2 = b.getString(2131958644);
            }
            else {
                if (b3) {
                    b5 = b.getString(2131958655);
                    s = b.getString(2131958651);
                    n = 2;
                    s2 = b.getString(2131958652);
                    break Label_0248;
                }
                b5 = b.getString(2131958656);
                s = b.getString(2131958653);
                s2 = b.getString(2131958650);
                n = 3;
            }
            d2 = 2131232177;
        }
        e0.G0.clear();
        e0.G0.add(new vl(2131232101, xpa.e(n), s2, s));
        e0.G0.add(new vl(2131232418, 3, b.getString(2131958654)));
        final fm$b fm$b = new fm$b();
        ((u92$a)fm$b).b = b5;
        final int a = w4j.a;
        ((u92$a)fm$b).d = d2;
        ((u92$a)fm$b).e = true;
        ((ijf)fm$b.h).q((Iterable)e0.G0);
        final fm fm = (fm)((h4j)fm$b).e();
        final tl$b tl$b = new tl$b(808);
        ((clp$a)tl$b).z((Object)fm);
        fw8.a(((dl1$a)tl$b).w());
    }
    
    public final void c(final h5t h5t) {
        final d5s$a d5s$a = new d5s$a();
        d5s$a.e = (nfd$c)nfd$c$b.b;
        if (h5t == h5t.G0) {
            d5s$a.s(2131958637);
            d5s$a.q(37);
            d5s$a.r("htl_latest");
        }
        else {
            d5s$a.s(2131958638);
            d5s$a.q(38);
            d5s$a.r("htl_top");
        }
        this.g.a((zfd)((h4j)d5s$a).e());
    }
}
