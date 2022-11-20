// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import com.twitter.weaver.mvi.MviViewModel;
import java.util.Iterator;
import com.twitter.rooms.model.AudioSpaceCommunityRoleType;
import com.twitter.rooms.model.RaisedHand;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.ArrayList;
import java.util.Set;

@sa8(c = "com.twitter.rooms.manager.RoomStateManager$observeAudioLevelChange$1$1", f = "RoomStateManager.kt", l = {}, m = "invokeSuspend")
public final class x extends p0s implements ftb<lvj<? extends String, ? extends Boolean>, go6<? super fzv>, Object>
{
    public Object D0;
    public final RoomStateManager E0;
    
    public x(final RoomStateManager e0, final go6<? super x> go6) {
        this.E0 = e0;
        super(2, (go6)go6);
    }
    
    public final go6<fzv> create(final Object d0, final go6<?> go6) {
        final x x = new x(this.E0, (go6<? super x>)go6);
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
        final lvj lvj = (lvj)this.D0;
        final String s = (String)lvj.D0;
        final boolean booleanValue = (boolean)lvj.E0;
        final RoomStateManager e0 = this.E0;
        final qsb<vqn, fzv> qsb = (qsb<vqn, fzv>)new qsb<vqn, fzv>(e0, s, booleanValue) {
            public final RoomStateManager D0;
            public final String E0;
            public final boolean F0;
            
            public final Object invoke(final Object o) {
                final vqn vqn = (vqn)o;
                czd.f((Object)vqn, "state");
                Set set;
                if (blz.M(vqn)) {
                    final Set a1 = onp.a1((Set)vqn.n, (Iterable)vqn.m);
                    final String e0 = this.E0;
                    final boolean f0 = this.F0;
                    final ArrayList list = new ArrayList<RoomUserItem>(iq4.H((Iterable)a1, 10));
                    for (final RoomUserItem roomUserItem : a1) {
                        boolean b;
                        if (!czd.a((Object)roomUserItem.getTwitterUserId(), (Object)e0) && !czd.a((Object)roomUserItem.getPeriscopeUserId(), (Object)e0)) {
                            b = (!f0 && roomUserItem.isTalking());
                        }
                        else {
                            b = f0;
                        }
                        list.add(RoomUserItem.copy$default(roomUserItem, null, null, null, b, null, null, false, false, false, null, null, null, null, false, null, false, false, false, false, null, null, 2097143, null));
                    }
                    set = mq4.R0((Iterable)list);
                }
                else {
                    final Set a2 = onp.a1((Set)vqn.n, (Iterable)vqn.m);
                    final RoomStateManager d0 = this.D0;
                    final String e2 = this.E0;
                    final boolean f2 = this.F0;
                    final ArrayList list2 = new ArrayList<RoomUserItem>(iq4.H((Iterable)a2, 10));
                    for (final RoomUserItem roomUserItem2 : a2) {
                        final String twitterUserId = roomUserItem2.getTwitterUserId();
                        final RoomStateManager$k0 companion = RoomStateManager.Companion;
                        boolean talking;
                        if ((czd.a((Object)twitterUserId, (Object)d0.m0().getStringId()) || (roomUserItem2.getPeriscopeUserId().length() > 0 && czd.a((Object)roomUserItem2.getPeriscopeUserId(), (Object)d0.U0.n()))) && vqn.c) {
                            talking = false;
                        }
                        else if (!czd.a((Object)roomUserItem2.getTwitterUserId(), (Object)e2) && !czd.a((Object)roomUserItem2.getPeriscopeUserId(), (Object)e2)) {
                            talking = roomUserItem2.isTalking();
                        }
                        else {
                            talking = f2;
                        }
                        list2.add(RoomUserItem.copy$default(roomUserItem2, null, null, null, talking, null, null, false, false, false, null, null, null, null, false, null, false, false, false, false, null, null, 2097143, null));
                    }
                    set = mq4.R0((Iterable)list2);
                }
                final String b2 = vqn.b;
                Label_0556: {
                    if (b2 != null) {
                        final RoomStateManager d2 = this.D0;
                        while (true) {
                            for (final Object next : set) {
                                if (((RoomUserItem)next).isTalking()) {
                                    final RoomUserItem roomUserItem3 = (RoomUserItem)next;
                                    if (roomUserItem3 != null) {
                                        d2.r1.a((Object)new v8o.v8o$a.b(b2, roomUserItem3.getImageUrl(), roomUserItem3.getName(), roomUserItem3.getTwitterUserIdLong()));
                                    }
                                    break Label_0556;
                                }
                            }
                            Object next = null;
                            continue;
                        }
                    }
                }
                final ArrayList<RoomUserItem> list3 = new ArrayList<RoomUserItem>();
                for (final Object next2 : set) {
                    if (((RoomUserItem)next2).getUserStatus() == wio.D0) {
                        list3.add((RoomUserItem)next2);
                    }
                }
                final Set r0 = mq4.R0((Iterable)list3);
                final Set y0 = onp.Y0(set, (Iterable)r0);
                final RoomStateManager d3 = this.D0;
                final w w = new w(y0, r0);
                final RoomStateManager$k0 companion2 = RoomStateManager.Companion;
                ((MviViewModel)d3).Q((qsb)w);
                return fzv.a;
            }
        };
        final RoomStateManager$k0 companion = RoomStateManager.Companion;
        ((MviViewModel)e0).T((qsb)qsb);
        return fzv.a;
    }
}
