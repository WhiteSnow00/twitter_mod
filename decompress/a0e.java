// 
// Decompiled by Procyon v0.6.0
// 

public final class a0e extends pue implements hub<jzd, Integer, Integer>
{
    public static final a0e F0;
    
    static {
        F0 = new a0e();
    }
    
    public a0e() {
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final jzd jzd = (jzd)o;
        final int intValue = ((Number)o2).intValue();
        e0e.f((Object)jzd, "$this$intrinsicSize");
        return jzd.e(intValue);
    }
}
