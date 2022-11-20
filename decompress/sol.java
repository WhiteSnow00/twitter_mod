// 
// Decompiled by Procyon v0.6.0
// 

public final class sol extends ste implements ftb<tg1, tg1, lvj<? extends Integer, ? extends Integer>>
{
    public static final sol D0;
    
    static {
        D0 = new sol();
    }
    
    public sol() {
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final tg1 tg1 = (tg1)o;
        final tg1 tg2 = (tg1)o2;
        czd.f((Object)tg1, "badgeCount");
        czd.f((Object)tg2, "launcherCount");
        return new lvj((Object)tg1.c, (Object)tg2.c);
    }
}
