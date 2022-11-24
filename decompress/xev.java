// 
// Decompiled by Procyon v0.6.0
// 

public final class xev implements wev
{
    public xev(final mxe<Object> mxe) {
        e0e.f((Object)mxe, "openbackInitializer");
        mxe.get();
    }
    
    @Override
    public final void a(final String s, final String s2, final int n) {
        lmj.b().a(new at4("message_displayed", vq9.r((Object)new x29(s, s2, n))));
    }
    
    @Override
    public final void b() {
        lmj.b().a(new at4("messages_remove"));
    }
    
    @Override
    public final void c(final String s) {
        e0e.f((Object)s, "message");
        lmj.b().a(new at4("message_dismissed", s));
    }
    
    @Override
    public final void d(final String s) {
        e0e.f((Object)s, "message");
        lmj.b().a(new at4("message_clicked", s));
    }
    
    @Override
    public final void e(final String s) {
        lmj.b().a(new at4("messages_add", c0e.h("[", s, "]")));
    }
    
    @Override
    public final boolean isEnabled() {
        return lmj.b().j;
    }
}
