import android.graphics.drawable.Drawable;
import android.graphics.drawable.Animatable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w6d extends vj1
{
    public long b;
    public x6d c;
    
    public w6d(final x6d c) {
        this.b = -1L;
        this.c = c;
    }
    
    @Override
    public final void d(final String s, final Object o, final Animatable animatable) {
        final long currentTimeMillis = System.currentTimeMillis();
        final x6d c = this.c;
        if (c != null) {
            final long b = this.b;
            final na8 na8 = (na8)c;
            na8.V0 = currentTimeMillis - b;
            ((Drawable)na8).invalidateSelf();
        }
    }
    
    @Override
    public final void e(final String s, final Object o) {
        this.b = System.currentTimeMillis();
    }
}
