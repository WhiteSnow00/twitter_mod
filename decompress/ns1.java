import java.nio.ByteBuffer;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ns1 extends DecoderInputBuffer
{
    public long L0;
    public int M0;
    public int N0;
    
    public ns1() {
        super(2);
        this.N0 = 32;
    }
    
    public final void q() {
        super.q();
        this.M0 = 0;
    }
    
    public final boolean v(final DecoderInputBuffer decoderInputBuffer) {
        omy.g(decoderInputBuffer.u() ^ true);
        omy.g(((mq2)decoderInputBuffer).m() ^ true);
        omy.g(((mq2)decoderInputBuffer).j(4) ^ true);
        boolean b = false;
        Label_0110: {
            Label_0108: {
                if (this.w()) {
                    if (this.M0 < this.N0) {
                        if (((mq2)decoderInputBuffer).p() == ((mq2)this).p()) {
                            final ByteBuffer f0 = decoderInputBuffer.F0;
                            if (f0 == null) {
                                break Label_0108;
                            }
                            final ByteBuffer f2 = super.F0;
                            if (f2 == null || f0.remaining() + f2.position() <= 3072000) {
                                break Label_0108;
                            }
                        }
                    }
                    b = false;
                    break Label_0110;
                }
            }
            b = true;
        }
        if (!b) {
            return false;
        }
        if (this.M0++ == 0) {
            super.H0 = decoderInputBuffer.H0;
            if (((mq2)decoderInputBuffer).j(1)) {
                ((mq2)this).D0 = 1;
            }
        }
        if (((mq2)decoderInputBuffer).p()) {
            ((mq2)this).D0 = Integer.MIN_VALUE;
        }
        final ByteBuffer f3 = decoderInputBuffer.F0;
        if (f3 != null) {
            this.s(f3.remaining());
            super.F0.put(f3);
        }
        this.L0 = decoderInputBuffer.H0;
        return true;
    }
    
    public final boolean w() {
        return this.M0 > 0;
    }
}
