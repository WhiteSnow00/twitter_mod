import android.content.ContentValues;
import java.util.Collections;
import android.database.Cursor;
import android.net.Uri;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Objects;
import android.content.ContentUris;
import com.twitter.util.user.UserIdentifier;
import android.content.Context;
import com.twitter.model.json.people.JsonSingleUserRecommendation;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t9m extends i1v<List<JsonSingleUserRecommendation>>
{
    public final long i1;
    public final long j1;
    public final long k1;
    public final Integer l1;
    public final Context m1;
    public final aav n1;
    public boolean o1;
    public hfv p1;
    
    public t9m(final Context m1, final UserIdentifier userIdentifier, final long i1, final long k1) {
        final aav d2 = aav.d2(userIdentifier);
        super(userIdentifier, 0);
        this.m1 = m1;
        this.n1 = d2;
        ((jh0<Object, Object>)this).k0();
        this.i1 = i1;
        this.j1 = -1L;
        this.k1 = k1;
        this.l1 = null;
    }
    
    @Override
    public final qrc f0() {
        final rbv rbv = new rbv();
        final aav n1 = this.n1;
        final Uri c = gfv.c(ContentUris.withAppendedId(gfv$p.c, this.i1), super.P0);
        Objects.requireNonNull(n1);
        final ArrayList list = new ArrayList();
        final Cursor query = n1.U0.getContentResolver().query(c, new String[] { "users_user_id" }, (String)null, (String[])null, (String)null);
        if (query != null) {
            try {
                while (query.moveToNext()) {
                    list.add(query.getLong(0));
                }
            }
            finally {
                query.close();
            }
        }
        final long[] h = hr4.H((Collection)list);
        ((qrc.a)rbv).n("/1.1/users/recommendations.json", "/");
        final int a = w4j.a;
        ((qrc.a)rbv).f("connections", true);
        final Integer l1 = this.l1;
        if (l1 != null) {
            ((qrc.a)rbv).c("page", l1);
        }
        ((qrc.a)rbv).c("owner_id", this.i1);
        ((qrc.a)rbv).c("user_type", 20L);
        ((qrc.a)rbv).c("user_tag", this.j1);
        ((qrc.a)rbv).c("user_id", this.k1);
        ((qrc.a)rbv).c("limit", 1L);
        if (h.length > 0) {
            ((qrc.a)rbv).g("excluded", h);
        }
        ((qrc.a)rbv).d("display_location", "profile-cluster-follow");
        ((qrc.a)rbv).c("pc", 1L);
        rbv.s();
        return ((qrc.a)rbv).k();
    }
    
    @Override
    public final wsc<List<JsonSingleUserRecommendation>, pav> g0() {
        return (wsc<List<JsonSingleUserRecommendation>, pav>)f9g.e((Class)JsonSingleUserRecommendation.class);
    }
    
    @Override
    public final void n0(final tsc<List<JsonSingleUserRecommendation>, pav> tsc) {
        if (tsc.g == null) {
            return;
        }
        final hn6 z = this.Z(this.m1);
        final List list = (List)tsc.g;
        if (!list.isEmpty()) {
            final hfv s = list.get(0).s();
            if ((this.p1 = s) != null) {
                final aav n1 = this.n1;
                final long i1 = this.i1;
                final long j1 = this.j1;
                final long k1 = this.k1;
                final tyr h2 = ((tk1)n1).H2();
                h2.H0();
                try {
                    final xyr xyr = new xyr("user_groups");
                    xyr.c = new String[] { "_id" };
                    final long c0 = s.C0;
                    xyr.d = "owner_id=? AND type=? AND tag=? AND user_id=?";
                    xyr.e = new String[] { String.valueOf(i1), String.valueOf(20), String.valueOf(j1), String.valueOf(c0) };
                    final Cursor x = h2.X(xyr.d());
                    Label_0557: {
                        if (x != null) {
                            try {
                                final int count = x.getCount();
                                x.close();
                                if (count > 0) {
                                    h2.A();
                                    h2.B();
                                    final boolean o1 = false;
                                    break Label_0557;
                                }
                            }
                            finally {
                                x.close();
                            }
                        }
                        final List<hfv> singletonList = Collections.singletonList(s);
                        try {
                            Label_0523: {
                                if (n1.W3((Collection)singletonList, i1, -1, -1L, (String)null, (String)null, z) != 1 && !n1.A3(s.C0, i1, j1)) {
                                    final boolean o1 = false;
                                    break Label_0523;
                                }
                                final ContentValues contentValues = new ContentValues();
                                contentValues.put("user_id", Long.valueOf(s.C0));
                                final hil a1 = s.a1;
                                if (a1 != null) {
                                    contentValues.put("pc", aav.j4((Object)a1, (alp)hil.n));
                                }
                                else {
                                    contentValues.putNull("pc");
                                    contentValues.putNull("g_flags");
                                }
                                final boolean o1 = h2.z2("user_groups", 0, contentValues, "owner_id=? AND type=? AND tag=? AND user_id=?", (Object[])new String[] { String.valueOf(i1), String.valueOf(20), String.valueOf(j1), String.valueOf(k1) }) == 1;
                                if (!o1 || s.o1 == null) {
                                    break Label_0523;
                                }
                                contentValues.clear();
                                contentValues.put("owner_id", Long.valueOf(i1));
                                contentValues.put("user_group_type", Integer.valueOf(20));
                                contentValues.put("user_group_tag", Long.valueOf(j1));
                                contentValues.put("user_id", Long.valueOf(s.C0));
                                contentValues.put("token", s.o1.a);
                                try {
                                    rqu.v(h2, "user_metadata", contentValues);
                                    final tyr tyr = h2;
                                    if (o1) {
                                        z.a(new Uri[] { gfv$p.a });
                                    }
                                    tyr.A();
                                    tyr.B();
                                    if (!(this.o1 = o1)) {
                                        this.o1 = this.n1.A3(this.p1.C0, this.i1, this.j1);
                                    }
                                    z.b();
                                }
                                finally {}
                            }
                        }
                        finally {}
                    }
                }
                finally {}
                h2.B();
            }
        }
    }
}
