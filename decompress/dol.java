// 
// Decompiled by Procyon v0.6.0
// 

public final class dol extends gue implements gub<xg1, xg1, gvj<? extends Integer, ? extends Integer>>
{
    public static final dol C0;
    
    static {
        C0 = new dol();
    }
    
    public dol() {
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final xg1 xg1 = (xg1)o;
        final xg1 xg2 = (xg1)o2;
        zzd.f((Object)xg1, "badgeCount");
        zzd.f((Object)xg2, "launcherCount");
        return new gvj((Object)xg1.c, (Object)xg2.c);
    }
}
