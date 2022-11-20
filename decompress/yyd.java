// 
// Decompiled by Procyon v0.6.0
// 

public final class yyd extends ste implements ftb<hyd, Integer, Integer>
{
    public static final yyd D0;
    
    static {
        D0 = new yyd();
    }
    
    public yyd() {
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final hyd hyd = (hyd)o;
        final int intValue = ((Number)o2).intValue();
        czd.f((Object)hyd, "$this$intrinsicSize");
        return hyd.e(intValue);
    }
}
