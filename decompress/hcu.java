import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hcu implements u9v
{
    public final gcu a;
    
    public hcu(final gcu a) {
        e0e.f((Object)a, "twPreferences");
        this.a = a;
    }
    
    public final <T> yz5 a(final gav<T> gav, final T t) {
        e0e.f((Object)gav, "twitterBluePrimitive");
        e0e.f((Object)t, "value");
        return yz5.l((Callable)new j5m((Object)gav, (Object)this, (Object)t, 2));
    }
}
