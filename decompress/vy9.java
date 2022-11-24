import org.webrtc.EglRenderer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vy9 implements Runnable
{
    public final EglRenderer F0;
    public final float G0;
    public final float H0;
    public final float I0;
    public final float J0;
    
    public vy9(final EglRenderer f0, final float g0, final float h0, final float i0, final float j0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
    }
    
    @Override
    public final void run() {
        EglRenderer.b(this.F0, this.G0, this.H0, this.I0, this.J0);
    }
}
