import tv.periscope.chatman.api.IdempotenceHeaderMapImpl;
import tv.periscope.android.api.service.hydra.model.guestservice.GuestServiceAudiospaceSettingsModificationRequest;
import tv.periscope.android.api.PsResponse;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mbn extends ste implements qsb<PsResponse, lcq<? extends PsResponse>>
{
    public final ran D0;
    public final GuestServiceAudiospaceSettingsModificationRequest E0;
    
    public mbn(final ran d0, final GuestServiceAudiospaceSettingsModificationRequest e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        czd.f((Object)o, "it");
        return this.D0.r.setAudiospaceSettings(IdempotenceHeaderMapImpl.Companion.create().getHeaderMap(), this.E0).I(this.D0.o);
    }
}
