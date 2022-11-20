// 
// Decompiled by Procyon v0.6.0
// 

public abstract class doq implements Comparable<doq>
{
    public static final a Companion;
    public final int D0;
    
    static {
        Companion = new a();
    }
    
    public doq(final int d0) {
        this.D0 = d0;
    }
    
    @Override
    public final int compareTo(final Object o) {
        final doq doq = (doq)o;
        czd.f((Object)doq, "other");
        return czd.h(this.D0, doq.D0);
    }
    
    public static final class a
    {
    }
}
