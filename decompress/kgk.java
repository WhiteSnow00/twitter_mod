import com.twitter.profiles.scrollingheader.c;
import android.net.Uri;
import java.util.Locale;
import android.graphics.Bitmap;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgk implements hgk$a
{
    public final kgk.kgk$b a;
    public final jkg b;
    public final hgk c;
    public final ivm d;
    public final UserIdentifier e;
    public String f;
    public v0c g;
    public qev h;
    public bgk.a i;
    public boolean j;
    public boolean k;
    public final kgk$a l;
    
    public kgk(final jkg b, final hgk c, final ivm d, final v0c g, final kgk.kgk$b a, final UserIdentifier e, final xba<u3u> xba) {
        this.i = bgk.a.D0;
        this.l = new jkg$a(this) {
            public final kgk D0;
            
            public final void b(final Bitmap bitmap) {
                ((c)((bgk.b)this.D0.a).a).o5(bitmap);
            }
        };
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = g;
        f.i(xba.v0(), (n93)new jgk((Object)this, 0));
    }
    
    public final void a(final v0c g) {
        this.g = g;
        final qev a = g.a;
        ((bgk.b)this.a).a(2131429426, a.c);
        if (ikr.g((CharSequence)a.k)) {
            ((bgk.b)this.a).a(2131429427, a.k);
        }
        final qev.b b = a.b;
        final qev.b e0 = qev.b.E0;
        Label_0274: {
            if (b == e0) {
                final dv6 g2 = a.g;
                if (g2 != null) {
                    if (!this.k) {
                        this.b.b(g2, (jkg$a)this.l);
                        this.k = true;
                    }
                    final qev h = this.h;
                    if (h == null) {
                        this.d.a(a.g, (ivm$b)new lo((Object)this, 9));
                        break Label_0274;
                    }
                    ((bgk.b)this.a).a(2131429428, h.c);
                    break Label_0274;
                }
            }
            if (b != e0 && !this.k) {
                final dv6 b2 = g.b;
                if (b2 != null) {
                    this.b.b(b2, (jkg$a)this.l);
                    this.k = true;
                }
                else {
                    final ya2 f = a.f;
                    if (f != null) {
                        this.b.a((dv6)f.a.get(0), (dv6)a.f.a.get(2), (jkg$a)this.l);
                        this.k = true;
                    }
                }
            }
        }
        final pqw d = a.d;
        final pqw$a a2 = d.a;
        if (a2 != null) {
            final bgk.b b3 = (bgk.b)this.a;
            if (b3.g == null) {
                final igk b4 = igk.b(b3.e);
                b3.g = b4;
                b3.e.addView(((ngk)b4).c);
            }
            ((ngk)b3.g).a(Uri.parse(String.format(Locale.ENGLISH, "https://foursquare.com/v/%s", a2.a)));
        }
        else {
            final pqw$c b5 = d.b;
            if (b5 != null) {
                final bgk.b b6 = (bgk.b)this.a;
                if (b6.f == null) {
                    final ogk b7 = ogk.b(b6.e);
                    b6.f = b7;
                    b6.e.addView(((ngk)b7).c);
                }
                final ogk f2 = b6.f;
                f2.c(b5.d);
                f2.d(b5.e);
                ((ngk)f2).a(Uri.parse(b5.c));
            }
        }
    }
    
    public final void b(final String f, final String g, final boolean i) {
        String f2;
        if ("all".equals(g)) {
            f2 = null;
        }
        else {
            f2 = this.f;
        }
        final hgk c = this.c;
        final String a = this.g.a.a;
        if (c.d == null) {
            c.d = (hgk$a)this;
            final trc b = c.b;
            final lgk$a lgk$a = new lgk$a();
            lgk$a.a = c.a;
            lgk$a.b = UserIdentifier.getCurrent();
            lgk$a.c = c.c;
            lgk$a.d = a;
            lgk$a.h = UserIdentifier.getCurrent().getId();
            lgk$a.e = f2;
            lgk$a.g = g;
            lgk$a.i = i;
            lgk$a.f = f;
            final lgk lgk = (lgk)((n4j)lgk$a).e();
            ((anm)lgk).U((wv0$b)new ggk(c));
            b.f((orc)lgk);
        }
    }
    
    public final void c(int a, final boolean b) {
        if (a != 0) {
            if (a == 1) {
                this.i = bgk.a.E0;
            }
        }
        else {
            this.i = bgk.a.D0;
        }
        if (b) {
            ((c)((bgk.b)this.a).a).Y0.setCurrentItem(a);
        }
        String s;
        if (a != 0) {
            if (a != 1) {
                return;
            }
            s = "photo_grid";
        }
        else {
            s = "tweets_timeline";
        }
        final String o = u0p.o(new String[] { "place_page", s, "", "", "impression" });
        final af4 af4 = new af4(this.e);
        ((u0p)af4).q(new String[] { o });
        ((u0p)af4).t = this.g.a.a;
        a = c5j.a;
        cbw.b((elm)af4);
    }
}
