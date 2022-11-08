import com.twitter.profiles.scrollingheader.c;
import android.net.Uri;
import java.util.Locale;
import android.graphics.Bitmap;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class egk implements bgk$a
{
    public final egk.egk$b a;
    public final lkg b;
    public final bgk c;
    public final rum d;
    public final UserIdentifier e;
    public String f;
    public s1c g;
    public vdv h;
    public vfk$a i;
    public boolean j;
    public boolean k;
    public final egk$a l;
    
    public egk(final lkg b, final bgk c, final rum d, final s1c g, final egk.egk$b a, final UserIdentifier e, final pca<f3u> pca) {
        this.i = vfk$a.C0;
        this.l = new lkg$a() {
            public final void a(final Bitmap bitmap) {
                ((c)((vfk.b)egk.this.a).a).o5(bitmap);
            }
        };
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = g;
        f.i(pca.v0(), (u93)new dgk((Object)this, 0));
    }
    
    public final void a(final s1c g) {
        this.g = g;
        final vdv a = g.a;
        ((vfk.b)this.a).a(2131429426, a.c);
        if (pjr.g((CharSequence)a.k)) {
            ((vfk.b)this.a).a(2131429427, a.k);
        }
        final vdv$b b = a.b;
        final vdv$b d0 = vdv$b.D0;
        Label_0274: {
            if (b == d0) {
                final zv6 g2 = a.g;
                if (g2 != null) {
                    if (!this.k) {
                        this.b.b(g2, (lkg$a)this.l);
                        this.k = true;
                    }
                    final vdv h = this.h;
                    if (h == null) {
                        this.d.a(a.g, (rum$b)new lo((Object)this, 9));
                        break Label_0274;
                    }
                    ((vfk.b)this.a).a(2131429428, h.c);
                    break Label_0274;
                }
            }
            if (b != d0 && !this.k) {
                final zv6 b2 = g.b;
                if (b2 != null) {
                    this.b.b(b2, (lkg$a)this.l);
                    this.k = true;
                }
                else {
                    final fb2 f = a.f;
                    if (f != null) {
                        this.b.a((zv6)f.a.get(0), (zv6)a.f.a.get(2), (lkg$a)this.l);
                        this.k = true;
                    }
                }
            }
        }
        final vpw d2 = a.d;
        final vpw.vpw$a a2 = d2.a;
        if (a2 != null) {
            final vfk.b b3 = (vfk.b)this.a;
            if (b3.g == null) {
                final cgk b4 = cgk.b(b3.e);
                b3.g = b4;
                b3.e.addView(((hgk)b4).c);
            }
            ((hgk)b3.g).a(Uri.parse(String.format(Locale.ENGLISH, "https://foursquare.com/v/%s", a2.a)));
        }
        else {
            final vpw.c b5 = d2.b;
            if (b5 != null) {
                final vfk.b b6 = (vfk.b)this.a;
                if (b6.f == null) {
                    final igk b7 = igk.b(b6.e);
                    b6.f = b7;
                    b6.e.addView(((hgk)b7).c);
                }
                final igk f2 = b6.f;
                f2.c(b5.d);
                f2.d(b5.e);
                ((hgk)f2).a(Uri.parse(b5.c));
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
        final bgk c = this.c;
        final String a = this.g.a.a;
        if (c.d == null) {
            c.d = (bgk$a)this;
            final psc b = c.b;
            final fgk$a fgk$a = new fgk$a();
            fgk$a.a = c.a;
            fgk$a.b = UserIdentifier.getCurrent();
            fgk$a.c = c.c;
            fgk$a.d = a;
            fgk$a.h = UserIdentifier.getCurrent().getId();
            fgk$a.e = f2;
            fgk$a.g = g;
            fgk$a.i = i;
            fgk$a.f = f;
            final fgk fgk = (fgk)((h4j)fgk$a).e();
            ((kmm)fgk).U((cw0$b)new agk(c));
            b.f((ksc)fgk);
        }
    }
    
    public final void c(int a, final boolean b) {
        if (a != 0) {
            if (a == 1) {
                this.i = vfk$a.D0;
            }
        }
        else {
            this.i = vfk$a.C0;
        }
        if (b) {
            ((c)((vfk.b)this.a).a).X0.setCurrentItem(a);
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
        final String o = d0p.o(new String[] { "place_page", s, "", "", "impression" });
        final zf4 zf4 = new zf4(this.e);
        zf4.q(new String[] { o });
        zf4.t = this.g.a.a;
        a = w4j.a;
        saw.b((okm)zf4);
    }
}
