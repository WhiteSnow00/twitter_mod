import java.util.Objects;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n1c extends d2v<mbm>
{
    public long j1;
    public volatile int k1;
    public final vav l1;
    
    public n1c(final UserIdentifier userIdentifier) {
        final vav c2 = vav.c2(userIdentifier);
        super(userIdentifier, 0);
        this.l1 = c2;
    }
    
    public final /* bridge */ Object b() throws InterruptedException {
        return this.b();
    }
    
    public final xrc<mbm, kbv> b() {
        if (((anm)this).Q0.getId() != 0L && this.j1 != 0L) {
            return (xrc<mbm, kbv>)super.b();
        }
        return (xrc<mbm, kbv>)xrc.c(0, "Invalid owner id or user");
    }
    
    public final tqc f0() {
        final mcv b = ib0.B("/1.1/friendships/show.json", "/");
        final int a = c5j.a;
        ((tqc$a)b).c("source_id", ((anm)this).Q0.getId());
        ((tqc$a)b).c("target_id", this.j1);
        return ((tqc$a)b).k();
    }
    
    public final asc<mbm, kbv> g0() {
        return (asc<mbm, kbv>)v8g.c((Class)mbm.class);
    }
    
    public final void m0(final xrc<mbm, kbv> xrc) {
        this.k1 = this.l1.w2(this.j1);
    }
    
    public final void n0(final xrc<mbm, kbv> xrc) {
        final Object g = xrc.g;
        if (g != null) {
            final int a = ((mbm)g).a.a;
            final vav l1 = this.l1;
            final long j1 = this.j1;
            Objects.requireNonNull(l1);
            final boolean b = asa.b().b("android_user_blob_write", false);
            cgv$b cgv$b = null;
            cgv y1;
            if (b) {
                y1 = l1.Y1(j1);
            }
            else {
                y1 = null;
            }
            final m4s a2 = hq1.a;
            final long currentTimeMillis = System.currentTimeMillis();
            if (y1 != null) {
                cgv$b = new cgv$b(y1);
            }
            l1.f4(j1, a, currentTimeMillis, cgv$b);
        }
        this.k1 = this.l1.w2(this.j1);
    }
}
