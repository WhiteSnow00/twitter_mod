import java.util.List;
import java.util.HashSet;
import java.util.Collection;
import java.util.Objects;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ds extends vza
{
    public final cgv K0;
    public final long[] L0;
    
    public ds(final Context context, final UserIdentifier userIdentifier, final cgv k0) {
        super(context, userIdentifier);
        this.K0 = k0;
        this.L0 = null;
    }
    
    public ds(final Context context, final UserIdentifier userIdentifier, final long[] l0) {
        super(context, userIdentifier);
        this.K0 = null;
        this.L0 = l0;
    }
    
    public final void m() {
        final vav g = this.g();
        final nm6 h = this.h();
        Label_0218: {
            if (this.K0 != null) {
                ((dj1)this).D0.getId();
                final cgv k0 = this.K0;
                Objects.requireNonNull(g);
                final List v = rif.v((Object)k0);
                final lzr g2 = ((ok1)g).G2();
                g2.G0();
                try {
                    g.T3((Collection)v);
                    g2.z();
                    break Label_0218;
                }
                finally {
                    g2.A();
                }
            }
            if (this.L0 != null) {
                ((dj1)this).D0.getId();
                final long[] l0 = this.L0;
                Objects.requireNonNull(g);
                final HashSet set = new HashSet();
                for (int length = l0.length, i = 0; i < length; ++i) {
                    final cgv y1 = g.Y1(l0[i]);
                    if (y1 != null) {
                        set.add(y1);
                    }
                }
                final lzr g3 = ((ok1)g).G2();
                g3.G0();
                try {
                    g.T3((Collection)set);
                    g3.z();
                }
                finally {
                    g3.A();
                }
            }
        }
        h.b();
    }
}
