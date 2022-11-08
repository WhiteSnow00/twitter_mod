// 
// Decompiled by Procyon v0.6.0
// 

public final class z01 extends ggm<sba>
{
    public static final z01.z01$a Companion;
    public static final tba D0;
    
    static {
        Companion = new z01.z01$a();
        D0 = (tba)sba.Companion.b("SPACE_JOIN_INVALID_EVENT_PAGE", "SPACE_JOIN_INVALID_EVENT_SECTION", "SPACE_JOIN_INVALID_EVENT_COMPONENT", "SPACE_JOIN_INVALID_ELEMENT_COMPONENT");
    }
    
    public z01() {
        super((Object)null, 1, (hg8)null);
    }
    
    public final String d() {
        final sba sba = (sba)this.b();
        String d;
        if (sba == null || (d = ((ada)sba).d()) == null) {
            d = "SPACE_JOIN_INVALID_EVENT_SECTION";
        }
        return d;
    }
}
