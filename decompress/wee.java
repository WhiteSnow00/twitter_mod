import java.util.Date;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wee implements u4a<wee>
{
    public static final wee.wee$a e;
    public final Map<Class<?>, b5j<?>> a;
    public final Map<Class<?>, dpw<?>> b;
    public b5j<Object> c;
    public boolean d;
    
    static {
        e = new wee.wee$a();
    }
    
    public wee() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = see.a;
        this.d = false;
        this.b(String.class, tee.a);
        this.b(Boolean.class, (dpw<? super Boolean>)uee.a);
        this.b(Date.class, (dpw<? super Date>)wee.e);
    }
    
    public final u4a a(final Class clazz, final b5j b5j) {
        this.a.put(clazz, b5j);
        this.b.remove(clazz);
        return (u4a)this;
    }
    
    public final <T> wee b(final Class<T> clazz, final dpw<? super T> dpw) {
        this.b.put(clazz, dpw);
        this.a.remove(clazz);
        return this;
    }
}
