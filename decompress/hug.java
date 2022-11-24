import java.io.IOException;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hug extends nxj<gug>
{
    public final Object parse(final qhe qhe) throws IOException {
        String j;
        final String s = j = qhe.j();
        if ("{".equals(s)) {
            final Map<String, String> h = uih.h(qhe, String.class);
            j = s;
            if (h.containsKey("text")) {
                j = h.get("text");
            }
        }
        return new gug(j);
    }
}
