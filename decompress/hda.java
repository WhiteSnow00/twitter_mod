// 
// Decompiled by Procyon v0.6.0
// 

public final class hda implements fda
{
    public final fda F0;
    public final gba G0;
    
    public hda(final fda f0, final gba g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final t5j v0() {
        final fda f0 = this.F0;
        final gba g0 = this.G0;
        e0e.f((Object)f0, "$this_scopeTo");
        e0e.f((Object)g0, "$completable");
        final t5j v0 = f0.v0();
        final yz5 d = g0.d();
        e0e.e((Object)d, "completable.observeComplete()");
        e0e.f((Object)v0, "<this>");
        final t5j takeUntil = v0.takeUntil((fbj)t5j.create((t9j)new o4b((Object)d, 1)));
        e0e.e((Object)takeUntil, "this.takeUntil(\n        \u2026        }\n        }\n    )");
        return takeUntil;
    }
}
