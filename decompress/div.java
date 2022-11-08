// 
// Decompiled by Procyon v0.6.0
// 

public abstract class div<Token, Suggestion extends ldp> implements otr<Token, Suggestion>
{
    public final int a;
    public final int b;
    public final boolean c;
    public final thv d;
    public final qvo e;
    public final rv1<gvj<Token, Iterable<Suggestion>>> f;
    public final rv1<Iterable<Suggestion>> g;
    public final rv1<gvj<Token, String>> h;
    public final m29 i;
    
    public div(final int b, final thv d, final ibm ibm, final qvo e) {
        zzd.f((Object)d, "typeAheadRepo");
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)e, "ioScheduler");
        this.a = 1;
        this.b = b;
        this.c = false;
        this.d = d;
        this.e = e;
        this.f = (rv1<gvj<Token, Iterable<Suggestion>>>)new rv1();
        this.g = (rv1<Iterable<Suggestion>>)rv1.e((Object)f3a.C0);
        final rv1 h = new rv1();
        this.h = (rv1<gvj<Token, String>>)h;
        this.i = new m29();
        ibm.i((rj)new isf((Object)((b5j)h).distinctUntilChanged().flatMap((qtb)new di((rtb)new biv(this), 12)).subscribe((fk6)new iaa((rtb)new civ(this), 9)), (Object)this, 3));
    }
    
    public final void a(final Iterable<? extends Suggestion> iterable) {
        zzd.f((Object)iterable, "selections");
        this.g.onNext((Object)iterable);
    }
    
    public final b5j<Iterable<Suggestion>> b() {
        return (b5j<Iterable<Suggestion>>)this.g;
    }
    
    public final void c(final Token token, final String s) {
        this.h.onNext((Object)new gvj((Object)token, (Object)s));
    }
}
