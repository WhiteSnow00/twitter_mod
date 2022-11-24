// 
// Decompiled by Procyon v0.6.0
// 

public final class axa extends pue implements stb<rrd, vrd>
{
    public static final axa F0;
    
    static {
        F0 = new axa();
    }
    
    public axa() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final rrd rrd = (rrd)o;
        e0e.f((Object)rrd, "data");
        return rrd.b;
    }
}
