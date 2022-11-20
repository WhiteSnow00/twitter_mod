import com.google.android.exoplayer2.mediacodec.MediaCodecUtil$e;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class urg implements Comparator
{
    public final int D0;
    public final Object E0;
    
    public urg(final Object e0, final int d0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final int compare(final Object o, final Object o2) {
        switch (this.D0) {
            default: {
                final ftb ftb = (ftb)this.E0;
                final ra3 a = ra3.a;
                czd.f((Object)ftb, "$tmp0");
                return ((Number)ftb.invoke(o, o2)).intValue();
            }
            case 0: {
                final MediaCodecUtil$e mediaCodecUtil$e = (MediaCodecUtil$e)this.E0;
                return mediaCodecUtil$e.l(o2) - mediaCodecUtil$e.l(o);
            }
        }
    }
}
