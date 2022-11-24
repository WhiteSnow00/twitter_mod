// 
// Decompiled by Procyon v0.6.0
// 

public final class nk extends ik
{
    public final dtv d;
    public final boolean e;
    public final pej f;
    public final pej g;
    
    public nk(final nk.nk$b nk$b) {
        e0e.f((Object)nk$b, "builder");
        super((ik$a)nk$b);
        final dtv c = nk$b.c;
        if (c != null) {
            this.d = c;
            this.e = nk$b.d;
            this.f = nk$b.e;
            this.g = nk$b.f;
            return;
        }
        e0e.m("link");
        throw null;
    }
}
