import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class hth<T> extends xur<T>
{
    public final ufp I0;
    public final int J0;
    public final boolean K0;
    
    public hth(final Context context, final ufp i0) {
        super(context);
        this.I0 = i0;
        this.J0 = 2131624343;
        this.K0 = false;
    }
    
    public long g(final T t) {
        throw null;
    }
    
    public final long getItemId(final int n) {
        return this.g(((z3e)this).getItem(n));
    }
    
    public final boolean isEnabled(final int n) {
        return this.I0.b(this.getItemId(n));
    }
}
