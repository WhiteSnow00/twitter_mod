import java.nio.ByteBuffer;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.e;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ld3 extends e
{
    public final DecoderInputBuffer R0;
    public final gxj S0;
    public long T0;
    public kd3 U0;
    public long V0;
    
    public ld3() {
        super(6);
        this.R0 = new DecoderInputBuffer(1);
        this.S0 = new gxj();
    }
    
    @Override
    public final void C() {
        final kd3 u0 = this.U0;
        if (u0 != null) {
            u0.i();
        }
    }
    
    @Override
    public final void E(final long n, final boolean b) {
        this.V0 = Long.MIN_VALUE;
        final kd3 u0 = this.U0;
        if (u0 != null) {
            u0.i();
        }
    }
    
    @Override
    public final void I(final n[] array, final long n, final long t0) {
        this.T0 = t0;
    }
    
    public final boolean c() {
        return true;
    }
    
    public final int e(final n n) {
        int n2;
        if ("application/x-camera-motion".equals(n.Q0)) {
            n2 = c0e.b(4);
        }
        else {
            n2 = c0e.b(0);
        }
        return n2;
    }
    
    public final boolean f() {
        return this.j();
    }
    
    public final String getName() {
        return "CameraMotionRenderer";
    }
    
    @Override
    public final void m(final int n, final Object o) throws ExoPlaybackException {
        if (n == 8) {
            this.U0 = (kd3)o;
        }
    }
    
    public final void v(final long n, final long n2) {
        while (!this.j() && this.V0 < 100000L + n) {
            this.R0.q();
            final y8r b = this.B();
            final DecoderInputBuffer r0 = this.R0;
            int i = 0;
            if (this.J(b, r0, 0) != -4) {
                break;
            }
            if (((dr2)this.R0).j(4)) {
                break;
            }
            final DecoderInputBuffer r2 = this.R0;
            this.V0 = r2.J0;
            if (this.U0 == null) {
                continue;
            }
            if (((dr2)r2).p()) {
                continue;
            }
            this.R0.t();
            final ByteBuffer h0 = this.R0.H0;
            final int a = rnw.a;
            float[] array;
            if (h0.remaining() != 16) {
                array = null;
            }
            else {
                this.S0.B(h0.array(), h0.limit());
                this.S0.D(h0.arrayOffset() + 4);
                array = new float[3];
                while (i < 3) {
                    array[i] = Float.intBitsToFloat(this.S0.g());
                    ++i;
                }
            }
            if (array == null) {
                continue;
            }
            this.U0.e(this.V0 - this.T0, array);
        }
    }
}
