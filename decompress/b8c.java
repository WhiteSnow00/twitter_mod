import com.twitter.dm.ui.DMAvatar;
import com.twitter.app.dm.GroupInfoEditContentViewProvider;

// 
// Decompiled by Procyon v0.6.0
// 

public final class b8c implements mx0
{
    public final GroupInfoEditContentViewProvider D0;
    
    public b8c(final GroupInfoEditContentViewProvider d0) {
        this.D0 = d0;
    }
    
    public final boolean L3(final vqg vqg) {
        return true;
    }
    
    public final void p1(final yx0 yx0) {
        final vqg d = yx0.d();
        if (d == null) {
            return;
        }
        final int a = d.a;
        if (a != 0) {
            if (a != 1) {
                final qft f1 = this.D0.f1;
                if (f1 != null) {
                    f1.c(2131953235, 0);
                }
            }
        }
        else {
            this.D0.a1 = d.a(3);
            final GroupInfoEditContentViewProvider d2 = this.D0;
            if (d2.a1 != null) {
                final DMAvatar h1 = d2.h1;
                jee.l((Object)h1);
                final DMAvatar dmAvatar = h1;
                final GroupInfoEditContentViewProvider d3 = this.D0;
                final jvg d4 = d3.a1.D0;
                final qo7 d5 = d3.d1;
                jee.l((Object)d5);
                h1.f(d4, d5, this.D0.b1);
                final GroupInfoEditContentViewProvider d6 = this.D0;
                d6.Z0 = false;
                d6.Z4();
            }
        }
    }
}
