import com.twitter.app.di.app.DaggerTwApplOG$r81;
import com.twitter.app.di.app.DaggerTwApplOG$q81;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lgx
{
    public final d79 a;
    public final jzw b;
    public final hgx c;
    public final o69 d;
    public final lgx.lgx$a e;
    public final lzw f;
    public final ink g;
    public final yxb h;
    public final h4x i;
    public h1 j;
    
    public lgx(final d79 a, final jzw b, final hgx c, final o69 d, final lzw f, final ink g, final yxb h) {
        this.e = new lgx.lgx$a(this);
        this.i = new h4x();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void a() {
        final h1 j = this.j;
        if (j != null) {
            if (!(this.b.c(v7q.p(j)).isEmpty() ^ true)) {
                final hgx c = this.c;
                final lzw f = this.f;
                final h1 i = this.j;
                Objects.requireNonNull(c);
                noj b;
                if (!x6.h(i.getType())) {
                    b = noj.b;
                    final int a = o5j.a;
                }
                else {
                    final DaggerTwApplOG$q81 daggerTwApplOG$q81 = (DaggerTwApplOG$q81)c.a;
                    Objects.requireNonNull(daggerTwApplOG$q81);
                    Objects.requireNonNull(f);
                    daggerTwApplOG$q81.d = f;
                    daggerTwApplOG$q81.c = i;
                    b = new noj((Object)((DaggerTwApplOG$r81)daggerTwApplOG$q81.a()).h());
                }
                if (b.f()) {
                    this.d.a((m69)new d19((p59)agq.g));
                    ((o69)this.b.a.a.get()).a((m69)new hr((n59)b.c(), (p59)agq.f));
                    this.d.a((m69)new o19());
                }
            }
        }
    }
}
