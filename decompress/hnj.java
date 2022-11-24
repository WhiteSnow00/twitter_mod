// 
// Decompiled by Procyon v0.6.0
// 

public final class hnj implements gnj
{
    public final omv<Long, uxi> a;
    
    public hnj(final qmv qmv, final hg6<Long, uxi> hg6, final kcm kcm) {
        e0e.f((Object)qmv, "repositoryManager");
        e0e.f((Object)hg6, "repositoryConfiguration");
        e0e.f((Object)kcm, "releaseCompletable");
        final de6 de6 = new de6();
        final omv a = qmv.a((hg6)hg6);
        e0e.e((Object)a, "repositoryManager.getRep\u2026(repositoryConfiguration)");
        this.a = (omv<Long, uxi>)a;
        kcm.i((sj)new tdv(de6, 14));
    }
    
    public final void a(final long n, final uxi uxi) {
        this.a.e((Object)n, (Object)uxi).D();
    }
}
