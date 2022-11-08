// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.app.fleets.stickers;

import kotlinx.serialization.KSerializer;
import kotlin.Metadata;
import com.twitter.app.common.args.ContentViewArgs;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004H\u00c6\u0001¨\u0006\u0005" }, d2 = { "Lcom/twitter/app/fleets/stickers/FleetStickerArgs;", "Lcom/twitter/app/common/args/ContentViewArgs;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "feature.tfa.fleets.api-legacy_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
@okp
public final class FleetStickerArgs implements ContentViewArgs
{
    public static final FleetStickerArgs INSTANCE;
    
    static {
        INSTANCE = new FleetStickerArgs();
        $cachedSerializer$delegate = rp2.y0(2, (otb)FleetStickerArgs$a.C0);
    }
    
    private FleetStickerArgs() {
    }
    
    private final /* synthetic */ gxe get$cachedSerializer$delegate() {
        return FleetStickerArgs.$cachedSerializer$delegate;
    }
    
    public final KSerializer<FleetStickerArgs> serializer() {
        return (KSerializer<FleetStickerArgs>)this.get$cachedSerializer$delegate().getValue();
    }
}
