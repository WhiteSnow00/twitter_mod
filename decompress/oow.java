// 
// Decompiled by Procyon v0.6.0
// 

public final class oow
{
    public final t5j<wow> a;
    
    public oow(final kzt<sa8, wow> kzt, final t5j<noj<sa8>> t5j, final iow iow, final bxo bxo, final kcm kcm) {
        e0e.f((Object)kzt, "dateValidator");
        e0e.f((Object)t5j, "inputObservable");
        e0e.f((Object)bxo, "observeScheduler");
        e0e.f((Object)kcm, "releaseCompletable");
        final t5j observeOn = t5j.switchOnNext((fbj)t5j.distinctUntilChanged().map((rtb)new x0i((stb)new oow$b((kzt)kzt), 5))).startWith((Object)new wow(0, (String)null)).distinctUntilChanged().compose((bcj)shm.F0).observeOn(bxo);
        e0e.e((Object)observeOn, "switchOnNext(\n          \u2026serveOn(observeScheduler)");
        this.a = (t5j<wow>)observeOn;
        kcm.i((sj)new cj7(observeOn.subscribe((rk6)new ima((stb)new oow$a(iow), 29)), 5));
    }
}
