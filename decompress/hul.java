import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hul extends j4e<dul>
{
    public final f5e<dul> N0;
    public final znl<ful> O0;
    public final t5j<ful> P0;
    
    public hul(final f5e<dul> n0, final d4e<dul> d4e, final kcm kcm) {
        e0e.f((Object)n0, "provider");
        e0e.f((Object)d4e, "directory");
        e0e.f((Object)kcm, "releaseCompletable");
        super((f5e)n0, (d4e)d4e, kcm);
        this.N0 = n0;
        final znl znl = new znl();
        this.O0 = (znl<ful>)znl;
        this.P0 = znl;
        final gda b = super.J0.b;
        e0e.e((Object)b, "eventObservable");
        final e39 e39;
        e39.c(tqb.T((fda)b).doOnComplete((sj)new hul$b(e39 = new e39())).subscribe((rk6)new f$s2((stb)new stb<c4e$b<dul>, vzv>(this) {
            public final hul F0;
            
            public final Object invoke(final Object o) {
                final c4e$b c4e$b = (c4e$b)o;
                c4e$b.b.getHeldView().setOnClickListener((View$OnClickListener)new View$OnClickListener(this.F0, c4e$b) {
                    public final hul F0;
                    public final c4e$b<dul> G0;
                    
                    public final void onClick(final View view) {
                        final znl<ful> o0 = this.F0.O0;
                        final Object c = this.G0.c;
                        e0e.e(c, "event.item");
                        o0.onNext((Object)new ful.a((dul)c));
                    }
                });
                return vzv.a;
            }
        })));
        final gda b2 = super.J0.b;
        e0e.e((Object)b2, "eventObservable");
        final e39 e40;
        e40.c(tqb.W((fda)b2).doOnComplete((sj)new hul$d(e40 = new e39())).subscribe((rk6)new f$s2((stb)new stb<c4e$f<dul>, vzv>() {
            public final Object invoke(final Object o) {
                ((c4e$f)o).a.getHeldView().setOnClickListener((View$OnClickListener)null);
                return vzv.a;
            }
        })));
    }
}
