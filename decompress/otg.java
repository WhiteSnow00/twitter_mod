import java.io.IOException;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class otg extends ywj<ntg>
{
    public final Object parse(final tge tge) throws IOException {
        String j;
        final String s = j = tge.j();
        if ("{".equals(s)) {
            final Map h = gih.h(tge, (Class)String.class);
            j = s;
            if (h.containsKey("text")) {
                j = (String)h.get("text");
            }
        }
        return new ntg(j);
    }
}
