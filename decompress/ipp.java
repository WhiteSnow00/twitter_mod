// 
// Decompiled by Procyon v0.6.0
// 

public final class ipp extends ste implements qsb<oap, Long>
{
    public static final ipp D0;
    
    static {
        D0 = new ipp();
    }
    
    public ipp() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final oap oap = (oap)o;
        czd.f((Object)oap, "item");
        return oap.a.hashCode();
    }
}
