import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wjy<K, V> extends dey<K, V> implements Serializable
{
    public final K C0;
    public final V D0;
    
    public wjy(final K c0, final V d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final K getKey() {
        return this.C0;
    }
    
    public final V getValue() {
        return this.D0;
    }
    
    public final V setValue(final V v) {
        throw new UnsupportedOperationException();
    }
}
