// 
// Decompiled by Procyon v0.6.0
// 

public final class znw
{
    public final h5j<how> a;
    
    public znw(final ryt<o98, how> ryt, final h5j<ynj<o98>> h5j, final tnw tnw, final gwo gwo, final xbm xbm) {
        czd.f((Object)ryt, "dateValidator");
        czd.f((Object)h5j, "inputObservable");
        czd.f((Object)gwo, "observeScheduler");
        czd.f((Object)xbm, "releaseCompletable");
        final h5j observeOn = h5j.switchOnNext((taj)h5j.distinctUntilChanged().map((psb)new g0i((qsb)new znw$b((ryt)ryt), 5))).startWith((Object)new how(0, null)).distinctUntilChanged().compose((pbj)dhm.D0).observeOn(gwo);
        czd.e((Object)observeOn, "switchOnNext(\n          \u2026serveOn(observeScheduler)");
        this.a = (h5j<how>)observeOn;
        xbm.i((oj)new ai7(observeOn.subscribe((lj6)new cpl((qsb)new znw$a(tnw), 2)), 5));
    }
}
