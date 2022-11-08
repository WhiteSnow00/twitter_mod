import com.twitter.app.di.app.DaggerTwApplOG$r81;
import com.twitter.app.di.app.DaggerTwApplOG$q81;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afx
{
    public final o69 a;
    public final ayw b;
    public final wex c;
    public final z59 d;
    public final a e;
    public final cyw f;
    public final nmk g;
    public final xxb h;
    public final v2x i;
    public i1 j;
    
    public afx(final o69 a, final ayw b, final wex c, final z59 d, final cyw f, final nmk g, final xxb h) {
        this.e = new a();
        this.i = new v2x();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void a() {
        final i1 j = this.j;
        if (j != null) {
            if (!(this.b.c(j78.r(j)).isEmpty() ^ true)) {
                final wex c = this.c;
                final cyw f = this.f;
                final i1 i = this.j;
                Objects.requireNonNull(c);
                snj b;
                if (!z6.h(i.getType())) {
                    b = snj.b;
                    final int a = w4j.a;
                }
                else {
                    final DaggerTwApplOG$q81 daggerTwApplOG$q81 = (DaggerTwApplOG$q81)c.a;
                    Objects.requireNonNull(daggerTwApplOG$q81);
                    Objects.requireNonNull(f);
                    daggerTwApplOG$q81.d = f;
                    daggerTwApplOG$q81.c = i;
                    b = new snj((Object)((DaggerTwApplOG$r81)daggerTwApplOG$q81.a()).h());
                }
                if (b.f()) {
                    this.d.a((x59)new l09((a59)meq.g));
                    ((z59)this.b.a.a.get()).a((x59)new gr((y49)b.c(), (a59)meq.f));
                    this.d.a((x59)new w09());
                }
            }
        }
    }
    
    public final class a implements o69$a
    {
        public final void a() {
        }
        
        public final void b() {
            afx.this.a();
        }
    }
}
