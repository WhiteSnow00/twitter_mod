import java.util.HashSet;
import java.util.regex.Pattern;
import java.util.Map;
import java.util.Objects;
import android.media.MediaCodecInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c0g implements nuk
{
    public final int c;
    public final Object d;
    
    public c0g(final Object d, final int c) {
        this.c = c;
        this.d = d;
    }
    
    public final boolean apply(final Object o) {
        final int c = this.c;
        final boolean b = true;
        final boolean b2 = true;
        boolean b3 = true;
        final boolean b4 = false;
        switch (c) {
            default: {
                final nuk nuk = (nuk)this.d;
                final int a = luk.a;
                return nuk.apply(o) ^ true;
            }
            case 4: {
                final ddu ddu = (ddu)this.d;
                final gju gju = (gju)o;
                final Map v = hdu.v;
                if (gju.a != ddu) {
                    b3 = false;
                }
                return b3;
            }
            case 3: {
                return ((HashSet)((pwd)this.d).c).contains(((bb7)o).a);
            }
            case 2: {
                final String s = (String)this.d;
                final MediaCodecInfo mediaCodecInfo = (MediaCodecInfo)o;
                final int a2 = kqb.a;
                if (mediaCodecInfo.isEncoder()) {
                    final String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    final int length = supportedTypes.length;
                    int i = 0;
                    while (true) {
                        while (i < length) {
                            if (supportedTypes[i].equalsIgnoreCase(s)) {
                                final boolean b5 = true;
                                if (b5) {
                                    return b;
                                }
                                return false;
                            }
                            else {
                                ++i;
                            }
                        }
                        final boolean b5 = false;
                        continue;
                    }
                }
                return false;
            }
            case 1: {
                final f4w f4w = (f4w)this.d;
                final txj txj = (txj)o;
                final int u1 = f4w.u1;
                Objects.requireNonNull(f4w);
                return txj.F0 != ((pnm)f4w).S0.getId() && b2;
            }
            case 0: {
                final zof zof = (zof)this.d;
                final lzw g = ((ezw)o).g;
                boolean a3 = b4;
                if (g instanceof a0g) {
                    final String eventId = ((a0g)g).c.eventId;
                    final String a4 = zof.a;
                    final Pattern a5 = flr.a;
                    a3 = e0e.a((Object)eventId, (Object)a4);
                }
                return a3;
            }
        }
    }
}
