import java.util.Objects;
import java.util.Arrays;
import com.twitter.util.user.UserIdentifier;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class at2 extends kmm<List<hfv>, pav>
{
    public final long[] V0;
    public final cdg W0;
    
    public at2(final UserIdentifier userIdentifier, final long[] v0, final cdg w0) {
        super(userIdentifier);
        this.V0 = v0;
        this.W0 = w0;
    }
    
    public final tsc<List<hfv>, pav> b() {
        int length = this.V0.length;
        final int b = f1v.b(length, 100);
        final ijf$a ijf$a = new ijf$a(this.V0.length);
        int n;
        for (int i = 0; i < b; ++i, length = n) {
            if ((n = length) > 0) {
                final long[] v0 = this.V0;
                final int n2 = v0.length - length;
                final long[] copyOfRange = Arrays.copyOfRange(this.V0, n2, Math.min(n2 + 100, v0.length));
                final cdg w0 = this.W0;
                Objects.requireNonNull(w0);
                final tsc r = ((ksc)new bdg(w0.a, copyOfRange, w0.b, w0.c)).R();
                if (r.b) {
                    ((ijf)ijf$a).q((Iterable)r.g);
                }
                n = length - copyOfRange.length;
            }
        }
        tsc c;
        if (((ijf)ijf$a).isEmpty()) {
            c = tsc.c(0, "");
        }
        else {
            c = new tsc(true, (Object)((h4j)ijf$a).e());
        }
        return (tsc<List<hfv>, pav>)c;
    }
}
