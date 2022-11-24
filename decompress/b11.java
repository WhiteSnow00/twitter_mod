// 
// Decompiled by Procyon v0.6.0
// 

public final class b11 extends lhm<ica>
{
    public static final b11.b11$a Companion;
    public static final jca G0;
    
    static {
        Companion = new b11.b11$a();
        G0 = (jca)ica.Companion.b("SPACE_JOIN_INVALID_EVENT_PAGE", "SPACE_JOIN_INVALID_EVENT_SECTION", "SPACE_JOIN_INVALID_EVENT_COMPONENT", "SPACE_JOIN_INVALID_ELEMENT_COMPONENT");
    }
    
    public b11() {
        super((Object)null, 1, (wg8)null);
    }
    
    public final String g() {
        final ica ica = (ica)this.c();
        String d;
        if (ica == null || (d = ((qda)ica).d()) == null) {
            d = "SPACE_JOIN_INVALID_EVENT_SECTION";
        }
        return d;
    }
}
