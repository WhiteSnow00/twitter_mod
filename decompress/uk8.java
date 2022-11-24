import org.json.JSONObject;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class uk8 implements hpp
{
    public static top b(final w9y w9y) {
        final top.b b = new top.b(8);
        final top.a a = new top.a(true, false);
        Objects.requireNonNull(w9y);
        return new top(System.currentTimeMillis() + 3600000, b, a, 10.0, 1.2, 60);
    }
    
    public final top a(final w9y w9y, final JSONObject jsonObject) {
        return b(w9y);
    }
}
