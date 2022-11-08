import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ch7
{
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ch7)) {
            return false;
        }
        Objects.requireNonNull(o);
        return zzd.a((Object)null, (Object)null);
    }
    
    @Override
    public final int hashCode() {
        throw null;
    }
    
    @Override
    public final String toString() {
        return "DMCentralEventOptionsInput(buffer=0, central_event_id=null)";
    }
}
