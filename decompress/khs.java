// 
// Decompiled by Procyon v0.6.0
// 

public final class khs extends pue implements stb<uhs, sr9>
{
    public static final khs F0;
    
    static {
        F0 = new khs();
    }
    
    public khs() {
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final uhs uhs = (uhs)o;
        e0e.f((Object)uhs, "$this$deleteIfSelectedOr");
        final qjs c = uhs.c;
        Object o2 = null;
        Integer value;
        if (c != null) {
            value = uhs.d(c, uhs.C());
        }
        else {
            value = null;
        }
        if (value != null) {
            o2 = new ip8(0, value.intValue() - zjs.d(uhs.f));
        }
        return o2;
    }
}
