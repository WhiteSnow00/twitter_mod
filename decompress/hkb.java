import android.os.BaseBundle;
import com.twitter.util.user.UserIdentifier;
import com.twitter.app.users.di.retained.FollowingTimelineRetainedGraph;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hkb extends xus
{
    public final fci<?> v1;
    
    public hkb(final hdv hdv, final fxs fxs, final bts bts, final ii7<hp6> ii7, final def<vxs> def, final dsb dsb, final vpd vpd, final vpi<vxs> vpi, final Context context, final tc tc, final oys oys, final p1t p1t, final d4e<vxs> d4e, final fda<fo> fda, final mex mex, final sfv sfv, final fci<?> v1) {
        super(hdv, fxs, bts, (ii7)ii7, (def)def, dsb, vpd, (vpi)vpi, tc, oys, p1t, (d4e)d4e, (fda)fda, mex, sfv);
        this.v1 = v1;
    }
    
    public final udv$b l0(final udv$b udv$b) {
        udv$b.a = "following";
        final k3a$d b = udv$b.b;
        final fkb d = ((FollowingTimelineRetainedGraph)((idv)this).G0.o()).d();
        final String string = ((BaseBundle)((am1)d).a).getString("following_timeline_owner_username");
        k3a$e c;
        if (zgl.q(UserIdentifier.fromId(((BaseBundle)((am1)d).a).getLong("following_timeline_owner_user_id")), ((BaseBundle)((am1)d).a).getString("following_timeline_owner_username"), pdw.d())) {
            final tx6 a = lfs.a;
            final zkr a2 = new zkr(2131955289);
            final zkr b2 = new zkr(2131955290);
            final i3a$a i3a$a = new i3a$a();
            i3a$a.a = (lfs)a2;
            i3a$a.b = (lfs)b2;
            i3a$a.c = (lfs)new zkr(2131953817);
            i3a$a.e = 0;
            c = new k3a$e((i3a)((z4j)i3a$a).e());
            c.a = (k3a$c)new pn1((Object)this, 19);
        }
        else {
            Object a4;
            if (string == null) {
                final tx6 a3 = lfs.a;
                a4 = new zkr(2131953815);
            }
            else {
                a4 = lfs.a(((idv)this).z0().getString(2131953813, new Object[] { string }));
            }
            final tx6 a5 = lfs.a;
            final zkr b3 = new zkr(2131953814);
            final i3a$a i3a$a2 = new i3a$a();
            i3a$a2.a = (lfs)a4;
            i3a$a2.b = (lfs)b3;
            i3a$a2.h = t3a.O0;
            c = new k3a$e((i3a)((z4j)i3a$a2).e());
        }
        b.c = c;
        return udv$b;
    }
    
    public final c5f n0() {
        return (c5f)new cg6((yzr)new gkb(this, 0), true, (cg6$a)this);
    }
}
