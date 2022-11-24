// 
// Decompiled by Procyon v0.6.0
// 

public final class h9 extends pue implements hub<String, f7, awj<? extends String, ? extends f7>>
{
    public static final h9 F0;
    
    static {
        F0 = new h9();
    }
    
    public h9() {
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final String s = (String)o;
        final f7 f7 = (f7)o2;
        e0e.f((Object)s, "profileId");
        e0e.f((Object)f7, "aboutModule");
        return new awj((Object)s, (Object)f7);
    }
}
