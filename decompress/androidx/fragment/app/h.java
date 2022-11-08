// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import java.util.Objects;

public final class h implements Runnable
{
    public final /* synthetic */ v.b C0;
    public final /* synthetic */ v.b D0;
    public final /* synthetic */ boolean E0;
    
    public h(final v.b c0, final v.b d0, final boolean e0, final at0 at0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    @Override
    public final void run() {
        final Fragment c = this.C0.c;
        final Fragment c2 = this.D0.c;
        final boolean e0 = this.E0;
        final upb a = tpb.a;
        if (e0) {
            Objects.requireNonNull(c2);
        }
        else {
            Objects.requireNonNull(c);
        }
    }
}
