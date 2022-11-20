import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ylt implements ms8
{
    public final ett a;
    public final q0c b;
    public final ucj c;
    public final dej d;
    public final t2j e;
    public final w19 f;
    
    public ylt(final ett a, final q0c b, final ucj c, final dej d, final t2j e, final xbm xbm) {
        czd.f((Object)a, "topicsRepository");
        czd.f((Object)b, "viewHelper");
        czd.f((Object)c, "detailRichTextOptions");
        czd.f((Object)d, "ocfRichTextProcessorHelper");
        czd.f((Object)e, "numTopicsSelectedManager");
        czd.f((Object)xbm, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = new w19();
        xbm.i((oj)new dt1((Object)this, 17));
    }
    
    public final void bind() {
        final vsr a = this.c.a;
        if (a != null) {
            int n = 0;
            if (a != null) {
                n = n;
                if (a.c == 9) {
                    n = 1;
                }
            }
            if (n != 0) {
                this.f.c(this.a.b().subscribe((lj6)new gwi((qsb)new qsb<List<? extends jwd>, fzv>(this) {
                    public final ylt D0;
                    
                    public final Object invoke(final Object o) {
                        final List d0 = (List)o;
                        final t2j e = this.D0.e;
                        czd.e((Object)d0, "it");
                        Objects.requireNonNull(e);
                        e.D0 = d0;
                        final dym p = s9i.p(this.D0.c.b, d0.size());
                        if (p != null) {
                            final cej b = p.b;
                            if (b != null) {
                                final ylt d2 = this.D0;
                                d2.b.e(d2.d.c((oxm)b));
                            }
                        }
                        return fzv.a;
                    }
                }, 6), (lj6)new bxi((qsb)ylt$b.D0, 1), (oj)iw9.F0));
            }
        }
    }
}
