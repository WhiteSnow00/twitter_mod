// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.audiospace;

import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.util.user.UserIdentifier;

@sa8(c = "com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel$intents$2$11", f = "RoomAudioSpaceViewModel.kt", l = {}, m = "invokeSuspend")
public final class d extends p0s implements ftb<d1n$q, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomAudioSpaceViewModel E0;
    public final jtn F0;
    
    public d(final RoomAudioSpaceViewModel e0, final jtn f0, final go6<? super d> go6) {
        this.E0 = e0;
        this.F0 = f0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final d d2 = new d(this.E0, this.F0, (go6<? super d>)go6);
        d2.D0 = d0;
        return (go6<fzv>)d2;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d d = (d)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        d.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final d1n$q d1n$q = (d1n$q)this.D0;
        final RoomAudioSpaceViewModel e0 = this.E0;
        final d$d d$d = new d$d(e0, d1n$q);
        final coe[] n1 = RoomAudioSpaceViewModel.n1;
        ((MviViewModel)e0).T((qsb)d$d);
        final qqp a = d1n$q.a;
        final boolean a2 = czd.a((Object)a, (Object)qqp.h.b);
        boolean a3 = true;
        if (a2) {
            this.F0.a.onNext((Object)new uzd(gpn.I0, (Integer)null, 6));
        }
        else if (czd.a((Object)a, (Object)qqp.i.b)) {
            this.F0.a.onNext((Object)new uzd(gpn.D0, (Integer)null, 6));
        }
        else if (czd.a((Object)a, (Object)qqp.q.b)) {
            final RoomAudioSpaceViewModel e2 = this.E0;
            ((MviViewModel)e2).T((qsb)new d$e(e2));
        }
        else if (czd.a((Object)a, (Object)qqp.v.b)) {
            ((MviViewModel)this.E0).V((Object)t0n$b0.a);
        }
        else if (czd.a((Object)a, (Object)qqp.c.b)) {
            final RoomAudioSpaceViewModel e3 = this.E0;
            ((MviViewModel)e3).T((qsb)new d$f(e3));
            vjo.G(this.E0.S0, "user_profile", "share_sheet", "share_via", "copy_link", null, 48);
        }
        else if (czd.a((Object)a, (Object)qqp.t.b)) {
            final RoomAudioSpaceViewModel e4 = this.E0;
            ((MviViewModel)e4).T((qsb)new d$g(e4));
            vjo.F(this.E0.S0, "caret", "hang_up", "click", null, null, 24);
        }
        else if (a instanceof qqp.k) {
            final qqp.k k = (qqp.k)d1n$q.a;
            final l0a b = k.b;
            final f1a c = k.c;
            final RoomAudioSpaceViewModel e5 = this.E0;
            ((MviViewModel)e5).T((qsb)new d$h(e5, c, b));
            final String c2 = t0a.c(b, c);
            if (c == f1a.K0) {
                this.E0.Q0.y0(c2);
            }
            this.E0.T0.a(c2, c);
        }
        else if (a instanceof qqp.j) {
            final f1a b2 = ((qqp.j)d1n$q.a).b;
            final RoomAudioSpaceViewModel e6 = this.E0;
            ((MviViewModel)e6).T((qsb)new d$i(b2, e6));
        }
        else if (czd.a((Object)a, (Object)qqp.a.b)) {
            ((MviViewModel)this.E0).Q((qsb)d$j.D0);
        }
        else if (czd.a((Object)a, (Object)qqp.n.b)) {
            final RoomAudioSpaceViewModel e7 = this.E0;
            ((MviViewModel)e7).T((qsb)new d$k(e7));
        }
        else if (czd.a((Object)a, (Object)qqp.p.b)) {
            ((MviViewModel)this.E0).V((Object)t0n$k.a);
            vjo.G(this.E0.S0, "feedback", "", "send_dm", "click", null, 48);
        }
        else if (czd.a((Object)a, (Object)qqp$w.b)) {
            final qbu b3 = qbu.Companion.b(UserIdentifier.Companion.c());
            final boolean e8 = b3.e("room_transcription_display", false);
            final qbu$c i = b3.i();
            ((qbu$d)i).f("room_transcription_display", e8 ^ true);
            i.e();
        }
        else if (czd.a((Object)a, (Object)qqp.s.b)) {
            final RoomAudioSpaceViewModel e9 = this.E0;
            ((MviViewModel)e9).T((qsb)new d$a(e9));
        }
        else if (czd.a((Object)a, (Object)qqp.u.b)) {
            final RoomAudioSpaceViewModel e10 = this.E0;
            ((MviViewModel)e10).T((qsb)new d$b(e10));
        }
        else if (czd.a((Object)a, (Object)qqp.r.b)) {
            final RoomAudioSpaceViewModel e11 = this.E0;
            ((MviViewModel)e11).T((qsb)new d$c(e11));
        }
        final qqp a4 = d1n$q.a;
        if (!(a4 instanceof qqp.k)) {
            a3 = czd.a((Object)a4, (Object)qqp$w.b);
        }
        if (!a3) {
            ((MviViewModel)this.E0).Q((qsb)f6n.D0);
        }
        return fzv.a;
    }
}
