// 
// Decompiled by Procyon v0.6.0
// 

public final class lhs extends pue implements stb<uhs, sr9>
{
    public static final lhs F0;
    
    static {
        F0 = new lhs();
    }
    
    public lhs() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final uhs uhs = (uhs)o;
        e0e.f((Object)uhs, "$this$deleteIfSelectedOr");
        final Integer b = uhs.b();
        ip8 ip8;
        if (b != null) {
            ip8 = new ip8(zjs.d(uhs.f) - b.intValue(), 0);
        }
        else {
            ip8 = null;
        }
        return ip8;
    }
}
