import com.twitter.weaver.mvi.MviViewModel;
import java.util.List;
import com.twitter.rooms.manager.RoomStateManager$k0;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import com.twitter.rooms.subsystem.api.args.RoomHostKudosArgs;
import tv.periscope.model.NarrowcastSpaceType;
import java.util.Set;
import tv.periscope.model.NarrowcastSpaceType$None;
import com.twitter.rooms.model.helpers.PostSurveyAdmin;
import java.util.concurrent.TimeUnit;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Objects;
import com.twitter.rooms.manager.RoomStateManager;
import com.twitter.rooms.di.room.RoomObjectGraph;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qao extends ste implements qsb<RoomObjectGraph, fzv>
{
    public final boolean D0;
    public final RoomStateManager E0;
    public final vqn F0;
    public final boolean G0;
    public final boolean H0;
    public final boolean I0;
    public final nsb<fzv> J0;
    
    public qao(final boolean d0, final RoomStateManager e0, final vqn f0, final boolean g0, final boolean h0, final boolean i0, final nsb<fzv> j0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        super(1);
    }
    
    public final Object invoke(Object o) {
        final RoomObjectGraph roomObjectGraph = (RoomObjectGraph)o;
        final lsk f0 = lsk.F0;
        czd.f((Object)roomObjectGraph, "$this$withCurrentRoom");
        if (!this.D0) {
            final njo o2 = roomObjectGraph.o4();
            final Integer n = this.E0.q1.a.a();
            int intValue;
            if (n != null) {
                intValue = n;
            }
            else {
                intValue = -1;
            }
            o2.d(intValue);
        }
        final int ordinal = ((Enum)this.F0.u).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                final String b = this.F0.b;
                if (b != null) {
                    final RoomStateManager e0 = this.E0;
                    final boolean g0 = this.G0;
                    final RoomStateManager$k0 companion = RoomStateManager.Companion;
                    e0.s0("endBroadcastAsAdmin request started");
                    if (g0) {
                        ((MviViewModel)e0).C((eaq)roomObjectGraph.h0().j(b), (qsb)new l9o(e0));
                    }
                    else {
                        roomObjectGraph.h0().m(b, g0);
                    }
                    roomObjectGraph.w4().a();
                }
            }
        }
        else {
            if (this.H0) {
                this.E0.d1.a.onNext((Object)jnn$a$b.a);
            }
            else if (this.F0.F != p9w.I0) {
                final RoomStateManager e2 = this.E0;
                final gio e3 = e2.e1;
                final String stringId = e2.m0().getStringId();
                final String n2 = this.E0.U0.n();
                final vqn f2 = this.F0;
                e3.a.onNext((Object)new gio$a$b(stringId, n2, f2.b, f2.i));
            }
            final vqn f3 = this.F0;
            final String b2 = f3.b;
            if (b2 != null) {
                final RoomStateManager e4 = this.E0;
                final aqn y0 = e4.Y0;
                Objects.requireNonNull(y0);
                y0.b.onNext((Object)b2);
                final kmk k = f3.K;
                if (k == kmk.D0) {
                    final n1o n3 = e4.n1;
                    Objects.requireNonNull(n3);
                    n3.b.onNext((Object)b2);
                }
                else if (pps.j(k)) {
                    e4.S0.e();
                }
            }
            vjo.F(this.E0.b1, "", "", "leave", null, null, 24);
            roomObjectGraph.s3().a("leave.ogg", false);
            roomObjectGraph.w4().a();
        }
        final gun$d c = this.E0.S0.c();
        if (c != null) {
            c.a.j(2);
        }
        if (this.I0) {
            this.E0.R0.b();
        }
        roomObjectGraph.E2().c();
        this.E0.P0.c(this.D0);
        final vjo b3 = this.E0.b1;
        b3.d = null;
        b3.d0(false);
        roomObjectGraph.C6().d.dispose();
        lsk lsk;
        if (blz.I(this.F0)) {
            lsk = lsk.D0;
        }
        else if (this.F0.p()) {
            lsk = lsk.E0;
        }
        else {
            lsk = f0;
        }
        RoomUserItem roomUserItem;
        if (this.F0.n.isEmpty()) {
            roomUserItem = null;
        }
        else {
            roomUserItem = (RoomUserItem)mq4.f0((Iterable)this.F0.n);
        }
        Label_1677: {
            if (pps.l(this.F0.K)) {
                final vqn f4 = this.F0;
                if (!f4.Q) {
                    final RoomStateManager e5 = this.E0;
                    final String b4 = f4.b;
                    final boolean h0 = this.H0;
                    final boolean g2 = this.G0;
                    Objects.requireNonNull(e5);
                    final wqn u = f4.u;
                    final wqn e6 = wqn.E0;
                    boolean b5 = false;
                    Label_0844: {
                        if (u == e6 && g2) {
                            final r21 f5 = f4.f;
                            if (f5 != null && f5.X) {
                                final djo a = djo.a;
                                if (asa.b().b("spaces_2022_h2_host_kudos", false)) {
                                    final mra mra = new mra("host_kudos_prompt", Integer.MAX_VALUE, TimeUnit.DAYS.toMillis(asa.b().f("spaces_2022_h2_host_kudos_fatigue_days", 7)), e5.m0());
                                    final boolean c2 = mra.c();
                                    if (c2) {
                                        mra.b();
                                    }
                                    if (c2) {
                                        b5 = true;
                                        break Label_0844;
                                    }
                                }
                            }
                        }
                        b5 = false;
                    }
                    if (!b5) {
                        final djo a2 = djo.a;
                        boolean b6 = false;
                        Label_0974: {
                            if (qwl.D0.c(101) <= asa.b().f("android_audio_post_survey_probability", 0) && e5.C1 > 0L) {
                                e5.C1 = -1L;
                                long n4;
                                if (lsk == f0) {
                                    n4 = asa.b().h("android_audio_post_survey_min_duration_seconds_listeners", -1L);
                                }
                                else {
                                    n4 = asa.b().h("android_audio_post_survey_min_duration_seconds_speakers", -1L);
                                }
                                if (n4 >= 0L) {
                                    if (hq1.b() - e5.C1 > n4) {
                                        b6 = true;
                                        break Label_0974;
                                    }
                                }
                            }
                            b6 = false;
                        }
                        if (b6) {
                            final vun j1 = e5.j1;
                            Objects.requireNonNull(PostSurveyAdmin.Companion);
                            String twitterUserId;
                            if (roomUserItem != null) {
                                twitterUserId = roomUserItem.getTwitterUserId();
                            }
                            else {
                                twitterUserId = null;
                            }
                            String periscopeUserId;
                            if (roomUserItem != null) {
                                periscopeUserId = roomUserItem.getPeriscopeUserId();
                            }
                            else {
                                periscopeUserId = null;
                            }
                            final PostSurveyAdmin postSurveyAdmin = new PostSurveyAdmin(twitterUserId, periscopeUserId);
                            final boolean b7 = e5.B0(f4, h0, g2);
                            final String z = f4.z;
                            final r21 f6 = f4.f;
                            Long l;
                            if (f6 != null) {
                                l = f6.l;
                            }
                            else {
                                l = null;
                            }
                            final boolean b8 = f4.u == e6;
                            Object o3 = null;
                            Label_1137: {
                                if (f6 != null) {
                                    final List h2 = f6.H;
                                    if (h2 != null) {
                                        o3 = mq4.R0((Iterable)h2);
                                        break Label_1137;
                                    }
                                }
                                o3 = p2a.D0;
                            }
                            final boolean m = f4.M;
                            final r21 f7 = f4.f;
                            Object o4;
                            if (f7 == null || (o4 = f7.T) == null) {
                                o4 = NarrowcastSpaceType$None.INSTANCE;
                            }
                            o = new ksk(lsk, b4, postSurveyAdmin, b7, z, l, b8, (Set)o3, m, (NarrowcastSpaceType)o4, f7 != null && f7.K);
                            Objects.requireNonNull(j1);
                            j1.a.onNext((Object)new dj6(o));
                            break Label_1677;
                        }
                    }
                    if (b5) {
                        final wnn$a wnn$a = (wnn$a)((wgm)e5.w1).b();
                        Integer value;
                        if (wnn$a != null) {
                            final int b9 = wnn$a.b;
                            final Integer l2 = e5.l0(f4);
                            if (l2 != null) {
                                value = l2.intValue() - b9;
                            }
                            else {
                                value = null;
                            }
                        }
                        else {
                            value = null;
                        }
                        final String b10 = f4.b;
                        if (b10 != null) {
                            final nnn v1 = e5.v1;
                            final String z2 = f4.z;
                            final r21 f8 = f4.f;
                            Long i;
                            if (f8 != null) {
                                i = f8.l;
                            }
                            else {
                                i = null;
                            }
                            Object o5 = null;
                            Label_1389: {
                                if (f8 != null) {
                                    final List h3 = f8.H;
                                    if (h3 != null) {
                                        o5 = mq4.R0((Iterable)h3);
                                        break Label_1389;
                                    }
                                }
                                o5 = p2a.D0;
                            }
                            final boolean m2 = f4.M;
                            final r21 f9 = f4.f;
                            final boolean b11 = f9 != null && f9.K;
                            Object o6;
                            if (f9 == null || (o6 = f9.T) == null) {
                                o6 = NarrowcastSpaceType$None.INSTANCE;
                            }
                            o = new qnn(new RoomHostKudosArgs(b10, z2, i, (Set)o5, m2, b11, value, (NarrowcastSpaceType)o6));
                            Objects.requireNonNull(v1);
                            v1.a.onNext(o);
                        }
                    }
                    else if (e5.B0(f4, h0, g2)) {
                        final String b12 = f4.b;
                        if (b12 != null) {
                            final hgn o7 = e5.o1;
                            final String z3 = f4.z;
                            final r21 f10 = f4.f;
                            Long l3;
                            if (f10 != null) {
                                l3 = f10.l;
                            }
                            else {
                                l3 = null;
                            }
                            final boolean b13 = f4.u == e6;
                            Object o8 = null;
                            Label_1609: {
                                if (f10 != null) {
                                    final List h4 = f10.H;
                                    if (h4 != null) {
                                        o8 = mq4.R0((Iterable)h4);
                                        break Label_1609;
                                    }
                                }
                                o8 = p2a.D0;
                            }
                            final boolean m3 = f4.M;
                            final r21 f11 = f4.f;
                            o = new kgn(b12, z3, l3, b13, (Set<AudioSpaceTopicItem>)o8, m3, f11 != null && f11.K);
                            Objects.requireNonNull(o7);
                            o7.a.onNext(o);
                        }
                    }
                }
            }
        }
        ((MviViewModel)this.E0).Q((qsb)oao.D0);
        final RoomStateManager e7 = this.E0;
        ((MviViewModel)e7).T((qsb)new pao((nsb)this.J0, this.F0, e7));
        return fzv.a;
    }
}
