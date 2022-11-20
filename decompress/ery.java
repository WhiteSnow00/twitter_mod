import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ery implements p4j
{
    public static final ery a;
    
    static {
        a = new ery();
    }
    
    public final void a(final Object o, final Object o2) {
        final Map.Entry entry = (Map.Entry)o;
        final q4j q4j = (q4j)o2;
        q4j.a(iry.g, entry.getKey());
        q4j.a(iry.h, entry.getValue());
    }
}
