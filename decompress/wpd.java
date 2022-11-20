import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wpd implements g3e
{
    public static final wpd b;
    public static final List<Integer> c;
    
    static {
        b = new wpd();
        c = s9i.s(8, 10, 11, 18, 21, 22, 23);
    }
    
    public final boolean b(final Object o) {
        czd.f(o, "item");
        return o instanceof qs6 && wpd.c.contains(((qs6)o).h.getType());
    }
}
