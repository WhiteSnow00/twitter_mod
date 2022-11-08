// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cnd<T> extends b5j<T>
{
    public abstract T d();
    
    public abstract void e(final wbj<? super T> p0);
    
    public final void subscribeActual(final wbj<? super T> wbj) {
        zzd.g((Object)wbj, "observer");
        this.e(wbj);
        wbj.onNext(this.d());
    }
    
    public final class a extends b5j<T>
    {
        public final void subscribeActual(final wbj<? super T> wbj) {
            zzd.g((Object)wbj, "observer");
            cnd.this.e(wbj);
        }
    }
}
