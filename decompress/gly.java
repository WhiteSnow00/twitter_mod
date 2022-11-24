import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gly<K, V> extends nfy<K, V> implements Serializable
{
    public final K F0;
    public final V G0;
    
    public gly(final K f0, final V g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final K getKey() {
        return this.F0;
    }
    
    public final V getValue() {
        return this.G0;
    }
    
    public final V setValue(final V v) {
        throw new UnsupportedOperationException();
    }
}
