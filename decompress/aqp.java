// 
// Decompiled by Procyon v0.6.0
// 

public final class aqp
{
    public static final aqp a;
    public static final daa b;
    public static final vba c;
    public static final vba d;
    public static final vba e;
    public static final vba f;
    
    static {
        a = new aqp();
        final baa b2 = baa.Companion.b("settings", "", "search");
        b = (daa)b2;
        final vba$a companion = vba.Companion;
        c = companion.b(b2, "results", "click");
        d = companion.b(b2, "results", "empty");
        e = companion.b(b2, "results", "show");
        f = companion.b(b2, "search_box", "began_typing");
    }
}
