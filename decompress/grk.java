// 
// Decompiled by Procyon v0.6.0
// 

public final class grk<T> extends erk<T>
{
    public final Object c;
    
    public grk(final int n) {
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
