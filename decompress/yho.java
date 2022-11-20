// 
// Decompiled by Procyon v0.6.0
// 

public final class yho extends ste implements qsb<qbu$e, Boolean>
{
    public final String D0;
    public final String E0;
    
    public yho() {
        this.D0 = "room_transcription_display";
        this.E0 = "room_transcription_display_autoplay";
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final qbu$e qbu$e = (qbu$e)o;
        czd.f((Object)qbu$e, "it");
        return czd.a((Object)qbu$e.b, (Object)this.D0) || czd.a((Object)qbu$e.b, (Object)this.E0);
    }
}
