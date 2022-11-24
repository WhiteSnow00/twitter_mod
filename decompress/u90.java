import android.graphics.Rect;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;

// 
// Decompiled by Procyon v0.6.0
// 

public final class u90 implements m90
{
    public final AnimatedFactoryV2Impl a;
    
    public u90(final AnimatedFactoryV2Impl a) {
        this.a = a;
    }
    
    public final j90 a(final oa0 oa0, final Rect rect) {
        final AnimatedFactoryV2Impl a = this.a;
        if (a.g == null) {
            a.g = new o90();
        }
        return (j90)new l90(a.g, oa0, rect, a.d);
    }
}
