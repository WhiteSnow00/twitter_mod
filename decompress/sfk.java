// 
// Decompiled by Procyon v0.6.0
// 

public abstract class sfk<T extends ofk> extends fo1<T>
{
    public abstract void b(final T p0);
    
    public final void onNext(final Object o) {
        final ofk ofk = (ofk)o;
        try {
            this.b((T)ofk);
        }
        catch (final RuntimeException ex) {
            m8a.d((Throwable)ex);
        }
    }
}
