import java.util.regex.Pattern;
import java.util.Collections;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class orh extends b9q
{
    public final mwj m;
    
    public orh() {
        this.m = new mwj();
    }
    
    public final psr j(final byte[] array, int i, final boolean b) throws SubtitleDecoderException {
        this.m.B(array, i);
        final ArrayList list = new ArrayList();
        while (true) {
            final mwj m = this.m;
            i = m.c - m.b;
            if (i <= 0) {
                return new prh(list);
            }
            if (i < 8) {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
            i = m.e();
            if (this.m.e() == 1987343459) {
                final mwj j = this.m;
                i -= 8;
                m87$a a;
                Object f = a = null;
                while (i > 0) {
                    if (i < 8) {
                        throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
                    }
                    int e = j.e();
                    final int e2 = j.e();
                    e -= 8;
                    final String o = imw.o(j.a, j.b, e);
                    j.E(e);
                    final int n = i - 8 - e;
                    if (e2 == 1937011815) {
                        final Pattern a2 = anx.a;
                        final anx.d d = new anx.d();
                        anx.e(o, d);
                        a = d.a();
                        i = n;
                    }
                    else {
                        i = n;
                        if (e2 != 1885436268) {
                            continue;
                        }
                        f = anx.f(null, o.trim(), Collections.emptyList());
                        i = n;
                    }
                }
                CharSequence charSequence;
                if ((charSequence = (CharSequence)f) == null) {
                    charSequence = "";
                }
                m87 m2;
                if (a != null) {
                    a.a = charSequence;
                    m2 = a.a();
                }
                else {
                    final Pattern a3 = anx.a;
                    final anx.d d2 = new anx.d();
                    d2.c = charSequence;
                    m2 = d2.a().a();
                }
                list.add(m2);
            }
            else {
                this.m.E(i - 8);
            }
        }
    }
}
