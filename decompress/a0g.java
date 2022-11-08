import java.util.List;
import com.twitter.media.av.ui.control.SkipWithCountDownBadgeView;
import com.twitter.media.av.ui.AutoPlayBadgeView;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a0g implements y94
{
    public final a0g.a0g$a C0;
    public u4 D0;
    public Collection<e2> E0;
    
    public a0g(final a0g.a0g$a c0) {
        this.C0 = c0;
    }
    
    public final void g(final u4 d0) {
        this.D0 = d0;
        d0.e.k((Collection)(this.E0 = ijf.w((Object)new vnk((vnk$a)new yzf(this)), (Object[])new e2[] { (e2)new gnk((gnk$a)new xzf(this)), (e2)new lhl((lhl$a)new ue8((Object)this, 13)) })));
    }
    
    public final void h() {
        final a0g.a0g$a c0 = this.C0;
        c0.b();
        final c6 f = c6.f;
        final AutoPlayBadgeView e0 = c0.E0;
        if (e0 != null) {
            e0.b(f);
        }
        final SkipWithCountDownBadgeView f2 = c0.F0;
        if (f2 != null) {
            f2.b(f);
        }
    }
    
    public final void unbind() {
        final u4 d0 = this.D0;
        if (d0 != null) {
            final List e0 = this.E0;
            if (e0 != null) {
                d0.e.Z((Collection)e0);
            }
        }
    }
}
