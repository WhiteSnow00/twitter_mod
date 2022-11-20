import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bvb implements nu1
{
    public final fu1 a;
    
    public bvb(final fu1 a) {
        this.a = a;
    }
    
    public final boolean a() {
        return false;
    }
    
    public final boolean b() {
        return false;
    }
    
    public final boolean isEnabled() {
        Objects.requireNonNull(this.a);
        return asa.b().b("android_behavioral_events_media_enabled", false);
    }
}
