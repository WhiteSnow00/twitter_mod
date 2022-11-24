import java.nio.ByteBuffer;
import java.util.Objects;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.text.SubtitleDecoderException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class paq extends i9q<iur, jur, SubtitleDecoderException> implements gur
{
    public paq() {
        super((DecoderInputBuffer[])new iur[2], (dd8[])new jur[2]);
        final int g = super.g;
        final int length = super.e.length;
        int i = 0;
        omi.p(g == length);
        for (DecoderInputBuffer[] e = super.e; i < e.length; ++i) {
            e[i].s(1024);
        }
    }
    
    public final void a(final long n) {
    }
    
    public final DecoderException e(DecoderInputBuffer decoderInputBuffer, final dd8 dd8, final boolean b) {
        decoderInputBuffer = decoderInputBuffer;
        final jur jur = (jur)dd8;
        try {
            final ByteBuffer h0 = decoderInputBuffer.H0;
            Objects.requireNonNull(h0);
            jur.s(decoderInputBuffer.J0, this.j(h0.array(), h0.limit(), b), ((iur)decoderInputBuffer).N0);
            ((dr2)jur).F0 &= Integer.MAX_VALUE;
            decoderInputBuffer = null;
        }
        catch (final SubtitleDecoderException ex) {}
        return (DecoderException)decoderInputBuffer;
    }
    
    public abstract fur j(final byte[] p0, final int p1, final boolean p2) throws SubtitleDecoderException;
}
