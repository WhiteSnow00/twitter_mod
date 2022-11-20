import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class w67
{
    public static final b Companion;
    public static final qwe<rlp<w67>> b;
    public final i8t a;
    
    static {
        Companion = new b();
        w67.b = (n4s)pps.n((nsb)w67$a.D0);
    }
    
    public w67(final i8t a) {
        this.a = a;
    }
    
    public static final rlp<w67> a() {
        Objects.requireNonNull(w67.Companion);
        final Object value = w67.b.getValue();
        czd.e(value, "<get-Serializer>(...)");
        return (rlp<w67>)value;
    }
    
    public i8t b() {
        return this.a;
    }
    
    public static final class b
    {
    }
}
