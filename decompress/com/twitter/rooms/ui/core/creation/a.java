// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.creation;

import com.twitter.weaver.mvi.MviViewModel;
import tv.periscope.android.api.CreateBroadcastResponse;
import java.util.List;

@sa8(c = "com.twitter.rooms.ui.core.creation.RoomCreationViewModel$5$1", f = "RoomCreationViewModel.kt", l = {}, m = "invokeSuspend")
public final class a extends p0s implements ftb<List<? extends CreateBroadcastResponse>, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomCreationViewModel E0;
    
    public a(final RoomCreationViewModel e0, final go6<? super a> go6) {
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
        final List list = (List)this.D0;
        if (list.isEmpty() ^ true) {
            final RoomCreationViewModel e0 = this.E0;
            final a$a a$a = new a$a(list);
            final RoomCreationViewModel$h companion = RoomCreationViewModel.Companion;
            ((MviViewModel)e0).Q((qsb)a$a);
        }
        else {
            final RoomCreationViewModel e2 = this.E0;
            final a$b d0 = a$b.D0;
            final RoomCreationViewModel$h companion2 = RoomCreationViewModel.Companion;
            ((MviViewModel)e2).Q((qsb)d0);
        }
        return fzv.a;
    }
}
