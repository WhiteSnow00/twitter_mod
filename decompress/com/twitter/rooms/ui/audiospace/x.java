// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.audiospace;

import com.twitter.weaver.mvi.MviViewModel;
import android.net.Uri;

@sa8(c = "com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel$intents$2$20$1$1$1", f = "RoomAudioSpaceViewModel.kt", l = {}, m = "invokeSuspend")
public final class x extends p0s implements ftb<String, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomAudioSpaceViewModel E0;
    public final t6n F0;
    
    public x(final RoomAudioSpaceViewModel e0, final t6n f0, final go6<? super x> go6) {
        this.E0 = e0;
        this.F0 = f0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final x x = new x(this.E0, this.F0, (go6<? super x>)go6);
        x.D0 = d0;
        return (go6<fzv>)x;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final x x = (x)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        x.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final String s = (String)this.D0;
        final RoomAudioSpaceViewModel e0 = this.E0;
        final String h = this.F0.h;
        czd.f((Object)h, "spaceId");
        czd.f((Object)s, "clipId");
        final String string = Uri.parse(djo.f(h)).buildUpon().appendQueryParameter("clipID", s).toString();
        czd.e((Object)string, "parse(RoomUtils.getSpace\u2026IP_ID, clipId).toString()");
        final t0n$n t0n$n = new t0n$n(string);
        final coe[] n1 = RoomAudioSpaceViewModel.n1;
        ((MviViewModel)e0).V((Object)t0n$n);
        return fzv.a;
    }
}
