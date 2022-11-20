import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jjt implements ijt
{
    public final Map<Integer, mra> a;
    
    public jjt() {
        this.a = new HashMap();
    }
    
    public final boolean a() {
        final mra mra = this.a.get(1);
        return mra != null && mra.c();
    }
    
    public final void b() {
        final mra mra = this.a.get(1);
        if (mra != null) {
            mra.b();
        }
    }
    
    public final void c(final mra mra) {
        this.a.put(1, mra);
    }
}
