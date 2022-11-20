import android.database.Cursor;
import com.twitter.database.schema.TwitterSchema;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.database.SQLException;
import android.content.ContentValues;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rxb
{
    public final jr a;
    public final usd b;
    public final usd c;
    public final adk d;
    public final usd e;
    public final usd f;
    public final usd g;
    public final usd h;
    public final usd i;
    public final usd j;
    public final bs k;
    public final usd l;
    public final usd m;
    
    public rxb(final nm6 nm6, final vav vav) {
        czd.f((Object)nm6, "contentUriNotifier");
        czd.f((Object)vav, "twitterDatabaseHelper");
        final nus nus = new nus(vav);
        this.a = new jr(nm6, (jr$a)new jr$a(nus, vav) {
            public final nus a;
            public final vav b;
            
            public final m5h a(final rzs rzs) {
                return this.b.O3(rzs);
            }
            
            public final int b(final lws lws, final nm6 nm6) {
                czd.f((Object)lws, "timelineIdentifier");
                final nus a = this.a;
                final mws mws = new mws(lws);
                Objects.requireNonNull(a);
                cj1.e();
                return a.e(mws, nm6, false);
            }
        });
        this.d = new adk((adk.a)new adk.a(vav, nm6) {
            public final vav a;
            public final nm6 b;
            
            @Override
            public final int a(final rzs$a rzs$a) {
                final vav a = this.a;
                rzs$a.f = this.b;
                return a.N3((rzs)((n4j)rzs$a).e());
            }
        });
        this.b = new usd((yws)new g63());
        this.c = new usd((yws)new wiy());
        this.e = new usd((yws)new mgm((mgm$a)new mgm$a(nm6, vav) {
            public final j2t a = new j2t(nm6, vav);
            
            public final cxs a(final String s, lws m) {
                czd.f((Object)s, "entryIdToReplace");
                czd.f((Object)m, "identifier");
                final j2t a = this.a;
                Objects.requireNonNull(a);
                final nus nus = new nus(a.a);
                final mws mws = new mws(m);
                final osl$a osl$a = new osl$a();
                ((fp1$a)osl$a).s(itl.q(new String[] { itl.b("timeline_entity_id", (Object)s), itl.b("timeline_entity_group_id", (Object)s) }));
                m = (lws)nus.m(mws, (osl)((n4j)osl$a).e());
                try {
                    final jws d = jws.d();
                    cxs cxs;
                    if (((Cursor)m).moveToFirst()) {
                        Objects.requireNonNull(d);
                        cxs = (cxs)d.c((Object)m);
                    }
                    else {
                        cxs = null;
                    }
                    ((Cursor)m).close();
                    return cxs;
                }
                finally {
                    if (m != null) {
                        try {
                            ((Cursor)m).close();
                        }
                        finally {
                            final Throwable t;
                            ((Throwable)s).addSuppressed(t);
                        }
                    }
                }
            }
            
            public final boolean b(final cvs cvs, final lgm lgm, final zus zus, final lws lws, final rzs$a rzs$a) {
                czd.f((Object)lgm, "instruction");
                czd.f((Object)lws, "identifier");
                final j2t a = this.a;
                final lzr g2 = ((ok1)a.a).G2();
                g2.G0();
                final mws mws = new mws(lws);
                rzs$a.f = a.b;
                final rzs rzs = (rzs)((n4j)rzs$a).e();
                final int h = cvs.h;
                final boolean b = false;
                boolean b2 = true;
                if ((h & 0x20) != 0x0) {
                    final String c = lgm.c;
                    final int r = wa2.r(h);
                    final h8a h8a = new h8a();
                    try {
                        a.a.G3(rzs, h8a, (Iterable)rif.v((Object)zus));
                        final ContentValues contentValues = new ContentValues();
                        a.a.X0(rzs, contentValues, r, zus, zus.h);
                        final String a2 = itl.a(new String[] { mws.b(), itl.b("entity_id", (Object)c) });
                        final List h2 = a.a.H3(zus, contentValues);
                        b2 = b;
                        if (((ok1)a.a).G2().y2("timeline", 0, contentValues, a2, (Object[])null) > 0) {
                            if (zus.g != null) {
                                final long a3 = a.a(itl.a(new String[] { mws.b(), itl.b("entity_id", (Object)zus.a) }));
                                if (a3 > 0L) {
                                    vav.P3(((ok1)a.a).G2(), a3, h2);
                                }
                            }
                            r0t.c(a.b, mws);
                            b2 = true;
                        }
                    }
                    catch (final SQLException ex) {
                        m8a.d((Throwable)ex);
                        b2 = b;
                    }
                }
                else {
                    new nus(a.a).f(mws, (Iterable)rif.v((Object)lgm.c));
                    a.a.N3(rzs);
                }
                if (b2) {
                    g2.z();
                }
                g2.A();
                return b2;
            }
        }));
        this.f = new usd(x68.b((yws)new wws((xws)new cc4((cc4$a)new cc4$a(nus, nm6) {
            public final nus a;
            public final nm6 b;
            
            public final int a(final lws lws) {
                czd.f((Object)lws, "timelineId");
                final nus a = this.a;
                final mws mws = new mws(lws);
                final nm6 b = this.b;
                Objects.requireNonNull(a);
                cj1.e();
                return a.e(mws, b, false);
            }
        })), (qsb)rxb$h.D0));
        this.g = new usd((yws)new hem((hem$a)new hem$a(nus, nm6) {
            public final nus a;
            public final nm6 b;
            
            public final void a(final lws lws) {
                czd.f((Object)lws, "timelineId");
                r0t.b(this.b, lws);
            }
            
            public final int b(final lws lws, final Iterable<String> iterable) {
                czd.f((Object)lws, "timeline");
                czd.f((Object)iterable, "entryIds");
                return this.a.f(new mws(lws), (Iterable)iterable);
            }
        }));
        this.h = new usd((yws)new blg((blg.a)new blg.a(nus, nm6) {
            public final nus a;
            public final nm6 b;
            
            @Override
            public final void a(final lws lws) {
                czd.f((Object)lws, "timelineId");
                r0t.b(this.b, lws);
            }
            
            @Override
            public final int b(final lws lws, final Iterable<String> iterable) {
                czd.f((Object)lws, "timelineId");
                czd.f((Object)iterable, "entryIds");
                final nus a = this.a;
                Objects.requireNonNull(a);
                cj1.e();
                final String a2 = itl.a(new String[] { itl.a(new String[] { itl.b("type", (Object)lws.a), itl.b("owner_id", (Object)lws.c), itl.b("timeline_tag", (Object)lws.b) }), itl.g("entity_id", (Iterable)iterable) });
                final lzr p2 = ((ok1)a.a.get()).p();
                final ContentValues contentValues = new ContentValues();
                contentValues.put("should_highlight", Integer.valueOf(1));
                return p2.y2("timeline", 0, contentValues, a2, (Object[])null);
            }
        }));
        this.k = new bs(nm6, (bs.b)new bs.b(nm6, vav) {
            public final b0t a = new b0t(nm6, b);
            public final vav b;
            
            @Override
            public final List<zus> a(final as as, final mws mws, final List<? extends zus> list, final rzs rzs) {
                final b0t a = this.a;
                final ContentValues b = a.b(as, mws);
                final int intValue = (int)c5j.b((Object[])new Integer[] { b.getAsInteger("flags"), 0 });
                final int r = wa2.r(intValue);
                final lzr g2 = ((ok1)a.a).G2();
                g2.G0();
                final boolean g3 = ikr.g((CharSequence)as.b);
                final String s = "container_sort_index";
                final String s2 = "_id";
                if (g3) {
                    String s3;
                    if (as.d) {
                        s3 = "-2";
                    }
                    else {
                        s3 = "2";
                    }
                    final String a2 = b0t.a(as, mws);
                    String s4;
                    if (as.d) {
                        s4 = itl.a(new String[] { a2, itl.q(new String[] { itl.k("container_sort_index", (Object)b.getAsLong("container_sort_index")), itl.a(new String[] { itl.b("container_sort_index", (Object)b.getAsLong("container_sort_index")), itl.k("_id", (Object)b.getAsLong("_id")) }) }) });
                    }
                    else {
                        s4 = itl.a(new String[] { a2, itl.q(new String[] { itl.d("container_sort_index", (Object)b.getAsLong("container_sort_index")), itl.a(new String[] { itl.b("container_sort_index", (Object)b.getAsLong("container_sort_index")), itl.d("_id", (Object)b.getAsLong("_id")) }) }) });
                    }
                    final lzr g4 = ((ok1)a.a).G2();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("UPDATE timeline SET container_sort_index = container_sort_index + ");
                    sb.append(s3);
                    sb.append(" WHERE ");
                    sb.append(s4);
                    g4.x(sb.toString());
                }
                final rif h = rif.H();
                final Iterator iterator = ((ArrayList)list).iterator();
                final lzr lzr = g2;
                final String s5 = s;
                final String s6 = s2;
                final Iterator iterator2 = iterator;
                while (iterator2.hasNext()) {
                    final zus zus = (zus)iterator2.next();
                    final ContentValues contentValues = new ContentValues(b);
                    final long longValue = b.getAsLong(s5);
                    if (as.d) {
                        contentValues.put(s5, Long.valueOf(longValue - 1L));
                    }
                    else {
                        contentValues.put(s5, Long.valueOf(longValue + 1L));
                    }
                    contentValues.remove(s6);
                    contentValues.put("entity_flattening_id", scc.a(zus));
                    a.a.X0(rzs, contentValues, r | 0x20, zus, zus.h);
                    final List h2 = a.a.H3(zus, contentValues);
                    final long y = gmw.y(lzr, "timeline", contentValues);
                    if (y > 0L) {
                        a.a.c3(rzs, f8t.g(rzs.c.a), lzr, contentValues, intValue, (alh)zus);
                        if (zus.g != null) {
                            vav.P3(lzr, y, h2);
                        }
                        r0t.c(a.b, mws);
                        h.p((Object)zus);
                    }
                }
                lzr.z();
                lzr.A();
                return (List)((n4j)h).e();
            }
            
            @Override
            public final void b(final rzs rzs, final h8a h8a, final Iterable<? extends zus> iterable) {
                this.b.G3(rzs, h8a, (Iterable)iterable);
            }
            
            @Override
            public final a c(final as as, final mws mws) {
                final ContentValues b = this.a.b(as, mws);
                Number asLong;
                if (b.size() <= 0) {
                    asLong = null;
                }
                else {
                    asLong = b.getAsLong("sort_index");
                }
                if (asLong == null) {
                    return null;
                }
                return new a(asLong.longValue()) {
                    public final long a = a;
                    
                    @Override
                    public final long a() {
                        return this.a;
                    }
                };
            }
        });
        this.i = new usd(x68.b((yws)new wws((xws)new zkg((zkg.a)new zkg.a(nus, nm6) {
            public final nus a;
            public final nm6 b;
            
            @Override
            public final void a(final lws lws) {
                czd.f((Object)lws, "timelineId");
                r0t.b(this.b, lws);
            }
            
            @Override
            public final int b(final lws lws, final long n) {
                czd.f((Object)lws, "timelineId");
                final nus a = this.a;
                Objects.requireNonNull(a);
                cj1.e();
                final f60 c = ((two)((np1)a.a.get()).T()).b((Class)o9t.class).c();
                ((o9t$a)c.a).S(true);
                return c.g(itl.a(new String[] { itl.a(new String[] { itl.b("type", (Object)lws.a), itl.b("owner_id", (Object)lws.c), itl.b("timeline_tag", (Object)lws.b) }), itl.d("sort_index", (Object)n) }), (String[])null);
            }
        })), (qsb)rxb$a.D0));
        this.j = new usd(x68.b((yws)new wws((xws)new jc4((jc4$a)new jc4$a(nus, nm6) {
            public final nus a;
            public final nm6 b;
            
            public final void a(final lws lws) {
                czd.f((Object)lws, "timelineId");
                r0t.b(this.b, lws);
            }
            
            public final int b(final lws lws) {
                czd.f((Object)lws, "timelineId");
                final nus a = this.a;
                Objects.requireNonNull(a);
                cj1.e();
                final f60 c = ((two)((np1)a.a.get()).T()).b((Class)o9t.class).c();
                ((o9t$a)c.a).S(false);
                return c.g(itl.a(new String[] { itl.b("type", (Object)lws.a), itl.b("owner_id", (Object)lws.c), itl.b("timeline_tag", (Object)lws.b) }), (String[])null);
            }
        })), (qsb)rxb$c.D0));
        this.l = new usd((yws)new blz());
        this.m = new usd((yws)new uoz());
    }
    
    public final vsd a(final tws tws, final w3c w3c, final wrm wrm, final uws uws, final wzs wzs) {
        czd.f((Object)tws, "instruction");
        czd.f((Object)w3c, "globalObjects");
        czd.f((Object)wrm, "responseObjects");
        vsd vsd;
        if (tws instanceof qvv) {
            final List a = ((qvv)tws).a;
            final ArrayList list = new ArrayList();
            final Iterator iterator = a.iterator();
            while (iterator.hasNext()) {
                final zus$a a2 = ((evs)iterator.next()).a(w3c, wrm);
                a2.m = "urt_add_entries";
                final zus zus = (zus)((n4j)a2).j();
                if (zus != null) {
                    list.add(zus);
                }
            }
            vsd = this.a.a((tws)new ir((List)list), w3c, wrm, uws, wzs);
        }
        else if (tws instanceof yvv) {
            final yvv yvv = (yvv)tws;
            final ess a3 = yvv.a;
            vsd = this.b.a((tws)new t3q(new css(a3.a, a3.b, a3.c, a3.d, a3.e, fq4.c(a3.h, (jtb)new dss(w3c, 0)), a3.i, a3.f, a3.g, yvv.b), yvv), w3c, wrm, uws, wzs);
        }
        else if (tws instanceof h4q) {
            vsd = this.c.a(tws, w3c, wrm, uws, wzs);
        }
        else if (tws instanceof zck) {
            vsd = this.d.a(tws, w3c, wrm, uws, wzs);
        }
        else if (tws instanceof xvv) {
            final xvv xvv = (xvv)tws;
            final zus$a a4 = xvv.a.a(w3c, wrm);
            a4.m = "urt_replace_entry";
            vsd = this.e.a((tws)new lgm(a4, xvv), w3c, wrm, uws, wzs);
        }
        else if (tws instanceof bc4) {
            vsd = this.f.a(tws, w3c, wrm, uws, wzs);
        }
        else if (tws instanceof gem) {
            vsd = this.g.a(tws, w3c, wrm, uws, wzs);
        }
        else if (tws instanceof alg) {
            vsd = this.h.a(tws, w3c, wrm, uws, wzs);
        }
        else if (tws instanceof ykg) {
            vsd = this.i.a(tws, w3c, wrm, uws, wzs);
        }
        else if (tws instanceof ic4) {
            vsd = this.j.a(tws, w3c, wrm, uws, wzs);
        }
        else if (tws instanceof rvv) {
            final rvv rvv = (rvv)tws;
            final List c = rvv.c;
            final ArrayList list2 = new ArrayList();
            final Iterator iterator2 = c.iterator();
            while (iterator2.hasNext()) {
                final zus$a a5 = ((evs)iterator2.next()).a(w3c, wrm);
                a5.m = "urt_add_to_module";
                a5.b = rvv.a;
                list2.add(a5);
            }
            vsd = this.k.a((tws)new as((List)list2, rvv), w3c, wrm, uws, wzs);
        }
        else if (tws instanceof des) {
            vsd = this.l.a(tws, w3c, wrm, uws, wzs);
        }
        else {
            if (!(tws instanceof vai)) {
                throw new IllegalStateException("Attempting to process an unrecognized TimelineInstruction");
            }
            vsd = this.m.a(tws, w3c, wrm, uws, wzs);
        }
        return vsd;
    }
}
