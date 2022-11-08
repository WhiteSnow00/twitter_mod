// 
// Decompiled by Procyon v0.6.0
// 

public final class exe<T> implements rll<T>
{
    public static final Object c;
    public volatile Object a;
    public volatile rll<T> b;
    
    static {
        c = new Object();
    }
    
    public exe(final rll<T> b) {
        this.a = exe.c;
        this.b = b;
    }
    
    public final T get() {
        final Object a = this.a;
        final Object c = exe.c;
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
