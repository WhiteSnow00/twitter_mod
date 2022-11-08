// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.replay;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import com.twitter.rooms.model.AudioSpaceTopicItem;
import java.util.ArrayList;
import tv.periscope.model.NarrowcastSpaceType;
import com.twitter.rooms.model.helpers.RoomUserItem;

public final class a extends gue implements rtb<qzn, qzn>
{
    public final /* synthetic */ qzn C0;
    public final /* synthetic */ RoomUserItem D0;
    public final /* synthetic */ RoomReplayConsumptionViewModel E0;
    public final /* synthetic */ RoomUserItem F0;
    public final /* synthetic */ gqn G0;
    public final /* synthetic */ boolean H0;
    public final /* synthetic */ NarrowcastSpaceType I0;
    
    public a(final qzn c0, final RoomUserItem d0, final RoomReplayConsumptionViewModel e0, final RoomUserItem f0, final gqn g0, final boolean h0, final NarrowcastSpaceType i0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        super(1);
    }
    
    public final Object invoke(Object o) {
        final qzn qzn = (qzn)o;
        zzd.f((Object)qzn, "$this$setState");
        final qzn c0 = this.C0;
        final String j = c0.j;
        boolean b = true;
        if (j == null && this.D0 != null) {
            final long id = this.E0.P0.getId();
            final RoomUserItem d0 = this.D0;
            zzd.c((Object)d0);
            if (id != d0.getTwitterUserIdLong()) {
                b = false;
            }
            o = new i3u((Object)b, (Object)this.D0.getName(), (Object)this.D0.getTwitterUserId());
        }
        else {
            final boolean c2 = c0.c;
            final qzn c3 = this.C0;
            o = new i3u((Object)c2, (Object)c3.h, (Object)c3.j);
        }
        final boolean booleanValue = (boolean)((i3u)o).C0;
        final String s = (String)((i3u)o).D0;
        final String s2 = (String)((i3u)o).E0;
        final RoomUserItem f0 = this.F0;
        String name = null;
        Label_0208: {
            if (f0 != null) {
                name = f0.getName();
                if (name != null) {
                    break Label_0208;
                }
            }
            name = s;
        }
        final RoomUserItem f2 = this.F0;
        String s3;
        if (f2 == null || (s3 = f2.getImageUrl()) == null) {
            s3 = this.C0.i;
        }
        final RoomReplayConsumptionViewModel e0 = this.E0;
        RoomUserItem roomUserItem;
        if ((roomUserItem = this.F0) == null) {
            roomUserItem = this.D0;
        }
        final String w = RoomReplayConsumptionViewModel.W(e0, roomUserItem);
        final gqn g0 = this.G0;
        final v21 f3 = g0.f;
        String s4;
        if ((f3 == null || (s4 = f3.j) == null) && (s4 = this.C0.l) == null) {
            s4 = "";
        }
        final boolean l = g0.L;
        Long r = null;
        String h;
        if (f3 != null) {
            h = f3.h;
        }
        else {
            h = null;
        }
        Long n;
        if ((n = this.C0.m) == null) {
            if (f3 != null) {
                n = f3.l;
            }
            else {
                n = null;
            }
        }
        if (f3 != null) {
            r = f3.R;
        }
        final boolean n2 = g0.N;
        if (f3 != null) {
            final List h2 = f3.H;
            if (h2 != null) {
                final ArrayList list = new ArrayList<String>(kr4.h1((Iterable)h2, 10));
                final Iterator iterator = h2.iterator();
                while (iterator.hasNext()) {
                    list.add(((AudioSpaceTopicItem)iterator.next()).getTopicId());
                }
                final Object o2 = or4.r2((Iterable)list);
                return qzn.l(qzn, l, booleanValue, this.H0, w, name, s3, s, s2, s4, n, h, (hmk)null, 0L, 0L, 0L, false, false, this.D0, this.F0, false, r, n2, false, false, false, false, false, (Set)o2, (String)null, this.I0, -1102068479, 3);
            }
        }
        final Object o2 = f3a.C0;
        return qzn.l(qzn, l, booleanValue, this.H0, w, name, s3, s, s2, s4, n, h, (hmk)null, 0L, 0L, 0L, false, false, this.D0, this.F0, false, r, n2, false, false, false, false, false, (Set)o2, (String)null, this.I0, -1102068479, 3);
    }
}
