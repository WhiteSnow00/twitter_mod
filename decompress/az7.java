// 
// Decompiled by Procyon v0.6.0
// 

public final class az7
{
    public final cnb a;
    public final obi<?> b;
    public final sxj c;
    public final ah7 d;
    
    public az7(final cnb a, final obi<?> b, final sxj c, final ah7 d) {
        czd.f((Object)b, "navigator");
        czd.f((Object)c, "participantSheetFactory");
        czd.f((Object)d, "dmChatLauncher");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a() {
        this.b.d((ym)new se7((ek1)((n4j)new ih7$a()).e()));
    }
    
    public final void b(final qo7 qo7) {
        czd.f((Object)qo7, "inboxItem");
        this.c.a(qo7, (nsb)rxj.D0).e2(this.a.P(), "TAG_USERS_BOTTOM_SHEET");
    }
}
