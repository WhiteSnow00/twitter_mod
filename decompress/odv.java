// 
// Decompiled by Procyon v0.6.0
// 

public final class odv implements ndv
{
    public odv(final fxe<Object> fxe) {
        zzd.f((Object)fxe, "openbackInitializer");
        fxe.get();
    }
    
    @Override
    public final void a(final String s, final String s2, final int n) {
        qlj.b().a(new ws4("message_displayed", asy.D0((Object)new f29(s, s2, n))));
    }
    
    @Override
    public final void b() {
        qlj.b().a(new ws4("messages_remove"));
    }
    
    @Override
    public final void c(final String s) {
        zzd.f((Object)s, "message");
        qlj.b().a(new ws4("message_dismissed", s));
    }
    
    @Override
    public final void d(final String s) {
        zzd.f((Object)s, "message");
        qlj.b().a(new ws4("message_clicked", s));
    }
    
    @Override
    public final void e(final String s) {
        qlj.b().a(new ws4("messages_add", zi.y("[", s, "]")));
    }
    
    @Override
    public final boolean isEnabled() {
        return qlj.b().j;
    }
}
