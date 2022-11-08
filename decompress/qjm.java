import java.util.UUID;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qjm
{
    public final qmw a;
    
    public qjm(final qmw a) {
        this.a = a;
    }
    
    public final String a() {
        Objects.requireNonNull(this.a);
        return UUID.randomUUID().toString();
    }
}
