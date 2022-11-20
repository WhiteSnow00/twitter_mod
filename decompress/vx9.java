import org.webrtc.EglRenderer$FrameListener;
import org.webrtc.RendererCommon$GlDrawer;
import org.webrtc.EglRenderer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vx9 implements Runnable
{
    public final EglRenderer D0;
    public final RendererCommon$GlDrawer E0;
    public final EglRenderer$FrameListener F0;
    public final float G0;
    public final boolean H0;
    
    public vx9(final EglRenderer d0, final RendererCommon$GlDrawer e0, final EglRenderer$FrameListener f0, final float g0, final boolean h0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
    }
    
    @Override
    public final void run() {
        EglRenderer.h(this.D0, this.E0, this.F0, this.G0, this.H0);
    }
}
