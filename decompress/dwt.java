import java.util.concurrent.atomic.AtomicInteger;
import java.util.UUID;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dwt
{
    public final UserIdentifier a;
    public final UUID b;
    public final boolean c;
    public final int d;
    public final AtomicInteger e;
    
    public dwt(final UserIdentifier a, final jwt jwt) {
        e0e.f((Object)a, "userIdentifier");
        e0e.f((Object)jwt, "samplingPolicy");
        this.a = a;
        final UUID randomUUID = UUID.randomUUID();
        e0e.e((Object)randomUUID, "uuidGenerator.uuid");
        this.b = randomUUID;
        this.c = (jwt.b || jwt.a.b());
        this.d = jwt.a.a;
        this.e = new AtomicInteger(0);
    }
}
