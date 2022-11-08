// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.ui.core.schedule.multi;

import android.content.res.Resources;
import java.util.Objects;
import android.content.Context;
import kotlin.Metadata;
import com.twitter.weaver.mvi.MviViewModel;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007" }, d2 = { "Lcom/twitter/rooms/ui/core/schedule/multi/ScheduledSpaceItemViewModel;", "Lcom/twitter/weaver/mvi/MviViewModel;", "Lfvo;", "Lwuo;", "Lvuo;", "Companion", "a", "feature.tfa.rooms.ui.core.api-legacy_release" }, k = 1, mv = { 1, 7, 1 })
public final class ScheduledSpaceItemViewModel extends MviViewModel<fvo, wuo, vuo>
{
    public static final ScheduledSpaceItemViewModel.ScheduledSpaceItemViewModel$a Companion;
    public static final /* synthetic */ soe<Object>[] R0;
    public final g6n N0;
    public final huo O0;
    public final gjo P0;
    public final gyh Q0;
    
    static {
        R0 = new soe[] { (soe)hi.m(ScheduledSpaceItemViewModel.class, "intents", "getIntents()Lcom/twitter/weaver/mvi/dsl/MviIntentTransformerBuilder;", 0) };
        Companion = new ScheduledSpaceItemViewModel.ScheduledSpaceItemViewModel$a();
    }
    
    public ScheduledSpaceItemViewModel(final Context context, final ksh.b b, final g6n n0, final huo o0, final gjo p6, final ibm ibm) {
        zzd.f((Object)context, "context");
        zzd.f((Object)b, "item");
        zzd.f((Object)n0, "audioSpacesRepository");
        zzd.f((Object)o0, "scheduledSpaceRepository");
        zzd.f((Object)p6, "roomsScribeReporter");
        zzd.f((Object)ibm, "releaseCompletable");
        Objects.requireNonNull(ScheduledSpaceItemViewModel.Companion);
        final String a = b.a;
        final String b2 = b.b;
        final boolean b3 = true;
        boolean b4 = false;
        String s;
        if (b2 == null || b2.length() == 0) {
            s = context.getResources().getString(2131955211);
        }
        else {
            s = b.b;
        }
        zzd.e((Object)s, "if (title.isNullOrEmpty(\u2026               else title");
        final Long c = b.c;
        String t;
        if (c != null) {
            final long longValue = c.longValue();
            final Resources resources = context.getResources();
            zzd.e((Object)resources, "context.resources");
            t = pf8.T(resources, longValue);
        }
        else {
            t = "";
        }
        final Long c2 = b.c;
        if (c2 != null) {
            final long longValue2 = c2.longValue();
            final t3s a2 = mq1.a;
            b4 = (longValue2 < System.currentTimeMillis() && b3);
        }
        super((fae)ibm, (oax)new fvo(a, s, t, b4));
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p6;
        this.Q0 = oyz.f0(this, (rtb)new ScheduledSpaceItemViewModel$b(this));
    }
    
    public final iyh<wuo> v() {
        return (iyh<wuo>)this.Q0.a((soe)ScheduledSpaceItemViewModel.R0[0]);
    }
}
