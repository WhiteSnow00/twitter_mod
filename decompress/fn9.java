import com.google.android.exoplayer2.n;
import java.util.List;
import com.twitter.media.av.broadcast.util.a$a;
import com.twitter.ui.widget.TickMarksView$a;
import com.twitter.media.av.broadcast.util.a;
import java.util.Locale;
import com.twitter.media.av.model.LiveContentRestrictedError;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fn9 implements fw1
{
    public final int a;
    public final Object b;
    
    public fn9(final Object b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public final void accept(final Object o, Object o2) {
        switch (this.a) {
            default: {
                final zzw zzw = (zzw)this.b;
                final pcp pcp = (pcp)o;
                final i6 i6 = (i6)o2;
                final vzw l0 = zzw.L0;
                final TickMarksView$a[] g2 = vzw.G2;
                Objects.requireNonNull(l0);
                final long a = pcp.b.a;
                if (a == l0.h2) {
                    l0.h2 = -1L;
                }
                if (!l0.i2 && !l0.j2 && (l0.c2 == a || l0.g2 == a)) {
                    l0.g2 = a;
                    l0.x2.p(false);
                }
                return;
            }
            case 22: {
                final znl znl = (znl)this.b;
                final ank ank = (ank)o;
                final i6 i7 = (i6)o2;
                e0e.f((Object)znl, "$replayAVEventPublishSubject");
                e0e.f((Object)ank, "event");
                znl.onNext((Object)ank);
                return;
            }
            case 21: {
                final nz0 nz0 = (nz0)this.b;
                final etv etv = (etv)o;
                final i6 i8 = (i6)o2;
                e0e.f((Object)nz0, "this$0");
                e0e.f((Object)etv, "event");
                nz0.b.onNext((Object)etv);
                return;
            }
            case 20: {
                final t1x t1x = (t1x)this.b;
                final omk omk = (omk)o;
                final i6 i9 = (i6)o2;
                t1x.K0.n();
                return;
            }
            case 19: {
                final rok rok = (rok)this.b;
                final omk omk2 = (omk)o;
                final i6 i10 = (i6)o2;
                rok.K0.e(((a0h)omk2).a);
                return;
            }
            case 18: {
                final or2 or2 = (or2)this.b;
                final wr2 wr2 = (wr2)o;
                final i6 i11 = (i6)o2;
                or2.K0.b(((a0h)wr2).a);
                return;
            }
            case 17: {
                final adh adh = (adh)this.b;
                final ljk ljk = (ljk)o;
                final i6 i12 = (i6)o2;
                adh.s();
                return;
            }
            case 16: {
                final swc swc = (swc)this.b;
                final iok iok = (iok)o;
                final i6 i13 = (i6)o2;
                final bcs r0 = swc.R0;
                r0.b.release();
                r0.c.a();
                return;
            }
            case 15: {
                final yok yok = (yok)this.b;
                final yoi yoi = (yoi)o;
                final i6 i14 = (i6)o2;
                Objects.requireNonNull(yok);
                final Exception a2 = yoi.a;
                if (a2 instanceof LiveContentRestrictedError) {
                    yok.K0.k0((w1)new gtv((a3)null, 0, (String)null, 1, false, (Throwable)a2, 4));
                }
                return;
            }
            case 14: {
                final xnk xnk = (xnk)this.b;
                final pdg pdg = (pdg)o;
                final i6 i15 = (i6)o2;
                Objects.requireNonNull(xnk);
                final x2$a x2$a = new x2$a(i15);
                x2$a.b = (b0)new odg();
                ((wi1)xnk).n((x2)((z4j)x2$a).e());
                return;
            }
            case 13: {
                final xjc xjc = (xjc)this.b;
                final iok iok2 = (iok)o;
                final i6 i16 = (i6)o2;
                xjc.v();
                final long b = xjc.N0.b();
                xjc.s(b, b, i16);
                xjc.U0 = true;
                return;
            }
            case 12: {
                final qr1 qr1 = (qr1)this.b;
                final nhm nhm = (nhm)o;
                final i6 i17 = (i6)o2;
                qr1.s();
                return;
            }
            case 11: {
                final v6$a v6$a = (v6$a)this.b;
                final oh3 oh3 = (oh3)o;
                final i6 i18 = (i6)o2;
                final v6 l2 = v6$a.L0;
                ((List<n>)l2.o).add(oh3.b);
                ((cxt)l2).b();
                return;
            }
            case 10: {
                final i4$c i4$c = (i4$c)this.b;
                final hok hok = (hok)o;
                final i6 i19 = (i6)o2;
                i4$c.M0.H0 = true;
                return;
            }
            case 9: {
                final z9f z9f = (z9f)this.b;
                final jol jol = (jol)o;
                final i6 i20 = (i6)o2;
                final aaf k0 = z9f.K0;
                ((jkh)k0).c.N();
                k0.i = false;
                return;
            }
            case 8: {
                final maf$a maf$a = (maf$a)this.b;
                final k99 k2 = (k99)o;
                final i6 i21 = (i6)o2;
                maf$a.K0.G0.setText((CharSequence)String.format(Locale.US, "%.2f", k2.b * 0.001));
                return;
            }
            case 7: {
                final m9f m9f = (m9f)this.b;
                final wnk wnk = (wnk)o;
                final i6 i22 = (i6)o2;
                final a$a n0 = m9f.N0;
                final xof k3 = m9f.K0;
                Objects.requireNonNull(n0);
                if (com.twitter.media.av.broadcast.util.a.a(k3) != pjk.H0) {
                    final r24 h0 = m9f.M0.H0;
                    if (!h0.d) {
                        h0.d = true;
                        h0.a();
                    }
                    final com.twitter.media.av.broadcast.view.fullscreen.a m0 = m9f.M0;
                    final a$a n2 = m9f.N0;
                    final xof k4 = m9f.K0;
                    Objects.requireNonNull(n2);
                    m0.h(com.twitter.media.av.broadcast.util.a.a(k4));
                    m9f.O0.j();
                }
                return;
            }
            case 6: {
                final nk2 nk2 = (nk2)this.b;
                final qk2 qk2 = (qk2)o;
                final kh2 a3 = nk2.L0.a(((i6)o2).b);
                final q4 n3 = a3.n;
                if (n3 != null) {
                    a3.b(n3);
                }
                return;
            }
            case 5: {
                final hl2$a hl2$a = (hl2$a)this.b;
                final phl phl = (phl)o;
                final i6 i23 = (i6)o2;
                hl2$a.K0.J0 = true;
                return;
            }
            case 4: {
                final ti2 ti2 = (ti2)this.b;
                final udl udl = (udl)o;
                final i6 i24 = (i6)o2;
                ti2.K0 = false;
                ti2.s();
                return;
            }
            case 3: {
                final cg2 cg2 = (cg2)this.b;
                final bi2 bi2 = (bi2)o;
                final i6 i25 = (i6)o2;
                e0e.f((Object)cg2, "this$0");
                final q4 l3 = cg2.L0;
                if (l3 != null) {
                    final h1 e1 = l3.b.e1;
                    if (e1 != null) {
                        cg2.J0.d(e1);
                    }
                }
                return;
            }
            case 2: {
                final nyw nyw = (nyw)this.b;
                final myw myw = (myw)o;
                final i6 i26 = (i6)o2;
                final lyw s = ((ryw)nyw).s();
                Object b2 = null;
                if (s != null) {
                    switch (((Enum)s.F0).ordinal()) {
                        case 5:
                        case 6: {
                            b2 = new b4q(1);
                            break;
                        }
                        case 1:
                        case 2:
                        case 3:
                        case 4: {
                            b2 = new uyw();
                            break;
                        }
                    }
                }
                if (b2 != null) {
                    o2 = new x2$a(i26);
                    ((x2$a)o2).b = (b0)b2;
                    ((wi1)nyw).n((x2)((z4j)o2).e());
                }
                return;
            }
            case 1: {
                final d4x d4x = (d4x)this.b;
                final k5q k5q = (k5q)o;
                final i6 i27 = (i6)o2;
                if (d4x.O0) {
                    d4x.T0 = i27.k;
                }
                return;
            }
            case 0: {
                final gn9 gn9 = (gn9)this.b;
                final vps vps = (vps)o;
                final i6 i28 = (i6)o2;
                gn9.L0 = true;
                final x2$a x2$a2 = new x2$a(i28);
                x2$a2.b = (b0)new en9();
                ((wi1)gn9).n((x2)((z4j)x2$a2).e());
            }
        }
    }
}
