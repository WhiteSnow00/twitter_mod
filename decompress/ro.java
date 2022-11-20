// 
// Decompiled by Procyon v0.6.0
// 

public final class ro
{
    public static final void a(final xba<bo> xba, final int n, final n93<bo> n2) {
        czd.f((Object)xba, "<this>");
        b(xba, n, (qsb<? super bo, fzv>)new qsb<bo, fzv>(n2) {
            public final Object invoke(final Object o) {
                ((n93)((m93)this).receiver).a((Object)o);
                return fzv.a;
            }
        });
    }
    
    public static final void b(final xba<bo> xba, final int n, final qsb<? super bo, fzv> qsb) {
        czd.f((Object)xba, "<this>");
        final h5j filter = xba.v0().filter((ytk)new ht1((qsb)new ro$c(n), 2));
        czd.e((Object)filter, "requestCode: Int, onNext\u2026uestCode == requestCode }");
        final w19 w19;
        w19.c(filter.doOnComplete((oj)new oj(w19 = new w19()) {
            public final w19 D0;
            
            public final void run() {
                this.D0.a();
            }
        }).subscribe((lj6)new f$e((qsb)new ro$b((qsb)qsb))));
    }
    
    public static final void c(final xba<bo> xba, final int n, final n93<bo> n2) {
        czd.f((Object)xba, "<this>");
        final qsb<bo, fzv> qsb = (qsb<bo, fzv>)new qsb<bo, fzv>(n2) {
            public final Object invoke(final Object o) {
                ((n93)((m93)this).receiver).a((Object)o);
                return fzv.a;
            }
        };
        final h5j filter = xba.v0().filter((ytk)new en0((qsb)new uo(n), 1)).filter((ytk)new qo((qsb)vo.D0, 0));
        czd.e((Object)filter, "requestCode: Int, onNext\u2026resultCode == RESULT_OK }");
        final w19 w19;
        w19.c(filter.doOnComplete((oj)new so(w19 = new w19())).subscribe((lj6)new f$e((qsb)new to((qsb)qsb))));
    }
}
