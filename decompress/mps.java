import android.graphics.Shader$TileMode;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mps
{
    public static final mps a;
    
    static {
        a = new mps();
    }
    
    public final int a() {
        Objects.requireNonNull(lps.Companion);
        return 3;
    }
    
    public final Shader$TileMode b() {
        return Shader$TileMode.DECAL;
    }
}
