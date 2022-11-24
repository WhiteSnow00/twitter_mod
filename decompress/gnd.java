// 
// Decompiled by Procyon v0.6.0
// 

public abstract class gnd<T> extends t5j<T>
{
    public abstract T d();
    
    public abstract void e(final ocj<? super T> p0);
    
    public final void subscribeActual(final ocj<? super T> ocj) {
        e0e.g((Object)ocj, "observer");
        this.e(ocj);
        ocj.onNext(this.d());
    }
    
    public final class a extends t5j<T>
    {
        public final gnd F0;
        
        public a(final gnd f0) {
            this.F0 = f0;
        }
        
        public final void subscribeActual(final ocj<? super T> ocj) {
            e0e.g((Object)ocj, "observer");
            this.F0.e(ocj);
        }
    }
}
