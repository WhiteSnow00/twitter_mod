import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k9r<T> implements mso<j9r<T>>
{
    public final T D0;
    public final ypa<T, j9r<T>> E0;
    public final String F0;
    
    public k9r(final T d0) {
        final ypa from = j9r.from((Object)d0);
        final String name = d0.getClass().getName();
        this.D0 = d0;
        this.E0 = (ypa<T, j9r<T>>)from;
        this.F0 = name;
    }
    
    public final Parcelable C3() {
        return (Parcelable)this.E0.a((Object)this.D0);
    }
    
    public final void T0() {
    }
    
    public final String getId() {
        return this.F0;
    }
    
    public final void v(final Parcelable parcelable) {
        ((j9r)parcelable).restoreState((Object)this.D0);
    }
}
