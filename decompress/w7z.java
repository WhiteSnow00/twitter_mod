import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w7z
{
    public static final ply a;
    public static final ply b;
    
    static {
        a = new ply("id");
        b = new ply("type");
        Objects.requireNonNull("transports");
        Objects.requireNonNull("name");
        Objects.requireNonNull("icon");
        Objects.requireNonNull("displayName");
        Objects.requireNonNull("alg");
        Objects.requireNonNull("plat");
        Objects.requireNonNull("rk");
        Objects.requireNonNull("clientPin");
        Objects.requireNonNull("up");
        Objects.requireNonNull("uv");
        Objects.requireNonNull("uvm");
    }
}
