import java.util.AbstractMap;
import j$.util.concurrent.ConcurrentHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class exd extends ConcurrentHashMap<String, String>
{
    public static final exd E0;
    public final Object D0;
    
    static {
        E0 = new exd();
    }
    
    public exd() {
        super(180, 0.8f, 4);
        this.D0 = new Object();
    }
    
    public final String a(String intern) {
        final String s = ((AbstractMap<K, String>)this).get(intern);
        if (s != null) {
            return s;
        }
        if (((AbstractMap)this).size() >= 180) {
            synchronized (this.D0) {
                if (((AbstractMap)this).size() >= 180) {
                    ((AbstractMap)this).clear();
                }
            }
        }
        intern = intern.intern();
        ((AbstractMap<String, String>)this).put(intern, intern);
        return intern;
    }
}
