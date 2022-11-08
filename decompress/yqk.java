// 
// Decompiled by Procyon v0.6.0
// 

public final class yqk<T> extends wqk<T>
{
    public final Object c;
    
    public yqk(final int n) {
        super(n);
        this.c = new Object();
    }
    
    @Override
    public final T a() {
        synchronized (this.c) {
            return super.a();
        }
    }
    
    @Override
    public final boolean b(final T t) {
        synchronized (this.c) {
            return super.b(t);
        }
    }
}
