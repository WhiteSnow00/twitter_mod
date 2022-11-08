import android.graphics.Rect;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w90 implements p90
{
    public final /* synthetic */ AnimatedFactoryV2Impl a;
    
    public w90(final AnimatedFactoryV2Impl a) {
        this.a = a;
    }
    
    public final l90 a(final pa0 pa0, final Rect rect) {
        final AnimatedFactoryV2Impl a = this.a;
        if (a.g == null) {
            a.g = new r90();
        }
        return (l90)new o90(a.g, pa0, rect, a.d);
    }
}
