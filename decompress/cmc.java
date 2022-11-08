import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cmc implements k0b<cmc>
{
    public final String a;
    public final List<String> b;
    public final boolean c;
    
    public cmc(final String a, final List<String> list, final boolean c) {
        this.a = a;
        this.b = Collections.unmodifiableList((List<? extends String>)list);
        this.c = c;
    }
}
