// 
// Decompiled by Procyon v0.6.0
// 

public final class wt1 implements uca<f7x>
{
    public final cbw a;
    public final cv1 b;
    public final ud2 c;
    public final g9h<y00> d;
    public final gwo e;
    public final d29<pca> f;
    
    public wt1(final cbw a, final cv1 b, final ud2 c, final g9h<y00> d, final gwo e, final xbm xbm) {
        czd.f((Object)a, "userEventReporter");
        czd.f((Object)b, "eventConverter");
        czd.f((Object)c, "breadcrumbManager");
        czd.f((Object)d, "metadataFetcher");
        czd.f((Object)e, "workScheduler");
        czd.f((Object)xbm, "releaseCompletable");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        final d29 f = new d29();
        this.f = (d29<pca>)f;
        xbm.i((oj)new qt1((Object)f, 0));
    }
    
    public final void a(final lca<f7x> lca) {
        czd.f((Object)lca, "eventSource");
        if (!this.f.a.containsKey(lca.getId())) {
            this.f.b((Object)lca.getId(), ((xba)lca).v0().filter((ytk)new vt1((qsb)wt1$a.D0, 0)).subscribeOn(this.e).flatMap((psb)new ut1((qsb)new qsb<j0a<f7x>, taj<? extends nv1>>(this) {
                public final wt1 D0;
                
                public final Object invoke(final Object o) {
                    final j0a j0a = (j0a)o;
                    czd.f((Object)j0a, "event");
                    final nv1 b = this.D0.b.b((j0a<f7x>)j0a);
                    final wt1 d0 = this.D0;
                    final nv1 a = d0.b.a(b, d0.c.c(b));
                    if (a != null) {
                        final h5j h5j = h5j.just((Object)a);
                        if (h5j != null) {
                            return h5j;
                        }
                    }
                    return h5j.empty();
                }
            }, 0)).doOnNext((lj6)new ft1((qsb)new qsb<nv1, fzv>(this.c) {
                public final Object invoke(final Object o) {
                    final nv1 nv1 = (nv1)o;
                    czd.f((Object)nv1, "p0");
                    ((ud2)((m93)this).receiver).b(nv1);
                    return fzv.a;
                }
            }, 1)).doOnComplete((oj)new rt1((Object)this, (Object)lca, 0)).subscribe((lj6)new st1((qsb)new qsb<elm, fzv>(this.a) {
                public final Object invoke(final Object o) {
                    final elm elm = (elm)o;
                    czd.f((Object)elm, "p0");
                    ((cbw)((m93)this).receiver).c(elm);
                    return fzv.a;
                }
            }, 0), (lj6)new tt1((qsb)wt1$e.D0, 0)));
        }
    }
}
