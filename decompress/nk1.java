import java.util.Objects;
import java.util.Collections;
import java.util.Map;
import com.google.android.exoplayer2.upstream.b;
import java.util.ArrayList;
import com.google.android.exoplayer2.upstream.a;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nk1 implements a
{
    public final boolean a;
    public final ArrayList<hzt> b;
    public int c;
    public b d;
    
    public nk1(final boolean a) {
        this.a = a;
        this.b = new ArrayList<hzt>(1);
    }
    
    public Map d() {
        return Collections.emptyMap();
    }
    
    public final void g(final hzt hzt) {
        Objects.requireNonNull(hzt);
        if (!this.b.contains(hzt)) {
            this.b.add(hzt);
            ++this.c;
        }
    }
    
    public final void p(final int n) {
        final b d = this.d;
        final int a = rnw.a;
        for (int i = 0; i < this.c; ++i) {
            this.b.get(i).e((a)this, d, this.a, n);
        }
    }
    
    public final void q() {
        final b d = this.d;
        final int a = rnw.a;
        for (int i = 0; i < this.c; ++i) {
            this.b.get(i).c((a)this, d, this.a);
        }
        this.d = null;
    }
    
    public final void r(final b b) {
        for (int i = 0; i < this.c; ++i) {
            this.b.get(i).i((a)this, b, this.a);
        }
    }
    
    public final void s(final b d) {
        this.d = d;
        for (int i = 0; i < this.c; ++i) {
            this.b.get(i).g((a)this, d, this.a);
        }
    }
}
