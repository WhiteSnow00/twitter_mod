import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oi implements ni
{
    public final pi a;
    public final zt8 b;
    
    public oi(final pi a) {
        this.a = a;
        this.b = new zt8();
    }
    
    @Override
    public final void a(final Context context, final ocw ocw) {
        final zt8 b = this.b;
        if (!b.b) {
            return;
        }
        this.a.a(context, ocw, b);
    }
    
    @Override
    public final void b(final int a) {
        final zt8 b = this.b;
        b.a = a;
        b.b = true;
    }
}
