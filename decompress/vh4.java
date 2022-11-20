import java.util.Iterator;
import java.util.HashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class vh4 implements Closeable, m6d
{
    public static final Set<String> E0;
    public Map<String, Object> D0;
    
    static {
        vh4.E0 = new HashSet((Collection<? extends E>)Arrays.asList("encoded_size", "encoded_width", "encoded_height", "uri_source", "image_format", "bitmap_config", "is_rounded"));
    }
    
    public vh4() {
        this.D0 = new HashMap();
    }
    
    public nsl a() {
        return (nsl)ndd.d;
    }
    
    public abstract int b();
    
    public boolean c() {
        return false;
    }
    
    @Override
    public abstract void close();
    
    public final void d(final Map<String, Object> map) {
        if (map == null) {
            return;
        }
        for (final String s : vh4.E0) {
            final Object value = map.get(s);
            if (value == null) {
                continue;
            }
            this.D0.put(s, value);
        }
    }
    
    public final void finalize() throws Throwable {
        if (this.isClosed()) {
            return;
        }
        xli.I0("CloseableImage", "finalize: %s %x still open.", new Object[] { this.getClass().getSimpleName(), System.identityHashCode(this) });
        try {
            this.close();
        }
        finally {
            super.finalize();
        }
    }
    
    public final Map<String, Object> getExtras() {
        return this.D0;
    }
    
    public abstract boolean isClosed();
}
