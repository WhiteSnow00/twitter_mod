import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lsy implements u4a<lsy>
{
    public static final int d = 0;
    public final Map<Class<?>, b5j<?>> a;
    public final Map<Class<?>, dpw<?>> b;
    public final b5j<Object> c;
    
    public lsy() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = isy.a;
    }
    
    public final /* bridge */ u4a a(final Class clazz, final b5j b5j) {
        this.a.put(clazz, b5j);
        this.b.remove(clazz);
        return (u4a)this;
    }
}
