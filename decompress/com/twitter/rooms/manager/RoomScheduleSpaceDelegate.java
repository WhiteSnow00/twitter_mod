// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.manager;

import kotlin.Metadata;
import tv.periscope.model.NarrowcastSpaceType;
import java.util.Set;
import java.util.Objects;
import com.twitter.rooms.subsystem.api.models.ScheduledSpace;

public final class RoomScheduleSpaceDelegate
{
    public final huo a;
    public final htn b;
    public final maa c;
    
    public RoomScheduleSpaceDelegate(final huo a, final htn b, final maa c) {
        zzd.f((Object)a, "scheduleSpacesRepository");
        zzd.f((Object)b, "roomPeriscopeAuthenticator");
        zzd.f((Object)c, "eventBus");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final n9q<r57> a(final ScheduledSpace scheduledSpace, final huo.c c) {
        zzd.f((Object)scheduledSpace, "scheduledSpace");
        return (n9q<r57>)this.b.b().p((qtb)new uii((rtb)new rtb<u3k$b, ubq<? extends String>>() {
            public final /* synthetic */ RoomScheduleSpaceDelegate C0;
            
            public final Object invoke(final Object o) {
                final u3k$b u3k$b = (u3k$b)o;
                zzd.f((Object)u3k$b, "results");
                n9q n9q;
                if (u3k$b.b.f()) {
                    n9q = n9q.n((Throwable)u3k$b.b.c());
                }
                else {
                    final huo a = this.C0.a;
                    final String description = scheduledSpace.getDescription();
                    final long timeInMs = scheduledSpace.getTimeInMs();
                    final Set<String> topicIds = scheduledSpace.getTopicIds();
                    final boolean spaceRecording = scheduledSpace.isSpaceRecording();
                    final boolean spaceClippable = scheduledSpace.isSpaceClippable();
                    final NarrowcastSpaceType narrowCastSpaceType = scheduledSpace.getNarrowCastSpaceType();
                    final huo.c e0 = c;
                    Objects.requireNonNull(a);
                    zzd.f((Object)description, "description");
                    zzd.f((Object)topicIds, "topicIds");
                    zzd.f((Object)narrowCastSpaceType, "narrowCastSpaceType");
                    a.b();
                    n9q = a.a.b().p((qtb)new i5i((rtb)new juo(a), 22)).w((qtb)new naf((rtb)new kuo(a, timeInMs, description, e0, topicIds, spaceRecording, spaceClippable, narrowCastSpaceType), 14));
                }
                return n9q;
            }
        }, 17)).p((qtb)new i5i((rtb)new rtb<String, ubq<? extends r57>>() {
            public final /* synthetic */ RoomScheduleSpaceDelegate C0;
            
            public final Object invoke(final Object o) {
                final String s = (String)o;
                zzd.f((Object)s, "it");
                final RoomScheduleSpaceDelegate c0 = this.C0;
                Objects.requireNonNull(c0);
                return n9q.g((pbq)new wno((Object)c0, (Object)s));
            }
        }, 15)).f((dcq)this.b.c());
    }
    
    @Metadata(d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004" }, d2 = { "Lcom/twitter/rooms/manager/RoomScheduleSpaceDelegate$CreateScheduledSpaceException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "subsystem.tfa.rooms.core_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class CreateScheduledSpaceException extends Exception
    {
        public CreateScheduledSpaceException() {
            super("failed to create a scheduled space");
        }
    }
}
