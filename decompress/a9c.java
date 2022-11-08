import com.twitter.dm.ui.DMAvatar;
import com.twitter.app.dm.GroupInfoEditContentViewProvider;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a9c implements rx0
{
    public final /* synthetic */ GroupInfoEditContentViewProvider C0;
    
    public a9c(final GroupInfoEditContentViewProvider c0) {
        this.C0 = c0;
    }
    
    public final boolean L3(final wqg wqg) {
        return true;
    }
    
    public final void p1(final dy0 dy0) {
        final wqg d = dy0.d();
        if (d == null) {
            return;
        }
        final int a = d.a;
        if (a != 0) {
            if (a != 1) {
                final bft e1 = this.C0.e1;
                if (e1 != null) {
                    e1.b(2131953235, 0);
                }
            }
        }
        else {
            this.C0.Z0 = d.a(3);
            final GroupInfoEditContentViewProvider c0 = this.C0;
            if (c0.Z0 != null) {
                final DMAvatar g1 = c0.g1;
                pf8.r(g1);
                final DMAvatar dmAvatar = g1;
                final GroupInfoEditContentViewProvider c2 = this.C0;
                final kvg c3 = c2.Z0.C0;
                final jp7 c4 = c2.c1;
                pf8.r(c4);
                g1.f(c3, c4, this.C0.a1);
                final GroupInfoEditContentViewProvider c5 = this.C0;
                c5.Y0 = false;
                c5.Z4();
            }
        }
    }
}
