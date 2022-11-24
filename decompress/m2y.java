import java.util.Objects;
import android.os.Bundle;
import com.google.android.gms.common.api.c$c;
import com.google.android.gms.common.api.c$b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m2y implements c$b, c$c
{
    public final o2y a;
    
    public m2y(final o2y a) {
        this.a = a;
    }
    
    public final void U0(final Bundle bundle) {
        Objects.requireNonNull(this.a.r, "null reference");
        final t4y k = this.a.k;
        Objects.requireNonNull(k, "null reference");
        k.e((u4y)new l2y(this.a));
    }
    
    public final void s(final bi6 bi6) {
        this.a.b.lock();
        try {
            if (this.a.l && !bi6.p()) {
                this.a.i();
                this.a.n();
            }
            else {
                this.a.l(bi6);
            }
        }
        finally {
            this.a.b.unlock();
        }
    }
    
    public final void x(final int n) {
    }
}
