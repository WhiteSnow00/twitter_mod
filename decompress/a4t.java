import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a4t
{
    public final lcv<nws> a;
    public final uc b;
    public final b81 c;
    public final adx d;
    public final int e;
    
    public a4t(final pca<fmf> pca, final qrs qrs, final lcv<nws> a, final uc b, final b81 c, final adx d, final ibm ibm) {
        zzd.f((Object)pca, "eventObservable");
        zzd.f((Object)qrs, "args");
        zzd.f((Object)a, "viewHost");
        zzd.f((Object)b, "mediaPrefetcher");
        zzd.f((Object)c, "autoplayManager");
        zzd.f((Object)d, "viewportController");
        zzd.f((Object)ibm, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = qrs.n();
        final b5j v0 = pca.v0();
        final m29 m29 = new m29();
        ((raa)ibm).d().q((rj)new rj() {
            public final void run() {
                m29.a();
            }
        });
        m29.c(v0.subscribe((fk6)new f$b4((rtb)new rtb<fmf, oyv>() {
            public final /* synthetic */ a4t C0;
            
            public final Object invoke(final Object o) {
                final fmf fmf = (fmf)o;
                final a4t c0 = this.C0;
                Objects.requireNonNull(c0);
                if (fmf instanceof fmf$e) {
                    final int a = ((fmf$e)fmf).a;
                    final b81 c2 = c0.c;
                    if ((c2.F0 || c2.C0.a()) && a == 0) {
                        final k6m n0 = c0.d.N0;
                        if (n0 != null) {
                            Objects.requireNonNull(b4t.Companion);
                            int n2;
                            if (n0.w() != -1) {
                                n2 = n0.w();
                            }
                            else {
                                n2 = n0.s();
                            }
                            final int d = n0.d();
                            ij1.f();
                            if (!c0.a().isEmpty()) {
                                c0.b.b(n2 - d, (i4e)c0.a(), t1.Companion.a(c0.e));
                            }
                        }
                    }
                }
                return oyv.a;
            }
        })));
    }
    
    public final i4e<nws> a() {
        i4e<Object> i4e;
        if (this.a.L1() && this.a.G1().c()) {
            i4e = this.a.G1().f();
            zzd.e((Object)i4e, "{\n                viewHo\u2026vider.items\n            }");
        }
        else {
            i4e = i4e.j();
        }
        return (i4e<nws>)i4e;
    }
}
