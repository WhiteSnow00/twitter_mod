import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ykp extends ste implements qsb<String, fzv>
{
    public final List<String> D0;
    
    public ykp(final List<String> d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final String s = (String)o;
        czd.f((Object)s, "hostname");
        this.D0.add(s);
        return fzv.a;
    }
}
