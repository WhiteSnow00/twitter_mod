// 
// Decompiled by Procyon v0.6.0
// 

public final class fd4 implements qxs<ed4, exs>
{
    public final fd4.fd4$a a;
    
    public fd4(final fd4.fd4$a a) {
        this.a = a;
    }
    
    @Override
    public final xtd a(final mxs mxs, final Object o) {
        final ed4 ed4 = (ed4)mxs;
        final exs exs = (exs)o;
        e0e.f((Object)ed4, "instruction");
        e0e.f((Object)exs, "requestContext");
        return (xtd)new ed4$a(this.a.a(exs));
    }
}
