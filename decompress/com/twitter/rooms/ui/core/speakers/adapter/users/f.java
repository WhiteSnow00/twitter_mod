// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.speakers.adapter.users;

import android.os.BaseBundle;
import android.os.Bundle;
import com.twitter.rooms.model.helpers.RoomUserItem;
import androidx.fragment.app.Fragment$InstantiationException;

@sa8(c = "com.twitter.rooms.ui.core.speakers.adapter.users.UserItemViewModel$intents$2$6", f = "UserItemViewModel.kt", l = {}, m = "invokeSuspend")
public final class f extends p0s implements ftb<rdw$g, go6<? super fzv>, Object>
{
    public final eig$c D0;
    public final UserItemViewModel E0;
    
    public f(final eig$c d0, final UserItemViewModel e0, final go6<? super f> go6) {
        this.D0 = d0;
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object o, final go6<?> go6) {
        return (go6<fzv>)new f(this.D0, this.E0, (go6<? super f>)go6);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final f f = (f)this.create(o, (go6<?>)o2);
        final fzv a = fzv.a;
        f.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        b1n.u(o);
        final eig$c d0 = this.D0;
        RoomUserItem roomUserItem;
        if ((roomUserItem = d0.c) == null) {
            roomUserItem = d0.b;
        }
        if (((cnb)this.E0.R0).P().H("TAG_ROOM_PROFILE_SHEET_FRAGMENT") == null) {
            final Bundle a = nh.A("twitter:id", 874340);
            if (!((BaseBundle)a).containsKey("twitter:id")) {
                throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
            }
            final ejo k = m1f.k(a);
            final int a2 = c5j.a;
            this.E0.Q0.a((vmj)new vmj.j(roomUserItem));
            ((wk1)k).e2(((cnb)this.E0.R0).P(), "TAG_ROOM_PROFILE_SHEET_FRAGMENT");
            vjo.G(this.E0.P0, "", "user", "", "click", null, 48);
        }
        return fzv.a;
    }
}
