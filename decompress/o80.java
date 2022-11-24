import java.util.List;
import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o80 implements u80<PointF, PointF>
{
    public final f80 F0;
    public final f80 G0;
    
    public o80(final f80 f0, final f80 g0) {
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final boolean f() {
        return this.F0.f() && this.G0.f();
    }
    
    public final wm1<PointF, PointF> g() {
        return (wm1<PointF, PointF>)new j3r((wm1)this.F0.g(), (wm1)this.G0.g());
    }
    
    public final List<zre<PointF>> h() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
