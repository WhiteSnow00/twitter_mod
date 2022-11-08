import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p8r<T> implements vro<n8r<T>>
{
    public final T C0;
    public final bra<T, n8r<T>> D0;
    public final String E0;
    
    public p8r(final T c0) {
        final bra<T, n8r<T>> from = n8r.from(c0);
        final String name = c0.getClass().getName();
        this.C0 = c0;
        this.D0 = from;
        this.E0 = name;
    }
    
    @Override
    public final Parcelable C3() {
        return (Parcelable)this.D0.a((Object)this.C0);
    }
    
    @Override
    public final String getId() {
        return this.E0;
    }
    
    @Override
    public final void v(final Parcelable parcelable) {
        ((n8r)parcelable).restoreState(this.C0);
    }
}
