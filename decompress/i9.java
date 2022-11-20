// 
// Decompiled by Procyon v0.6.0
// 

public final class i9 extends ste implements ftb<String, g7, lvj<? extends String, ? extends g7>>
{
    public static final i9 D0;
    
    static {
        D0 = new i9();
    }
    
    public i9() {
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final String s = (String)o;
        final g7 g7 = (g7)o2;
        czd.f((Object)s, "profileId");
        czd.f((Object)g7, "aboutModule");
        return new lvj((Object)s, (Object)g7);
    }
}
