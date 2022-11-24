// 
// Decompiled by Procyon v0.6.0
// 

public final class epl extends pue implements hub<wg1, wg1, awj<? extends Integer, ? extends Integer>>
{
    public static final epl F0;
    
    static {
        F0 = new epl();
    }
    
    public epl() {
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final wg1 wg1 = (wg1)o;
        final wg1 wg2 = (wg1)o2;
        e0e.f((Object)wg1, "badgeCount");
        e0e.f((Object)wg2, "launcherCount");
        return new awj((Object)wg1.c, (Object)wg2.c);
    }
}
