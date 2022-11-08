import android.os.BaseBundle;
import com.twitter.util.user.UserIdentifier;
import com.twitter.app.users.di.retained.FollowingTimelineRetainedGraph;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ikb extends mts
{
    public final mbi<?> s1;
    
    public ikb(final ybv ybv, final aws aws, final qrs qrs, final zh7<vo6> zh7, final udf<nws> udf, final dsb dsb, final rpd rpd, final zoi<nws> zoi, final Context context, final uc uc, final exs exs, final g0t g0t, final x3e<nws> x3e, final pca<bo> pca, final adx adx, final jev jev, final mbi<?> s1) {
        super(ybv, aws, qrs, (zh7)zh7, (udf)udf, dsb, rpd, (zoi)zoi, uc, exs, g0t, (x3e)x3e, (pca)pca, adx, jev);
        this.s1 = s1;
    }
    
    @Override
    public final lcv$b m0(final lcv$b lcv$b) {
        lcv$b.a = "following";
        final y2a.d b = lcv$b.b;
        final hkb d = ((FollowingTimelineRetainedGraph)super.D0.o()).d();
        final String string = ((BaseBundle)((zl1)d).a).getString("following_timeline_owner_username");
        y2a.e c;
        if (bgl.q(UserIdentifier.fromId(((BaseBundle)((zl1)d).a).getLong("following_timeline_owner_user_id")), ((BaseBundle)((zl1)d).a).getString("following_timeline_owner_username"), ncw.d())) {
            final jx6 a = yds.a;
            final jjr a2 = new jjr(2131955289);
            final jjr b2 = new jjr(2131955290);
            final w2a$a w2a$a = new w2a$a();
            w2a$a.a = (yds)a2;
            w2a$a.b = (yds)b2;
            w2a$a.c = (yds)new jjr(2131953817);
            w2a$a.e = 0;
            c = new y2a.e((w2a)((h4j)w2a$a).e());
            c.a = (y2a.c)new fj4((Object)this, 16);
        }
        else {
            Object a4;
            if (string == null) {
                final jx6 a3 = yds.a;
                a4 = new jjr(2131953815);
            }
            else {
                a4 = yds.a(this.z0().getString(2131953813, new Object[] { string }));
            }
            final jx6 a5 = yds.a;
            final jjr b3 = new jjr(2131953814);
            final w2a$a w2a$a2 = new w2a$a();
            w2a$a2.a = (yds)a4;
            w2a$a2.b = (yds)b3;
            w2a$a2.h = h3a.L0;
            c = new y2a.e((w2a)((h4j)w2a$a2).e());
        }
        b.c = c;
        return lcv$b;
    }
    
    @Override
    public final v4f o0() {
        return (v4f)new qf6((kyr)new jnc((Object)this, 2), true, (qf6$a)this);
    }
}
