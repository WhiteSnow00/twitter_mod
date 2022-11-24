// 
// Decompiled by Procyon v0.6.0
// 

public abstract class w8a<T>
{
    public abstract boolean a(final T p0, final T p1);
    
    public abstract int b(final T p0);
    
    public final boolean c(final T t, final T t2) {
        return t == t2 || (t != null && t2 != null && this.a(t, t2));
    }
}
