import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.google.android.exoplayer2.ParserException;
import java.util.Collection;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.List;
import android.text.TextUtils;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kox extends paq
{
    public final gxj m;
    public final fox n;
    
    public kox() {
        this.m = new gxj();
        this.n = new fox();
    }
    
    @Override
    public final fur j(final byte[] array, int i, final boolean b) throws SubtitleDecoderException {
        this.m.B(array, i);
        final ArrayList list = new ArrayList();
        try {
            mox.d(this.m);
            while (!TextUtils.isEmpty((CharSequence)this.m.f())) {}
            final ArrayList list2 = new ArrayList();
            while (true) {
                final gxj m = this.m;
                i = -1;
                int b2 = 0;
                while (i == -1) {
                    b2 = m.b;
                    final String f = m.f();
                    if (f == null) {
                        i = 0;
                    }
                    else if ("STYLE".equals(f)) {
                        i = 2;
                    }
                    else if (f.startsWith("NOTE")) {
                        i = 1;
                    }
                    else {
                        i = 3;
                    }
                }
                m.D(b2);
                if (i == 0) {
                    return (fur)new oox((List)list2);
                }
                if (i == 1) {
                    while (!TextUtils.isEmpty((CharSequence)this.m.f())) {}
                }
                else if (i == 2) {
                    if (!list2.isEmpty()) {
                        throw new SubtitleDecoderException("A style block was found after the first cue.");
                    }
                    this.m.f();
                    list.addAll(this.n.a(this.m));
                }
                else {
                    if (i != 3) {
                        continue;
                    }
                    final gxj j = this.m;
                    final Pattern a = jox.a;
                    final String f2 = j.f();
                    hox hox = null;
                    if (f2 != null) {
                        final Pattern a2 = jox.a;
                        final Matcher matcher = a2.matcher(f2);
                        if (matcher.matches()) {
                            hox = jox.d(null, matcher, j, list);
                        }
                        else {
                            final String f3 = j.f();
                            if (f3 != null) {
                                final Matcher matcher2 = a2.matcher(f3);
                                if (matcher2.matches()) {
                                    hox = jox.d(f2.trim(), matcher2, j, list);
                                }
                            }
                        }
                    }
                    if (hox == null) {
                        continue;
                    }
                    list2.add(hox);
                }
            }
        }
        catch (final ParserException ex) {
            throw new SubtitleDecoderException((Throwable)ex);
        }
    }
}
