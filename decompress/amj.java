// 
// Decompiled by Procyon v0.6.0
// 

public final class amj extends qtr<dmj>
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public amj(final String s, final dmj dmj) {
        e0e.f((Object)s, "id");
        e0e.f((Object)dmj, "properties");
        super(s, dmj);
    }
    
    public static final class a
    {
    }
    
    public static final class b extends qtr$a<amj, dmj>
    {
        public final qtr g(final String s, final bur bur) {
            final dmj dmj = (dmj)bur;
            e0e.f((Object)s, "id");
            e0e.f((Object)dmj, "properties");
            return new amj(s, dmj);
        }
    }
}
