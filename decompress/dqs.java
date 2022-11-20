import android.graphics.Shader$TileMode;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dqs
{
    public static final dqs a;
    
    static {
        a = new dqs();
    }
    
    public final int a() {
        Objects.requireNonNull(cqs.Companion);
        return 3;
    }
    
    public final Shader$TileMode b() {
        return Shader$TileMode.DECAL;
    }
}
