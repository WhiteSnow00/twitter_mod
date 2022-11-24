// 
// Decompiled by Procyon v0.6.0
// 

public final class v2o
{
    public final znl<u2o> a;
    
    public v2o() {
        this.a = (znl<u2o>)new znl();
    }
    
    public final t5j<u2o> a() {
        final t5j share = ((t5j)this.a).share();
        e0e.e((Object)share, "rsvpSubject.share()");
        return (t5j<u2o>)share;
    }
    
    public final void b(final String s, final boolean b) {
        this.a.onNext((Object)new u2o(s, b));
    }
}
