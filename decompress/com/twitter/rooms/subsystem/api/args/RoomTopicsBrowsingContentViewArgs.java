// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.rooms.subsystem.api.args;

import kotlinx.serialization.KSerializer;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/rooms/subsystem/api/args/RoomTopicsBrowsingContentViewArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "subsystem.tfa.rooms.api_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
@okp
public final class RoomTopicsBrowsingContentViewArgs implements ContentViewArgs
{
    public static final RoomTopicsBrowsingContentViewArgs INSTANCE;
    
    static {
        INSTANCE = new RoomTopicsBrowsingContentViewArgs();
        $cachedSerializer$delegate = rp2.y0(2, (otb)RoomTopicsBrowsingContentViewArgs$a.C0);
    }
    
    private RoomTopicsBrowsingContentViewArgs() {
    }
    
    private final /* synthetic */ gxe get$cachedSerializer$delegate() {
        return RoomTopicsBrowsingContentViewArgs.$cachedSerializer$delegate;
    }
    
    public final KSerializer<RoomTopicsBrowsingContentViewArgs> serializer() {
        return (KSerializer<RoomTopicsBrowsingContentViewArgs>)this.get$cachedSerializer$delegate().getValue();
    }
}
