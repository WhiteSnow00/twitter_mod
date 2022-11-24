// 
// Decompiled by Procyon v0.6.0
// 

public final class aip extends pue implements hub<Object, Object, Object>
{
    public static final aip F0;
    
    static {
        F0 = new aip();
    }
    
    public aip() {
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        Object o3 = o;
        if (o == null) {
            o3 = o2;
        }
        return o3;
    }
}
