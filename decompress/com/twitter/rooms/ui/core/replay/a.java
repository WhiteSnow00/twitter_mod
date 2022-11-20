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

public final class a extends ste implements qsb<d0o, d0o>
{
    public final d0o D0;
    public final RoomUserItem E0;
    public final RoomReplayConsumptionViewModel F0;
    public final RoomUserItem G0;
    public final vqn H0;
    public final boolean I0;
    public final NarrowcastSpaceType J0;
    
    public a(final d0o d0, final RoomUserItem e0, final RoomReplayConsumptionViewModel f0, final RoomUserItem g0, final vqn h0, final boolean i0, final NarrowcastSpaceType j0) {
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
        final d0o d0o = (d0o)o;
        czd.f((Object)d0o, "$this$setState");
        final d0o d0 = this.D0;
        final String j = d0.j;
        boolean b = true;
        if (j == null && this.E0 != null) {
            final long id = this.F0.Q0.getId();
            final RoomUserItem e0 = this.E0;
            czd.c((Object)e0);
            if (id != e0.getTwitterUserIdLong()) {
                b = false;
            }
            o = new x3u((Object)b, (Object)this.E0.getName(), (Object)this.E0.getTwitterUserId());
        }
        else {
            final boolean c = d0.c;
            final d0o d2 = this.D0;
            o = new x3u((Object)c, (Object)d2.h, (Object)d2.j);
        }
        final boolean booleanValue = (boolean)((x3u)o).D0;
        final String s = (String)((x3u)o).E0;
        final String s2 = (String)((x3u)o).F0;
        final RoomUserItem g0 = this.G0;
        String name = null;
        Label_0208: {
            if (g0 != null) {
                name = g0.getName();
                if (name != null) {
                    break Label_0208;
                }
            }
            name = s;
        }
        final RoomUserItem g2 = this.G0;
        String s3;
        if (g2 == null || (s3 = g2.getImageUrl()) == null) {
            s3 = this.D0.i;
        }
        final RoomReplayConsumptionViewModel f0 = this.F0;
        RoomUserItem roomUserItem;
        if ((roomUserItem = this.G0) == null) {
            roomUserItem = this.E0;
        }
        final String w = RoomReplayConsumptionViewModel.W(f0, roomUserItem);
        final vqn h0 = this.H0;
        final r21 f2 = h0.f;
        String s4;
        if ((f2 == null || (s4 = f2.j) == null) && (s4 = this.D0.l) == null) {
            s4 = "";
        }
        final boolean l = h0.L;
        Long r = null;
        String h2;
        if (f2 != null) {
            h2 = f2.h;
        }
        else {
            h2 = null;
        }
        Long n;
        if ((n = this.D0.m) == null) {
            if (f2 != null) {
                n = f2.l;
            }
            else {
                n = null;
            }
        }
        if (f2 != null) {
            r = f2.R;
        }
        final boolean n2 = h0.N;
        if (f2 != null) {
            final List h3 = f2.H;
            if (h3 != null) {
                final ArrayList list = new ArrayList<String>(iq4.H((Iterable)h3, 10));
                final Iterator iterator = h3.iterator();
                while (iterator.hasNext()) {
                    list.add(((AudioSpaceTopicItem)iterator.next()).getTopicId());
                }
                final Object o2 = mq4.R0((Iterable)list);
                return d0o.l(d0o, l, booleanValue, this.I0, w, name, s3, s, s2, s4, n, h2, (nmk)null, 0L, 0L, 0L, false, false, this.E0, this.G0, false, r, n2, false, false, false, false, false, (Set)o2, (String)null, this.J0, -1102068479, 3);
            }
        }
        final Object o2 = p2a.D0;
        return d0o.l(d0o, l, booleanValue, this.I0, w, name, s3, s, s2, s4, n, h2, (nmk)null, 0L, 0L, 0L, false, false, this.E0, this.G0, false, r, n2, false, false, false, false, false, (Set)o2, (String)null, this.J0, -1102068479, 3);
    }
}
