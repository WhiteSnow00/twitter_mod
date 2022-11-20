// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.audiospace;

import com.twitter.weaver.mvi.MviViewModel;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.List;

@sa8(c = "com.twitter.rooms.ui.audiospace.RoomAudioSpaceViewModel$44$1", f = "RoomAudioSpaceViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends p0s implements ftb<lvj<? extends l31, ? extends List<? extends vwp$b>>, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomAudioSpaceViewModel E0;
    
    public a(final RoomAudioSpaceViewModel e0, final go6<? super a> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final a a = new a(this.E0, (go6<? super a>)go6);
        a.D0 = d0;
        return (go6<fzv>)a;
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final a a = (a)this.create(o, (go6<?>)o2);
        final fzv a2 = fzv.a;
        a.invokeSuspend(a2);
        return a2;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final lvj lvj = (lvj)this.D0;
        final l31 l31 = (l31)lvj.D0;
        final List list = (List)lvj.E0;
        final RoomAudioSpaceViewModel e0 = this.E0;
        final a$a a$a = new a$a(l31, list);
        final coe[] n1 = RoomAudioSpaceViewModel.n1;
        ((MviViewModel)e0).Q((qsb)a$a);
        final RoomUserItem roomUserItem = (RoomUserItem)mq4.h0((Iterable)l31.a);
        final RoomAudioSpaceViewModel e2 = this.E0;
        final vjo s0 = e2.S0;
        RoomUserItem roomUserItem2 = null;
        if (roomUserItem != null) {
            roomUserItem2 = (RoomUserItem)mq4.h0((Iterable)e2.h1.a(rp9.H0(roomUserItem), (c22)null));
        }
        s0.e0(roomUserItem2);
        return fzv.a;
    }
}
