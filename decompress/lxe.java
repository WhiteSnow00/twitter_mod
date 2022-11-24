// 
// Decompiled by Procyon v0.6.0
// 

public final class lxe<T> implements qml<T>
{
    public static final Object c;
    public volatile Object a;
    public volatile qml<T> b;
    
    static {
        c = new Object();
    }
    
    public lxe(final qml<T> b) {
        this.a = lxe.c;
        this.b = b;
    }
    
    public final T get() {
        final Object a = this.a;
        final Object c = lxe.c;
        final T t = (T)a;
        if (a == c) {
            synchronized (this) {
                if (this.a == c) {
                    this.a = this.b.get();
                    this.b = null;
                }
            }
        }
        return t;
    }
}
