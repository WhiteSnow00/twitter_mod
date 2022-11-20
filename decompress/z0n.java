import tv.periscope.android.api.PsAudioSpaceResponse;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z0n extends wq implements qsb<PsAudioSpaceResponse, p01>
{
    public static final z0n K0;
    
    static {
        K0 = new z0n();
    }
    
    public z0n() {
        super(1, (Class)rml.class, "toAudioSpaces", "toAudioSpaces(Ltv/periscope/android/api/PsAudioSpaceResponse;Z)Lcom/twitter/rooms/model/AudioSpace;", 1);
    }
    
    public final Object invoke(final Object o) {
        final PsAudioSpaceResponse psAudioSpaceResponse = (PsAudioSpaceResponse)o;
        czd.f((Object)psAudioSpaceResponse, "p0");
        return rml.y(psAudioSpaceResponse, false);
    }
}
